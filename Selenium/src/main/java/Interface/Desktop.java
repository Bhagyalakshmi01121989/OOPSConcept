package Interface;

public class Desktop implements Hardware, Software {

	public void Software() {
		// TODO Auto-generated method stub
		System.out.println("software");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardwareResource");
		
	}
	
	public void desktopModel() {
		System.out.println("desktopModel");
		
		
	}
	
	//multiple inheritance

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.Software();
		dt.hardwareResources();
		dt.desktopModel();
	}
}