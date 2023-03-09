package cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n03.model.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@Document(collection = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int kilograms;

    public Fruit (String name, int kilograms) {
        this.name = name;
        this.kilograms = kilograms;
    }


}

