package Comic;

import javax.swing.*;
import java.awt.*;
public class Scene3 extends JPanel {
	
	public Scene3(Color bk) {
		setBackground(bk);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.orange);
		g.fillOval(200, 200, 50,50);
		g.drawString("Scene3", 30, 30);
		
	}

}
