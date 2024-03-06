package student.studentscore.domain;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }


}
