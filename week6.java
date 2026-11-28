import java.util.Scanner;

public class StudentEmailOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String VALID_DOMAIN = "bmsce.ac.in";

        System.out.print("Enter student email address: ");
        String email = sc.nextLine();

        String trimmed = email.trim();
        System.out.println("\nTrimmed email: \"" + trimmed + "\"");

        System.out.println("Length of email address: " + trimmed.length());

        int atIndex = trimmed.indexOf('@');
        if (atIndex == -1 || atIndex != trimmed.lastIndexOf('@')) {
            System.out.println("Invalid email !");
            sc.close();
            return;
        }

        String username = trimmed.substring(0, atIndex);
        String domain = trimmed.substring(atIndex + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        if (domain.equalsIgnoreCase(VALID_DOMAIN)) {
            System.out.println("Domain matches " + VALID_DOMAIN + ".");
        } else {
            System.out.println("Domain does not match " + VALID_DOMAIN + ". ");
        }

        String lower = trimmed.toLowerCase();
        System.out.println("Lowercase email: " + lower);

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine().trim();
        if (lower.startsWith(prefix.toLowerCase())) {
            System.out.println("Email starts with the prefix \"" + prefix + "\".");
        } else {
            System.out.println("Email does not start with the prefix \"" + prefix + "\".");
        }

        if (lower.endsWith(VALID_DOMAIN)) {
            System.out.println("Email ends with " + VALID_DOMAIN + ": true");
        } else {
            System.out.println("Email ends with " + VALID_DOMAIN + ": false");
        }

        if (lower.endsWith("@" + VALID_DOMAIN)) {
            String updated = lower.replace("@" + VALID_DOMAIN, "@cse." + VALID_DOMAIN);
            System.out.println("Updated email: " + updated);
        } else {
            System.out.println("Domain " + VALID_DOMAIN + " not found, so replacement was not performed.");
        }

        System.out.print("Enter character or sequence to search for: ");
        String seq = sc.nextLine().trim();
        if (lower.contains(seq.toLowerCase())) {
            System.out.println("Email contains \"" + seq + "\".");
        } else {
            System.out.println("Email does not contain \"" + seq + "\".");
        }

        System.out.print("\nEnter first email for comparison: ");
        String email1 = sc.nextLine().trim();
        System.out.print("Enter second email for comparison: ");
        String email2 = sc.nextLine().trim();

        if (email1.equalsIgnoreCase(email2)) {
            System.out.println("The two email addresses are identical .");
        } else {
            System.out.println("The two email addresses are different.");
        }

        sc.close();
        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
