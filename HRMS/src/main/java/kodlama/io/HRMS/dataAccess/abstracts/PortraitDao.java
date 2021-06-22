package kodlama.io.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.Portrait;

public interface PortraitDao extends JpaRepository<Portrait, Integer> {

	 List<Portrait> getByJobSeeker_Id(int jobSeekerid);
}
