package mac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainFrame extends JFrame {

	private LightsPanel panel;
	public static int i = 0;

	public MainFrame() {
		super("Traffic Lights");
		this.setLayout(new BorderLayout());
		this.setSize(300, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		panel = new LightsPanel();
		panel.setBackground(Color.WHITE);

		this.add(panel, BorderLayout.CENTER);

		Timer timer = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.changeLights();
				i++;
			}

		});

		timer.setRepeats(true);
		timer.setInitialDelay(0);
		timer.start();

	}

}
