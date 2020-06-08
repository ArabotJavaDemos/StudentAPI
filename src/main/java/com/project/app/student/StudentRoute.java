package com.project.app.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRoute {

    @Autowired
    StudentServices services ;

    @GetMapping("/student")
    public List<Student> showAllHandler(){
        return services.showAll();
    }

    @GetMapping("/student/{collage}")
    public List<Student> getByCollege(@PathVariable String collage){
        return services.findByCollage(collage);
    }

    @PostMapping("/student")
    public Student addHandler(@RequestBody Student student){
        return services.addStudent(student);
    }

    @PutMapping("/student/{studentId}")
    public Student updateHandler(@PathVariable long studentId , @RequestBody Student student){
        return services.updateStudent(student) ;
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteHandler(@PathVariable long studentId){
        return services.deleteStudent(studentId);
    }


}
