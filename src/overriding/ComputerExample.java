package overriding;

public class ComputerExample {
	
	public static void main(String [] args) {
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("원면적 : "+calc.areaCircle(r));
		System.out.println();
		
		Computer comp = new Computer();
		System.out.println("원면적 : "+comp.areaCircle(r));
		System.out.println();
		
	}

}
