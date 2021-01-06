package app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "WARES")
@RequiredArgsConstructor
@Getter
public class Ware {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long wareId;

    @Column (nullable = false)
    private String code;

    @Column (nullable = false)
    private String  name;

    @Column (nullable = false)
    private String type;

    @Column (nullable = false)
    private Integer count;

    @Column (nullable = false)
    private Double price;

    @OneToOne
    @JoinColumn(name = "wareId", referencedColumnName = "merchantId")
    private Merchant merchant;
}
