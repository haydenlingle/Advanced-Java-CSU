import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P13 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		LinkedBookList lbl = new LinkedBookList();
		
		Scanner scan = new Scanner(new File("top10.txt"));
		int bookCount = (Integer.parseInt(scan.nextLine()));
		
		//reads in all of the books, and adds them to the linked list
		for(int i = 0; i < bookCount; i++){
			String line = scan.nextLine();
			String[] parts = line.split("\t");
			String name = parts[0];
			String title = parts[1];
			int numPages = Integer.parseInt(parts[2]);
			Book b = new Book(name, title, numPages);
			//System.out.println("adding: " + b.getTitle());
			lbl.add(b);
		}
		//adding when there's no books
		//adding when one book
		//adding at head of linked list
		
		
		Book c = new Book("Z", "Therese Anne Fowler", 384);
		//System.out.println("adding: " + c.getTitle());
		lbl.remove(c);
		
		//System.out.println("deleted: " + lbl.remove(5).getTitle());

		//System.out.println("Testing add");
		System.out.println(lbl);
		System.out.println(lbl.totalPages());
		
		scan.close();
	}
}

