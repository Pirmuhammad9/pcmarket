package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
}
