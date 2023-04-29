package test3;



	public class main {
	    public static void main(String[] args) {
	        methods obj=new methods();
	        for (; ; ) {
	            int choice = obj.userInput();
	            switch (choice) {
	                case 0 -> {
	                    System.out.println("Library Closed!");
	                    System.exit(0);
	                }
	                case 1 -> obj.printAvailableBook();
	                case 2 -> obj.issueBook();
	                case 3 -> obj.returnBook();
	                case 4 -> obj.printIssuedBook();
	                case 5 -> obj.addBook();
	                default -> System.out.println("Invalid Input!");
	            }
	        }
	    }
	}

