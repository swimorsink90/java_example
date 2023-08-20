package collection.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String [] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전을 넣음
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //동전 케이스가 비었는지 확인
			Coin coin = coinBox.pop();	//동전 케이스에서 가장 위의 동전 꺼내기
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
		}
	}

}
