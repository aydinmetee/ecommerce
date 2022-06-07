package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import tr.com.metea.ecommerce.domain.Cart;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class CartReadDTO extends CartWriteDTO {
    private BigDecimal totalAmount;
    private Cart.CartStatus status;
    private String id;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
}
