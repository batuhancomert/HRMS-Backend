package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer> {

}
