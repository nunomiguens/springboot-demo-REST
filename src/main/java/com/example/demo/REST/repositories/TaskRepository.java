package com.example.demo.REST.repositories;

import com.example.demo.REST.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
