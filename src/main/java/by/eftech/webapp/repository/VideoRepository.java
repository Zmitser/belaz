package by.eftech.webapp.repository;

import by.eftech.webapp.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface VideoRepository extends JpaRepository<Video, Integer> {
}
