package kodlama.io.HRMS.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HRMS.business.abstracts.SystemWorkerService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.SystemWorker;

@RestController
@RequestMapping("/api/system_worker")

public class SystemWorkerController {

	
	private SystemWorkerService systemWorkerService;

	@Autowired
	public SystemWorkerController (SystemWorkerService systemWorkerService) {
		super();
		this.systemWorkerService = systemWorkerService;
	}
	@GetMapping("/getall")
	public DataResult<List<SystemWorker>> getAll(){
		return this.systemWorkerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@Valid @RequestBody SystemWorker systemWorker) {
		return this.systemWorkerService.add(systemWorker);
	}
}
