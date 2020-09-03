package com.example.creatorsassistant.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.creatorsassistant.db.classes.character;

import java.util.List;

@Dao
public interface characterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCharacter(character insert);

    @Delete
    void deleteCharacter(character delete);

    @Query("SELECT * FROM character WHERE id=:id")
    character getCharacterById(int id);

    @Query("SELECT * FROM character WHERE world=:world")
    LiveData<List<character>> getAllCharacters(int world);
}
