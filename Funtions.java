import java.util.Scanner;

class Functions {
    public static String takeName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Corrected method
        sc.close(); // Added to close the scanner resource
        return name;
    }

    public static void main(String[] args) {
        String name = takeName();
        System.out.println(name);
    }
}
