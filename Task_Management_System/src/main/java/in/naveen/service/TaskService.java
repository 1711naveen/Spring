package in.naveen.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	public List<String> getTaskStatus(){
		return Arrays.asList("ToDo", "Active", "Completed");
	}
}
