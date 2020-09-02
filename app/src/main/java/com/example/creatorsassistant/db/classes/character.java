package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.example.creatorsassistant.db.helpers.*;

@Entity(tableName = "character", foreignKeys = {
        @ForeignKey(entity = race.class, parentColumns = "id", childColumns = "race"),
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world")
})
public class character {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int race;
    private String description;
    private String backStory;
    //foreign key array
    private String faction;
    @Ignore
    private int[] factionArray;
    //foreign key array
    private String allies;
    @Ignore
    private int[] alliesArray;
    //foreign key array
    private String enemies;
    @Ignore
    private int[] enemiesArray;
    private String skills;
    private int world;
    @Ignore
    private sqLiteSudoArray arrayHelper = new sqLiteSudoArray();

    //used to create a new item to insert into the database
    @Ignore
    public character(int id, String name, int race, String description, String backStory, int[] factionArray, int[] alliesArray, int[] enemiesArray, String skills, int world) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.description = description;
        this.backStory = backStory;
        this.factionArray = factionArray;
        this.alliesArray = alliesArray;
        this.enemiesArray = enemiesArray;
        this.skills = skills;
        this.world = world;
        this.faction=arrayHelper.arrayToString(factionArray);
        this.allies=arrayHelper.arrayToString(alliesArray);
        this.enemies=arrayHelper.arrayToString(enemiesArray);
    }


    //used to pull items from the database
    public character(int id, String name, int race, String description, String backStory, String faction, String allies, String enemies, String skills, int world) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.description = description;
        this.backStory = backStory;
        this.faction = faction;
        this.allies = allies;
        this.enemies = enemies;
        this.skills = skills;
        this.world = world;
        this.enemiesArray = arrayHelper.stringToArray(enemies);
        this.alliesArray = arrayHelper.stringToArray(allies);
        this.factionArray = arrayHelper.stringToArray(faction);
    }

    @Ignore
    public character(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public int[] getEnemiesArray() {
        return enemiesArray;
    }

    public void setEnemiesArray(int[] enemiesArray) {
        this.enemiesArray = enemiesArray;
    }

    public int[] getAlliesArray() {
        return alliesArray;
    }

    public void setAlliesArray(int[] alliesArray) {
        this.alliesArray = alliesArray;
    }

    public int[] getFactionArray() {
        return factionArray;
    }


}
