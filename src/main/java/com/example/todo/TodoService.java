package com.example.todo;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.example.todo.Todo;
import com.example.todo.TodoRepository;

import java.util.*;

import javax.validation.OverridesAttribute;

// Do not modify the below code

public class TodoService implements TodoRepository {

    private static HashMap<Integer, Todo> todoList = new HashMap<>();

    public TodoService() {
        todoList.put(1, new Todo(1, "Watch Movie", "LOW", "TO DO"));
        todoList.put(2, new Todo(2, "Finish Project", "HIGH", "IN PROGRESS"));
        todoList.put(3, new Todo(3, "Buy Groceries", "MEDIUM", "TO DO"));
        todoList.put(4, new Todo(4, "Learning from NxtWave", "HIGH", "IN PROGRESS"));
        todoList.put(5, new Todo(5, "Go for a Run", "MEDIUM", "DONE"));

    }

    @Override
    public ArrayList<Todo> addTodo() {
        Collection<Todo> todoCollection = todoList.values();
        ArrayList<Todo> todo = new ArrayList<>(todoCollection);
        return todo;
    }

    @Override
    public Todo getTodoById(int id){
        Todo todo = todoList.get(id);
        if (todo == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return todo;
    }

}
