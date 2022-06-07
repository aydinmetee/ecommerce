package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class InventoryWriteDTO {
    @Min(0)
    @NotNull
    private Long quantity;
}
