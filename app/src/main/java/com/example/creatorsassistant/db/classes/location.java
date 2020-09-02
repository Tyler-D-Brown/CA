package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.creatorsassistant.db.helpers.sqLiteSudoArray;

@Entity(tableName = "location", foreignKeys = {
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world")
})
public class location {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int world;
    private String name;
    private String description;
    private String factions;
    @Ignore
    private int[] factionsArray;
    @Ignore
    private sqLiteSudoArray arrayHelper = new sqLiteSudoArray();

    public location(int id, int world, String name, String description, String factions) {
        this.id = id;
        this.world = world;
        this.name = name;
        this.description = description;
        this.factions = factions;
        this.factionsArray = arrayHelper.stringToArray(factions);
    }

    @Ignore
    public location(int id, int world, String name, String description, int[] factionsArray) {
        this.id = id;
        this.world = world;
        this.name = name;
        this.description = description;
        this.factionsArray = factionsArray;
        this.factions = arrayHelper.arrayToString(factionsArray);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactions() {
        return factions;
    }

    public void setFactions(String factions) {
        this.factions = factions;
    }

    public int[] getFactionsArray() {
        return factionsArray;
    }

    public void setFactionsArray(int[] factionsArray) {
        this.factionsArray = factionsArray;
    }
}
