package com.project.app.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo studentRepo ;


    public List<Student> showAll() {
        List<Student> studentList = new ArrayList<>();
        studentRepo.findAll().forEach(studentList::add);
        return studentList;
    }

    public Student addStudent(Student student){
        return studentRepo.save(student) ;
    }


    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public String deleteStudent(long studentId) {
        studentRepo.deleteById(studentId);
        return "Student Deleted" ;
    }

    public List<Student> findByCollage(String collage) {
        return studentRepo.findByCollege(collage);
    }
}
