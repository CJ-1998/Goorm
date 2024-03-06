package student.studentscore.domain;

import java.util.ArrayList;

public class ApiResponse<T> {
    private Status status;
    private Metadata metadata;
    private ArrayList<Student> results;
    private Data data;

    public ApiResponse (Student student){
        results=new ArrayList<>();
        results.add(student);
        status = new Status(2000,"OK");
        metadata = new Metadata(results.size());
    }

    public ApiResponse (ArrayList<Student> allStudent){
        results=allStudent;
        status = new Status(2000,"OK");
        metadata = new Metadata(results.size());
    }

    public ApiResponse (int code, String message, Data newData){
        status=new Status(code, message);
        data=newData;
    }
}
