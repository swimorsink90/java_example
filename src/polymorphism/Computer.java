package polymorphism;

public class Computer {
	
	private String manufacture;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	public Computer(String manufacture, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacture = manufacture;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	
	public double computePower() {
		return ramSize * processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	@Override
	public String toString() {
		return "manufacture=" + manufacture + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", diskSize=" + diskSize + ", processorSpeed=" + processorSpeed;
	}
	
	
	

}
