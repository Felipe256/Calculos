package Atividade;

import javax.swing.JOptionPane;

public class A3 {
	public static void main(String[] args) {
		//Todo Auto-generated method stub
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota"));
	int d = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota"));
	int e = Integer.parseInt(JOptionPane.showInputDialog("Digite a quinta nota"));
	double total = (a+b+c+d+e)/5;
	JOptionPane.showMessageDialog(null,total + " é a média");
	}
}
