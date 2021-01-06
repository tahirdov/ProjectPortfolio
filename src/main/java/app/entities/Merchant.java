package app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "MERCHANTS")
@RequiredArgsConstructor
@Getter
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchantId;

    @Column (nullable = false, unique = true)
    private String businessName;

    @Column (nullable = false, unique = true)
    private String businessMail;

    @Column (nullable = false)
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "merchantId", referencedColumnName = "userId")
    private User user;

}
