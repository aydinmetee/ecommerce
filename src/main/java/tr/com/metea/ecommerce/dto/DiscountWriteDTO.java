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
public class DiscountWriteDTO {
    private String name;
    private String description;
    private BigDecimal ratio;
    private Boolean valid;
}
