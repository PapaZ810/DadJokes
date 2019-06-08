package dad.view;

import javax.swing.*;
import dad.controller.DadController;
import java.awt.*;
import java.awt.event.*;

public class DadPanel extends JPanel 
{
	private static final long serialVersionUID = -117L;
	
	private DadController app;
	private SpringLayout appLayout;
	
	private JLabel dadLab;
	private JTextField responseField;
	private JButton makeJoke;
	
	public DadPanel(DadController app)
	{
		super();
		
		appLayout = new SpringLayout();
		
		this.app = app;
		
		dadLab = new JLabel("Advice will show here.");
		responseField = new JTextField("How do you Feel?");
		makeJoke = new JButton("Generate advice.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(300, 120));
		this.setBackground(Color.BLUE);
		this.add(responseField);
		this.add(dadLab);
		this.add(makeJoke);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, makeJoke, 6, SpringLayout.SOUTH, dadLab);
		appLayout.putConstraint(SpringLayout.WEST, makeJoke, 0, SpringLayout.WEST, responseField);
		appLayout.putConstraint(SpringLayout.EAST, makeJoke, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, dadLab, 6, SpringLayout.SOUTH, responseField);
		appLayout.putConstraint(SpringLayout.EAST, responseField, 0, SpringLayout.EAST, dadLab);
		appLayout.putConstraint(SpringLayout.WEST, dadLab, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, dadLab, -37, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, dadLab, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, responseField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, responseField, 10, SpringLayout.WEST, this);
		dadLab.setBackground(Color.WHITE);
		dadLab.setOpaque(true);
	}
	
	private void makeRandomColor()
	{
		int red = 100;
		int blue = 100;
		int green = 100;
		
		while(true)
		{
			red = (int)Math.random() * 255;
			blue = (int)Math.random() * 255;
			green = (int)Math.random() * 255;
			
			this.setBackground(new Color(red, blue, green));
			
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	private void makeJoke()
	{
		String response = responseField.getText();
		
		String inbet = response.substring(response.indexOf("I'm")+4);
		
		String trimmed = inbet.trim();
		
		String out = "Hi " + trimmed + ", I'm dad!";
		
		dadLab.setText(out); 
	}
	
	private void setupListeners()
	{
		makeJoke.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				makeJoke();
				//makeRandomColor();
			}
		});
	}
}
