package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.dto.ProductReadDTO;
import tr.com.metea.ecommerce.dto.ProductSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.ProductWriteDTO;
import tr.com.metea.ecommerce.serviceview.ProductServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class ProductServiceViewImpl extends
        BaseServiceViewImpl<ProductReadDTO, ProductWriteDTO, Product, ProductSearchCriteriaDTO>
        implements ProductServiceView {
    private final ModelMapper modelMapper;

    @Override
    public ProductReadDTO convertToDTO(Product product) {
        final var dto = modelMapper.map(product, ProductReadDTO.class);
        dto.setQuantity(product.getInventory().getQuantity());
        dto.setCategoryName(product.getCategory().getName());
        dto.setDiscountRatio(product.getDiscount().getRatio());
        dto.setCategoryId(product.getCategory().getId());
        dto.setInventoryId(product.getInventory().getId());
        dto.setDiscountId(product.getDiscount().getId());
        return dto;
    }
}
