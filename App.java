package mac;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame frame;

				frame = new MainFrame();
				frame.setVisible(true);
			}

		});
	}
}
