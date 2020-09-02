package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.example.creatorsassistant.db.helpers.sqLiteSudoArray;

@Entity(tableName = "faction", foreignKeys = {
        @ForeignKey(entity = location.class, parentColumns = "id", childColumns = "hq"),
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world"),
        @ForeignKey(entity = character.class, parentColumns = "id", childColumns = "leader")
})
public class faction {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int hq;
    private int world;
    private int leader;
    private String name;
    private String description;

    public faction(int id, int hq, int world, int leader, String name, String description) {
        this.id = id;
        this.hq = hq;
        this.world = world;
        this.leader = leader;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHq() {
        return hq;
    }

    public void setHq(int hq) {
        this.hq = hq;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
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
}
