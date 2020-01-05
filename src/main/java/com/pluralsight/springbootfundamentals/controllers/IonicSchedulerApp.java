package com.pluralsight.springbootfundamentals.controllers;

import com.pluralsight.springbootfundamentals.models.Player;
import com.pluralsight.springbootfundamentals.models.Team;
import com.pluralsight.springbootfundamentals.models.Tournament;
import com.pluralsight.springbootfundamentals.DataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/ionic")
//@CrossOrigin : This will allow all the CORS request.
//However, setting CORS via filter and active profile = Development is a better approach
public class IonicSchedulerApp {

    DataService ds = new DataService();

    @GetMapping
    @RequestMapping(value = "/tournaments", method = RequestMethod.GET)
    public List<Tournament> getTournaments()
    {
        return ds.tournaments;
    }

    //RequestParam expects parameter to be sent via ?id=1, should be used for optional item
    @RequestMapping(value = "/getTeams/{id}", method = RequestMethod.GET)
    public List<Team> getTeams(@PathVariable(name="id", required=true) String id){
         for(Tournament tournament:ds.tournaments){
            if(tournament.getId().equals(id)){
                return tournament.getTeams();
            }
        }
        return null;
    }


    @RequestMapping(value = "/getTeamDetail/{id}", method = RequestMethod.GET)
    public List<Player> getTeamDetail(@PathVariable(name="id") String id){
        for(Team team:ds.teamList){
            if(team.getId().equals(id)){
                return team.getPlayers();
            }
        }
        return null;
    }
}
