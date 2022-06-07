package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import tr.com.metea.ecommerce.domain.Discount;
import tr.com.metea.ecommerce.util.SearchCriteria;
import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class DiscountSearchCriteriaDTO extends DiscountReadDTO implements BaseSearchCriteriaDTO<Discount> {

    @Override
    public SearchCriteriaOptions<Discount> criteriaFieldMapper() {
        final var searchCriteriaOptions = new SearchCriteriaOptions<Discount>();
        searchCriteriaOptions.add(new SearchCriteria("ratio", this.getRatio(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("name", this.getName(), SearchCriteria.SearchOperation.LIKE));
        searchCriteriaOptions.add(new SearchCriteria("description", this.getDescription(), SearchCriteria.SearchOperation.LIKE));

        searchCriteriaOptions.add(new SearchCriteria("id", this.getId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("creUser", this.getCreUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("updUser", this.getUpdUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("valid", this.getValid(), SearchCriteria.SearchOperation.EQUAL));
        return searchCriteriaOptions;
    }
}
