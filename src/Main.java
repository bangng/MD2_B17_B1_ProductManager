import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        manager.showProduct();
        while (true){
            System.out.println("PRODUCT-MANAGER");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product");
            System.out.println("4. Search by name");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    manager.showProduct();
                    break;
                case 2:
                    System.out.println("Enter products name");
                    String name = scanner.nextLine();
                    System.out.println("Enter products manufacturer");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter products price");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter products description");
                    String description = scanner.nextLine();
                    if (name.isEmpty() || manufacturer.isEmpty()){
                        System.out.println("Invalid product");
                        return;
                    }
                    manager.addProduct(name,manufacturer,price,description);
                    break;
                case 3:
                    System.out.println("Enter product Id to remove: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    manager.removeProductById(id);
                    break;
                case 4:
                    System.out.println("Enter product name");
                    String nameSearch = scanner.nextLine();
                    System.out.println(manager.searchProduct(nameSearch));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
