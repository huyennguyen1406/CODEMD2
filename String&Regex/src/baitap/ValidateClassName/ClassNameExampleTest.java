package baitap.ValidateClassName;

public class ClassNameExampleTest {
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        String[] testClass = new String[] {"C0318G","M0318G", "P0323A","A1234H","P1133L"};
        for (String className : testClass) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name [" + className + "] is valid: " + isValid);
        }
    }
}
