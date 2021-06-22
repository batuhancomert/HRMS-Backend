package kodlama.io.HRMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="business_experiences")
public class BusinessExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String position;
	
	@Column(name="starting_date")
	private LocalDate startingDate;
	
	@Column(name="termination_date",nullable = true)
	private LocalDate terminationDate;
	
	@Column(name="company_name")
	private String companyName;
	
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	public String getTerminationDate() {

		if (terminationDate == null) {
			
			return "Devam ediyor.";
		}

		return terminationDate.toString();
	}
}
