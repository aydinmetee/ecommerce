package tr.com.metea.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import tr.com.metea.ecommerce.domain.Category;
import tr.com.metea.ecommerce.util.SearchCriteria;
import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Getter
@Setter
public class CategorySearchCriteriaDTO extends CategoryReadDTO implements BaseSearchCriteriaDTO<Category> {
    public SearchCriteriaOptions<Category> criteriaFieldMapper() {
        final var searchCriteriaOptions = new SearchCriteriaOptions<Category>();
        searchCriteriaOptions.add(new SearchCriteria("name", this.getName(), SearchCriteria.SearchOperation.LIKE));
        searchCriteriaOptions.add(new SearchCriteria("code", this.getDescription(), SearchCriteria.SearchOperation.LIKE));

        searchCriteriaOptions.add(new SearchCriteria("id", this.getId(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("creUser", this.getCreUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("updUser", this.getUpdUser(), SearchCriteria.SearchOperation.EQUAL));
        searchCriteriaOptions.add(new SearchCriteria("valid", this.getValid(), SearchCriteria.SearchOperation.EQUAL));
        return searchCriteriaOptions;
    }
}
