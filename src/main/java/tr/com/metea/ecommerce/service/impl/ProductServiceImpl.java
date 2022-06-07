package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.dto.ProductSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.ProductWriteDTO;
import tr.com.metea.ecommerce.service.CategoryService;
import tr.com.metea.ecommerce.service.DiscountService;
import tr.com.metea.ecommerce.service.InventoryService;
import tr.com.metea.ecommerce.service.ProductService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends BaseServiceImpl<Product, ProductWriteDTO, ProductSearchCriteriaDTO>
        implements ProductService {
    private final ModelMapper modelMapper;
    private final DiscountService discountService;
    private final InventoryService inventoryService;
    private final CategoryService categoryService;

    @Override
    public Product convertToEntity(ProductWriteDTO dto) {
        final var product = modelMapper.map(dto, Product.class);
        product.setDiscount(discountService.getById(dto.getDiscountId()));
        product.setCategory(categoryService.getById(dto.getCategoryId()));
        product.setInventory(inventoryService.getById(dto.getInventoryId()));
        return product;
    }

    @Override
    public Product mapDtoToEntity(Product entity, ProductWriteDTO dto) {
        if (!entity.getDiscount().getId().equals(dto.getDiscountId())) {
            entity.setDiscount(discountService.getById(dto.getDiscountId()));
        }
        if (!entity.getCategory().getId().equals(dto.getCategoryId())) {
            entity.setCategory(categoryService.getById(dto.getCategoryId()));
        }
        if (!entity.getInventory().getId().equals(dto.getInventoryId())) {
            entity.setInventory(inventoryService.getById(dto.getInventoryId()));
        }
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setCode(dto.getCode());
        entity.setPrice(dto.getPrice());

        return entity;
    }
}
