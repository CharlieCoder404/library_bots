import java.util.ArrayList;
import java.util.Scanner;

public class libraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("Discovery of India");
        books.add("3 mistakes of my life");
        books.add("Bhagwat Gita");
        books.add("A letter from a father to his daughter");
        books.add("Tapaswini");
        books.add("Sherlock Holmes");
        books.add("Panchtantra");
        books.add("Mahabharat");
        books.add("Ramayan");
        books.add("Atomic habits");
        books.add("Rich Dad Poor Dad");
        books.add("Godan");
        books.add("Dakmunsi");
        books.add("The Great Gatsby");

        ArrayList<String> authors = new ArrayList<>();
        authors.add("J.K. Rowling");
        authors.add("Jawahar Lal Neheru");
        authors.add("Chetan Bhagat");
        authors.add("Lord Krishna");
        authors.add("Jawahar Lal Neheru");
        authors.add("Gangadhar Meher");
        authors.add("Aurthur");
        authors.add("Vishnu Sharma");
        authors.add("Maharsi VyasaDeva");
        authors.add("Maharsi Valmiki");
        authors.add("James");
        authors.add("Robert and Sharon");
        authors.add("Premchand");
        authors.add("Fakir Mohan Senapati");
        authors.add("Scott");



        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number for one of the following function : \n1. Issue Book\n2. Add Book\n3. Return Book\n");
            System.out.print("Your Input : ");
            int f = input.nextInt();


            if (f > 0 && f <= 3) {

// To issue book --------------------------------------
                if (f == 1) {
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i)+" by " +authors.get(i)+".");
                    }
                    System.out.println();
                    System.out.print("Enter the no. of the book : ");
                    int b1 = input.nextInt();
                    if(b1>0 && b1<=books.size()) {
                        if (!(books.get(b1 - 1).contains("issued"))) {
                            System.out.print("Enter the student's name : ");
                            input.nextLine();
                            String name = input.nextLine();
                            System.out.println(books.get(b1 - 1) + " is issued to " + name + ".");
                            String temp = books.get(b1 - 1);
                            books.remove(b1 - 1);
                            books.add(b1 - 1, name + " issued " + temp);
                            System.out.println();
                        } else {
                            System.out.println(books.get(b1 - 1) + " by " + authors.get(b1 - 1) + ".");
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("Wrong input ! Try Again");
                        System.out.println();
                    }
                }

// To add book ----------------------------------------------------------
                else if (f == 2) {
                    System.out.print("Enter the name of the book : ");
                    input.nextLine();
                    String bookName = input.nextLine();
                    System.out.print("Enter the name of the author : ");
                    String authorName = input.nextLine();
                    System.out.println();
                    books.add(bookName);
                    authors.add(authorName);
                }

// To return book --------------------------------------------------------
                else if(f==3) {
                        System.out.print("Enter the no. where you issued the book : ");
                        int index = input.nextInt();
                    if (index>0 && index<=books.size()) {
                        if((books.get(index - 1).contains("issued"))) {
                            System.out.print("Enter the name of the book : ");
                            input.nextLine();
                            String bookName2 = input.nextLine();
                            System.out.print("Enter the name of the author : ");
                            String authorName2 = input.nextLine();
                            System.out.println();
                            books.remove(index - 1);
                            authors.remove(index - 1);
                            books.add(index - 1, bookName2);
                            authors.add(index - 1, authorName2);
                        }
                        else{
                            System.out.println("This place is already full.");
                        }
                    } else {
                        System.out.println("Wrong input ! Try Again");
                    }
                }

// If user gave any number other than 1,2,3
                else{
                    System.out.println("Wrong input !!! Try Again.");
                }
            }

            else {
                System.out.println("Choose the correct option");
            }

        }

    }
}