package thread.beef;

import java.awt.Toolkit;

//0.5�� �ֱ�� beep���� �߻���Ű�鼭 ���ÿ� �������ϴ� �۾�
//������ �߻��� �������� ���� �ٸ� �۾��̹Ƿ� ���ν����尡 ���ÿ� �ΰ��� �۾��� ó���� �� ����
//�� �ڵ��� ���ν������ �������� ��� �߻���Ų ����, ������ ����
public class BeefPrintExample1 {
	
	public static void main(String [] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {} //0.5�ʰ� ����
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("######### ding dong");
			try {Thread.sleep(500);}catch(Exception e) {} //0.5�ʰ� ����
		}
		
	}

}
