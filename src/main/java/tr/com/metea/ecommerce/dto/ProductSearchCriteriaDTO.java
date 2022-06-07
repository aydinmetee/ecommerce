package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import tr.com.metea.ecommerce.domain.Product;
import tr.com.metea.ecommerce.util.SearchCriteria;
import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class ProductSearchCriteriaDTO extends ProductReadDTO implements BaseSearchCriteriaDTO<Product> {
    @Override
    public SearchCriteriaOptions<Product> criteriaFieldMapper() {
        final var searchCriteriaOptions = new SearchCriteriaOptions<Product>();
        searchCriteriaOptions.add(new SearchCriteria("name", this.getName(), SearchCriteria.SearchOperation.LIKE));
        searchCriteriaOptions.add(new SearchCriteria("description", this.getDescription(), SearchCriteria.SearchOperation.LIKE));

        searchCriteriaOptions.add(new SearchCriteria("category/id", this.getCategoryId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("category/name", this.getCategoryName(), SearchCriteria.SearchOperation.LIKE));

        searchCriteriaOptions.add(new SearchCriteria("inventory/id", this.getInventoryId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("inventory/quantity", this.getQuantity(), SearchCriteria.SearchOperation.EQUAL));

        searchCriteriaOptions.add(new SearchCriteria("discount/id", this.getDiscountId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("discount/ratio", this.getDiscountRatio(), SearchCriteria.SearchOperation.EQUAL));

        searchCriteriaOptions.add(new SearchCriteria("id", this.getId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("creUser", this.getCreUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("updUser", this.getUpdUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("valid", this.getValid(), SearchCriteria.SearchOperation.EQUAL));
        return searchCriteriaOptions;
    }
}
