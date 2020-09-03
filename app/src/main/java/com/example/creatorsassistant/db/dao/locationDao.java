package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.location;

import java.util.List;

@Dao
public interface locationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLocation(location insert);

    @Delete
    void deleteLocation(location delete);

    @Query("SELECT * FROM location WHERE id=:id")
    location getLocationById(int id);

    @Query("SELECT * FROM location WHERE world=:world")
    LiveData<List<location>> getAllLocation(int world);
}
