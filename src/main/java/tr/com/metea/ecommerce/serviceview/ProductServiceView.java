package tr.com.metea.ecommerce.serviceview;

import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.dto.ProductReadDTO;
import tr.com.metea.ecommerce.dto.ProductSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.ProductWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface ProductServiceView extends
        BaseServiceView<Product, ProductReadDTO, ProductWriteDTO, ProductSearchCriteriaDTO> {
}
