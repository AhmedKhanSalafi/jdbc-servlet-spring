package springboot.restApi.restApi.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.restApi.restApi.beans.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {}
