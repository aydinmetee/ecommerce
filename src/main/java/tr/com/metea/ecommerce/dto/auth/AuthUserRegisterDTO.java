package tr.com.metea.ecommerce.dto.auth;

import lombok.*;
import tr.com.metea.ecommerce.domain.auth.AuthUser;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserRegisterDTO extends AuthUserLoginDTO {
    private AuthUser.AuthType type;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
