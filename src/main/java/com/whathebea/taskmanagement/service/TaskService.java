package com.whathebea.taskmanagement.service;

import com.whathebea.taskmanagement.model.Task;
import com.whathebea.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> getTask(long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }

}
