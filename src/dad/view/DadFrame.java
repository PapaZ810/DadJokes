package dad.view;

import javax.swing.*;
import dad.controller.DadController;
import java.awt.*;

public class DadFrame extends JFrame
{
	private static final long serialVersionUID = 2L;
	
	private DadController app;
	private DadPanel pane;
	
	public DadFrame(DadController app)
	{
		super();
		
		this.app = app;
		pane = new DadPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(pane);
		this.setTitle("I'm a Dad");
		this.setPreferredSize(new Dimension(400, 200));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}
