package app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "USERS")
@RequiredArgsConstructor
@Getter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column (nullable = false, unique = true)
    private String userMail;

    @Column (nullable = false)
    private String password;
}
