package stingProgs;

public class CompareSting {
    public static void main(String[] args) {
        String str1 = "Mukesh";
        String str2 = "mukesh";
        String str3 = new String("Mukesh");
        String str4 = new String("Mukesh");

        if (str1 == str2) {
            System.out.println("Strig is equal 1");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strig is equal 2");
        }
        if (str1.equals(str2)) {
            System.out.println("Strig is equal 3");
        }

        //check if Strig is equal : 3 and 4
        System.out.println(str3 == str4);

       //check if Strig is equal : 3 and 4
        System.out.println(str3.equals(str4));


    }
}
