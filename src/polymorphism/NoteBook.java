package polymorphism;

public class NoteBook extends Computer{
	
	private double screenSize;
	private double weight;

	public NoteBook(String manufacture, String processor, int ramSize, int diskSize, double processorSpeed,
			double screenSize, double weight) {
		super(manufacture, processor, ramSize, diskSize, processorSpeed);
		this.screenSize = screenSize;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString()+", screenSize=" + screenSize + ", weight=" + weight;
	}
}
