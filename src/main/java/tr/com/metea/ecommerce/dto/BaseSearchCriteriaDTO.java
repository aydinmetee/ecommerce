package tr.com.metea.ecommerce.dto;

import tr.com.metea.ecommerce.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */

public interface BaseSearchCriteriaDTO<E> {
    SearchCriteriaOptions<E> criteriaFieldMapper();
}
