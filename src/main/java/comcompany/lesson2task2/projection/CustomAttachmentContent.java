package comcompany.lesson2task2.projection;

import comcompany.lesson2task2.entity.Attachment;
import comcompany.lesson2task2.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
