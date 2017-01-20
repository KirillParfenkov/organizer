package com.company.dao;

import com.company.dao.temp.TempNoteDao;

/**
 * Created by parf on 20.1.17.
 */
public class NoteDaoGetter {

    private static NoteDao noteDao;

    private NoteDaoGetter() {}


    public static NoteDao getInstance() {

        if (noteDao == null) {
            noteDao = new TempNoteDao();
        }
        return noteDao;
    }
}
