package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.nation;

import java.util.List;

@Dao
public interface nationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNation(nation insert);

    @Delete
    void deleteNation(nation delete);

    @Query("SELECT * FROM nation WHERE id=:id")
    nation getNationById(int id);

    @Query("SELECT * FROM nation WHERE world=:world")
    LiveData<List<nation>> getAllNations(int world);
}
