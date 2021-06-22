package kodlama.io.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.HRMS.entities.concretes.BusinessExperience;

@Repository
public interface BusinessExperienceDao extends JpaRepository<BusinessExperience, Integer> {

	List<BusinessExperience> getAllByJobSeeker_IdOrderByTerminationDateDesc(int jobSeekerId);
}
