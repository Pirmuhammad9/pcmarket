package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Address;
import comcompany.lesson2task2.entity.Category;
import comcompany.lesson2task2.projection.CustomAddress;
import comcompany.lesson2task2.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
