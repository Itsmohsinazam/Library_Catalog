package Library_Catalog;

import javax.swing.JOptionPane;

public class Library_System {
    public static void main(String[] args) {
        Catalog<LibraryItem<?>> catalog = new Catalog<>();

        while (true) {
    		int choice = Integer.parseInt(JOptionPane.showInputDialog("1. Add Item\n"+
        															"2. Remove Item\n"+
        															"3. View Catalog\n"+
        															"4. Exit\n"+
        															"Enter your choice: "));
        	
            switch (choice) {
                case 1:
            		String title = JOptionPane.showInputDialog("Enter title: ");
            		String author = JOptionPane.showInputDialog("Enter author: ");
            		Integer itemID = Integer.parseInt(JOptionPane.showInputDialog("Enter itemID: "));
                    LibraryItem<?> newItem = new LibraryItem<>(title, author, itemID);
                    catalog.addItem(newItem);
                    int showItem= Integer.parseInt(JOptionPane.showInputDialog("You have successfully added the book\n\n"+
                    															"Title: "+title+"\n"+ 
                    															"Author: "+author+"\n"+ 
                    															"ItemID: "+itemID+"\n\n"+
                    															"Enter 1 to view catalog or 0 to exit: "));
                    if (showItem==1){
                        catalog.displayCatalog();
                        break;
                    }
                    else if(showItem == 0){
                    	JOptionPane.showMessageDialog(null,"Exiting program.");
                        System.exit(0);
                    }
                    else {
                    	JOptionPane.showMessageDialog(null,"Invalid choice. Please try again.");
                    }
                    break;
                case 2:
                	Integer idToRemove = Integer.parseInt(JOptionPane.showInputDialog("Enter itemID to remove: "));
                    LibraryItem<?> itemToRemove = null;
                    for (LibraryItem<?> item : catalog.getItems()) {
                        if (item.getItemID() == idToRemove) {
                            itemToRemove = item;
                          
                            int remove = Integer.parseInt(JOptionPane.showInputDialog("You have successfully removed the book\n\n"+
									"Enter 1 to view catalog or 0 to exit: "));
							if (remove ==1){
							catalog.displayCatalog();
							break;
							}
							else if(remove == 0){
							JOptionPane.showMessageDialog(null,"Exiting program.");
							System.exit(0);
							}
							else {
							JOptionPane.showMessageDialog(null,"Invalid choice. Please try again.");
							}
							break;
                        }
                    }
                    if (itemToRemove != null) {
                        catalog.removeItem(itemToRemove);
                    } else {
                    	JOptionPane.showMessageDialog(null,"Item not found in the catalog.");
                    }
                    break;
                case 3:
                    catalog.displayCatalog();
                    break;
                case 4:
                	JOptionPane.showMessageDialog(null,"Exiting program.");
                    System.exit(0);
                default:
                	JOptionPane.showMessageDialog(null,"Invalid choice. Please try again.");
            }
        }
    }
}
