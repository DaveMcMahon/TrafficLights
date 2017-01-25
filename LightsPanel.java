package mac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LightsPanel extends JPanel {

	private Color red;
	private Color green;
	private Color amber;

	public LightsPanel() {
		this.setLayout(new BorderLayout());

		this.red = Color.BLACK;
		this.amber = Color.BLACK;
		this.green = Color.BLACK;
		repaint();

	}

	public void switchRed() {
		this.red = Color.RED;
		this.green = Color.BLACK;
		this.amber = Color.BLACK;
		repaint();
	}

	public void switchGreen() {
		this.red = Color.BLACK;
		this.amber = Color.BLACK;
		this.green = Color.GREEN;
		repaint();

	}

	public void switchAmber() {
		this.red = Color.BLACK;
		this.green = Color.BLACK;
		this.amber = Color.ORANGE;
		repaint();

	}

	public void changeLights() {
		if (MainFrame.i % 3 == 0)
			switchRed();
		else if (MainFrame.i % 3 == 1)
			switchAmber();
		else
			switchGreen();

	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(red);
		graphics.fillOval(100, 100, 100, 100);

		graphics.setColor(amber);
		graphics.fillOval(100, 200, 100, 100);

		graphics.setColor(green);
		graphics.fillOval(100, 300, 100, 100);

		graphics.setColor(Color.BLACK);
		graphics.drawRect(80, 30, 140, 450);

		graphics.setColor(Color.BLACK);
		graphics.fillRect(135, 480, 30, 100);
	}

}
