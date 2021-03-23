package nba_project.nba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Autowired
    @Qualifier("warriors")
    private ITeam team1;
    @Autowired
    @Qualifier("raptors")
    private ITeam team2;

    public ITeam playGame(){
        return Math.random() >0.5 ? team1 : team2;
    }
}
