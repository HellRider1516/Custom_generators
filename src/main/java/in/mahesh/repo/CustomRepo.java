package in.mahesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Student;

public interface CustomRepo extends JpaRepository<Student, Serializable> {

}
