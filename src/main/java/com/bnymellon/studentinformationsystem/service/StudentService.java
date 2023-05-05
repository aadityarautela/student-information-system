package com.bnymellon.studentinformationsystem.service;

import com.bnymellon.studentinformationsystem.model.Student;
import com.bnymellon.studentinformationsystem.repository.StudentRepository;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Student> createStudent(Student data, MultipartFile aadhar, MultipartFile communityCertificate, MultipartFile birthCertificate) {
        Student newStudent = new Student(data);
        try {
            newStudent.setAADHAR_ID_BLOB(aadhar.getBytes());
            newStudent.setBIRTH_CERTIFICATE_BLOB(birthCertificate.getBytes());
            newStudent.setCOMMUNITY_CERTIFICATE_BLOB(communityCertificate.getBytes());
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "File Upload Error");
        }
        return new ResponseEntity<>(repository.save(newStudent), HttpStatus.CREATED);
    }

    public ResponseEntity<Student> updateStudent(Long STUDENT_IDENTIFIER, Student data, MultipartFile aadhar, MultipartFile communityCertificate, MultipartFile birthCertificate) {
        Student student;
        if(repository.findById(STUDENT_IDENTIFIER).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
        }
        data.setSTUDENT_IDENTIFIER(STUDENT_IDENTIFIER);
        return new ResponseEntity<>(repository.save(data), HttpStatus.OK);
    }

    public ResponseEntity<Student> getStudent(Long STUDENT_IDENTIFIER) {
        if(repository.findById(STUDENT_IDENTIFIER).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
        }
        return new ResponseEntity<>(repository.findById(STUDENT_IDENTIFIER).get(), HttpStatus.OK);
    }

    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Resource> getStudentAadhar(Long STUDENT_IDENTIFIER) {
        if(repository.findById(STUDENT_IDENTIFIER).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
        }
        Student student = repository.findById(STUDENT_IDENTIFIER).get();
        if(student.getAADHAR_ID_AVAILABLE_INDICATOR() == "Y") {
            InputStreamResource resource = new InputStreamResource(new ByteArrayInputStream(student.getAADHAR_ID_BLOB()));
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Disposition", "attachment; filename=\"" + student.getAADHAR_ID_FILENAME() + "\"");
            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(student.getAADHAR_ID_BLOB().length)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aadhar Not Found");
    }

    public ResponseEntity<Resource> getStudentBirthCertificate(Long STUDENT_IDENTIFIER) {
        if(repository.findById(STUDENT_IDENTIFIER).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
        }
        Student student = repository.findById(STUDENT_IDENTIFIER).get();
        if(student.getBIRTH_CERTIFICATE_AVAILABLE_INDICATOR() == "Y") {
            InputStreamResource resource = new InputStreamResource(new ByteArrayInputStream(student.getBIRTH_CERTIFICATE_BLOB()));
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Disposition", "attachment; filename=\"" + student.getBIRTH_CERTIFICATE_FILENAME() + "\"");
            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(student.getBIRTH_CERTIFICATE_BLOB().length)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Birth Certificate Not Found");
    }

    public ResponseEntity<Resource> getStudentCommunityCertificate(Long STUDENT_IDENTIFIER) {
        if(repository.findById(STUDENT_IDENTIFIER).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
        }
        Student student = repository.findById(STUDENT_IDENTIFIER).get();
        if(student.getCOMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR() == "Y") {
            InputStreamResource resource = new InputStreamResource(new ByteArrayInputStream(student.getCOMMUNITY_CERTIFICATE_BLOB()));
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Disposition", "attachment; filename=\"" + student.getCOMMUNITY_CERTIFICATE_FILENAME() + "\"");
            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(student.getCOMMUNITY_CERTIFICATE_BLOB().length)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Community Certificate Not Found");
    }


}
