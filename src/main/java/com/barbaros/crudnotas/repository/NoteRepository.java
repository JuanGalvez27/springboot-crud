package com.barbaros.crudnotas.repository;

import com.barbaros.crudnotas.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> { // Una interfaz en java es como un contrado algo que dice que metodos va a tener un objeto mas no la implmentacion
}
