package tr.com.metea.ecommerce.serviceview;

import tr.com.metea.ecommerce.domain.Discount;
import tr.com.metea.ecommerce.dto.DiscountReadDTO;
import tr.com.metea.ecommerce.dto.DiscountSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.DiscountWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface DiscountServiceView extends BaseServiceView<Discount, DiscountReadDTO, DiscountWriteDTO, DiscountSearchCriteriaDTO> {
}
