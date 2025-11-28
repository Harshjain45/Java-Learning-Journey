/*15. Demonstrate all 4 access modifiers:
public variable
private variable
protected variable
default variable
Access them from another class (only allowed one's work). */
public class AccessClass {
    //Class with all 4 access modifiers
    static class Demo {
        public String publicVar = "I am PUBLIC";          // accessible everywhere
        private String privateVar = "I am PRIVATE";       // only inside this class
        protected String protectedVar = "I am PROTECTED"; // same package + subclasses
        String defaultVar = "I am DEFAULT";               // same package only
        //Method to show private variable (since no one else can access it)
        public void showPrivate() {
            System.out.println(privateVar);
        }
    }
    //Another class (same file, same package)
    static class TestAccess {
        public void checkAccess() {
            Demo d = new Demo(); // Object creation
            //Accessing variables
            System.out.println(d.publicVar);     // ✔ Accessible
            System.out.println(d.protectedVar);  // ✔ Accessible (same package)
            System.out.println(d.defaultVar);    // ✔ Accessible (same package)

            //Private variable cannot be accessed directly
            //System.out.println(d.privateVar);  // ❌ ERROR: private

            d.showPrivate(); // ✔ Access private through public method
        }
    }
    public static void main(String[] args) {
        TestAccess ta = new TestAccess(); // Instantiating TestAccess
        ta.checkAccess();                 // Checking access
    }
}