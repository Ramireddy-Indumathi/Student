package StudentPro.demo.Service;

import StudentPro.demo.Model.Student;
import StudentPro.demo.StudentRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentSer {
    @Autowired
    StudentRepo gr;
    public List<Student> getAll()
    {
        return gr.findAll();
    }

    public Student getById(int id) {
        return gr.findById(id);
    }

    public List<Student> getByName(String name)
    {
        return gr.findByName(name);
    }
    public void addingData(Student student) {
        gr.save(student);

    }
    public void addStudents(Student student) {
        gr.save(student);
    }


    public void deleteById(int id) {
        gr.deleteById(id);
    }
}
