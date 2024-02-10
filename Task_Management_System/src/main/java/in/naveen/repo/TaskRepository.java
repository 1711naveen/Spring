package in.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naveen.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
