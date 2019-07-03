package com.matias.school.repository;

import com.matias.school.domain.Student;
import com.matias.school.domain.Subject;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository implements IRepository<Student> {

    public List<Student> findAll() {
        return getStudentsMock();
    }

    public void save(Student entity) {

    }

    /**
     * Mock purposes
     * */
    public List<Student> getStudentsMock(){

        Set<Subject> subjects_1 = getSubjectsMock_1();
        Set<Subject> subjects_2 = getSubjectsMock_2();
        Set<Subject> subjects_3 = getSubjectsMock_3();

        Student student_1 = new Student(1, "John", "Fowler", "M", new Date(),
                1, 2, subjects_1);
        Student student_2 = new Student(2, "Joyce", "Dean", "F", new Date(),
                1, 3, subjects_2);
        Student student_3 = new Student(3, "Emilio", "Garcia", "M", new Date(),
                1, 4, subjects_3);
        Student student_4 = new Student(4, "Spencer", "Morgan", "M", new Date(),
                1, 5, subjects_1);
        Student student_5 = new Student(5, "Victoria", "Tiedemann", "F", new Date(),
                1, 6, subjects_2);
        Student student_6 = new Student(6, "Michelle", "Talbot", "F", new Date(),
                1, 7, subjects_3);

        List<Student> students = new ArrayList<>();
        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_4);
        students.add(student_5);
        students.add(student_6);
        return students;
    }

    /**
     * Mock purposes
     * */
    private Set<Subject> getSubjectsMock_1(){
        Set<Subject> subjects = new HashSet<>();

        Subject subject_1 = new Subject(1, "Algebra");
        Subject subject_2 = new Subject(2, "Geometry");
        Subject subject_3 = new Subject(3, "Biology");

        subjects.add(subject_1);
        subjects.add(subject_2);
        subjects.add(subject_3);

        return subjects;
    }

    /**
     * Mock purposes
     * */
    private Set<Subject> getSubjectsMock_2(){
        Set<Subject> subjects = new HashSet<>();

        Subject subject_1 = new Subject(4, "History");
        Subject subject_2 = new Subject(5, "Art");
        Subject subject_3 = new Subject(6, "Music");

        subjects.add(subject_1);
        subjects.add(subject_2);
        subjects.add(subject_3);

        return subjects;
    }

    /**
     * Mock purposes
     * */
    private Set<Subject> getSubjectsMock_3(){
        Set<Subject> subjects = new HashSet<>();

        Subject subject_1 = new Subject(7, "Spanish");
        Subject subject_2 = new Subject(8, "Geography");
        Subject subject_3 = new Subject(9, "Science");

        subjects.add(subject_1);
        subjects.add(subject_2);
        subjects.add(subject_3);

        return subjects;
    }

}
