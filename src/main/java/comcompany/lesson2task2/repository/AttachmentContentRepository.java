package comcompany.lesson2task2.repository;

import comcompany.lesson2task2.entity.AttachmentContent;
import comcompany.lesson2task2.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
