import javax.swing.*;
import java.awt.event.*;

public class Login {
	String username = "";
	String password = "";
	boolean usernameCheck = false;
	boolean passwordCheck = false;
	String status = "";
	
	JFrame login = new JFrame("LOGIN MODULE");
	JFrame sign_in = new JFrame("SIGN-IN MODULE");
	JFrame admin = new JFrame("ADMIN MODULE");
	
	JButton admBttn = new JButton("Admin Login");
	JButton libBttn = new JButton("Librarian Login");
	JButton submitBttn = new JButton("Submit");
	JButton exitBttn = new JButton("Exit");
	
	JTextField tfUsername = new JTextField();
	JPasswordField tfPassword = new JPasswordField();
	
	JLabel message = new JLabel("Welcome to NU Library System");
	JLabel text1 = new JLabel("Username: ");
	JLabel text2 = new JLabel("Password: ");
	
	public Login() {
		// FOR LOGIN FRAME
		admBttn.setBounds(130,100,150,40);
		admBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.dispose();
				status = "admin";
				loginFrame();	
			}
		});
		
		libBttn.setBounds(130,200,150,40);
		libBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.dispose();
				status = "librarian";
				loginFrame();
			}
		});
		
		//LOGIN FRAME
		login.add(admBttn);
		login.add(libBttn);

		login.setSize(500,500);
		login.setLayout(null);
		login.setVisible(true);
	}

	public void loginFrame() {
		sign_in.setSize(500,500);
		sign_in.setLayout(null);
		
		text1.setBounds(100,100,100,40);
		text2.setBounds(100,150,100,40);
		
		tfUsername.setBounds(200,100,200,40);
		sign_in.add(tfUsername);
		
		tfPassword.setBounds(200,150,200,40);
		sign_in.add(tfPassword);
		
		tfUsername.setText("");
		tfPassword.setText("");
		submitBttn.setBounds(150,200,100,40);
		submitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = tfUsername.getText();
				password = tfPassword.getText();
				inputCheck(username, password);
			}
		});
		sign_in.add(submitBttn);
		
		exitBttn.setBounds(250,200,100,40);
		exitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_in.dispose();
				login.setVisible(true);
			}
		});
		sign_in.add(exitBttn);
		
		sign_in.add(text1);
		sign_in.add(text2);
		
		//FOR ADMIN
		admin.setSize(500,500);
		admin.setLayout(null);
		message.setBounds(150,150,200,100);
		admin.add(message);
		
		sign_in.setVisible(true);
		
	}
	public void inputCheck(String username, String password) {
		
		if(status.equals("admin")) {
			if ((username.equals("Admin_01")) || (username.equals("Admin_02")) || (username.equals("Admin_03"))) {
				usernameCheck = true;
			}

			if ((password.equals("AdminOne")) || (password.equals("AdminTwo")) || (password.equals("AdminThree"))) {
				passwordCheck = true;
			}
		}
		if(status.equals("librarian")) {
			if ((username.equals("Librarian_01")) || (username.equals("Librarian_02")) || (username.equals("Librarian_03"))) {
				usernameCheck = true;
			}

			if ((password.equals("LibOne")) || (password.equals("LibTwo")) || (password.equals("LibThree"))) {
				passwordCheck = true;
			}
		}
		
		if (usernameCheck && passwordCheck) {			
			JOptionPane.showMessageDialog(null, "Correct Username and Password");
			if(status.equals("admin")) {
				sign_in.dispose();
				admin.setVisible(true);
			}
			if(status.equals("librarian")) {
				sign_in.dispose();
				BookRent br = new BookRent();
			}
		}
		else if (!passwordCheck && !usernameCheck) {
			JOptionPane.showMessageDialog(null, "INCORRECT USERNAME AND PASSWORD");
			loginFrame();
		}
		else if(!usernameCheck) {
			JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
			loginFrame();
		}
		else if (!passwordCheck) {
			JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
			loginFrame();
		}
		
	}
	
	public static void main(String[] args) {
		Login system = new Login();
	}
	
}
