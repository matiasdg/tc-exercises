package com.matias.school.service;

import com.matias.school.domain.Student;
import com.matias.school.domain.Subject;
import com.matias.school.repository.StudentRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * Provides all the students grouped by first letter of last name
     * @return Map<String, Student>
     */
    public Map<String, List<Student>> getStudentsGroupByLastNameFirstLetter(){
        List<Student> students = studentRepository.findAll();

        return students.stream().collect(
                Collectors.groupingBy(s -> String.valueOf(s.getLastname().charAt(0)))
        );
    }

    /**
     * @param subjectId
     * @return Map<String, Student>
     * Provides all the students by Subject Id
     */
    public List<Student> getStudentsBySubjectId(Integer subjectId){
        List<Student> students = studentRepository.findAll();

        return students.stream().filter(s -> s.getSubjects().stream()
                .anyMatch(sub -> sub.getId().equals(subjectId))
        ).collect(Collectors.toList());

    }

}
