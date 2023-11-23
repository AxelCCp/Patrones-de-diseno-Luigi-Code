package B9_State;

public class Unblocked implements MissionState {

	@Override
	public void next(Mission mission) {
		mission.setState(new Progress());
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return " id unBlocked";
	}

}
