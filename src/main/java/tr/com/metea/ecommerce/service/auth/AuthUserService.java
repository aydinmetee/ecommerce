package tr.com.metea.ecommerce.service.auth;

import tr.com.metea.ecommerce.domain.auth.AuthUser;
import tr.com.metea.ecommerce.dto.auth.AuthUserLoginDTO;
import tr.com.metea.ecommerce.dto.auth.AuthUserRegisterDTO;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
public interface AuthUserService {
    Boolean login(AuthUserLoginDTO authUserLoginDTO);

    AuthUser getSessionInfo();

    AuthUser getSessionInfo(String username);

    AuthUser save(AuthUserRegisterDTO authUserRegisterDTO);

}
