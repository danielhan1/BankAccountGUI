import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGuI extends JFrame
{
	
	public TestGuI()
	{
		
		//thing before the .setTitle = implicit parameter
		setTitle("BankAccount");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		JLabel lblOne = new JLabel("Name:");
		lblOne.setBounds(20, 20, 100, 30);
		add(lblOne);
		
		JTextField text = new JTextField("");
		text.setBounds(70, 20, 100, 30);
		add(text);
		
		JLabel lblTwo = new JLabel("Account Type: ");
		lblTwo.setBounds(20, 70, 100, 30);
		add(lblTwo);
		
		String[] accounts = { "Checkings", "Savings" };
		JComboBox boxOne = new JComboBox(accounts);
		boxOne.setBounds(110, 70, 90, 30);
		add(boxOne);
		
		
		JLabel lblThree = new JLabel("Initial Balance: ");
		lblThree.setBounds(20, 120, 100, 30);
		add(lblThree);
		
		JTextField textTwo = new JTextField("");
		textTwo.setBounds(110, 120, 100, 30);
		add(textTwo);
		
		JButton buttonOne = new JButton("Create Account");
		buttonOne.setBounds(20, 170, 130, 30);
		add(buttonOne);
		
		//buttonOne.addActionListener(new ActionListener()
		//{
		//	public void actionPerformed(ActionEvent e)
			//{
				
				
			//}
		//}
//);
		JButton buttonTwo = new JButton("Display All Accounts");
		buttonTwo.setBounds(170, 170, 180, 30);
		add(buttonTwo);
		//this. <- to get dropdown menu
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//this refers to the object in the parameter
		
	}
	
	public static void main(String[] args)
	{
		new TestGuI();
	}
}
