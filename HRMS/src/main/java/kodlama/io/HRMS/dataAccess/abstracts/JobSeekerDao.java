package kodlama.io.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	boolean existsByNationalityId(String nationalityId);
	boolean existsByEmail(String email);
}
