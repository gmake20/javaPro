package scm;

//Calc.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame implements ActionListener {

	private JTextField display;

	private String firstNum = "";
	private String operator = "";
	private boolean isNewInput = true;

	public Calc() {
		setTitle("계산기");
		setSize(350, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// 화면 표시창
		display = new JTextField("0");
		display.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);

		add(display, BorderLayout.NORTH);

		// 버튼 패널
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4, 5, 5));

		String[] btnNames = {
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "3", "-",
				"0", "C", "=", "+"
		};

		for (String name : btnNames) {
			MyButton btn = new MyButton(name);
			btn.addActionListener(this);
			panel.add(btn);
		}

		add(panel, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();

		// 숫자 버튼
		if (cmd.matches("[0-9]")) {

			if (isNewInput || display.getText().equals("0")) {
				display.setText(cmd);
				isNewInput = false;
			} else {
				display.setText(display.getText() + cmd);
			}
		}

		// 연산자 버튼
		else if (cmd.matches("[+\\-*/]")) {

			firstNum = display.getText();
			operator = cmd;
			isNewInput = true;
		}

		// 결과 계산
		else if (cmd.equals("=")) {

			double num1 = Double.parseDouble(firstNum);
			double num2 = Double.parseDouble(display.getText());

			double result = 0;

			switch (operator) {
			case "+":
				result = num1 + num2;
				break;

			case "-":
				result = num1 - num2;
				break;

			case "*":
				result = num1 * num2;
				break;

			case "/":
				result = num1 / num2;
				break;
			}

			// 정수면 .0 제거
			if (result == (int) result) {
				display.setText(String.valueOf((int) result));
			} else {
				display.setText(String.valueOf(result));
			}

			isNewInput = true;
		}

		// 초기화
		else if (cmd.equals("C")) {
			display.setText("0");
			firstNum = "";
			operator = "";
			isNewInput = true;
		}
	}

	public static void main(String[] args) {
		new Calc();
	}
}