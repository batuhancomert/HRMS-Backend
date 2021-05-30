package kodlama.io.HRMS.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seekers")
public class JobSeeker extends User {

	private int id;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="nationality_id")
	private String nationalityId;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
}
