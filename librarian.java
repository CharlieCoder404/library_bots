import java.util.Scanner;

class Library{
    String [] arr = new String[5];
    int i = 0;
    Library() {
        arr[0] = "Add a Book";
        arr[1] = "Add a Book";
        arr[2] = "Add a Book";
        arr[3] = "Add a Book";
        arr[4] = "Add a Book";
    }
    public  void takingFeedback() {
        Scanner review = new Scanner(System.in);
        boolean b = false;
        float rate = 0.0f;
        while (!b) {
            System.out.print("Enter your rating between '0' to '5' : ");
            float rating = review.nextFloat();
            if (rating >= 0 && rating <= 5) {
                rate = rate + rating;
                b = true;
            } else {
                System.out.println("Wrong Input !!!\n");
            }
        }
        System.out.println("Give us your review : ");
        review.nextLine();
        String feedback = review.nextLine();
        if(rate>=3){
            System.out.println("Thank you for your rating and time." +
                    "\nWe appreciate your efforts.\n" +
                    "\nSo tell me...what you want to do today ?"+
                    "\n(Quick Tip : Use the 'explore' command to know all other commands and their functions)\n");
        }
        else{
            System.out.println("Thank you for your concern." +
                    "\nWe will look into the matter soon.\n" +
                    "\nSo tell me...what you want to do today ?"+
                    "\n(Quick Tip : Use the 'explore' command to know all other commands and their functions)");
        }
        System.out.println();

    }
    public void addBook(){
        if(i<5) {
            for (int j = 0;j<5;j++) {
                String s = arr[j];
                if(s == "Add a Book" || s == "This book is already been issued.") {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter book name : ");
                    arr[j] = input.nextLine();
                    System.out.println("");
                    System.out.println("current Library status :- ");
                    i++;
                    break;
                }
            }
        }
        else{
            System.out.println("No space available.\n");
            System.out.println("current Library status :- ");
        }
    }
    public void showAvailableBook(){
        for (int j=0;j<arr.length;j++){
            System.out.println((j+1)+". "+arr[j]);
        }
        System.out.println("");
    }
    public void issueBook(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the book number : ");
        int bookNumber = input.nextInt()-1;
            String s = arr[bookNumber];
        if (s == "Add a Book" || s == "This book is already been issued.") {
            System.out.println("Currently there is no book available with this book number.\n");
            System.out.println("current Library status :- ");
        }
        else {
            if (bookNumber >= 0 && bookNumber < i) {
                System.out.printf("'%S' is issued.\n\n", arr[bookNumber]);
                System.out.println("current Library status :- ");
                arr[bookNumber] = "This book is already been issued.";
                i--;
            }
        }
    }
    public void removeBook(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the book number : ");
        int bookNumber = input.nextInt()-1;
        String s = arr[bookNumber];
        if (s == "Add a Book" || s == "This book is already been issued.") {
            System.out.println("Currently there is no book available with this book number.\n");
            System.out.println("current Library status :- ");
        }
        else {
            if (bookNumber >= 0 && bookNumber < i) {
                System.out.printf("'%S' is removed.\n\n", arr[bookNumber]);
                System.out.println("current Library status :- ");
                arr[bookNumber] = "Add a Book";
                i--;
            }
        }
    }

