package day03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc {
	private static JTextField tf1;
	private static JTextField tfResult;
	private static JTextField tf2;

	public static void main(String[] args) {
		JFrame f=new JFrame("::MyCalc v1.0::");
		f.setSize(500, 800);
		f.setLocation(500,0);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\multicamp\\JavaWorkspace\\Begin\\img\\calc.png"));
		lblNewLabel.setBounds(24, 35, 434, 378);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(424, 470, -382, 75);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("숫자2");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3.setBounds(46, 521, 91, 52);
		panel.add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.BOLD, 36));
		tf1.setBounds(213, 436, 245, 52);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1= tf1.getText();
				String input2= tf2.getText();
				f.setTitle(tf1+"+"+tf2);
				
				float in1 =Float.parseFloat(input1);
				float in2 =Float.parseFloat(input2);
				
				float plus= in1+in2;
				tfResult.setText(in1+"+"+in2+"="+plus);
			}

		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNewButton.setBounds(25, 600, 81, 52);
		panel.add(btnNewButton);
		
		tfResult = new JTextField();
		tfResult.setText("여기에 결과 출력");
		tfResult.setFont(new Font("굴림", Font.BOLD, 36));
		tfResult.setBounds(24, 665, 434, 66);
		panel.add(tfResult);
		tfResult.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("숫자1");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(46, 432, 111, 66);
		panel.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1= tf1.getText();
				String input2= tf2.getText();
				f.setTitle(tf1+"-"+tf2);
				
				float in1 =Float.parseFloat(input1);
				float in2 =Float.parseFloat(input2);
				
				float minus= in1-in2;
				tfResult.setText(in1+"-"+in2+"="+minus);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNewButton_1.setBounds(143, 600, 81, 52);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1= tf1.getText();
				String input2= tf2.getText();
				f.setTitle(tf1+"*"+tf2);
				
				float in1 =Float.parseFloat(input1);
				float in2 =Float.parseFloat(input2);
				
				float multi= in1*in2;
				tfResult.setText(in1+"*"+in2+"="+multi);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNewButton_2.setBounds(261, 600, 81, 52);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1= tf1.getText();
				String input2= tf2.getText();
				f.setTitle(tf1+"/"+tf2);
				
				float in1 =Float.parseFloat(input1);
				float in2 =Float.parseFloat(input2);
				
				float div= in1/in2;
				tfResult.setText(in1+"/"+in2+"="+div);
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNewButton_3.setBounds(377, 600, 81, 52);
		panel.add(btnNewButton_3);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("굴림", Font.BOLD, 36));
		tf2.setColumns(10);
		tf2.setBounds(213, 521, 245, 52);
		panel.add(tf2);
		f.setVisible(true);
		
		
		
		
		
		
	}
}
