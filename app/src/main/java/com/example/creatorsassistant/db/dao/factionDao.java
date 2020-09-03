package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.faction;

import java.util.List;

@Dao
public interface factionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertFaction(faction insert);

    @Delete
    void deleteFaction(faction delete);

    @Query("SELECT * FROM faction WHERE id=:id")
    faction getFactionById(int id);

    @Query("SELECT * FROM faction WHERE world=:world")
    LiveData<List<faction>> getAllFactions(int world);
}
