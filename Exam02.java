package day02;
import java.util.*;

import javax.swing.JOptionPane;
public class Exam02 {

	public static void main(String[] args) {
		String score1=JOptionPane.showInputDialog("체육 점수를 입력하세요");
		String score2=JOptionPane.showInputDialog("수학 점수를 입력하세요");
		String score3=JOptionPane.showInputDialog("영어 점수를 입력하세요");
		String score4=JOptionPane.showInputDialog("국어 점수를 입력하세요");
		
		if (score1.equals("")) {
			System.out.println("체육점수를 입력하세요");
			return;
		}
		if (score2.equals("")) {
			System.out.println("수학 점수를 입력하세요");
			return;
		}
		if (score3.equals("")) {
			System.out.println("영어 점수를 입력하세요");
			return;
		}
		if (score4.equals("")) {
			System.out.println("국어 점수를 입력하세요");
			return;
		}
	
		
		int score11=Integer.parseInt(score1);
		int score22=Integer.parseInt(score2);
		int score33=Integer.parseInt(score3);
		int score44=Integer.parseInt(score4);
		
		System.out.printf("당신의 평균은 %d점 입니다", (score11+score22+score33+score44)/4);
		
		
		
		
		
		
		
		
		
		

	}

}
