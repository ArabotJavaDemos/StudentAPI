package io.arabot.app.controller;


import io.arabot.app.entity.Student;
import io.arabot.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService services ;

    @GetMapping(produces = "application/json")
    public ResponseEntity showAllHandler(){
        return services.showAll();
    }

    @GetMapping("/{collage}")
    public List<Student> getStudentByCollege(@PathVariable String collage){
        return services.findByCollage(collage);
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return services.addStudent(student);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<String> updateStudent(@PathVariable long studentId , @RequestBody Student student){
        return services.updateStudent(studentId ,student) ;
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable long studentId){
        return services.deleteStudent(studentId);
    }


}
