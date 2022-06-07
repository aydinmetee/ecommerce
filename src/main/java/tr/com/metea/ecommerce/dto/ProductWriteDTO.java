package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class ProductWriteDTO {
    private String name;
    private String code;
    private String description;
    private BigDecimal price;
    private String categoryId;
    private String inventoryId;
    private String discountId;
}
