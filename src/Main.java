import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();
		JFrame frame = new JFrame("Mouse Jostle");
		frame.setSize(200, 200);
		JCheckBox enable = new JCheckBox("Jostle");
		frame.add(enable);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while(true)
		{
			if(enable.isSelected())
			{
				Point loc = MouseInfo.getPointerInfo().getLocation();
				r.mouseMove(loc.x+1, loc.y);
				Thread.yield();
				loc = MouseInfo.getPointerInfo().getLocation();
				r.mouseMove(loc.x-1, loc.y);
			}
			Thread.yield();
		}
	}
}
