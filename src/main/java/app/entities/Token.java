package app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "TOKENS")
@Getter
@RequiredArgsConstructor
public class Token {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "tokenId", referencedColumnName = "userId")
    private User user;
    private Long tokenId;

    @Column (nullable = false)
    private String token;

}
