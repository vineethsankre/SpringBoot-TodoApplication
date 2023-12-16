package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.*;

@RestController
public class TodoController {
    TodoService todoService = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> addTodo() {
        return todoService.addTodo();
    }
    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable("id") int id){
        return todoService.getTodoById(id);
    }
}
