package tr.com.metea.ecommerce.serviceview.auth.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.auth.AuthUser;
import tr.com.metea.ecommerce.dto.auth.AuthUserLoginDTO;
import tr.com.metea.ecommerce.dto.auth.AuthUserRegisterDTO;
import tr.com.metea.ecommerce.service.auth.impl.AuthUserServiceImpl;
import tr.com.metea.ecommerce.serviceview.auth.AuthUserServiceView;

import java.util.Objects;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
@Service
@RequiredArgsConstructor
public class AuthUserServiceViewImpl implements AuthUserServiceView {
    private final AuthUserServiceImpl authUserService;

    @Override
    public Boolean login(AuthUserLoginDTO authUserLoginDTO) {
        return authUserService.login(authUserLoginDTO);
    }

    @Override
    public Boolean save(AuthUserRegisterDTO authUserRegisterDTO) {
        final var authUser = authUserService.save(authUserRegisterDTO);
        if (Objects.isNull(authUser)) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return authUserService.loadUserByUsername(username);
    }

    @Override
    public AuthUser getSessionInfo(String username) {
        return authUserService.getSessionInfo(username);
    }
}
