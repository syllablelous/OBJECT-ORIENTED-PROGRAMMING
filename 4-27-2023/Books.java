public class Books {
	String name;
	String author;
	int copy;
	
	public Books(String name, String author, int copy) {
		this.name = name;
		this.author = author;
		this.copy = copy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int copy) {
		this.copy = copy;
	}
}
