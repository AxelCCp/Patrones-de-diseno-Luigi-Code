package B9_State;

public class Blocked implements MissionState{

	@Override
	public void next(Mission mission) {
		mission.setState(new Unblocked());
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return " is blocked";
	}

}
