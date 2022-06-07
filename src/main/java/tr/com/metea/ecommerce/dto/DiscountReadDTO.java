package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class DiscountReadDTO extends DiscountWriteDTO{
    private String id;
    private String creUser;
    private Date creDate;
    private String updUser;
    private Date updDate;
}
