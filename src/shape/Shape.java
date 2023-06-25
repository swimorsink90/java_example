package shape;

public abstract class Shape implements MyComparable{
	
	public String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public abstract double computeArea(); //면적 계산
	public abstract double computePerimeter(); //둘레 계산
	
	//자기자신과 매개변수로 들어온 값의 크기를 비교
	public int compareTo(Object other) {
		double myArea = computeArea();
		double yourArea = ((Shape) other).computeArea();
		
		if(myArea < yourArea) return -1;
		else if (myArea == yourArea) return 0;
		else return 1;
	}

}
