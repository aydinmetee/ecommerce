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
@Table(name = "cart")
public class Cart extends BaseEntity {
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CartStatus status;

    public enum CartStatus {
        NEW,
        READY,
        COMPLETE
    }
}
