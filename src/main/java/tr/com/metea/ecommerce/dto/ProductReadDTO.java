package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class ProductReadDTO extends ProductWriteDTO {

    private String id;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
    private Boolean valid;

    private String categoryName;

    private Long quantity;

    private BigDecimal discountRatio;

}
