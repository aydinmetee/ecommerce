package tr.com.metea.ecommerce.domain.auth;

import lombok.*;
import tr.com.metea.ecommerce.util.IdGenerator;

import javax.persistence.*;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "auth_user")
public class AuthUser {
    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String id;
    @Column(name = "username", length = 100, unique = true)
    private String username;
    @Column(name = "password", length = 200)
    private String password;
    @Column(name = "first_name", length = 200)
    private String firstName;
    @Column(name = "last_name", length = 200)
    private String lastName;
    @Column(name = "phone_number", length = 11)
    private String phoneNumber;
    @Column(name = "email", length = 100, unique = true)
    private String email;
    @Column(name = "auth_type")
    @Enumerated(EnumType.STRING)
    private AuthType type;

    public enum AuthType {
        USER,
        ADMIN
    }

    @PrePersist
    public void onPrePersist() {
        setId(IdGenerator.getUUID());
    }

}
