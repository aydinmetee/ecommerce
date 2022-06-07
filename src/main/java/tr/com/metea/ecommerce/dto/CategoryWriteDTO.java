package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class CategoryWriteDTO {
    @NotBlank
    private String name;
    private String description;
}
