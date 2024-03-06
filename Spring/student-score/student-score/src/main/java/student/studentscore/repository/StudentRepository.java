package student.studentscore.repository;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import student.studentscore.domain.Student;

@Repository
public class StudentRepository {

    private ArrayList<Student> repository;

    public StudentRepository(){
        repository = new ArrayList<>();
    }

    public void add(Student student){
        repository.add(student);
    }

    public ArrayList<Student> allStudent(){
        return repository;
    }

    public Student getStudent(int grade){
        for (Student student : repository) {
            if(student.getGrade()==grade){
                return student;
            }
        }
        return null;
    }
}
