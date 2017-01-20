package com.company.dao;

import com.company.domain.Note;

import java.util.List;

/**
 * Created by parf on 20.1.17.
 */
public interface NoteDao {

    Note save(Note note);
    Note get(String id);
    List<Note> find();
    Note update(Note note);
    void delete(Note note);

}
