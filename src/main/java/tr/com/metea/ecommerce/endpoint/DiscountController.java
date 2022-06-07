package tr.com.metea.ecommerce.endpoint;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.ecommerce.domain.Discount;
import tr.com.metea.ecommerce.dto.DiscountReadDTO;
import tr.com.metea.ecommerce.dto.DiscountSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.DiscountWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@RestController
@RequestMapping("/discount")
@Api(value = "/discount")
public class DiscountController extends BaseController<Discount, DiscountReadDTO, DiscountWriteDTO, DiscountSearchCriteriaDTO> {
}
