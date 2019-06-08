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
	
	private JPanel grids;
	
	public DadPanel(DadController app)
	{
		super();
		
		this.app = app;
		
		dadLab = new JLabel("I'm an Dead");
		responseField = new JTextField("How do you Feel?");
		makeJoke = new JButton("Create the joke");
		
		grids = new JPanel(new GridLayout(0,1));
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(400, 200));
		this.add(grids);
		grids.add(responseField);
		grids.add(dadLab);
		grids.add(makeJoke);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void makeJoke()
	{
		String response = responseField.getText();
		
		String inbet = response.substring(response.indexOf("I'm")+1);
		
		String out = "Hi " + inbet + ", I'm dad!";
		
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
