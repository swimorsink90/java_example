package polymorphism;

//다형성 : 수퍼클래스(부모클래스) 타입의 변수가 서브클래스 타입의 타입의 객체를 참조할 수 있다.
public class PolyExample {
	
	public static void main(String [] args) {
		
		Computer myComputer = new Computer("Acme", "Intel", 2, 160, 2.4);
		NoteBook yourNotebook = new NoteBook("DellGate", "AMD", 4, 240, 1.8, 15.0, 7.5);
		
		System.out.println("My Computer is "+myComputer.toString());		
		System.out.println("Your Notebook is "+yourNotebook.toString());
		
		//theComputer는 Computer 타입의 변수이면서 실제로는 Notobook 객체를 참조하고 있다.
		//두 클래스는 각자의 toString 메서드를 갖지만, 동적바인딩이 발생하면서, Notebook 클래스의 toString() 메서드가 실행됨
		Computer theComputer = new NoteBook("Bravo", "Intel", 4, 240, 2/4, 15.07, 7);
		System.out.println("The Computer is "+theComputer.toString());
	}

}
