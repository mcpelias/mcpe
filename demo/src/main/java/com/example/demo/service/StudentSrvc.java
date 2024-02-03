package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentSrvc
{
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents()
    {
        return studentRepository.getAllStudents();
    }

    public Student findByStudentId(int Stud_id)
    {
        return studentRepository.findByStudentId(Stud_id);
    }

    public Student saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    public void deleteByStudentId(int Stud_id)
    {
         studentRepository.deleteByStudentId(Stud_id);
    }


    public Student updateStudent(int Stud_id, Student student)
    {
        return studentRepository.updateStudent(Stud_id, student);
    }

}
