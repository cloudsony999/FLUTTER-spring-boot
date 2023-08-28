package com.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.todo.Task.TaskItem;
import com.todo.Task.TaskRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TaskItem t1 = new TaskItem("eat", true);
		TaskItem t2 = new TaskItem("eat", true);
		TaskItem t3 = new TaskItem("eat", true);
		TaskItem t4 = new TaskItem("eat", true);
		TaskItem t5 = new TaskItem("eat", true);
		List<TaskItem> tl = Arrays.asList(t1, t2, t3, t4, t5);
		taskRepository.saveAll(tl);
		System.out.println("----------saved-------------");

	}

}
