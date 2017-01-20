package com.company.dao.temp;

import com.company.dao.NoteDao;
import com.company.domain.Note;

import java.util.*;

/**
 * Created by parf on 20.1.17.
 */
public class TempNoteDao implements NoteDao {

    private Map<String, Note> notes;

    public TempNoteDao() {
        notes = new HashMap<>();
    }

    @Override
    public Note save(Note note) {

        if (note != null) {
            String id = UUID.randomUUID().toString();
            note.setId(id);
            notes.put(id, note);
        }
        return null;
    }

    @Override
    public Note get(String id) {
        return notes.get(id);
    }

    @Override
    public List<Note> find() {

        List<Note> result = new ArrayList<>(notes.values());
        return result;
    }

    @Override
    public Note update(Note note) {
        return null;
    }

    @Override
    public void delete(Note note) {

    }
}
