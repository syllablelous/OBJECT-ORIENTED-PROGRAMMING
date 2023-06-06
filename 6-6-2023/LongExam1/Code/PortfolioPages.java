package FinalGUI; //You can omit this line or edit it to match your corresponding package if you want to run the code.

import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PortfolioPages extends JFrame{

	private JPanel contentPane;
	int pageCounter = 0; // This variable acts as a page counter in which the value stored in this variable affects which image is to be displayed or whether the program should close.
	JLabel backgroundLabel = new JLabel("");

	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortfolioPages pages = new PortfolioPages();
					pages.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Create the frame.
	 
	public PortfolioPages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 80, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		backgroundLabel.setBounds(5, 5, 1280, 720);
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/AboutMeandContacts.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			backgroundLabel.setIcon(img); // Allows for me to set the background image for the frame using the image loaded in the ImageIcon object img.
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		contentPane.setLayout(null);
		contentPane.add(backgroundLabel);
		
		JButton nextButton = new JButton(""); //Next Button
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageCounter++;				
				backgroundLabel.setIcon(setPage(pageCounter));
			}
		});
		nextButton.setBounds(277, 30, 178, 89);
		//The following three lines of code makes the button invisible but still clickable.
		nextButton.setOpaque(false);				
		nextButton.setContentAreaFilled(false);		
		nextButton.setBorderPainted(false);
		contentPane.add(nextButton);
		
		JButton backButton = new JButton(""); //Back Button
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageCounter--;
				backgroundLabel.setIcon(setPage(pageCounter));
			}
		});
		backButton.setBounds(35, 18, 184, 89);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		contentPane.add(backButton);
		
		
		
	}
	/*
	 * This function takes in an argument for the page number counter from the Back or Next buttons and returns an ImageIcon object. 
	 * The function changes the image to be loaded in the ImageIcon object img or can close the window either to open
	 * the front page or to simply exit the portfolio. The changed value set to the img object is returned to be used
	 * as the argument-value for backgroundLabel.setIcon().
	 */
	public ImageIcon setPage(int pageNo) {
		ImageIcon img = null;
		try {
			if (pageCounter == -1) {
				//Closes this window and opens the FrontPage class.
				dispose();
				FrontPage page = new FrontPage();
				page.setVisible(true);
			}
			else if(pageCounter == 0) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/AboutMeandContacts.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else if(pageCounter == 1) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/Hobbies-2.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else if(pageCounter == 2) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/TalentAchievements-2.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else if(pageCounter == 3) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/WhyBSIT-2.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else if(pageCounter == 4) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/StrengthWeakness-2.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else if(pageCounter == 5) {
				img = new ImageIcon(ImageIO.read(new File("/Users/russeljeromerapi/Downloads/End-2.png")).getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
			}
			else {
				//Closes this window and simply exits the application.
				dispose();
			}
		}
		
		
		catch (IOException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
		return img;
	}

}
