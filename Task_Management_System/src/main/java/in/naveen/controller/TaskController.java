package in.naveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.naveen.entity.Task;
import in.naveen.repo.TaskRepository;
import in.naveen.service.TaskService;

@RestController
@CrossOrigin
public class TaskController {
	
	private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

//    @GetMapping("/{taskId}")
//    public Task getTaskById(@PathVariable Long taskId) {
//        return taskRepository.findById(taskId).orElse(null);
//    }

//    @PostMapping
//    public Task createTask(@RequestBody Task task) {
//        // Additional logic can be added if needed
//        return taskRepository.save(task);
//    }

//    @PutMapping("/{taskId}")
//    public Task updateTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
//        // Additional logic can be added if needed
//        updatedTask.setId(taskId);
//        return taskRepository.save(updatedTask);
//    }

//    @DeleteMapping("/{taskId}")
//    public void deleteTask(@PathVariable Long taskId) {
//        taskRepository.deleteById(taskId);
//    }
}
