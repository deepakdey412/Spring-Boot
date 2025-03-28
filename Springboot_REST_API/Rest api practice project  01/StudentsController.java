package com.example.controller;

import com.example.model.Students;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentController")
public class StudentsController {

    private Students student; // Single student object

    // ✅ GET - Fetch Student
    @GetMapping("/getStudent")
    public Students getStudent() {
        return student; // Agar student null hoga to response empty milega
    }

    // ✅ POST - Add Student
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Students students) {
        this.student = students;
        return "Student added successfully!";
    }

    // ✅ PUT - Update Student
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Students updatedStudent) {
        if (this.student != null) {
            this.student = updatedStudent;
            return "Student updated successfully!";
        } else {
            return "No student record found to update!";
        }
    }

    // ✅ DELETE - Remove Student
    @DeleteMapping("/deleteStudent")
    public String deleteStudent() {
        if (this.student != null) {
            this.student = null;
            return "Student deleted successfully!";
        } else {
            return "No student record found to delete!";
        }
    }
}
