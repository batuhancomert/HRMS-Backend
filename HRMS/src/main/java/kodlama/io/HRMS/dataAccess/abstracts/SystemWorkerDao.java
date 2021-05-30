package kodlama.io.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.SystemWorker;

public interface SystemWorkerDao extends JpaRepository<SystemWorker, Integer> {


}
