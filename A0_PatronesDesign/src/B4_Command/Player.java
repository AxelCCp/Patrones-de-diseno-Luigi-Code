package B4_Command;

public class Player {

	public Player(int posX, int posY, int posZ) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
	}
	
	public void moveFront() {
		posZ++;
		System.out.println("Position z " + posZ);
	}

	public void moveBack() {
		posZ--;
		System.out.println("Position z " + posZ);
	}
	
	public void moveRight() {
		posX++;
		System.out.println("Position x " + posX);
	}
	
	public void moveLeft() {
		posX--;
		System.out.println("Position x " + posX);
	}
	
	public void jump() {
		posY++;
		System.out.println("Position y " + posY);
		try {
			Thread.sleep(500);
			posY--;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Position y " + posY);
	}
	
	private int posX, posY, posZ;

}
