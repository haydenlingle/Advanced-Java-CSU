

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		BookNode newBook = new BookNode(b);
		if(head == null){
			head = newBook;
			size++;
		}else{
			BookNode curr = head;
			while(curr.getNext() != null){
				curr = curr.getNext();
			}
			curr.setNext(newBook);
			size++;
		}		
	}
	
	//IMPLEMENT -- adds a book at the specific index, 
	//  or at the end if index is greater than size
	public void add(Book b, int index){
		if (index>size)
			index=size;
		if (index == 0) {
			head = new BookNode(b, head);
			size++;
		}
		else { // find predecessor of node
			BookNode curr = head;
			for (int i=0; i<index-1; i++){
				curr = curr.getNext();
			}
			curr.setNext(new BookNode(b, curr.getNext()));
			size++;
		}
		
	}//end add
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		BookNode curr = head;
		BookNode prev = null;
		Book removedBook = null;
		for(int i = 0; i < size; i++){
			if(curr.getBook().getAuthor().equals(b.getAuthor()) && curr.getBook().getNumPages() == b.getNumPages() && curr.getBook().getTitle().equals(b.getTitle())){//found a match
				removedBook = curr.getBook();
				if(curr == head){
					head = head.getNext();
					size--;
					return removedBook;
				}else{
					prev.setNext(curr.getNext());
					curr = null;
					size--;
					return removedBook;			
				}
			}//end found match
			prev = curr;//set prev to curr
			curr=curr.getNext();//increment curr
		}//end for
		return removedBook;
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		Book removedNode = null;
		if (index<0 || index >= size)
			return null;
		if (index == 0) {
			// special case: removing first element
			removedNode = head.getBook();
			head = head.getNext();
		} else {
			// removing from elsewhere in the list
			BookNode current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			removedNode = current.getNext().getBook();
			current.setNext(current.getNext().getNext());
		}		
		size--;
		return removedNode;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		int total = 0;
		for(BookNode curr = head; curr != null; curr = curr.getNext()){
			total += curr.getNumPages();
		}
		return total;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}




