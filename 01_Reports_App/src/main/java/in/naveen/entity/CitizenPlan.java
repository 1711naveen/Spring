package in.naveen.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity()
@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planstatus;
	private LocalDate planStartDate;
	private LocalDate planDate;
	private Double benefitAmount;
	private String denialReason;
	private LocalDate terminatedDate;
	private String terminationReason;
}