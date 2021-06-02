package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getRegion();
    String getDistrict();
    String getStreet();
}
