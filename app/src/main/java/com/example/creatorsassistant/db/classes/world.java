package com.example.creatorsassistant.db.classes;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "world")
public class world {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private String technologyLevel;
    private boolean newWorld;

    public world(int id, String name, String description, String technologyLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologyLevel = technologyLevel;
        this.newWorld = false;
    }

    @Ignore
    public world(){
        this.newWorld = true;
        this.name = "";
        this.description = "";
        this.technologyLevel = "";
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologyLevel() {
        return technologyLevel;
    }

    public void setTechnologyLevel(String technologyLevel) {
        this.technologyLevel = technologyLevel;
    }
}
