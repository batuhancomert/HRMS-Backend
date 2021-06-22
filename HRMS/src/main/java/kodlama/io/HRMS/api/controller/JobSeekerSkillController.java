package kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.JobSeekerSkillService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobSeekerSkill;

@RestController
@RequestMapping("/api/job_seeker_skill")

public class JobSeekerSkillController {

	private JobSeekerSkillService jobSeekerSkillService;

	@Autowired
	public JobSeekerSkillController(JobSeekerSkillService jobSeekerSkillService) {
		super();
		this.jobSeekerSkillService = jobSeekerSkillService;
	}
	

	@GetMapping("/getall")
	public DataResult<List<JobSeekerSkill>> getAll(){
		return this.jobSeekerSkillService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerSkill jobSeekerSkill) {
		return this.jobSeekerSkillService.add(jobSeekerSkill);
	  }
	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeekerSkill jobSeekerSkill) {
		return this.jobSeekerSkillService.delete(jobSeekerSkill);
	  }
}
