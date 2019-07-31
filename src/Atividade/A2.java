package Atividade;

import javax.swing.JOptionPane;

public class A2{
	public static void main(String[] args) {
		//Todo Auto-generated method stub
			
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número"));
		
		if(a>b && a>c) {
			if(b>c) {
				JOptionPane.showMessageDialog(null,c +" < "+ b +" < "+ a);
			}else {
				JOptionPane.showMessageDialog(null,b +" < "+ c +" < "+ a);
			}
		}
		if(b>a && b>c) {
			if(a>c) {
				JOptionPane.showMessageDialog(null,c +" < "+ a +" < " + b);
			}else {
				JOptionPane.showMessageDialog(null,a +" < "+ c +" < "+ b);
			}
		}
			if(c>a && c>b) {
				if(a>b) {
					JOptionPane.showMessageDialog(null, b +" < "+ a +" < "+ c);
				}else {
					JOptionPane.showMessageDialog(null, a +" < "+ b +" < "+ c);
				}
			}
	}
		
}