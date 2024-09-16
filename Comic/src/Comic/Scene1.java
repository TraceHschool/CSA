package Comic;

import javax.swing.*;
import java.awt.*;


public class Scene1 extends JPanel {
	
	public Scene1(Color bk) {
		setBackground(bk);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(100,70,50));
		g.fillOval(100, 100, 300,100);
		g.fillRect(150, 150, 30, 100);
		g.fillRect(300, 150, 30, 100);
		g.fillRect(325, 50, 50, 80);
		g.fillRect(325, 25, 120, 40);
		g.drawString("Scene2", 30, 30);
		
		
	}

}
