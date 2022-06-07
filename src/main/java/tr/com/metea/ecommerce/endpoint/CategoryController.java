package tr.com.metea.ecommerce.endpoint;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.dto.CategoryReadDTO;
import tr.com.metea.ecommerce.dto.CategorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.CategoryWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@RestController
@RequestMapping("/category")
@Api(value = "/category")
public class CategoryController extends
        BaseController<Category, CategoryReadDTO, CategoryWriteDTO, CategorySearchCriteriaDTO> {
}
