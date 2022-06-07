package tr.com.metea.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tr.com.metea.ecommerce.domain.Cart;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface CartRepository extends JpaRepository<Cart, String>, JpaSpecificationExecutor<Cart> {
}
