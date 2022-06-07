package tr.com.metea.ecommerce.endpoint;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.dto.ProductReadDTO;
import tr.com.metea.ecommerce.dto.ProductSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.ProductWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@RestController
@RequestMapping("/product")
@Api(value = "/product")
public class ProductController extends
        BaseController<Product, ProductReadDTO, ProductWriteDTO, ProductSearchCriteriaDTO> {
}
