package io.arabot.app.repo;

import io.arabot.app.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student,Long> {

    public List<Student> findByCollege(String college);
}
