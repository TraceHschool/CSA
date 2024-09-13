package Comic;

import javax.swing.*;
import java.awt.*;


public class Scene1 extends JPanel {
	
	public Scene1(Color bk) {
		setBackground(bk);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(200,255,00));
		g.drawOval(200, 200, 500,50);
		g.drawString("Scene2", 30, 30);
		
		
	}

}
