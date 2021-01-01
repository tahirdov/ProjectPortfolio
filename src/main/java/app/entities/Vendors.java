package app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "VENDORS")
@RequiredArgsConstructor
@Getter
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendorId;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false, unique = true)
    private String address;
}
