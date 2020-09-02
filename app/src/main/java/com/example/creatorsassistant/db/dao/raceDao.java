package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.race;

import java.util.List;

@Dao
public interface raceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRace(race insert);

    @Delete
    void deleteRace(race delete);

    @Query("SELECT * FROM world WHERE id=:id")
    race getRaceById(int id);

    @Query("SELECT * FROM world")
    LiveData<List<race>> getAllRace();
}
