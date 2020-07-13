package com.oogie.discographyvelocity.model;

public class SongList {
    private Integer id;
    private String songName;
    private String musician;
    private String thisyear;
    private String album;
    private String genre;

    public SongList(Integer id, String songName, String musician, String thisyear, String album, String genre) {
        super();
        this.id = id;
        this.songName = songName;
        this.musician = musician;
        this.thisyear = thisyear;
        this.album = album;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public String getMusician() {
        return musician;
    }

    public String getThisyear() {
        return thisyear;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }
}
