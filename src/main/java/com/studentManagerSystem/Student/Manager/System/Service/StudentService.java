package com.studentManagerSystem.Student.Manager.System.Service;

import com.studentManagerSystem.Student.Manager.System.Entity.Student;
import com.studentManagerSystem.Student.Manager.System.Repository.StudentRepository;
import com.studentManagerSystem.Student.Manager.System.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent (StudentDto studentDto){
        Student student = new Student();

        student.setStudentFName(studentDto.getStudentFName());
        student.setStudentLName(studentDto.getStudentLName());
        student.setStudentAddress(studentDto.getStudentAddress());
        student.setStudentBDay(studentDto.getStudentBDay());
        student.setStudentMarks(studentDto.getStudentMarks());

        return studentRepository.save(student);
    }
}
