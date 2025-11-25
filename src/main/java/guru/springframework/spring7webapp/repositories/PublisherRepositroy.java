package guru.springframework.spring7webapp.repositories;

import guru.springframework.spring7webapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepositroy extends JpaRepository<Publisher, Long> {
}
