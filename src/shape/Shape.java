package shape;

public abstract class Shape implements MyComparable{
	
	public String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public abstract double computeArea();		//도형 면적 구하기
	public abstract double computePerimeter();	//도형 둘레구하기
	
	public int compareTo(Object other) {
		double myArea = computeArea();
		double yourArea = ((Shape) other).computeArea();
		
		if(myArea < yourArea) return -1;
		else if (myArea == yourArea) return 0;
		else return 1;
	}

}
