package kodlama.io.HRMS.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="application_deadline")
	private String applicationDeadline;
	
	@Column(name="created_date")
	private String createdDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="min_salary")
	private String minSalary;
	
	@Column(name="max_salary")
	private String maxSalary;
	
	@Column(name="open_position")
	private String openPosition;
	
	@ManyToOne
	@JoinColumn(name="employers")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name="cities")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_position")
	private JobPosition jobPosition;
}
