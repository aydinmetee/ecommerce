package tr.com.metea.ecommerce.domain;

import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import tr.com.metea.ecommerce.util.IdGenerator;
import tr.com.metea.ecommerce.util.SessionContext;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Mete Aydin
 * @date 17.10.2021
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String id;
    @Column(name = "CRE_USER", length = 36)
    private String creUser;
    @Column(name = "cre_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creDate;
    @Column(name = "UPD_USER", length = 36)
    private String updUser;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updDate;
    @Column(name = "valid")
    @Type(type = "yes_no")
    private Boolean valid;


    @PrePersist
    public void onPrePersist() {
        setId(IdGenerator.getUUID());
        setCreUser(SessionContext.getSessionData().getUserId());
        setValid(Boolean.TRUE);
        this.creDate = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdUser(SessionContext.getSessionData().getUserId());
        this.updDate = new Date();
    }

}
