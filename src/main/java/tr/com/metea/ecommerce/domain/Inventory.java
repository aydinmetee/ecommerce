package tr.com.metea.ecommerce.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name = "inventory")
public class Inventory extends BaseEntity {
    @Column(name = "quantity")
    private Long quantity;
}
