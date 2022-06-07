package tr.com.metea.ecommerce.dto.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class TokenResponseDTO {
    private String accessToken;
    private String userName;
    private String userId;
    private Date expiredTime;
}
