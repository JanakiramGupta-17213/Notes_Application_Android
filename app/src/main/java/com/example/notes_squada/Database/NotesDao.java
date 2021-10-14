package com.example.notes_squada.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.Date;
import java.util.List;

@Dao
public interface NotesDao {

    @Query("SELECT * FROM notes")
    List<Notes> getallnotes();

    @Query("SELECT title FROM notes")
    List<String> gettitles();

    @Query("SELECT id FROM notes WHERE category IN (:categoryname)")
    List<Integer> getallidbycategory(String categoryname);

    @Query("SELECT title FROM notes WHERE category IN (:categoryname)")
    List<String> gettitlesbycategory(String categoryname);

    @Query("SELECT date FROM notes WHERE category IN (:categoryname)")
    List<String> getdatesbycategory(String categoryname);

    @Query("SELECT category FROM notes")
    List<String> getcategories();

    @Insert
    void InsertNotes(Notes notes);

    @Update
    void UpdateNotes(Notes note);

    @Delete
    void DeleteNotes(Notes note);
}
