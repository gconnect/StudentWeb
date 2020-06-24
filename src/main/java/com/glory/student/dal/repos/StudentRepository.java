package com.glory.student.dal.repos;
import org.springframework.data.repository.CrudRepository;
import com.glory.student.dal.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
