import java.util.*;

public class BookRental {
	public static void main(String[] args) {
		ArrayList<Books> books = new ArrayList<Books>();
		Scanner sc = new Scanner(System.in);
		Books book1 = new Books();
		book1.setName("System Analysis and Design");
		book1.setAuthor("Paul Anthers");
		book1.setCopy(2);
		
		Books book2 = new Books();
		book2.setName("Android Application");
		book2.setAuthor("Mia B. Anderson");
		book2.setCopy(3);
		
		Books book3 = new Books();
		book3.setName("Programming Concepts and Application");
		book3.setAuthor("Wesley Gibbins");
		book3.setCopy(4);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		
		for(int x = 0; x < books.size(); x++) {
			System.out.print(x + " " + books.get(x).getName() + " by " + books.get(x).getAuthor() + "\n");
		}
		System.out.println("*****************************" + "\n");
		
		boolean stop = false;
		while(!stop) {
			try {
				System.out.print("Choose the number of the book that you want to rent: ");
				int choice = sc.nextInt();
				
				sc.nextLine();
				
				if(books.get(choice).copy == 0) {
					System.out.println("There are no more available copies for this book.");
				}
				
				else {
					System.out.println("You have chosen to rent the book: " + books.get(choice).getName() + "\n");
					books.get(choice).setCopy(books.get(choice).copy - 1);
				}
				
				System.out.print("Do you want to rent another book? (Y/N) ");
				char rent_again = sc.nextLine().toUpperCase().charAt(0);
				if(rent_again == 'N') {
					stop = true;
				}
			}
			catch(IndexOutOfBoundsException ex) {
				System.out.println("Index does not exist!");
			}
			
			catch(InputMismatchException ex) {
				System.out.println("Invalid input!");
				sc.nextLine(); //stops the while loop from running an infinite loop 
			}
		
		}
		System.out.println("PROGRAM ENDS");
	}
}
