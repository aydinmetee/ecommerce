package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.dto.CategorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CategoryWriteDTO;
import tr.com.metea.ecommerce.service.CategoryService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryWriteDTO, CategorySearchCriteriaDTO>
        implements CategoryService {

    private final ModelMapper modelMapper;

    @Override
    public Category convertToEntity(CategoryWriteDTO dto) {
        return modelMapper.map(dto, Category.class);
    }

    @Override
    public Category mapDtoToEntity(Category entity, CategoryWriteDTO dto) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }
}
