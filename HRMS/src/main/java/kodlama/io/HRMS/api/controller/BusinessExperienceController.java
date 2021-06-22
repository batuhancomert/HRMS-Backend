package kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.BusinessExperienceService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.BusinessExperience;

@RestController
@RequestMapping("/api/business_experience")

public class BusinessExperienceController {

	private BusinessExperienceService businessExperienceService;
	
	@Autowired
	public BusinessExperienceController(BusinessExperienceService businessExperienceService) {
		super();
		this.businessExperienceService = businessExperienceService;
	}


	@GetMapping("/getall")
	public DataResult<List<BusinessExperience>> getAll(){
		return this.businessExperienceService.getAll();
	}
	
	@GetMapping("/getAllByJobSeekerIdOrderByTerminationDateDesc")
	public DataResult<List<BusinessExperience>> getAllByJobSeekerIdOrderByTerminationDateDesc(int jobSeekerId) {
		
		return this.businessExperienceService.getAllByJobSeekerIdOrderByTerminationDateDesc(jobSeekerId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody BusinessExperience businessExperience) {
		return this.businessExperienceService.add(businessExperience);
	  }
	@PostMapping("/delete")
	public Result delete(@RequestBody BusinessExperience businessExperience) {
		return this.businessExperienceService.delete(businessExperience);
	  }
}
