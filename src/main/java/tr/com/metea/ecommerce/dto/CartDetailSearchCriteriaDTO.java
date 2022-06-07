package tr.com.metea.ecommerce.dto;

import tr.com.metea.ecommerce.domain.CartDetail;
import tr.com.metea.ecommerce.util.SearchCriteria;
import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public class CartDetailSearchCriteriaDTO extends CartDetailReadDTO implements BaseSearchCriteriaDTO<CartDetail> {
    @Override
    public SearchCriteriaOptions<CartDetail> criteriaFieldMapper() {
        final var searchCriteriaOptions = new SearchCriteriaOptions<CartDetail>();

        searchCriteriaOptions.add(new SearchCriteria("id", this.getId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("creUser", this.getCreUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("updUser", this.getUpdUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("valid", this.getValid(), SearchCriteria.SearchOperation.EQUAL));
        return searchCriteriaOptions;
    }
}
