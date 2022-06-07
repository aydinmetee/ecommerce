package tr.com.metea.ecommerce.serviceview;

import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.dto.CategoryReadDTO;
import tr.com.metea.ecommerce.dto.CategorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CategoryWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CategoryServiceView
        extends BaseServiceView<Category, CategoryReadDTO, CategoryWriteDTO, CategorySearchCriteriaDTO> {
}
