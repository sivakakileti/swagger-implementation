package javaswagger.implementation.controller;

import javaswagger.implementation.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentsList = Stream.of(
                new Student("siva","kakileti",101,"ECE",11, Arrays.asList("134535331","2374989101")),
                new Student("saroj","kondeti",100,"ECE",7, Arrays.asList("134535331","2374989101")),
                new Student("abhi","makenna",55,"EEE",21, Arrays.asList("134535331","2374989101")),
                new Student("koushik","abbayya",31,"EEE",3, Arrays.asList("134535331","2374989101")),
                new Student("dhanayjay","mahajan",151,"EEE",21, Arrays.asList("134535331","2374989101")),
                new Student("sai","jaddu",167,"MECHANICAL",65, Arrays.asList("134535331","2374989101")),
                new Student("satishT","akkapolu",127,"MECHANICAL",1, Arrays.asList("134535331","2374989101")),
                new Student("pratap","marineni",200,"MECHANICAL",6, Arrays.asList("134535331","2374989101")),
                new Student("basha","wahid",45,"CSE",12, Arrays.asList("134535331","2374989101"))
        ).collect(Collectors.toList());
        ResponseEntity<List<Student>> listResponseEntity = new ResponseEntity<>(studentsList, HttpStatus.OK);
        return listResponseEntity;
    }
}
