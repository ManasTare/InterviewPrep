package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.NoteService;
import com.example.model.Note;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "http://localhost:5173")
public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	@PostMapping
	public Note create(@RequestBody Note note) {
		return noteService.save(note);
	}
	@GetMapping
	public List<Note> getAll(){
		return noteService.getAll();
	}
}
