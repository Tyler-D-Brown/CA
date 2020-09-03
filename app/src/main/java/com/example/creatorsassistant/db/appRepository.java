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

    /*
    public LiveData<List<character>> characters;
    public LiveData<List<event>> events;
    public LiveData<List<faction>> factions;
    public LiveData<List<location>> locations;
    public LiveData<List<magic>> magics;
    public LiveData<List<nation>> nations;
    public LiveData<List<race>> races;
    public LiveData<List<world>> worlds;*/

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

    public LiveData<List<character>> getAllCharacters(int world){return db.character().getAllCharacters(world);}

    public character getCharacterById(int id){return db.character().getCharacterById(id);}

    public void insertCharacter(final character insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.character().insertCharacter(insert);
            }
        });
    }

    public LiveData<List<event>> getAllEvents(int world){return db.event().getAllEvents(world);}

    public event getEventById(int id){return db.event().getEventById(id);}

    public void insertEvent(final event insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.event().insertEvent(insert);
            }
        });
    }

    public LiveData<List<faction>> getAllFactions(int world){return db.faction().getAllFactions(world);}

    public faction getFactionById(int id){return db.faction().getFactionById(id);}

    public void insertFaction(final faction insert){
        executor.execute(
            new Runnable(){
                @Override
                public void run(){
                    db.faction().insertFaction(insert);
                }
            }
        );
    }

    public LiveData<List<location>> getAllLocations(int world){return db.location().getAllLocation(world);}

    public location getLocationById(int id){return db.location().getLocationById(id);}

    public void insertLocation(final location insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.location().insertLocation(insert);
            }
        });
    }

    public LiveData<List<magic>> getAllMagic(int world){return db.magic().getAllMagic(world);}

    public magic getMagicById(int id){return db.magic().getMagicById(id);}

    public void insertMagic(final magic insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.magic().insertMagic(insert);
            }
        });
    }

    public LiveData<List<nation>> getAllNations(int world){return db.nation().getAllNations(world);}

    public nation getNationById(int id){return db.nation().getNationById(id);}

    public void insertNation(final nation insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.nation().insertNation(insert);
            }
        });
    }

    public LiveData<List<race>> getAllRaces(int world){return db.race().getAllRace(world);}

    public race getRaceById(int id){return db.race().getRaceById(id);}

    public void insertRace(final race insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.race().insertRace(insert);
            }
        });
    }

    public LiveData<List<world>> getAllWorlds(){return db.world().getAllWorlds();}

    public world getWorldById(int id){return db.world().getWorldById(id);}

    public void insertWorld(final world insert){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.world().insertWorld(insert);
            }
        });
    }
}
