package B9_State;

public interface MissionState{
	
	void next(Mission mission);
	
	String print();
	
}
