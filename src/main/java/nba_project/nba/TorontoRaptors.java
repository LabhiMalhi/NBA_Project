package nba_project.nba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("raptors")
public class TorontoRaptors implements ITeam {
    @Value("${team.raptors.name}")
    private String name;

    @Override
    public String getTeamName() {
        return name;
    }
}
