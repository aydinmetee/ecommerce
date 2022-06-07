package tr.com.metea.ecommerce.dto;

import tr.com.metea.ecommerce.domain.Inventory;
import tr.com.metea.ecommerce.util.SearchCriteria;
import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public class InventorySearchCriteriaDTO extends InventoryReadDTO implements BaseSearchCriteriaDTO<Inventory> {
    @Override
    public SearchCriteriaOptions<Inventory> criteriaFieldMapper() {
        final var searchCriteriaOptions = new SearchCriteriaOptions<Inventory>();
        searchCriteriaOptions.add(new SearchCriteria("quantity", this.getQuantity(), SearchCriteria.SearchOperation.EQUAL));

        searchCriteriaOptions.add(new SearchCriteria("id", this.getId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("creUser", this.getCreUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("updUser", this.getUpdUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("valid", this.getValid(), SearchCriteria.SearchOperation.EQUAL));
        return searchCriteriaOptions;
    }
}
