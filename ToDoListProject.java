import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program allows the user to create a simple to-do list where
 * they can add items to a list, show the current items of that list,
 * and remove items from the existing list.
 * @author Javier Colon Morales
 */

public class ToDoListProject {

    private static final List<String> currentList = new ArrayList<>();

    /**
     * This creates an ArrayList type object called currentList which is populated by making
     * the user select options between integers 1 to call the showList method, 2 to call the
     * addItem method, 3 to the removeItem method, or 0 to break and exit the program. Option 1
     * will call the showList method which will show the current items on the ArrayList.
     * Option 2 will call the addItem method which will add items into the ArrayList. Option
     * 3 will call the removeItem method which will remove items from the ArrayList. Option
     * 0 will force a break in the program to close.
     * The menuItem is the choice entered by the user to select which method to call.
     * The menuItem will call the menu method for an explanation to the user of their
     * available choices as well as the creation of a Scanner type object to take in
     * the user's choice.
     * @param args The main method of this program.
     */
    public static void main(String[] args) {
        int menuItem;
        while (true) {
            menuItem = menu();
            if (menuItem == 1) {
                showList();
            } else if (menuItem == 2) {
                addItem();
            } else if (menuItem == 3) {
                removeItem();
            } else if (menuItem == 0) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }

    /**
     * This is the menu method which is called by the menuItem to show the user an
     * explanation to the user of their available choices as well as the creation of
     * a Scanner type object to take in the user's choice. The choice variable will be the given
     * integer to use as an argument to select the menu choice. Depending on the user's choice
     * between 1, 2, 3, and 0, the respective methods will be called.
     * @return  returns the choice from the user between 1, 2, 3 and 0 to call the respective method.
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("1. Show current list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println("0. Exit the program");
        System.out.println();
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }

    /**
     * The showList method will print the list of items in the currentList ArrayList. The number variable
     * will be the given integer to use as an argument showList method which will show the respective
     * element in the currentList ArrayList to the user.
     */
    public static void showList() {
        System.out.println();
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");
    }

    /**
     * The addItem method will create a Scanner type object and ask the user to add an
     * item into the currentList ArrayList. The item variable is what the user will type out
     * using a Scanner type object to add an item to the currentList ArrayList. This method then
     * prints the elements in the currentList ArrayList to the user.
     */
    public static void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        System.out.println("Item added...\n\n\n" );
        showList();
        System.out.println();
    }
    /**
     * The removeItem method will create a Scanner type object and show the user the currentList
     * ArrayList. The user will enter an integer that corresponds to an element in the currentList ArrayList.
     * That element will then be removed from the currentList ArrayList. The integer index variable is what the user
     * will type out which corresponds to the element in the currentList ArrayList to remove that element from the
     * currentList ArrayList. This method then prints the remaining elements in the currentList ArrayList to the user
     * after their selected element is removed.
     */
    public static void removeItem() {
        System.out.println("Remove Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove? Please select the number.");
        showList();
        System.out.println();
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to" + currentList.size());
                    removeItem();
        }else {
            currentList.remove(index-1);
            System.out.println("Item removed...\n\n\n");
        }
        showList();
        System.out.println();
    }
}