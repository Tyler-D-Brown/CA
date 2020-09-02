package com.example.creatorsassistant.db.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.creatorsassistant.db.helpers.sqLiteSudoArray;

@Entity(tableName = "event", foreignKeys = {
        @ForeignKey(entity = location.class, parentColumns = "id", childColumns = "location"),
        @ForeignKey(entity = world.class, parentColumns = "id", childColumns = "world"),
        @ForeignKey(entity = event.class, parentColumns = "id", childColumns = "precedingEvent")
})
public class event {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private int precedingEvent;
    private int world;
    private int location;
    private String characters;
    @Ignore
    private int[] charactersArray;
    @Ignore
    private sqLiteSudoArray arrayHelper = new sqLiteSudoArray();

    //for retrieving elements from the database
    public event(int id, String name, String description, int precedingEvent, int world, int location, String characters) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.precedingEvent = precedingEvent;
        this.world = world;
        this.location = location;
        this.characters = characters;
        this.charactersArray = arrayHelper.stringToArray(characters);
    }

    //for creating items to insert into the database
    @Ignore
    public event(int id, String name, String description, int precedingEvent, int world, int location, int[] charactersArray) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.precedingEvent = precedingEvent;
        this.world = world;
        this.location = location;
        this.charactersArray = charactersArray;
        this.characters = arrayHelper.arrayToString(charactersArray);
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

    public int getPrecedingEvent() {
        return precedingEvent;
    }

    public void setPrecedingEvent(int precedingEvent) {
        this.precedingEvent = precedingEvent;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public int[] getCharactersArray() {
        return charactersArray;
    }

    public void setCharactersArray(int[] charactersArray) {
        this.charactersArray = charactersArray;
    }
}
