package com.travelService.controller.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.constants.SampleConstants;
import com.travelService.dao.SampleDao;
import com.travelService.model.SampleNotes;
import com.travelService.response.SampleResponse;

@Component
public class SampleServiceImpl implements ISampleService {
	@Autowired
	SampleResponse sampleResponse;
	
	@Autowired
	SampleDao sampleDao;

	//direclty sending response from here.
	@Override
	public SampleResponse getSomedata() {


		sampleResponse.setMoney(SampleConstants.MONEY);
		
		Map<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("testkey", "testValue");
		hashmap.put("testkey1", "testValue1");
		sampleResponse.setAdditionalPorperties(hashmap);

		return sampleResponse;
	}

	@Override
	public List<SampleNotes> getAllNotesService() {
		List<SampleNotes> notesData= sampleDao.getNotes();
		return notesData;
	}

	@Override
	public SampleNotes saveNotesService(SampleNotes notes) {
		return  sampleDao.saveNotes(notes);

	}

}
