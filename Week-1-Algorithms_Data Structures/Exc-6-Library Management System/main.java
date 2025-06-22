import java.util.*;

public class main {

    public static void linear_search(Book[] book, int searchId) {
        boolean found = false;

        for (int i=0;i<book.length;i++) {
            if (book[i].bookId==searchId) {
                System.out.println("Linear Search: Product Found!");
                book[i].display();
                found=true;
                break;
            }
        }

        if (!found) {
            System.out.println("Linear Search: Product with ID "+searchId+ " not found.");
        }
    }
    
    public static void binary_search(Book [] book, int searchId) {
        int l=0, h=book.length - 1;

        while (l<= h) {
            int mid=(l+h)/2;
            if (book[mid].bookId==searchId) {
                System.out.println("Binary Search: Product Found!");
                book[mid].display();

                return;
            } else if (book[mid].bookId<searchId) {
                l=mid+1;
            } else {
                h= mid-1;
            }
        }

        System.out.println("Binary Search: Product not found.");
    }

    public static void main(String [] args) {
        int n=3;
        Book[] book=new Book[n];
        book[0]=new Book(123,"Flowers types", "Botany");
        book[1]=new Book(113,"Humans", "Biology");
        book[2]=new Book(233,"Politics", "Civics");
        

        int searchId=233;
        
        linear_search(book,searchId);

      Arrays.sort(book,new Comparator<Book>() {
      public int compare(Book a, Book b) {
          if (a.bookId<b.bookId)
              return -1;
          else if (a.bookId>b.bookId)  
              return 1;
          else
              return 0;
      }
  });
        
        binary_search(book,searchId);

        
    }
}
