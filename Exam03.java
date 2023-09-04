package day02;
import java.util.*;

import javax.swing.JOptionPane;
public class Exam03 {

	public static void main(String[] args) {
		
		float pi=3.14f;
				
		String half=JOptionPane.showInputDialog("반지름을 입력하세요");
		if (half.equals("")) {
			System.out.println("반지름을 입력하지 않으셨습니다.");
			return;
		}
		
		float half1 = Float.parseFloat(half);
	
		
		System.out.printf("원의 면적은 %f 입니다", pi * (half1*half1));
		
		

		


		
		
		
		
	

	}
}
