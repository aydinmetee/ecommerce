package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Cart;
import tr.com.metea.ecommerce.dto.CartReadDTO;
import tr.com.metea.ecommerce.dto.CartSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartWriteDTO;
import tr.com.metea.ecommerce.serviceview.CartServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CartServiceViewImpl extends
        BaseServiceViewImpl<CartReadDTO, CartWriteDTO, Cart, CartSearchCriteriaDTO>
        implements CartServiceView {
    private final ModelMapper modelMapper;

    @Override
    public CartReadDTO convertToDTO(Cart cart) {
        return modelMapper.map(cart, CartReadDTO.class);
    }
}
