package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.CartDetail;
import tr.com.metea.ecommerce.dto.CartDetailReadDTO;
import tr.com.metea.ecommerce.dto.CartDetailSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartDetailWriteDTO;
import tr.com.metea.ecommerce.serviceview.CartDetailServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CartDetailServiceViewImpl extends
        BaseServiceViewImpl<CartDetailReadDTO, CartDetailWriteDTO, CartDetail, CartDetailSearchCriteriaDTO>
        implements CartDetailServiceView {
    private final ModelMapper modelMapper;

    @Override
    public CartDetailReadDTO convertToDTO(CartDetail cartDetail) {
        final var dto = modelMapper.map(cartDetail, CartDetailReadDTO.class);
        dto.setCartId(cartDetail.getCart().getId());
        dto.setProductName(cartDetail.getProduct().getName());
        dto.setProductId(cartDetail.getProduct().getId());
        return dto;
    }
}
