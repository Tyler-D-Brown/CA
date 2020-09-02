package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "magic", foreignKeys = {
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world")
})
public class magic {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private int world;

    public magic(int id, String name, String description, int world) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.world = world;
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

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }
}
