package com.pluralsight.springbootfundamentals;

import com.pluralsight.springbootfundamentals.models.Player;
import com.pluralsight.springbootfundamentals.models.Team;
import com.pluralsight.springbootfundamentals.models.Tournament;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<Tournament> tournaments = null;
    public static List<Team> teamList = null;
    static {

        tournaments = new ArrayList<Tournament>();
        teamList = new ArrayList<>();
        List<Player> pl = new ArrayList<>();
        pl.add(new Player("1","Dhoni"));
        pl.add(new Player("3","Raydu"));
        pl.add(new Player("2","Raina"));
        pl.add(new Player("4","Ravindra Jadeza"));

        List<Player> pl2 = new ArrayList<>();
        pl2.add(new Player("1","Rohit"));
        pl2.add(new Player("2","Pollard"));
        pl2.add(new Player("3","Lewis"));
        pl2.add(new Player("4","Pandya"));

        List<Player> pl3 = new ArrayList<>();
        pl3.add(new Player("3","Sachin"));
        pl3.add(new Player("1","Dhoni"));
        pl3.add(new Player("2","Raina"));
        pl3.add(new Player("4","Ravindra Jadeza"));

        List<Player> pl4 = new ArrayList<>();
        pl4.add(new Player("1","Aktar"));
        pl4.add(new Player("3","Wasim"));
        pl4.add(new Player("2","Inji"));
        pl4.add(new Player("4","Babar Azam"));

        List<Team> teams = new ArrayList<>();
        teams.add(new Team("1","CSK", pl));
        teams.add(new Team("2","MI",pl2));


        tournaments.add( new Tournament("1","IPL 2020",teams));

        teams = new ArrayList<>();
        teams.add(new Team("3","India",pl3));
        teams.add(new Team("4","Pakistan",pl4));
        tournaments.add( new Tournament("2","World Cup 2019", teams));


        teamList.add(new Team("1","CSK", pl));
        teamList.add(new Team("2","MI",pl2));
        teamList.add(new Team("3","India",pl3));
        teamList.add(new Team("4","Pakistan",pl4));
    }

}
