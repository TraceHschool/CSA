package Comic;

import javax.swing.*;
import java.awt.*;


public class Scene6 extends JPanel {
	
	public Scene6(Color bk) {
		setBackground(bk);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.drawOval(200, 200, 50,50);
		g.drawString("Scene2", 30, 30);
		
	}

}
