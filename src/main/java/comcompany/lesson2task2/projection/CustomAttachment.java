package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    Double getSize();
    String getContentType();
}
