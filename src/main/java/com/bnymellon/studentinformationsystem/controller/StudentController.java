package com.bnymellon.studentinformationsystem.controller;

import com.bnymellon.studentinformationsystem.model.Student;
import com.bnymellon.studentinformationsystem.service.StudentService;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student data) {
        return service.createStudent(data, null, null, null);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/student/{STUDENT_IDENTIFIER}")
    public ResponseEntity<Student> getStudent(@PathVariable Long STUDENT_IDENTIFIER) {
        return service.getStudent(STUDENT_IDENTIFIER);
    }

    @PutMapping("/student/{STUDENT_IDENTIFIER}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long STUDENT_IDENTIFIER, @RequestBody Student data) {
        return service.updateStudent(STUDENT_IDENTIFIER, data, null, null, null);
    }

    @GetMapping("/student/{STUDENT_IDENTIFIER}/deactivate")
    public ResponseEntity<Student> deactivateStudent(@PathVariable Long STUDENT_IDENTIFIER) {
        return service.deactivateStudent(STUDENT_IDENTIFIER);
    }

    @PostMapping("/student/{STUDENT_IDENTIFIER}/aadhar")
    public ResponseEntity<String> setStudentAadhar(@PathVariable Long STUDENT_IDENTIFIER, @RequestPart MultipartFile file) {
        return service.setStudentAadhar(STUDENT_IDENTIFIER, file);
    }

    @PostMapping("/student/{STUDENT_IDENTIFIER}/birth_certificate")
    public ResponseEntity<String> setStudentBirthCertificate(@PathVariable Long STUDENT_IDENTIFIER, @RequestPart MultipartFile file) {
        return service.setStudentBirthCertificate(STUDENT_IDENTIFIER, file);
    }

    @PostMapping("/student/{STUDENT_IDENTIFIER}/community_certificate")
    public ResponseEntity<String> setStudentCommunityCertificate(@PathVariable Long STUDENT_IDENTIFIER, @RequestPart MultipartFile file) {
        return service.setStudentCommunityCertificate(STUDENT_IDENTIFIER, file);
    }

    @GetMapping("/student/{STUDENT_IDENTIFIER}/aadhar")
    public ResponseEntity<Resource> getStudentAadhar(@PathVariable Long STUDENT_IDENTIFIER) {
        return service.getStudentAadhar(STUDENT_IDENTIFIER);
    }

    @GetMapping("/student/{STUDENT_IDENTIFIER}/birth_certificate")
    public ResponseEntity<Resource> getStudentBirthCertificate(@PathVariable Long STUDENT_IDENTIFIER) {
        return service.getStudentBirthCertificate(STUDENT_IDENTIFIER);
    }

    @GetMapping("/student/{STUDENT_IDENTIFIER}/community_certificate")
    public ResponseEntity<Resource> getStudentCommunityCertificate(@PathVariable Long STUDENT_IDENTIFIER) {
        return service.getStudentCommunityCertificate(STUDENT_IDENTIFIER);
    }

}
