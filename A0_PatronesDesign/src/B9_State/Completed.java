package B9_State;

public class Completed implements MissionState{

	@Override
	public void next(Mission mission) {
		System.out.println(mission.getName() + " mission  completed, no next state.");
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return " is completed";
	}

}
