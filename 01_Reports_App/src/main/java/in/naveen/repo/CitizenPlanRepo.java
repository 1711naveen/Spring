package in.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naveen.entity.CitizenPlan;

public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Integer> {

}
