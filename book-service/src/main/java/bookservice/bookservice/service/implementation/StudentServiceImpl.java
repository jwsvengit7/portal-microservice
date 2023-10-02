package bookservice.bookservice.service.implementation;


import bookservice.bookservice.domain.dto.response.IdentityResponse;
import bookservice.bookservice.domain.dto.response.StudentResponse;
import bookservice.bookservice.domain.entity.IdentityManager;
import bookservice.bookservice.domain.entity.Student;
import bookservice.bookservice.domain.repository.IdentityRepository;
import bookservice.bookservice.domain.repository.StudentRepository;
import bookservice.bookservice.exception.UserNotFoundException;
import bookservice.bookservice.service.interfaces.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import bookservice.bookservice.domain.dto.request.StudentRequest;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final IdentityRepository identityRepository;
    private final ModelMapper modelmapper;


    @Override
    public StudentResponse createStudent(StudentRequest studentRequest) {
        Student saveStudent  =studentRepository.insert(studentObj(studentRequest));
        return modelmapper.map(saveStudent, StudentResponse.class);
    }

    /****
     *
     * @param studentRequest
     * @return
     */
    private Student studentObj(StudentRequest studentRequest){
        return  Student.builder()
                .email(studentRequest.getEmail())
                .fullName(studentRequest.getFullName())
                .password(BCrypt.hashpw(studentRequest.getPassword(),BCrypt.gensalt()))
                .profileUrl("https://media.licdn.com/dms/image/D4D35AQGsLnh-DLvapg/profile-framedphoto-shrink_200_200/0/1691844659432?e=1694649600&v=beta&t=SNfI5_gvIOfziAc2NuEI3wXmD3lvqvE8hEniu1_sUyk")
                .identityManager(saveId(studentRequest.getIdentityResponse(),studentRequest.getEmail()))
                .build();
    }

    /**
     *
     * @param identityResponse
     * @param student
     * @return
     */
    private IdentityManager saveId(IdentityResponse identityResponse, String student){
        return IdentityManager.builder()
                .age(identityResponse.getAge())
                .classes(identityResponse.getClasses())
                .studentId(student)
                .build();
    }

    @Override
    public String deleteStudent(String id) {
        return null;
    }

    @Override
    public Boolean findUser(String email, String password) {
        return studentRepository.findStudentByEmailAndPassword(email,password).isPresent();
    }

    @Override
    public StudentResponse getUser(String email) {
        Student student = studentRepository.findStudentByEmail(email)
                .orElseThrow(()-> new UserNotFoundException("USER NOT FOUND"));
        return modelmapper.map(student,StudentResponse.class);
    }
}
