package com.example.demo.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	
	@GetMapping("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCount(@PathParam("id") int id) {
	    System.out.println(id);
		 int countPage = service.countPage(id);
		 System.out.println(countPage);
		 String message= "total no of page:"+ countPage + "for this"+ id;
		return Response.ok().entity(message).build();
		
	}

	@GetMapping("/msg/{msg}")
	public String msg(@PathVariable String msg){
		return "msg";
	}

	@GetMapping("/success")
	public ResponseEntity<String> successMethod (){
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

	@GetMapping("/found")
	private ResponseEntity<String> notFoundMethod(){
		return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	}
}
