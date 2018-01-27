package elseif;

import javax.swing.JOptionPane;

public class RUHappy {
public static void main(String[] args) {
	String Hap = JOptionPane.showInputDialog("are you Happy?");
	if(Hap.equalsIgnoreCase("yes")) {
		
		JOptionPane.showMessageDialog(null, "keep doing what you are doing");
	}
	else if(Hap.equalsIgnoreCase("no")) {
		String no = JOptionPane.showInputDialog("do you want to be happy");
		if(no.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "keep doing what you are doing");
		}
		else if(no.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "change something");
		}
		
	}
	else {
		JOptionPane .showMessageDialog(null, "okkkkkkkkk");
	}
}
}
