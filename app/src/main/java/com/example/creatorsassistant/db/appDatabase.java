package com.example.creatorsassistant.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.creatorsassistant.db.dao.*;
import com.example.creatorsassistant.db.classes.*;

@Database(entities = {
        character.class, event.class, faction.class, location.class,
        magic.class, nation.class, race.class, world.class}, version = 0)
public abstract class appDatabase extends RoomDatabase{
    public static final String DATABASE_NAME = "creatorsAssistant.db";
    private static volatile appDatabase instance;
    private static final Object Lock = new Object();

    public abstract characterDao character();
    public abstract eventDao event();
    public abstract factionDao faction();
    public abstract locationDao location();
    public abstract magicDao magic();
    public abstract nationDao nation();
    public abstract raceDao race();
    public abstract worldDao world();

    public static appDatabase getInstance(Context context){
        if(instance == null){
            synchronized (Lock){
                if(instance==null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                        appDatabase.class, DATABASE_NAME).fallbackToDestructiveMigration().build();
                }
            }
        }
        return instance;
    }
}
