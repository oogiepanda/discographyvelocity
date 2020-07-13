package com.oogie.discographyvelocity.da;

import com.oogie.discographyvelocity.model.SongList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongListDAOImpl implements SongListDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public List<SongListEntity> getSongs() {
//        return jdbcTemplate.query("SELECT id, song_name, musician, year, album, genre FROM song_list",
//                (rs, rowNum) -> new SongListEntity(rs.getInt("id"), rs.getString("song_name"),
//                        rs.getString("musician"), rs.getInt("year"), rs.getString("album"),
//                        rs.getString("genre")));
//    }

    public List<SongList> getSongs() {
        return jdbcTemplate.query("SELECT id, song_name, musician, thisyear, album, genre FROM song_list",
                (rs, rowNum) -> new SongList(rs.getInt("id"), rs.getString("song_name"),
                        rs.getString("musician"), rs.getString("thisyear"), rs.getString("album"),
                        rs.getString("genre")));
    }
    @Override
    public void insertBatch() {
        jdbcTemplate.execute("DROP TABLE song_list IF EXISTS ");
        jdbcTemplate.execute("CREATE TABLE song_list(id INT NOT NULL AUTO_INCREMENT, song_name VARCHAR(50) NOT NULL, musician VARCHAR(50), thisyear VARCHAR(4), album VARCHAR(50), genre VARCHAR(15), PRIMARY KEY (id))");
        jdbcTemplate.batchUpdate("Insert INTO song_list(song_name, musician, thisyear, album, genre) VALUES (?,?,?,?,?)", songData());

    }

    private List<Object[]> songData() {
        List<Object[]> songs = new ArrayList<>();
        songs.add("Under Pressure,Queen,1987,Hot Space,Rock".split(","));
        return songs;
    }
}
