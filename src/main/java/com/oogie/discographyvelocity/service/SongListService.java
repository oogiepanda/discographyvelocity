package com.oogie.discographyvelocity.service;

import com.oogie.discographyvelocity.da.SongListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("songListService")
public class SongListService implements ServiceFacade{
    @Autowired
    private SongListDAO songListDAO;

    public Object doService(Object ... args) throws Exception {
        Assert.notNull(args[0]);
        if (args[0].equals("insert")) {
            songListDAO.insertBatch();
            return true;
        } else {
            return songListDAO.getSongs();
        }
    }
}