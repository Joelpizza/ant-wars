package antwar;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

import antwar.Spelplan;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(40,40);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack();
		frame.setVisible(true);
		
		Canvas spelplan = new Spelplan();
		spelplan.setSize(960,960);
		frame.add(spelplan);
		Graphics g = spelplan.getGraphics();

	}

}
