package be.businesstraining.myimmowebback.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "immos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Immo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adress;
    private String pictureUrl;
    private BigDecimal surfaceArea;
    private BigDecimal price;
    private String contact;


}
