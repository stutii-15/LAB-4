public class SpeedController {

    // Method to check speed
    public void checkSpeed(int speed) {
        if (speed > 100) {
            // Throw an exception if speed exceeds limit
            throw new ArithmeticException("Speed limit exceeded!");
        } else {
            System.out.println("Speed is normal.");
        }
    }

    public static void main(String[] args) {
        SpeedController controller = new SpeedController();

        try {
            // Safe speed
            controller.checkSpeed(80);

            // Unsafe speed
            controller.checkSpeed(120);

        } catch (ArithmeticException e) {
            // Catch the thrown exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
