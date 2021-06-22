package kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.JobSeekerEducationService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobSeekerEducation;

@RestController
@RequestMapping("/api/job_seeker_education")

public class JobSeekerEducationController {

	private JobSeekerEducationService jobSeekerEducationService;

	@Autowired
	public JobSeekerEducationController(JobSeekerEducationService jobSeekerEducationService) {
		super();
		this.jobSeekerEducationService = jobSeekerEducationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekerEducation>> getAll(){
		return this.jobSeekerEducationService.getAll();
	}
	
	@GetMapping("/getAllByJobSeekerIdOrderByGraduationDateDesc")
	public DataResult<List<JobSeekerEducation>> getAllByJobSeekerIdOrderByGraduationDateDesc(int jobSeekerId) {
		return this.jobSeekerEducationService.getAllByJobSeekerIdOrderByGraduationDateDesc(jobSeekerId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerEducation jobSeekerEducation) {
		return this.jobSeekerEducationService.add(jobSeekerEducation);
	  }
	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeekerEducation jobSeekerEducation) {
		return this.jobSeekerEducationService.delete(jobSeekerEducation);
	  }
}
