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
		
		dadLab = new JLabel("I'm an Dead");
		dadLab.setBackground(Color.WHITE);
		appLayout.putConstraint(SpringLayout.WEST, dadLab, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, dadLab, 281, SpringLayout.WEST, this);
		responseField = new JTextField("How do you Feel?");
		appLayout.putConstraint(SpringLayout.NORTH, dadLab, 48, SpringLayout.SOUTH, responseField);
		appLayout.putConstraint(SpringLayout.SOUTH, dadLab, 95, SpringLayout.SOUTH, responseField);
		appLayout.putConstraint(SpringLayout.NORTH, responseField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, responseField, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, responseField, -10, SpringLayout.EAST, this);
		makeJoke = new JButton("Create the joke");
		appLayout.putConstraint(SpringLayout.WEST, makeJoke, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, makeJoke, -10, SpringLayout.SOUTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(400, 200));
		this.setBackground(Color.BLUE);
		this.add(responseField);
		this.add(dadLab);
		this.add(makeJoke);
	}
	
	private void setupLayout()
	{
		dadLab.setOpaque(true);
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
			}
		});
	}
}
