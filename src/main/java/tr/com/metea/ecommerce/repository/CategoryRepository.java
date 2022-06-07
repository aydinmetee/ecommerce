package tr.com.metea.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tr.com.metea.ecommerce.domain.Category;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CategoryRepository extends JpaRepository<Category, String>, JpaSpecificationExecutor<Category> {
}
