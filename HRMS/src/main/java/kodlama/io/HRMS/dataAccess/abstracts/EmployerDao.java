package kodlama.io.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	boolean existsByEmail(String email);
	
}
