import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    String isbn;
    int stock;

    Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    void display() {
        System.out.println("\nBook Information");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock: " + stock);
    }

    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    void addStock(int amount) {
        stock += amount;
    }

    void checkAvailability() {
        if (stock > 0) {
            System.out.println("Available for purchase");
        } else {
            System.out.println("Out of stock");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Book 1");
        System.out.print("Title: ");
        String t1 = sc.nextLine();
        System.out.print("Author: ");
        String a1 = sc.nextLine();
        System.out.print("Price: ");
        double p1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("ISBN: ");
        String i1 = sc.nextLine();
        System.out.print("Stock: ");
        int s1 = sc.nextInt();
        sc.nextLine();

        Book b1 = new Book(t1, a1, p1, i1, s1);

        System.out.println("\nEnter details of Book 2");
        System.out.print("Title: ");
        String t2 = sc.nextLine();
        System.out.print("Author: ");
        String a2 = sc.nextLine();
        System.out.print("Price: ");
        double p2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("ISBN: ");
        String i2 = sc.nextLine();
        System.out.print("Stock: ");
        int s2 = sc.nextInt();

        Book b2 = new Book(t2, a2, p2, i2, s2);

        System.out.print("\nEnter discount percentage for Book 1: ");
        double d1 = sc.nextDouble();
        b1.applyDiscount(d1);

        System.out.print("Enter number of new copies for Book 1: ");
        int add1 = sc.nextInt();
        b1.addStock(add1);

        b1.display();
        b1.checkAvailability();

        System.out.print("\nEnter discount percentage for Book 2: ");
        double d2 = sc.nextDouble();
        b2.applyDiscount(d2);

        System.out.print("Enter number of new copies for Book 2: ");
        int add2 = sc.nextInt();
        b2.addStock(add2);

        b2.display();
        b2.checkAvailability();
    }
}
