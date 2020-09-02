package com.example.creatorsassistant.db.classes;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "world")
public class world {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private String technologyLevel;

    public world(int id, String name, String description, String technologyLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologyLevel = technologyLevel;
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
