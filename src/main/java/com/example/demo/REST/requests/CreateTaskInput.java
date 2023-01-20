package com.example.demo.REST.requests;

import com.example.demo.REST.entities.Task;
import com.example.demo.REST.entities.TaskStatusEnum;

import java.util.Date;

public record CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
    public Task toTask() {
        Task task = new Task();

        task.setName(name);
        task.setDescription(description);
        task.setStatus(status);
        task.setDueDate(dueDate);

        return task;
    }
}
