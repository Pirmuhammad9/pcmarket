package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Address;
import comcompany.lesson2task2.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    String getName();
    Address getAddress();
    String getPhoneNUmber();
}
