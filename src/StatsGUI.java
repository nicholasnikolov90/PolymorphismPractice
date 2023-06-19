import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Implementation of a GUI to accept user integer inputs, calculates the median and mean and displays to the interface
 * Contains an option to reset and continue calculating
 * 
 *
 * @author Nick Nikolov
 */
public class StatsGUI implements ActionListener {
	private JTextField inputField;
	private JTextArea display;
	private JButton reset, displayStats;
	private Stats stats; // initialize stats instance variable

	public StatsGUI(String title) { 
		
		this.stats = new Stats(); // create new stats object
		
		
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 200);  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel prompt = new JLabel("Next Grade (press ENTER)");
		jfrm.add(prompt);
		
		this.inputField = new JTextField(4); 
		this.inputField.setText("");
		this.inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		this.display = new JTextArea (5 ,20);
		jfrm.add(display);
		
		displayStats = new JButton("STATS");
		displayStats.addActionListener(this);
		jfrm.add(displayStats);

		reset = new JButton("RESET");
		reset.addActionListener(this);
		jfrm.add(reset);
		
		jfrm.setVisible(true);	
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == inputField) {
			// Add the current user input to the array of grades
			stats.setCurrentInput(Integer.parseInt(inputField.getText()));
			stats.add(stats.getCurrentInput());
			this.inputField.setText("");
			this.display.append(" ");
			this.display.append(String.valueOf(stats.getCurrentInput()));
		}
		
		//Displays the statistic results of all the user inputs
		else if(e.getSource() == displayStats) {
			this.display.append(stats.toString());
		}
		// Resets the GUI window, removes all current text and creates new stats object. All inputs are reset.
		else if(e.getSource() == reset) { //used else if so both buttons aren't pressed at the same time.
			this.display.setText("");
			this.stats = new Stats();
		}

	}

	public static void main(String[] args) {
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new StatsGUI("Grades statistics");
			}
		});
	}
}
