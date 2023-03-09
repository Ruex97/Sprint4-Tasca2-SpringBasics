package cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n02.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    List<Fruit> findByName(String name);


}
