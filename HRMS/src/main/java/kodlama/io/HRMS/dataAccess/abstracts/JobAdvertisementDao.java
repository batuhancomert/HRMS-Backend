package kodlama.io.HRMS.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	
	   List<JobAdvertisement> getByIsActive(boolean isActive); 
	   
	   List<JobAdvertisement> getByOrderByApplicationDeadline(); 
	   
	   List<JobAdvertisement> getByIsActiveAndEmployer_companyName(boolean status, String companyName);
	   
	   
	 }
