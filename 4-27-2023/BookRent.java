import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.*;

public class BookRent {
	ArrayList<Books> books = new ArrayList<Books>();

	Books book1, book2, book3;
	
	JFrame librarian = new JFrame("LIBRARIAN MODULE");
	JTextArea pane = new JTextArea();
	JTextField text = new JTextField();
	JTextField input = new JTextField();
	JButton submitBttn = new JButton("Submit");
	JButton exitBttn = new JButton("Exit");
	
	boolean stop = false;
	
	public BookRent() {
		book1 = new Books("System Analysis and Design", "Paul Anthers", 2);
		book2 = new Books("Android Application", "Mia B. Anderson", 3);
		book3 = new Books("Programming Concepts and Application", "Wesley Gibbins", 4);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		pane.setBounds(0,0,500,100);
		text.setBounds(0,150,500,45);
		input.setBounds(0,200,500,45);
		
		librarian.add(pane);
		librarian.add(text);
		librarian.add(input);
		pane.append("ELECTRONIC BOOK RENTAL SYSTEM" + "\n");
		pane.append("*****************************" + "\n");
		
		for(int x = 0; x < books.size(); x++) {
			pane.append(x + " " + books.get(x).getName() + " by " + books.get(x).getAuthor() + "\n");
		}
		pane.append("*****************************" + "\n");
		
		
		submitBttn.setBounds(150,200,100,40);
		submitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		exitBttn.setBounds(250,200,100,40);
		exitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				librarian.dispose();
				Login login = new Login();
			}
		});
		librarian.add(submitBttn);
		librarian.add(exitBttn);
		
		librarian.setSize(500,500);
		librarian.setLayout(null);
		librarian.setVisible(true);
				
	}
	public void submitInput() {
		input.getText();
	}
	public void rentCheck() {
		while(!stop) {
			try {
				text.setText("Choose the number of the book that you want to rent: ");
				int choice = Integer.parseInt(input.getText());
				
				if(books.get(choice).copy == 0) {
					text.setText("There are no more available copies for this book.");
				}
				
				else {
					System.out.println("You have chosen to rent the book: " + books.get(choice).getName() + "\n");
					books.get(choice).setCopy(books.get(choice).copy - 1);
				}
				
				System.out.print("Do you want to rent another book? (Y/N) ");
				char rent_again = input.getText().toUpperCase().charAt(0);
				if(rent_again == 'N') {
					stop = true;
				}
			}
			catch(IndexOutOfBoundsException ex) {
				System.out.println("Index does not exist!");
			}
			
			catch(InputMismatchException ex) {
				System.out.println("Invalid input!");
 
			}
		
		}
	}
}
