package tr.com.metea.ecommerce.domain;

import lombok.*;

import javax.persistence.*;

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
@Table(name = "cart_det")
public class CartDetail extends BaseEntity {
    @JoinColumn(name = "product_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Product product;
    @JoinColumn(name = "cart_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;
    private Long quantity;

}
