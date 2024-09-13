package Comic;

import javax.swing.*;
import java.awt.*;


public class myDrawing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		//frame.setSize(900, 600);
		frame.setTitle("my first drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scene1 s1 = new Scene1(Color.blue);
		Scene2 s2 = new Scene2(Color.green);
		Scene3 s3 = new Scene3(Color.red);
		Scene4 s4 = new Scene4(Color.yellow);
		Scene5 s5 = new Scene5(Color.red);
		Scene6 s6 = new Scene6(Color.yellow);

		
		
		Container pane = frame.getContentPane();
		
		pane.setLayout(new GridLayout(3,2,25,25));
		
		//row 1
		pane.add(s1); pane.add(s2);
		
		//row2
		pane.add(s3);pane.add(s4);
		
		//row3
		pane.add(s5);pane.add(s6);
		

		//get screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int height = screenSize.height;
		int width = screenSize.width;
		
		frame.setPreferredSize(new Dimension(width,height));
		frame.pack();
		
		
		
		
		frame.setVisible(true);
		
		
	}//end main
}//end class
