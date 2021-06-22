package kodlama.io.HRMS.business.concretes;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobSeekerService;
import kodlama.io.HRMS.business.abstracts.PortraitService;
import kodlama.io.HRMS.core.utilities.image.ImageUploadCloudinaryService;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.PortraitDao;
import kodlama.io.HRMS.entities.concretes.Portrait;

@Service
public class PortraitManager implements PortraitService {

	private PortraitDao portraitDao;
	private ImageUploadCloudinaryService imageUploadCloudinaryService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public PortraitManager(PortraitDao portraitDao,ImageUploadCloudinaryService imageUploadCloudinaryService,JobSeekerService jobSeekerService) {
		this.portraitDao=portraitDao;		
		this.imageUploadCloudinaryService=imageUploadCloudinaryService;
		this.jobSeekerService=jobSeekerService;
	}
	
	 @Override
	 public Result add(int jobSeekerId,String path) {
		 
		  
	        File file= (new File(path));


	        String url=imageUploadCloudinaryService.upload(file);

	       
	        Portrait portrait=new Portrait();
	        portrait.setImageUrl(url);
	        portrait.setJobSeeker(jobSeekerService.getById(jobSeekerId).getData());

	       

	        portraitDao.save(portrait);
	        return new SuccessResult("Image Added");
			
	}
}
