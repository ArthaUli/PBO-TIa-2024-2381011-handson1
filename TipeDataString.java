public class TipeDataString {
    public static void main(String[] args) {

        String firstName = "Artha";
        String lastName = "Uli";

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat( " "). concat(str: lastName);
        System.out.println(fullName);
    }
}
