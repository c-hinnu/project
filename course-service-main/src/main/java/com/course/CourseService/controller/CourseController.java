package com.course.CourseService.controller;

import com.course.CourseService.dto.CourseDTO;
import com.course.CourseService.model.Course;
import com.course.CourseService.model.Topic;
import com.course.CourseService.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);

    }
    @GetMapping("/{courseId}/topics")
    public ResponseEntity<List<Topic>> getCourseTopics(@PathVariable Long courseId) {
        List<Topic> topics = courseService.getCourseTopics(courseId);
        return ResponseEntity.ok(topics);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseId(@PathVariable Long courseId)
    {
        Course course= courseService.getCourseId(courseId);
        return ResponseEntity.ok(course);
    }
    @GetMapping("/coursename")
    public ResponseEntity<List<String>> getCoursetitle() 
    {
    	List <Course> course=courseService.getall();
    	List<String> s=new ArrayList<>();
    	for(int i=0;i<course.size();i++)
    	{
    	s.add(course.get(i).getTitle());
    	}
    	return ResponseEntity.ok().body(s);
    }
    @GetMapping("/t/{title}")
    public ResponseEntity<String> getCourseDetails(@PathVariable String title)
    {
    	String s=courseService.getdetails(title);
    	return ResponseEntity.ok().body(s);
    	
    }
    
//    //search
//    @GetMapping("/search")
//    public ResponseEntity<List<String>> searchCourseNames(@RequestParam("prefix") String prefix) {
//        List<String> courseNames = courseService.searchCourseNames(prefix);
//        return ResponseEntity.ok(courseNames);
//    }
}

