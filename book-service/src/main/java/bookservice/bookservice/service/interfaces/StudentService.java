package bookservice.bookservice.service.interfaces;


import bookservice.bookservice.domain.dto.request.StudentRequest;
import bookservice.bookservice.domain.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse createStudent(StudentRequest studentRequest);
    String deleteStudent(String id);
    Boolean findUser(String email,String password);
    StudentResponse getUser(String email);
}
