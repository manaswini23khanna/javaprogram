package pack1;

public class ClassPrintName {
    
    void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        String name = "Manu"; 

        ClassPrintName obj = new ClassPrintName();
        obj.printName(name);
    }
}
