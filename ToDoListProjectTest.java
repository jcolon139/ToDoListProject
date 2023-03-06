import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"DuplicatedCode", "ConstantConditions"})
class ToDoListProjectTest extends ToDoListProject {

    @org.junit.jupiter.api.Test
    @DisplayName("Takes in integers to make choices.")
    void testMain() {
        int menuItem = 1;
            if (menuItem == 1) {
                System.out.println("Calls showList method.");
            } else if (menuItem == 2) {
                System.out.println("Calls addItem method.");
            } else if (menuItem == 3) {
                System.out.println("Calls removeItem method.");
            } else if (menuItem == 0) {
                System.out.println("Breaks and exits program.");
            }
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Shows current ArrayList elements and element positions.")
    void testShowList() {
        final List<String> currentList = new ArrayList<>();
        System.out.println("Adding TestItem1 and TestItem2 to ArrayList. List: ");
        currentList.add("TestItem1");
        currentList.add("TestItem2");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
    }

    @org.junit.jupiter.api.Test
    void testAddItem() {
        final List<String> currentList = new ArrayList<>();
        System.out.println("Adding TestItem1 and TestItem2 to ArrayList. List: ");
        currentList.add("TestItem1");
        currentList.add("TestItem2");

        for (String item : currentList) {
            System.out.println(item);
        }

    }

    @org.junit.jupiter.api.Test
    void testRemoveItem() {
        final List<String> currentList = new ArrayList<>();
        System.out.println("Adding TestItem1 and TestItem2 to ArrayList. List: ");
        currentList.add("TestItem1");
        currentList.add("TestItem2");

        for (String item : currentList) {
            System.out.println(item);
        }
        System.out.println("Removing TestItem1 from ArrayList. List:");
        currentList.remove("TestItem1");
        for (String item : currentList) {
            System.out.println(item);
        }
    }
}