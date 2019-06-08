package dad.view;

import javax.swing.*;
import dad.controller.DadController;
import java.awt.*;
import java.awt.event.*;

public class DadPanel extends JPanel 
{
	private DadController app;
	private SpringLayout appLayout;
	
	private JLabel dadLab;
	private JTextField responseField;
	private JButton makeJoke;
	
	public DadPanel(DadController app)
	{
		super();
		
		this.app = app;
		
		dadLab = new JLabel("I'm an Dead");
		responseField = new JTextField("How do you Feel?");
		makeJoke = new JButton("Create the joke");
		
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
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
