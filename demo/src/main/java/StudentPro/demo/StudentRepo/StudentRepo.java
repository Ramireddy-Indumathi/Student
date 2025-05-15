package StudentPro.demo.StudentRepo;


import StudentPro.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    public Student findById(int id);
    public List<Student> findByName( String name);
}
