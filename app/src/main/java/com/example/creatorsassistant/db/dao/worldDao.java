package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.world;

import java.util.List;

@Dao
public interface worldDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWorld(world insert);

    @Delete
    void deleteWorld(world delete);

    @Query("SELECT * FROM race WHERE id=:id")
    world getWorldById(int id);

    @Query("SELECT * FROM race")
    LiveData<List<world>> getAllWorlds();
}
