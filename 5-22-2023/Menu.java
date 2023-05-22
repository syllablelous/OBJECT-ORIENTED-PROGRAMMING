package Draft;

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

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 665, 491);
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\2.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(img);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		
		JButton bioButton = new JButton("BioInfo");
		bioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\3.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(img);
				}
				catch (IOException ex) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		bioButton.setBounds(467, 23, 184, 89);
		bioButton.setOpaque(false);
		bioButton.setContentAreaFilled(false);
		bioButton.setBorderPainted(false);
		contentPane.add(bioButton);
		
		JButton personalBttn = new JButton("Personal");
		personalBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\4.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(img);
				}
				catch (IOException ex) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		personalBttn.setBounds(467, 123, 178, 99);
		personalBttn.setOpaque(false);
		personalBttn.setContentAreaFilled(false);
		personalBttn.setBorderPainted(false);
		contentPane.add(personalBttn);
		
		JButton whyBttn = new JButton("Why");
		whyBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\5.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(img);
				}
				catch (IOException ex) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		whyBttn.setBounds(467, 233, 184, 78);
		whyBttn.setOpaque(false);
		whyBttn.setContentAreaFilled(false);
		whyBttn.setBorderPainted(false);
		contentPane.add(whyBttn);
		
		JButton strengthBttn = new JButton("Strength");
		strengthBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\6.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
					lblNewLabel.setIcon(img);
				}
				catch (IOException ex) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		strengthBttn.setBounds(467, 322, 184, 95);
		strengthBttn.setOpaque(false);
		strengthBttn.setContentAreaFilled(false);
		strengthBttn.setBorderPainted(false);
		contentPane.add(strengthBttn);
		
		JButton exitBttn = new JButton("Exit");
		exitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitBttn.setBounds(467, 428, 184, 62);
		exitBttn.setOpaque(false);
		exitBttn.setContentAreaFilled(false);
		exitBttn.setBorderPainted(false);
		contentPane.add(exitBttn);
		
		
	}

}
