public class Test {
    /**
     * 3 Types of Constructors
     * No-arg = no parameters
     * 
     */
    /**
     * No-Arg
     */
    // Test(){
    //     System.out.println("Test Class Constructor Called");
    // }
    /**
     * Parameterized Constructor
     * @param args
     * @throws Exception
     */
    private String language;
    // Test(String lang){
    //     language = lang;
    // }

    /**
     * Default constructor
     */


    public void displayLanguage(){
        System.out.println("The language is " + language);
    }

    public static void main(String[] args) throws Exception {
        // declare an object/instance of the Test Class
        String langInput = "English";
        Test t = new Test();
        t.displayLanguage();

    }
}
