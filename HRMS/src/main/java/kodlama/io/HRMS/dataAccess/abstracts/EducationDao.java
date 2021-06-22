package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.HRMS.entities.concretes.Education;

@Repository
public interface EducationDao extends JpaRepository<Education, Integer> {

	boolean existsByEducationName(String education);
}
