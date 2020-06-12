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

    @GetMapping
    public List<Student> showAllHandler(){
        return services.showAll();
    }

    @GetMapping("/{collage}")
    public List<Student> getByCollege(@PathVariable String collage){
        return services.findByCollage(collage);
    }

    @PostMapping
    public ResponseEntity<String> addHandler(@RequestBody Student student){
        return services.addStudent(student);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<String> updateHandler(@PathVariable long studentId , @RequestBody Student student){
        return services.updateStudent(studentId ,student) ;
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteHandler(@PathVariable long studentId){
        return services.deleteStudent(studentId);
    }


}
