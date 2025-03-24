package ibm.com.demo.springbootai.repository;

import ibm.com.demo.springbootai.model.Bubble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BubbleRepository extends JpaRepository<Bubble, Long> {
} 