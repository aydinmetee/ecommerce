package tr.com.metea.ecommerce.service;

import tr.com.metea.ecommerce.domain.CartDetail;
import tr.com.metea.ecommerce.dto.CartDetailSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartDetailWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CartDetailService extends
        BaseService<CartDetail, CartDetailWriteDTO, CartDetailSearchCriteriaDTO> {
}
