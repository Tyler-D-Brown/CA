package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.event;

import java.util.List;

@Dao
public interface eventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEvent(event insert);

    @Delete
    void deleteEvent(event delete);

    @Query("SELECT * FROM event WHERE id=:id")
    event getEventById(int id);

    @Query("SELECT * FROM event WHERE world=:world")
    LiveData<List<event>> getAllEvents(int world);
}
