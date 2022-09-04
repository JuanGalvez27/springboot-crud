package com.barbaros.crudnotas.service;

import com.barbaros.crudnotas.model.Note;
import com.barbaros.crudnotas.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> searchNotes(){
        return noteRepository.findAll();
    }

    public String saveNotes(Note note){
        noteRepository.save(note);
        return "Su nota se ha guardado";
    }

    public String deleteNote(Long id){
        if(noteRepository.existsById(id)) {
            noteRepository.deleteById(id);
            return "Se ha eliminado la nota " + id;
        } else {
            return "El id " + id + " no existe";
        }

    }

}
