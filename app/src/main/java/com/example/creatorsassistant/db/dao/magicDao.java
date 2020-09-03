package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.magic;

import java.util.List;

@Dao
public interface magicDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMagic(magic insert);

    @Delete
    void deleteMagic(magic delete);

    @Query("SELECT * FROM magic WHERE id=:id")
    magic getMagicById(int id);

    @Query("SELECT * FROM magic WHERE world=:world")
    LiveData<List<magic>> getAllMagic(int world);
}
