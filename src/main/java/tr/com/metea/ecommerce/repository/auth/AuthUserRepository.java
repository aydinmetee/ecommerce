package tr.com.metea.ecommerce.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.metea.ecommerce.domain.auth.AuthUser;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
public interface AuthUserRepository extends JpaRepository<AuthUser, String> {
    AuthUser findAuthUserByUsername(String username);
}
