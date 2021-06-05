package kodlama.io.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employers")

public class Employer extends User{
	
	
	private int id;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="company_phone")
	private String companyPhone;
	
	@NotBlank(message="Bu Alanın Doldurulması Zorunlu")
	@Column(name="company_website")
	private String companyWebSite;
	
	@JsonIgnore
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisements;
	
	

}
