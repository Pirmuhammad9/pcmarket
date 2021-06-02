package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Basket;
import comcompany.lesson2task2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;

@Projection(types = Basket.class)
public interface CustomBasket {
    Integer getId();
    Product getProduct();
    Double getPrice();
    Integer getQuentity();
}
