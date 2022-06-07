package tr.com.metea.ecommerce.serviceview;

import tr.com.metea.ecommerce.domain.Cart;
import tr.com.metea.ecommerce.dto.CartReadDTO;
import tr.com.metea.ecommerce.dto.CartSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CartServiceView extends
        BaseServiceView<Cart, CartReadDTO, CartWriteDTO, CartSearchCriteriaDTO> {
}
