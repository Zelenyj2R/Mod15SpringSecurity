package com.goit10.Mod15SpringSecurity.repository;


import com.goit10.Mod15SpringSecurity.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}