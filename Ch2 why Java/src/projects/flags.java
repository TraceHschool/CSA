package projects;

import javax.swing.*;
import java.awt.*;

public class flags {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("France");
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame m = new JFrame();
		m.setTitle("Mauritius");
		m.setSize(500, 300);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame b = new JFrame();
		m.setTitle("Bulgaria");
		m.setSize(500, 300);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		
		
		JPanel p1 = new JPanel(); p1.setBackground(Color.blue);
		JPanel p2 = new JPanel(); p2.setBackground(Color.white);
		JPanel p3 = new JPanel(); p3.setBackground(Color.red);
		JPanel p4 = new JPanel(); p4.setBackground(Color.blue);
		JPanel p5 = new JPanel(); p5.setBackground(Color.red);
		JPanel p6 = new JPanel(); p6.setBackground(Color.blue);
		JPanel p7 = new JPanel(); p7.setBackground(Color.yellow);
		JPanel p8 = new JPanel(); p8.setBackground(Color.green);
		JPanel p9 = new JPanel(); p9.setBackground(Color.white);
		JPanel p10 = new JPanel(); p10.setBackground(Color.green);
		JPanel p11 = new JPanel(); p11.setBackground(Color.red);


		
		Container p = f.getContentPane();
		p.setLayout(new GridLayout (1,3));
		
		p.add(p1); p.add(p2);
		
		p.add(p3);
		
		f.setVisible(true);
		
		Container q = m.getContentPane();
		q.setLayout(new GridLayout (4,1));
		
		q.add(p5); q.add(p6);
		
		q.add(p7); q.add(p8);
		
		m.setVisible(true);
		
		Container r = b.getContentPane();
		r.setLayout(new GridLayout (3,1));
		
		r.add(p5); r.add(p6);
		
		r.add(p7); r.add(p8);
		
		b.setVisible(true);


	}

}
