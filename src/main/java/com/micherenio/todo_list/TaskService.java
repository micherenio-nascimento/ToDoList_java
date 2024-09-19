package com.micherenio.todo_list;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
 
    private List<Task> tasks = new ArrayList<>();
    private long idCounter = 1;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task addTask(String description) {
        Task newTask = new Task(idCounter++, description);
        tasks.add(newTask);
        return newTask;
    }

    public Task updateTask(long id, String description, boolean completed) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDescription(description);
                task.setCompleted(completed);
                return task;
            }
        }
        return null;
    }

    public boolean deleteTask(long id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

	public Task getTaskById(long id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new RuntimeException("Task with ID " + id + " not found");
    }
    
}