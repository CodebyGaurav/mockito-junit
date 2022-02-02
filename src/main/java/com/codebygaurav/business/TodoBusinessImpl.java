package com.codebygaurav.business;

import java.util.ArrayList;
import java.util.List;

import com.codebygaurav.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filleredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		for(String todo : todos) {
			if(todo.contains("Spring")) {
				filleredTodos.add(todo);
			}
		}
		
		return null;
		
	}
	
}
