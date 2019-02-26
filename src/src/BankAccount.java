/**
 * Daniel Han
 * PD. 7
 */
import javax.swing.JFrame;



import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.JComboBox;

import javax.swing.JButton;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;



public class BankAccount extends JFrame

{

	

	public BankAccount()

	{

		

		//thing before the .setTitle = implicit parameter

		setTitle("BankAccount");

		setBounds(200, 200, 1000, 800);

		setLayout(null);

		

		JLabel lblOne = new JLabel("Name:");

		lblOne.setBounds(20, 20, 100, 30);

		add(lblOne);

		

		JTextField textOne = new JTextField("");

		textOne.setBounds(70, 20, 100, 30);

		add(textOne);

		

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

		
		
		ArrayList<BankAcc> accountz = new ArrayList<BankAcc>(); 
		
		buttonOne.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e)

		{
				
				int OVER_DRAFT_FEE = 15;

				double RATE = 0.0025;

				double TRANSACTION_FEE = 1.5;

				int MIN_BAL = 300;

				int MIN_BAL_FEE = 10;

				int FREE_TRANS = 10;
				
				if(boxOne.getSelectedItem().equals("Checkings"))
				{
					String bal = textTwo.getText();
					double initialBal = Double.parseDouble(bal);
					CheckingsAccount account = new CheckingsAccount(textOne.getText(), initialBal, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANS);
					accountz.add(account);
					
					
				}
				else
				{
					String balance = textTwo.getText();
					double initialBal2 = Double.parseDouble(balance);
					SavingsAccount account = new SavingsAccount(textOne.getText(), initialBal2, RATE, MIN_BAL, MIN_BAL_FEE);
					accountz.add(account);
					
				}

		}

		
		}
		);

		JButton buttonTwo = new JButton("Display All Accounts");

		buttonTwo.setBounds(170, 170, 180, 30);

		add(buttonTwo);
		
		buttonTwo.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent f)
			{
				if(f.getActionCommand().matches("Display All Accounts"));
				{

					
					System.out.println(accountz);
					
				}
				
		
			}
		
		}
		);

		//this. <- to get dropdown menu

		setVisible(true);

		setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		//this refers to the object in the parameter

		

	}

	

	public static void main(String[] args)

	{

		new BankAccount();

	}

}