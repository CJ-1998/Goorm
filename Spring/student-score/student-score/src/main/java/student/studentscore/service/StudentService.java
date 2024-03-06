package student.studentscore.service;

import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import student.studentscore.domain.Student;
import student.studentscore.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Student addStudent(String name, int grade){
        Student student = new Student(name,grade);
        studentRepository.add(student);
        return student;
    }

    public ArrayList<Student> getAllStudent(){
        return studentRepository.allStudent();
    }


    public Student getStudent(int grade) {
        return studentRepository.getStudent(grade);
    }
}
