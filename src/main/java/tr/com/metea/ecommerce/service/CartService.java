package tr.com.metea.ecommerce.service;

import tr.com.metea.ecommerce.domain.Cart;
import tr.com.metea.ecommerce.dto.CartSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CartService extends
        BaseService<Cart, CartWriteDTO, CartSearchCriteriaDTO> {
}
