package com.pluralsight.springbootfundamentals.models;

import java.util.List;

public class Team {
    private String name;
    private String id;
    private List<Player> players;

    public Team(String id, String name, List<Player> players) {
        this.name = name;
        this.id = id;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}

