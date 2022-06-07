package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.CartDetail;
import tr.com.metea.ecommerce.dto.CartDetailSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartDetailWriteDTO;
import tr.com.metea.ecommerce.service.CartDetailService;
import tr.com.metea.ecommerce.service.CartService;
import tr.com.metea.ecommerce.service.ProductService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CartDetailServiceImpl extends BaseServiceImpl<CartDetail, CartDetailWriteDTO, CartDetailSearchCriteriaDTO>
        implements CartDetailService {
    private final ModelMapper modelMapper;
    private final ProductService productService;
    private final CartService cartService;

    @Override
    public CartDetail convertToEntity(CartDetailWriteDTO dto) {
        final var cartDetail = modelMapper.map(dto, CartDetail.class);
        cartDetail.setProduct(productService.getById(dto.getProductId()));
        cartDetail.setCart(cartService.getById(dto.getCartId()));
        return cartDetail;
    }

    @Override
    public CartDetail mapDtoToEntity(CartDetail entity, CartDetailWriteDTO dto) {
        entity.setQuantity(dto.getQuantity());
        return entity;
    }
}
