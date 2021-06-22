package kodlama.io.HRMS.adapters;

import java.io.File;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlama.io.HRMS.core.utilities.image.ImageUploadCloudinaryService;

@Service
public class ImageUploadCloudinaryAdapter implements ImageUploadCloudinaryService {

	 Cloudinary cloudinary;

	    public ImageUploadCloudinaryAdapter() {
	        this.cloudinary = new com.cloudinary.Cloudinary(ObjectUtils.asMap(
	                "cloud_name","dqsui1mz7",
	                "api_key","711464732159579",
	                "api_secret","KmgxsC70D6btNxzkcnQzDO5VFgw"
	        ));
	    }

	    @Override
	    public String upload(File file) {
	        try {
	            Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	            return  (uploadResult.get("url").toString());
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
}
