package sample.multimodule.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import sample.multimodule.domain.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
