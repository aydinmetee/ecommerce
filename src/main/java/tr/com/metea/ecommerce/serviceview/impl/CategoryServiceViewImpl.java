package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.dto.CategoryReadDTO;
import tr.com.metea.ecommerce.dto.CategorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CategoryWriteDTO;
import tr.com.metea.ecommerce.service.CategoryService;
import tr.com.metea.ecommerce.serviceview.CategoryServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceViewImpl
        extends BaseServiceViewImpl<CategoryReadDTO, CategoryWriteDTO, Category, CategorySearchCriteriaDTO, CategoryService>
        implements CategoryServiceView {

    private final ModelMapper modelMapper;

    @Override
    public CategoryReadDTO convertToDTO(Category category) {
        return modelMapper.map(category, CategoryReadDTO.class);
    }
}
