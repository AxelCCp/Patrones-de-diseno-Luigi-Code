package B1_FlyWeight;

public class Coordinates {

	
	public Coordinates() {
		// TODO Auto-generated constructor stub
		posX = (int) (Math.random() * 100);
		posY = (int) (Math.random() * 100);
		posZ = (int) (Math.random() * 100);
	}
	
	
	public static Coordinates getCoordinates() {
		return new Coordinates();
	}
	
	
	
	@Override
	public String toString() {
		return "Coordinates [posX=" + posX + ", posY=" + posY + ", posZ=" + posZ + "]";
	}



	private int posX, posY, posZ;
	
}
