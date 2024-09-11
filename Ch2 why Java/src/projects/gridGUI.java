package projects;

import javax.swing.*;
import java.awt.*;

public class gridGUI {

	public static void main(String[] args) {
		JFrame grid = new JFrame();
		grid.setTitle("Grid");
		grid.setSize(500, 500);
		grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Stripe1 = new JPanel();
		Stripe1.setBackground(Color.black);
		
		JPanel Stripe2 = new JPanel();
		Stripe2.setBackground(Color.white);
		
		JPanel Stripe3 = new JPanel();
		Stripe3.setBackground(Color.black);
		
		JPanel Stripe4 = new JPanel();
		Stripe4.setBackground(Color.white);
		
		JPanel Stripe5 = new JPanel();
		Stripe5.setBackground(Color.black);
		
		JPanel Stripe6 = new JPanel();
		Stripe6.setBackground(Color.white);

		JPanel Stripe7 = new JPanel();
		Stripe7.setBackground(Color.black);
		
		JPanel Stripe8 = new JPanel();
		Stripe8.setBackground(Color.white);
		
		JPanel Stripe9 = new JPanel();
		Stripe9.setBackground(Color.black);

		
		Container FR = grid.getContentPane();
		FR.setLayout(new GridLayout(3,3));
		FR.add(Stripe1);
		FR.add(Stripe2);
		FR.add(Stripe3);
		FR.add(Stripe4);
		FR.add(Stripe5);
		FR.add(Stripe6);
		FR.add(Stripe7);
		FR.add(Stripe8);
		FR.add(Stripe9);

		
		grid.setVisible(true);
		
	}

}