    public void addMultipleBooks(){
        System.out.println("There are only "+(5-i)+" spots available.");
        System.out.print("Enter the no. of books you want to add : ");
        Scanner user= new Scanner(System.in);
        int noOfBooks = user.nextInt();
        int b =0;
        if(noOfBooks <= 5) {
                for (int noOfAddedBooks =1; noOfAddedBooks <= noOfBooks; noOfAddedBooks++) {
                    if (i < 5) {
                        System.out.println("Adding no. " + noOfAddedBooks + " book : ");
                        for (int j = 0; j < 5; j++) {
                            String s = arr[j];
                            if (s.equals("Add a Book") || s.equals("This book is already been issued.")) {
                                Scanner input = new Scanner(System.in);
                                System.out.print("Enter book name : ");
                                arr[j] = input.nextLine();
                                i++;
                                b++;
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("All spaces are been occupied.");
                    }
                }
            System.out.println(b+" no. of books are added successfully.");
                System.out.println("\nCurrent Library Status :-");
        }
        else{
            System.out.println("This no. of shelves is not available !! Try again after sometime.");
        }

    }
    public void returnBook(){
        if (i < 5) {
            for (int k = 0; k < 5; k++) {
                String s = arr[k];
                if (s == "Add a Book" || s == "This book is already been issued.") {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter book name : ");
                    arr[k] = input.nextLine();
                    System.out.println("");
                    System.out.println("current Library status :- ");
                    i++;
                    break;
                }
            }
        }
            else{
                System.out.println("No space available.");
                System.out.println("");
                System.out.println("current Library status :- ");
            }

    }
    public void aboutTheProgram(){
        System.out.println("Hello User !! welcome to the Library." +
                "\nI am a java program created by 'Pritish' AKA 'Charlie'." +
                "\nHe created me to help you in managing all your Library stuff." +
                "\nI am the 'LIBRARIAN' & I am always ready to help you." +
                "\nSo tell me...what you want to do today ?"+
                "\n(Quick Tip : Use the 'explore' command to know all other commands and their functions)\n");
    }
    public void showCommands() {
        System.out.println("1. 'see all books' - To see all available books.");
        System.out.println("2. 'add' - To add a book.");
        System.out.println("3. 'add books' - To add multiple books.");
        System.out.println("4. 'issue' - To issue a book.");
        System.out.println("5. 'return' - To return a book.");
        System.out.println("6. 'remove' - To remove a book.");
        System.out.println("7. 'know' - To know more about the program.");
        System.out.println("8. 'suggest' - To give rating and feedback about the program.");
        System.out.println("9. 'shutdown' - To close the library and reset it.");
        System.out.println("10. 'explore' - To see different commands and their functions.");
        System.out.println();
    }
}

public class librarian {
    public static void main(String[] args) {
        Scanner detailsInput = new Scanner(System.in);
        System.out.print("Heyyyy !!!\nMy name is 'LIBRARIAN'.\nCan you tell me your name ?\n" +
                "\n1.Yes ! I am happy to share it with your." +
                "\n2.No ! I can't.\nPlease enter your preferred number  : ");
        boolean b = false;
        String reader = "";
        while(!b) {
            int yesOrNo = detailsInput.nextInt();
            if (yesOrNo == 1) {
                detailsInput.nextLine();
                System.out.print("Please enter Your name : ");
                reader = detailsInput.nextLine();
                b = true;
            } else if (yesOrNo == 2) {
                reader = "Guest";
                b = true;
            } else {
                System.out.print("Wrong entry ! Please select a number '1 for yes' or '2 for no' :- ");
                b = false;
            }
        }
        System.out.println("\nHello "+ reader +" !! welcome to the Library." +
                        "\nAs I said , I am the 'LIBRARIAN'." +
                        "\nSo tell me...what you want to do today ?"+
                "\n(Quick Tip : Use the 'explore' command to know all other commands and their functions)\n");
        Library list= new Library();
        Scanner input = new Scanner(System.in);

        boolean ending= false;
        while (!ending) {
            System.out.print("I want to : ");
            String cmd = input.nextLine();
            switch (cmd) {
                case "issue" -> {
                    list.showAvailableBook();
                    list.issueBook();
                    list.showAvailableBook();
                }
                case "return" -> {
                    list.returnBook();
                    list.showAvailableBook();
                }
                case "see all books" -> list.showAvailableBook();
                case "add" -> {
                    list.addBook();
                    list.showAvailableBook();
                }
                case "add books" -> {
                    list.addMultipleBooks();
                    list.showAvailableBook();
                }
                case "remove" -> {
                    list.showAvailableBook();
                    list.removeBook();
                    list.showAvailableBook();
                }
                case "know" -> {
                   list.aboutTheProgram();
                }
                case "explore" -> {
                    list.showCommands();
                }
                case "suggest" -> {
                    list.takingFeedback();
                }

                case "shutdown" -> {
                     ending = true;
                    System.out.printf("Closing the Library." +
                            "\nBye %s." +
                            "\nSee you soon !!!\n",reader);
                }
                default -> System.out.println("Wrong command.\n");
            }
        }
    }
}