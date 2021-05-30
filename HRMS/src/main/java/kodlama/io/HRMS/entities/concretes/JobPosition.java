package kodlama.io.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_positions")
public class JobPosition {

	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@NotBlank(message="Pozisyon alanı zorunludur")
	@Column(name="position")
	private String position;
}
