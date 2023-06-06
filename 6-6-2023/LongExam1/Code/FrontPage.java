package FinalGUI; //You can omit this line or edit it to match your corresponding package if you want to run the code.

/*
 * The following imported packages and classes are required in order to be able to inherit and utilize the JFrame class and 
 * other necessary classes and libraries in order to run this program.
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPage extends JFrame{

	private JPanel contentPane;

	// Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage frame = new FrontPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	// Create the frame.
	 
	public FrontPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 80, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(5, 5, 1280, 720);
		
		try {
			// You can edit the file path inside new File() in order to match the current file path of the image file.
			ImageIcon img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/FrontPage.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			backgroundLabel.setIcon(img); //Allows for me to set the background for the JFrame window using the image from ImageIcon
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		contentPane.setLayout(null);
		contentPane.add(backgroundLabel);
		
		JButton proceedButton = new JButton(""); //Proceed Button
		proceedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// When this button is clicked, it will simply close this window and open up the PortfolioPages window.
				dispose();
				PortfolioPages pages = new PortfolioPages();
				pages.setVisible(true);
			}
		});
		
		proceedButton.setBounds(532, 499, 226, 111);
		// The following three lines of code allow for my button to appear invisible while still being able to be clicked on.
		proceedButton.setOpaque(false);
		proceedButton.setContentAreaFilled(false);
		proceedButton.setBorderPainted(false);
		contentPane.add(proceedButton);
	}
}
