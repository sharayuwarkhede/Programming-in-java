import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String name, author;
    int id;
    int issueStatus; // 0 = available, 1 = issued

    Book(String name, int id, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.issueStatus = 0;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);

    // Method to add a book with given details
    void add(String name, int id, String author) {
        list.add(new Book(name, id, author));// Adding book to the list
    }

    // Method to add a new book by taking input from user
    void addNew() {
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        list.add(new Book(name, id, author));// Adding book to the list
        System.out.println("Book added successfully!");
    }

    // Method to display all books in the library   
    void display() {
        if (list.isEmpty()) {// Check if the list is empty
            System.out.println("No books available.");
        } else {
            for (Book b : list) {// Displaying book details
                System.out.println(b.id + " " + b.name + " " + b.author);
            }
        }
    }

    // Method to remove a book by name
    void remove() {
        System.out.print("Enter book name to remove: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Book b : list) {
            if (b.name.equalsIgnoreCase(name)) {
                list.remove(b);
                found = true;//sets the flag to true to indicate that the book was found and removed
                System.out.println("Book removed successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    void issue() {
        System.out.println("\nAvailable Books:");
        for (Book b : list) {
            if (b.issueStatus == 0) {
                System.out.println("Name: " + b.name + ", ID: " + b.id);
            }
        }

        System.out.println("Search by: 1. ID 2. Name");
        int choice = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Book b : list) {
                if (b.id == id && b.issueStatus == 0) {
                    b.issueStatus = 1;
                    found = true;
                    System.out.println("Book issued successfully!");
                    break;
                }
            }
        } else if (choice == 2) {
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            for (Book b : list) {
                if (b.name.equalsIgnoreCase(name) && b.issueStatus == 0) {
                    b.issueStatus = 1;
                    found = true;
                    System.out.println("Book issued successfully!");
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Book not found or already issued.");
        }
    }

    void returnBook() {
        System.out.println("\nIssued Books:");
        for (Book b : list) {
            if (b.issueStatus == 1) {
                System.out.println("Name: " + b.name + ", ID: " + b.id);
            }
        }

        System.out.println("Search by: 1. ID 2. Name");
        int choice = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (Book b : list) {
                if (b.id == id && b.issueStatus == 1) {
                    b.issueStatus = 0;
                    found = true;
                    System.out.println("Book returned successfully!");
                    break;
                }
            }
        } else if (choice == 2) {
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            for (Book b : list) {
                if (b.name.equalsIgnoreCase(name) && b.issueStatus == 1) {
                    b.issueStatus = 0;
                    found = true;
                    System.out.println("Book returned successfully!");
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Book not found or not issued.");
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library ob = new Library();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of book " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            ob.add(name, id, author);
        }

        int ch;

        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1.Add Book");
            System.out.println("2.Display Book");
            System.out.println("3.Remove Book");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    ob.addNew();
                    break;

                case 2:
                    ob.display();
                    break;

                case 3:
                    ob.remove();
                    break;

                case 4:
                    ob.issue();
                    break;

                case 5:
                    ob.returnBook();
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 6);
    }
}