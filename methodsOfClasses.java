import java.lang.reflect.Method;
public class methodsOfClasses {


    public static void main(String[] args) {
        // Example for a built-in class (String)
        System.out.println("Methods of String class:");
        listMethods(String.class);

        // Example for a custom class
        System.out.println("\nMethods of MyClass:");
        listMethods(MyClass.class);
    }

    public static void listMethods(Class<?> clazz) {
        // getMethods() returns all public methods of the class or interface,
        // including those inherited from superclasses and superinterfaces.
        Method[] methods = clazz.getMethods();

        // getDeclaredMethods() returns all methods declared by the class or interface,
        // but not inherited methods. It includes public, protected, package-private, and private methods.
        // Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

class MyClass {
    public void publicMethod() {
        // ...
    }

    protected void protectedMethod() {
        // ...
    }

    private void privateMethod() {
        // ...
    }

    public int calculate(int a, int b) {
        return a + b;
    }
  
}
