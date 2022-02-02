package com.codebygaurav.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.codebygaurav.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoServiceStub todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filleredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dumpy");
		assertEquals(2, filleredTodos.size());
	}

}
