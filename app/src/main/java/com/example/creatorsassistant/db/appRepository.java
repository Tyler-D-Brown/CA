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
    public LiveData<List<world>> worlds;
    */

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

    //TODO handle the deletion of characters to handle sudo array.
    public void deleteCharacter(final character delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.character().deleteCharacter(delete);
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

    public void deleteEvent(final event delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.event().deleteEvent(delete);
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

    //TODO handle the deletion of factions to handle sudo array.
    public void deleteFaction(final faction delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.faction().deleteFaction(delete);
            }
        });
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

    public void deleteLocation(final location delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.location().deleteLocation(delete);
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

    public void deleteMagic(final magic delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.magic().deleteMagic(delete);
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

    public void deleteNation(final nation delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.nation().deleteNation(delete);
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

    public void deleteRace(final race delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.race().deleteRace(delete);
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

    public world getNewWorld(){
        return db.world().getNewWorld();
    }

    public void deleteWorld(final world delete){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                db.world().deleteWorld(delete);
            }
        });
    }
}