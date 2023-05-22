package Draft;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frontpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frontpage frame = new Frontpage();
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
	public Frontpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 665, 491);
		
		try {
			ImageIcon img = new ImageIcon(ImageIO.read(new File("C:\\Users\\National University\\Downloads\\images\\1.png")).getScaledInstance(650, 540, Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(img);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		
		JButton aboutButton = new JButton("About the Student");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu menu = new Menu();
				menu.setVisible(true);
			}
		});
		aboutButton.setBounds(145, 270, 225, 135);
		aboutButton.setOpaque(false);
		aboutButton.setContentAreaFilled(false);
		aboutButton.setBorderPainted(false);
		contentPane.add(aboutButton);
	}

}
