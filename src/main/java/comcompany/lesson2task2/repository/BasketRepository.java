package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Basket;
import comcompany.lesson2task2.projection.CustomBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
