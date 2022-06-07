package tr.com.metea.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tr.com.metea.ecommerce.domain.Discount;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface DiscountRepository extends JpaRepository<Discount, String>, JpaSpecificationExecutor<Discount> {
}
