package org.wind.k.webservice.cxf.response;

import org.wind.k.webservice.cxf.dto.TeamDTO;

public class TeamResult {
	
	private TeamDTO team;	
	
	public TeamDTO getTeam() {
		return team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}
}
