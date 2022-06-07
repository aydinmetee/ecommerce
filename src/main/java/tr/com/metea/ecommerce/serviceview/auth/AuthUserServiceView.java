package tr.com.metea.ecommerce.serviceview.auth;

import tr.com.metea.ecommerce.domain.auth.AuthUser;
import tr.com.metea.ecommerce.dto.auth.AuthUserLoginDTO;
import tr.com.metea.ecommerce.dto.auth.AuthUserRegisterDTO;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
public interface AuthUserServiceView {
    Boolean login(AuthUserLoginDTO authUserLoginDTO);

    Boolean save(AuthUserRegisterDTO authUserRegisterDTO);

    UserDetails loadUserByUsername(String username);

    AuthUser getSessionInfo(String username);
}
