package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentSrvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class Controller
{
        @Autowired
        private StudentSrvc studentSrvc;

//Retrieve all entries
        @GetMapping("/allstudents")
        public List<Student> getAllStudents()
        {
                return studentSrvc.getAllStudents();
        }

 // Create a new entry
        @PostMapping("/createEntry")
        public Student createStudent(@RequestBody Student student)
        {
                return studentSrvc.saveStudent(student);
        }
//updating a specific Student through studentid
        @PutMapping("/{studentID}")
        public Student update_student(@PathVariable int studentID, @RequestBody Student student)
        {
              return studentSrvc.updateStudent(studentID, student);
        }
// delete a specific entry using student id
        @DeleteMapping("/{studentID}")
        public void delete_student(@PathVariable int studentID)
        {
                 studentSrvc.deleteByStudentId(studentID);
        }
//search a specific entry using studentid
        @GetMapping("/{studentID}")
        public Student getStudentById(@PathVariable int studentID) {
                return studentSrvc.findByStudentId(studentID);
        }
}
