package app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;

public class AppMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public AppMenu() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		JButton coinButton = new JButton("Flip a Coin");
		panel.add(coinButton);
		
		JButton clickerButton = new JButton("ADHD Clicker");
		panel.add(clickerButton);
		
		JButton nameButton = new JButton("Name Generator");
		panel.add(nameButton);

	}

}
