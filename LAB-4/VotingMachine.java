import java.util.Scanner;

class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}

public class VotingMachine {  

    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
          
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VotingMachine machine = new VotingMachine();  

        try {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            
            machine.castVote(age);

        } catch (MinorAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); 
            
        }
    }
}
