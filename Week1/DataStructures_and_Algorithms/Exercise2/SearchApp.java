package Week1.DataStructures_and_Algorithms.Exercise2;

class SearchApp {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Mobile", "Electronics"),
            new Product(5, "Backpack", "Travel")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchAlgorithms.linearSearch(products, "Mobile");
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");

        SearchAlgorithms.sortByName(products);
        System.out.println("Binary Search:");
        Product result2 = SearchAlgorithms.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
    }
}
