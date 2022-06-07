package tr.com.metea.ecommerce.service;

import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.dto.ProductSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.ProductWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface ProductService extends
        BaseService<Product, ProductWriteDTO, ProductSearchCriteriaDTO> {
}
