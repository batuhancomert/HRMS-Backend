package kodlama.io.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	
	List<JobAdvertisement> getByIsActive(boolean isActive);
	
	List<JobAdvertisement> getByIsActiveOrderByApplicationDeadline(boolean isActive);
	
	List<JobAdvertisement> getByIsActiveAndEmployer_CompanyName(boolean status, String companyName);
}
