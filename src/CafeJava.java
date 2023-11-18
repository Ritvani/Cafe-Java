public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int dripCoffee = 3;
        int latte = 4;
        int cappuccino = 3;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + readyMessage);

        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }

        int totalSam = latte * 2;

        System.out.println(generalGreeting + customer2 + " " + displayTotalMessage + totalSam);

        if (isReadyOrder3){
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println("We are sorry " + customer2 + pendingMessage);
        }

        int differenceJimmy = latte - dripCoffee;
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + differenceJimmy);

    }
}
