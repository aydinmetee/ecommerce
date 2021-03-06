package tr.com.metea.ecommerce.util;

import lombok.*;

/**
 * @author Mete Aydin
 * @date 17.10.2021
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class SearchCriteria {
    private String key;
    private Object value;
    private SearchOperation operation;

    public enum SearchOperation {
        GREATER_THAN,
        LESS_THAN,
        GREATER_THAN_EQUAL,
        LESS_THAN_EQUAL,
        NOT_EQUAL,
        EQUAL,
        LIKE,
        MATCH_END,
    }
}
