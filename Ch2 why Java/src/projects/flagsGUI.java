package projects;

import javax.swing.*;
import java.awt.*;

public class flagsGUI {

	public static void main(String[] args) {
		JFrame France = new JFrame();
		France.setTitle("France");
		France.setSize(500, 300);
		France.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel fStripe1 = new JPanel();
		fStripe1.setBackground(Color.blue);
		
		JPanel fStripe2 = new JPanel();
		fStripe2.setBackground(Color.white);
		
		JPanel fStripe3 = new JPanel();
		fStripe3.setBackground(Color.red);
		
		Container FR = France.getContentPane();
		FR.setLayout(new GridLayout(1,3));
		FR.add(fStripe1);
		FR.add(fStripe2);
		FR.add(fStripe3);
		
		France.setVisible(true);
		
		JFrame Mauritius = new JFrame();
		Mauritius.setTitle("Mauritius");
		Mauritius.setSize(500, 300);
		Mauritius.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mStripe1 = new JPanel();
		mStripe1.setBackground(Color.red);
		
		JPanel mStripe2 = new JPanel();
		mStripe2.setBackground(Color.blue);
		
		JPanel mStripe3 = new JPanel();
		mStripe3.setBackground(Color.yellow);
		
		JPanel mStripe4 = new JPanel();
		mStripe4.setBackground(Color.green);
		
		Container MA = Mauritius.getContentPane();
		MA.setLayout(new GridLayout(4,1));
		MA.add(mStripe1);
		MA.add(mStripe2);
		MA.add(mStripe3);
		MA.add(mStripe4);
		
		Mauritius.setVisible(true);

		JFrame Bulgaria = new JFrame();
		Bulgaria.setTitle("Bulgaria");
		Bulgaria.setSize(500, 300);
		Bulgaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel bStripe1 = new JPanel();
		bStripe1.setBackground(Color.white);
		
		JPanel bStripe2 = new JPanel();
		bStripe2.setBackground(Color.green);
		
		JPanel bStripe3 = new JPanel();
		bStripe3.setBackground(Color.red);
		
		Container BU = Bulgaria.getContentPane();
		BU.setLayout(new GridLayout(3,1));
		BU.add(bStripe1);
		BU.add(bStripe2);
		BU.add(bStripe3);
		
		Bulgaria.setVisible(true);

		
		
		

		
	
	}

}
