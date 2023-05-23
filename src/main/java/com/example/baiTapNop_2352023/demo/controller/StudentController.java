package com.example.baiTapNop_2352023.demo.controller;
import com.example.baiTapNop_2352023.demo.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    List<StudentModel> studentModelList;

    @GetMapping("")
    public ResponseEntity<?> hello(){
        StudentModel studentModel = new StudentModel();
        studentModelList.add(studentModel);
        return new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }

    @GetMapping("/requestParam")
    public ResponseEntity<?> requestParam(
            @RequestParam String age,
            @RequestParam String name
    ){
        StudentModel studentModel = new StudentModel();
        studentModel.setAge(Integer.parseInt(age));
        studentModel.setName(name);
        studentModelList.add(studentModel);
        return new ResponseEntity<>(studentModelList, HttpStatus.ACCEPTED.OK); }

    @GetMapping("/pathVariable/{age}/{name}")
    public ResponseEntity<?> pathVariable(
            @PathVariable String age,
            @PathVariable String name
    ){
        StudentModel studentModel = new StudentModel();
        studentModel.setAge(Integer.parseInt(age));
        studentModel.setName(name);
        studentModelList.add(studentModel);
        return new ResponseEntity<>(studentModelList, HttpStatus.ACCEPTED.OK);
    }
    @GetMapping("/requestBody")
    public ResponseEntity<?> requestBody(
            @RequestBody StudentModel studentModel
    ){
        studentModelList.add(studentModel);
        return new ResponseEntity<>(studentModelList, HttpStatus.ACCEPTED.OK);
    }
}
