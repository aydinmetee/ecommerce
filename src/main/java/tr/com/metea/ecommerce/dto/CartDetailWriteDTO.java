package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class CartDetailWriteDTO {
    private String productId;
    private String cartId;
    private Long quantity;
}
