import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();
		JFrame frame = new JFrame();
		frame.setSize(100, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while(true)
		{
			Point loc = MouseInfo.getPointerInfo().getLocation();
			r.mouseMove(loc.x+1, loc.y);
			Thread.yield();
			loc = MouseInfo.getPointerInfo().getLocation();
			r.mouseMove(loc.x-1, loc.y);
			Thread.yield();
		}
	}
}
