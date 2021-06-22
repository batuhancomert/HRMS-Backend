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
@Table(name="job_seeker_educations")
public class JobSeekerEducation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="starting_date")
	private LocalDate startingDate;
	
	@Column(name="graduation_date")
	private LocalDate graduationDate;
	
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne
	@JoinColumn(name = "education_id")
	private Education education;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public String getGraduationDate() {

		if (graduationDate == null) {
			return "Devam ediyor.";
		}

		return graduationDate.toString();
	}
}
