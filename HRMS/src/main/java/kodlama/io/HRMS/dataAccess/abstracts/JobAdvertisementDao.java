package kodlama.io.HRMS.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	
	   List<JobAdvertisement> getByIsActiveTrue(); 
	   
	   List<JobAdvertisement> getByOrderByApplicationDeadline(); 
	   
	   List<JobAdvertisement> getByIsActiveTrueAndEmployer_Id(int employerId);
	   
	   
	 }
