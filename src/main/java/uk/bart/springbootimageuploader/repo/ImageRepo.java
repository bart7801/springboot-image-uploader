package uk.bart.springbootimageuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.bart.springbootimageuploader.model.Image;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {

}
