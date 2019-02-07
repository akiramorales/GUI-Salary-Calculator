/**
 * @author Akira Morales
 * Period 6
 */
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SalaryCalculator {

	public static void main(String[] args)
	{
		//Key listener
		//Format amount to 2 decimals
		JFrame calc = new JFrame();
		calc.setBounds(300, 300, 500, 300);
		calc.setLayout(null);
		
		JLabel rateLabel = new JLabel("Hourly Rate");
		rateLabel.setBounds(25, 25, 100, 25);
		calc.add(rateLabel);
		JLabel hoursLabel = new JLabel("Hours/Week");
		hoursLabel.setBounds(25, 50, 150, 25);
		calc.add(hoursLabel);
		JLabel amountLabel = new JLabel("Annual Salary: $");
		amountLabel.setBounds(300, 200, 200, 25);
		calc.add(amountLabel);
		
		JTextField rateText = new JTextField();
		rateText.setBounds(100, 25, 100, 25);
		calc.add(rateText);
		JTextField hoursText = new JTextField();
		hoursText.setBounds(100, 50, 100, 25);
		calc.add(hoursText);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(25, 200, 100, 25);
		calc.add(calculate);
		calculate.addActionListener(new actionListener())
		{
			public void ActionPerformed(ActionEvent calculate)
			{
				rateLabel.setText("");
				hoursLabel.setText("");
				amountLabel.setText("Amount Salary: $" + Double.parseDouble(rateText.getText()) * Double.parseDouble(hoursText.getText()) * 52);
			}
		}
		
		calc.setVisible(true);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
