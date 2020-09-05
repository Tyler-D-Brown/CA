package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.creatorsassistant.db.helpers.sqLiteSudoArray;

@Entity(tableName = "nation", foreignKeys = {
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world"),
        @ForeignKey(entity = character.class, parentColumns = "id", childColumns = "ruler"),
        @ForeignKey(entity = location.class, parentColumns = "id", childColumns = "capital")
})
public class nation {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int ruler;
    private int capital;
    private int world;
    private String name;
    private String description;
    private String government;
    private String allies;
    @Ignore
    private int[] alliesArray;
    private String enemies;
    @Ignore
    private int[] enemiesArray;
    @Ignore
    private sqLiteSudoArray arrayHelper = new sqLiteSudoArray();

    public nation(int id, int ruler, int capital, int world, String name, String description, String government, String allies, String enemies) {
        this.id = id;
        this.ruler = ruler;
        this.capital = capital;
        this.world = world;
        this.name = name;
        this.description = description;
        this.government = government;
        this.allies = allies;
        this.enemies = enemies;
        this.alliesArray = arrayHelper.stringToArray(allies);
        this.enemiesArray = arrayHelper.stringToArray(enemies);
    }

    @Ignore
    public nation(int id, int ruler, int capital, int world, String name, String description, String government, int[] alliesArray, int[] enemiesArray) {
        this.id = id;
        this.ruler = ruler;
        this.capital = capital;
        this.world = world;
        this.name = name;
        this.description = description;
        this.government = government;
        this.alliesArray = alliesArray;
        this.enemiesArray = enemiesArray;
        this.allies = arrayHelper.arrayToString(alliesArray);
        this.enemies = arrayHelper.arrayToString(enemiesArray);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuler() {
        return ruler;
    }

    public void setRuler(int ruler) {
        this.ruler = ruler;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
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

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    public int[] getAlliesArray() {
        return alliesArray;
    }

    public void setAlliesArray(int[] alliesArray) {
        this.alliesArray = alliesArray;
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }

    public int[] getEnemiesArray() {
        return enemiesArray;
    }

    public void setEnemiesArray(int[] enemiesArray) {
        this.enemiesArray = enemiesArray;
    }
}
