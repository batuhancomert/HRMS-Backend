package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.JobSeekerSkill;

public interface JobSeekerSkillDao extends JpaRepository<JobSeekerSkill, Integer> {

}
