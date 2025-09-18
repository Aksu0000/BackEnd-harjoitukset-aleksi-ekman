package s25.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s25.viikko1.domain.Student;
import java.util.List;
import java.util.ArrayList;

@Controller

public class StudentController {

    public static List<Student> students = new ArrayList<>();

        static {
            students.add(new Student("Aku", "Ankka"));
            students.add(new Student("Ines", "Ankka"));
            students.add(new Student("Hannu", "Hanhi"));
        }

    @GetMapping("/hello")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "studentlist";
    }
    

}
