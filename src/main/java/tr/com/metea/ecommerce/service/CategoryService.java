package tr.com.metea.ecommerce.service;

import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.dto.CategorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CategoryWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CategoryService extends BaseService<Category, CategoryWriteDTO, CategorySearchCriteriaDTO> {
}
