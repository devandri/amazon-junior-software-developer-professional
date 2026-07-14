public class ExampleString {
    public static void main(String[] str) {
        String firstName = "Andri";
        String lastName = "Wibowo Saputro";
        String email = "email@example.com";

        String username = firstName.toLowerCase() + lastName.toLowerCase();
        System.out.println("username after conversiton and concatenation: " + username);

        email = email.replace("example.com", "gmail.com");
        System.out.println("email after replacing example.com with gmail.com: " + email);

        System.out.println("index of @ in the email address is: " + email.indexOf("@"));

    }
}
