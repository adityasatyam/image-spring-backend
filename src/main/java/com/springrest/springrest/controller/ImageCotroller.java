package com.springrest.springrest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Image;

import com.springrest.springrest.services.ImageService;

@CrossOrigin
@RestController
public class ImageCotroller {
	@Autowired
	private ImageService imageService;
	
//	@GetMapping("/")
//	public String home() {
//		return "This is course application";
//	}
	//get the courses
	@GetMapping("/")
	public List<Image> getCourses()
	{
		return this.imageService.getImages();
	}
	@GetMapping("/show/{id}")
	public Image getImage(@PathVariable String id) {
		return this.imageService.getImage(Long.parseLong(id));
	}
	@PostMapping("/")
	public Image addImage(@RequestBody Image image) {
		return this.imageService.addImage(image);
	}
//	@PutMapping("/courses")
//	public Object updateCourse(@RequestBody Course course) {
//		return this.courseService.updateCourse(course);
//		
//	}
//	@DeleteMapping("/courses/{courseId}")
//	public String deleteCourse(@PathVariable String courseId) {
//		return this.courseService.deleteCourse(Long.parseLong(courseId));
//	}

}
