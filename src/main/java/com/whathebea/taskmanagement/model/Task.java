package com.whathebea.taskmanagement.model;

public class Task {
    private long id;
    private String description;
    private TaskStatus status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public enum TaskStatus {
        PENDING,
        IN_PROGRESS,
        DONE
    }
}
