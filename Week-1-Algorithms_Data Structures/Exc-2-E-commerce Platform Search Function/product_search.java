import java.util.*;

public class product_search {

    public static void linear_search(Product[] products, int searchId) {
        boolean found = false;

        for (int i=0;i<products.length;i++) {
            if (products[i].productId==searchId) {
                System.out.println("Linear Search: Product Found!");
                found=true;
                break;
            }
        }

        if (!found) {
            System.out.println("Linear Search: Product with ID "+searchId+ " not found.");
        }
    }
    
    public static void binary_search(Product [] products, int searchId) {
        int l=0, h=products.length - 1;

        while (l<= h) {
            int mid=(l+h)/2;
            if (products[mid].productId==searchId) {
                System.out.println("Binary Search: Product Found!");
                return;
            } else if (products[mid].productId<searchId) {
                l=mid+1;
            } else {
                h= mid-1;
            }
        }

        System.out.println("Binary Search: Product not found.");
    }

    public static void main(String [] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n=scanner.nextInt();
        scanner.nextLine(); 
        Product[] products=new Product[n];

        for (int i=0;i<n;i++) {
            System.out.println("Enter details for product "+(i+1)+":");

            System.out.print("Product ID: ");
            int id=scanner.nextInt();
            scanner.nextLine(); // Clear newline

            System.out.print("Product Name: ");
            String name= scanner.nextLine();

            System.out.print("Product Category: ");
            String category = scanner.nextLine();

            products[i]=new Product(id,name, category);
        }

        System.out.print("\nEnter the product ID to search: ");
        int searchId=scanner.nextInt();
        


        linear_search(products,searchId);

      Arrays.sort(products,new Comparator<Product>() {
      public int compare(Product a, Product b) {
          if (a.productId<b.productId)
              return -1;
          else if (a.productId>b.productId)  
              return 1;
          else
              return 0;
      }
  });
        
        binary_search(products,searchId);

        scanner.close();
    }
}
