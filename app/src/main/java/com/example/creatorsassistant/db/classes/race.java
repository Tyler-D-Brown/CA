package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.creatorsassistant.db.helpers.sqLiteSudoArray;

@Entity(tableName = "nation", foreignKeys = {
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world")
})
public class race {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int world;
    private String name;
    private String description;
    private String uniqueCharacteristics;
    private String uniqueAbilities;

    public race(int id, int world, String name, String description, String uniqueCharacteristics, String uniqueAbilities) {
        this.id = id;
        this.world = world;
        this.name = name;
        this.description = description;
        this.uniqueCharacteristics = uniqueCharacteristics;
        this.uniqueAbilities = uniqueAbilities;
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

    public String getUniqueCharacteristics() {
        return uniqueCharacteristics;
    }

    public void setUniqueCharacteristics(String uniqueCharacteristics) {
        this.uniqueCharacteristics = uniqueCharacteristics;
    }

    public String getUniqueAbilities() {
        return uniqueAbilities;
    }

    public void setUniqueAbilities(String uniqueAbilities) {
        this.uniqueAbilities = uniqueAbilities;
    }
}
