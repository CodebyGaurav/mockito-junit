package com.codebygaurav.data.api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn spring MVC","Learn spring", "Learn to Sports");
	}

}
