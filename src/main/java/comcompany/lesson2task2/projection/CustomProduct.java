package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Attachment;
import comcompany.lesson2task2.entity.Category;
import comcompany.lesson2task2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    String getDescription();
    String getInfo();
    Double getPrice();
    Integer getWarrenty();
    Category getCategory();
    Attachment getAttachment();
}
