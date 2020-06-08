package com.project.app.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentRoute {

    @Autowired
    StudentServices services ;

    @GetMapping
    public List<Student> showAllHandler(){
        return services.showAll();
    }

    @GetMapping("/{collage}")
    public List<Student> getByCollege(@PathVariable String collage){
        return services.findByCollage(collage);
    }

    @PostMapping
    public Student addHandler(@RequestBody Student student){
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
