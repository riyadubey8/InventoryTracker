import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        boolean runner = true;

        while(true){
            System.out.println("What would you like to do: ");
            System.out.println("1. Add item");
            System.out.println("2. Change price of existing item");
            System.out.println("3. Change stock of existing item");
            System.out.println("4. View all items");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                
                //add item
                case 1:
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Price: ");
                double price = scanner.nextDouble();
                System.out.println("Stock: ");
                int stock = scanner.nextInt();
                scanner.nextLine();

                Item item = new Item(name, price, stock);
                items.add(item);
                System.out.println("Item added succesfully!");
                break;

                //Change price of exsiting item
                case 2:
                System.out.println("Item name: ");
                String priceName = scanner.nextLine();

                boolean i = true;

                for(Item j: items){
                    if(j.getName().equalsIgnoreCase(priceName)){
                        System.out.println("New price: ");
                        double newPrice = scanner.nextDouble();
                        j.setPrice(newPrice);
                        System.out.println("Price updated!");
                        i = false;
                        break;
                    } else {
                        i = true;
                    }   
                }

                if(i){
                    System.out.println("Sorry, that was an invalid input");
                }

                break;

                //changing stock
                case 3:
                System.out.println("Item name: ");
                String stockName = scanner.nextLine();

                boolean l = true;

                for(Item x: items){
                    if(x.getName().equalsIgnoreCase(stockName)){
                        System.out.println("New amt. in stock: ");
                        int newStock = scanner.nextInt();
                        scanner.nextLine();
                        x.setStock(newStock);
                        System.out.println("Stock updated!");
                        l = false;
                        break;
                    } else {
                        l = true;
                    }
                }

                if(l){
                    System.out.println("Sorry, that was an invalid input!");
                }

                break;

                //view all items
                case 4:
                int number = 1;
                for(Item itemList: items){
                    System.out.println(number + ". " + itemList);
                    number++;
                }
                
                break;

                //Exit
                case 5:
                runner = false;
                break;              
            }
        }
    }
}