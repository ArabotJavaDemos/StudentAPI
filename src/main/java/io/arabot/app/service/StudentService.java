package io.arabot.app.service;

import io.arabot.app.entity.Student;
import io.arabot.app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo ;


    public ResponseEntity showAll() {
        List<Student> studentList = new ArrayList<>();
        studentRepo.findAll().forEach(studentList::add);
        return ResponseEntity.ok(studentList);
    }

    public List<Student> findByCollage(String collage) {
        return studentRepo.findByCollege(collage);
    }

    public ResponseEntity<String> addStudent(Student student){
        long id = studentRepo.save(student).getId() ;
        ResponseEntity.status(201);
        return ResponseEntity.ok().body("New Student Added With ID: " + id);
    }


    public ResponseEntity<String> updateStudent(long studentId , Student student) {
        if(studentRepo.findById(studentId).isPresent()){
            studentRepo.save(student);
            ResponseEntity.status(201);
            return ResponseEntity.ok().body("Student with ID Number: " + studentId +" Updated");
        }else{
            return ResponseEntity.badRequest().body("Invalid Student ID");
        }
    }

    public ResponseEntity<String> deleteStudent(long studentId) {
        if(studentRepo.findById(studentId).isPresent()){
            studentRepo.deleteById(studentId);
            return ResponseEntity.ok().body("Student Data Deleted!");
        }else{
            return ResponseEntity.badRequest().body("Invalid Student ID");
        }
    }

}
