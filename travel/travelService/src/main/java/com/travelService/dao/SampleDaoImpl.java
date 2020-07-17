package com.travelService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.model.SampleNotes;
import com.travelService.repository.SampleNoteRepository;
@Component
public class SampleDaoImpl implements SampleDao {

	@Autowired
	SampleNoteRepository noteRepository;

	@Override
	public List<SampleNotes> getNotes() {
		return noteRepository.findAll();

	}

	@Override
	public SampleNotes saveNotes(SampleNotes note) {

		return noteRepository.save(note);
	}

}
