package com.example.demo.REST.requests;

import com.example.demo.REST.entities.TaskStatusEnum;

import java.util.Date;

public record UpdateTaskInput(TaskStatusEnum status, Date dueDate) {

}
