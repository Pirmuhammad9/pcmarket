package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.Address;
import comcompany.lesson2task2.entity.Attachment;
import comcompany.lesson2task2.projection.CustomAddress;
import comcompany.lesson2task2.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
