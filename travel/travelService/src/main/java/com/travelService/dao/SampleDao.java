package com.travelService.dao;

import java.util.List;

import com.travelService.model.SampleNotes;

public interface SampleDao {

	

	List<SampleNotes> getNotes();

	SampleNotes saveNotes(SampleNotes notes);
}
