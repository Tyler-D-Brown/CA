package com.example.creatorsassistant.db;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.creatorsassistant.db.classes.character;
import com.example.creatorsassistant.db.classes.event;
import com.example.creatorsassistant.db.classes.faction;
import com.example.creatorsassistant.db.classes.location;
import com.example.creatorsassistant.db.classes.magic;
import com.example.creatorsassistant.db.classes.nation;
import com.example.creatorsassistant.db.classes.race;
import com.example.creatorsassistant.db.classes.world;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class appRepository {
    private static appRepository ourInstance;

    public LiveData<List<character>> characters;
    public LiveData<List<event>> events;
    public LiveData<List<faction>> factions;
    public LiveData<List<location>> locations;
    public LiveData<List<magic>> magics;
    public LiveData<List<nation>> nations;
    public LiveData<List<race>> races;
    public LiveData<List<world>> worlds;

    private appDatabase db;
    private Executor executor = Executors.newSingleThreadExecutor();

    public static appRepository getInstance(Context context){
        if(ourInstance == null){
            ourInstance = new appRepository(context);
        }
        return ourInstance;
    }

    public appRepository(Context context){
        db = appDatabase.getInstance(context);
        
    }
}
