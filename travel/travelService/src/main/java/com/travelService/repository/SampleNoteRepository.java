package com.travelService.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelService.model.SampleNotes;

@Repository
public interface SampleNoteRepository extends JpaRepository<SampleNotes, Long> {

}