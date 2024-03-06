package student.studentscore.controller;

import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import student.studentscore.domain.ApiResponse;
import student.studentscore.domain.Student;
import student.studentscore.service.StudentService;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @ResponseBody
    @GetMapping("/student")
    public ApiResponse<Student> saveStudent(@RequestParam("name") String name, @RequestParam("grade") int grade){
        Student student = studentService.addStudent(name, grade);
        return makeResponse(student);
    }

    @ResponseBody
    @GetMapping("/all_student")
    public ApiResponse<Student> getAllStudent(){
        ArrayList<Student> allStudent = studentService.getAllStudent();
        return makeResponse(allStudent);
    }

    @ResponseBody
    @GetMapping("/one_student")
    public ApiResponse<Student> getOneStudent(@RequestParam("grade") int grade){
        Student student = studentService.getStudent(grade);
        return makeResponse(student);
    }


    public ApiResponse<Student> makeResponse(Student student){
        return new ApiResponse<Student>(student);
    }

    public ApiResponse<Student> makeResponse(ArrayList<Student> allStudent){
        return new ApiResponse<Student>(allStudent);
    }

}
