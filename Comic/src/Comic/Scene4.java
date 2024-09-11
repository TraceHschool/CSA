package Comic;

import javax.swing.*;
import java.awt.*;
public class Scene4 extends JPanel{
	public Scene4(Color bk) {
		setBackground(bk);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(200, 200, 50,50);
		g.drawString("Scene4", 30, 30);
		
	}

}
