package com.company;

import com.company.client.Observer;
import com.company.dao.NoteDao;
import com.company.dao.NoteDaoGetter;
import com.company.domain.Note;

/**
 * Created by parf on 20.1.17.
 */
public class NoteObserver implements Observer {



    @Override
    public void process(SystemEvent event) {

        NoteDao noteDao = NoteDaoGetter.getInstance();
        noteDao.save(new Note());
    }
}
