package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Cart;
import tr.com.metea.ecommerce.dto.CartSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CartWriteDTO;
import tr.com.metea.ecommerce.service.CartService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CartServiceImpl extends BaseServiceImpl<Cart, CartWriteDTO, CartSearchCriteriaDTO>
        implements CartService {
    private final ModelMapper modelMapper;

    @Override
    public Cart convertToEntity(CartWriteDTO dto) {
        return modelMapper.map(dto, Cart.class);
    }

    @Override
    public Cart mapDtoToEntity(Cart entity, CartWriteDTO dto) {
        return entity;
    }
}
