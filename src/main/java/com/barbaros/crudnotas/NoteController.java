package com.barbaros.crudnotas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NoteController {

    @Autowired // Le dice a spring que el objeto de noteRepository lo va a meter ahi automaticamnte
    private NoteRepository noteRepository;

    @GetMapping("/note")
    public List<Note> findAll(){
        return noteRepository.findAll();
    }

    @PostMapping("/note")
    public String saveNotes(@RequestBody Note note){ //@RequestBody convierte a JSON y lo mete en mi clase note
        noteRepository.save(note);
        return "Su nota se ha guardado";
    }
}
