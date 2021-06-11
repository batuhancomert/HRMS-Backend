package kodlama.io.HRMS.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.JobAdvertisementService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Employer;
import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/job_advertisements")

public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}

	@PostMapping("/add")
	public Result add(@Valid @RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}

	@DeleteMapping("/delete")
	public Result delete(@Valid @RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.delete(jobAdvertisement);
	}
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return this.jobAdvertisementService.getByIsActiveTrue();
	}

	@GetMapping("/getByOrderByApplicationDeadline")
	public DataResult<List<JobAdvertisement>> getByOrderByApplicationDeadline() {
		return this.jobAdvertisementService.getByOrderByApplicationDeadline();	}

	@GetMapping("/getByIsActiveTrueAndEmployer")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_Id(int employerId) {
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployer_Id(employerId);
	}
	
}
