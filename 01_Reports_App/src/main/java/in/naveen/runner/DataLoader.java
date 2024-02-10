package in.naveen.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.naveen.entity.CitizenPlan;
import in.naveen.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName(null);
	}

}
