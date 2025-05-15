package StudentPro.demo.Controller;

import StudentPro.demo.Model.Student;
import StudentPro.demo.Service.StudentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentCon {
    @Autowired
    StudentSer gs;
    @GetMapping("/")
    public String message()
    {
        return " hi students ";
    }
    @GetMapping("/All")
    public List<Student> getAll()
    {
        return gs.getAll();
    }
    @GetMapping("byName/{name}")
    public  List<Student>  getByName(@PathVariable String name)
    {
        return gs.getByName(name);
    }
    @PostMapping("addData/")
    public String addingData(@RequestBody Student  student)
    {
        gs.addingData(student);
        return "completed";
    }

    @GetMapping("ById/{id}")
    public Student getById( @PathVariable int id)
    {
        return gs.getById(id);
    }
    @PostMapping("add")
    public String addStudents(@RequestBody Student student){
        gs.addStudents(student);
        return "added successfully.";
    }
    @DeleteMapping("remove/{id}")
    public String deleteDataById(@PathVariable int id)
    {
        gs.deleteById(id);
        return "deleted";
    }
}

