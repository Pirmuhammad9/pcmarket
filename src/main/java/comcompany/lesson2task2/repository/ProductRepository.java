package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Product;
import comcompany.lesson2task2.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
