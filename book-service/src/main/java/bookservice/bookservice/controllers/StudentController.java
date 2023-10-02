package bookservice.bookservice.controllers;

import bookservice.bookservice.domain.dto.request.StudentRequest;
import bookservice.bookservice.domain.dto.response.ApiResponse;
import bookservice.bookservice.domain.dto.response.StudentResponse;
import bookservice.bookservice.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<StudentResponse>> saveStudent(@RequestBody StudentRequest studentRequest){
        ApiResponse<StudentResponse> apiResponse = new ApiResponse<>(studentService.createStudent(studentRequest));
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/findUser/{email}/{password}")
    public ResponseEntity<ApiResponse<Boolean>> findUser(@PathVariable String email,@PathVariable String password){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>(studentService.findUser(email,password));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @GetMapping("/users/{username}")
    public ResponseEntity<ApiResponse<StudentResponse>> users(@PathVariable String username){
        ApiResponse<StudentResponse> apiResponse = new ApiResponse<>(studentService.getUser(username));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
