package kodlama.io.HRMS.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.JobPositionService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_position")
public class JobPositionController {

	@Autowired
	private JobPositionService jobPositionService ;

	
	public JobPositionController (JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
	}
	@PostMapping("/add")
	public Result add(@Valid @RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
}
