package at.geise.test.webapp.jpa;

import lombok.*;

import javax.persistence.*;
import java.io.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nachname;
    private String vorname;
}
