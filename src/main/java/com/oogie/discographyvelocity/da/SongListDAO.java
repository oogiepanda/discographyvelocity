package com.oogie.discographyvelocity.da;

import com.oogie.discographyvelocity.model.SongList;

import java.util.List;

public interface SongListDAO {
//    public List<SongListEntity> getSongs();
    public List<SongList> getSongs();
    public void insertBatch();

}
