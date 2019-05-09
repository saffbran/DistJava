package us.bsaffert.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamsController {
    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getThanks() {
        return teamService.getAllTeams();
    }
}