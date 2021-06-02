package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Address;
import comcompany.lesson2task2.entity.Product;
import comcompany.lesson2task2.projection.CustomAddress;
import comcompany.lesson2task2.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
