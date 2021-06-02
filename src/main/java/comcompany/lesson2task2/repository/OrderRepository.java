package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Address;
import comcompany.lesson2task2.entity.Order;
import comcompany.lesson2task2.projection.CustomAddress;
import comcompany.lesson2task2.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
