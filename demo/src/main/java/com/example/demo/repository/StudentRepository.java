package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepository
{
    private final List<Student> list = new ArrayList<Student>();
    public List<Student> getAllStudents()
    {
        return list;
    }






    public Student findByStudentId(int studId)
    {
        for (int i = 0; i < list.size(); i++)
        {
            Student student = list.get(i);
            if (student.getStudId() == studId) {
                return list.get(i); // Return the student at the actual index
            }
        }
        return null;
    }




    public void deleteByStudentId(int Stud_id)
    {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudId() == Stud_id)
            {
                iterator.remove();

            }
        }
    }






    public Student updateStudent(int studId, Student student)
    {
        for (int i = 0; i < list.size(); i++)
        {
            Student existingStudent = list.get(i);
            if (existingStudent.getStudId() == studId) {
                // Update the existing student at the actual index
                existingStudent.setStudId(student.getStudId());
                existingStudent.setStudName(student.getStudName());
                existingStudent.setBookdescription(student.getBookdescription());
                return existingStudent;
            }
        }
        return null; // Return null if no student with the given Stud_id is found
    }



    public Student saveStudent(Student student)
    {
        Student s = new Student();
        s.setStudId(student.getStudId());
        s.setStudName(student.getStudName());
        s.setBookdescription(student.getBookdescription());
        list.add(s);
        return s;
    }






}
