package nba_project.nba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("warriors")
public class GoldenWarriors implements ITeam{
    @Value("${team.warriors.name}")
    private String name;

    @Override
    public String getTeamName() {
        return name;
    }
}
