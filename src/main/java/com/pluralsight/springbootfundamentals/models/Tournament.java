package com.pluralsight.springbootfundamentals.models;

import java.util.List;

public class Tournament {
    private String name;
    private String id;
    private List<Team> teams;

    public Tournament(String id, String name, List<Team> teams) {
        this.name = name;
        this.id = id;
        this.teams = teams;
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

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
