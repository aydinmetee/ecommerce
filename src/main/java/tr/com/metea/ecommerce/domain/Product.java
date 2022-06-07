package tr.com.metea.ecommerce.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private BigDecimal price;

    @JoinColumn(name = "category_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @JoinColumn(name = "inventory_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Inventory inventory;
    @JoinColumn(name = "discount_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Discount discount;
}
