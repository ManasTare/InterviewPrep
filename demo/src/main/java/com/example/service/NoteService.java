package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Note;
import com.example.repository.NoteRepository;

@Service
public class NoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	public Note save(Note note) {
		return noteRepository.save(note); 
	}
	
	public List<Note> getAll(){
		return noteRepository.findAll();
	}
	
	public Optional<Note> getById(Long id) {
		return noteRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		noteRepository.deleteById(id);
	}
}
