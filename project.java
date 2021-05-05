import java.util.Scanner;

public class project {
    public static void main (String[] args){
        System.out.println("Hello welcome to the food app");
        System.out.println("Please  create a password: ");
        Scanner scan= new Scanner(System.in); // creo el metodo que escanea lo que escribo por consola
        String password = scan.next();
        System.out.println("Your password is: "+ password);


        System.out.println("Please confirm you password: ");
        String confirmpass= scan.next();
        while(!confirmpass.equals(password)) { // mientras sean distintas , le pido que ingrese la correcta y chequeo
            System.out.println("The password is wrong, please enter the correct password: ");
            confirmpass = scan.next();
        }
        System.out.println("Access granted");
        System.out.println("Are you hungry ? 'Yes' or 'No' :");
        String answer = scan.next();

        if(answer.equals("yes")){
            System.out.println("Choose what you want to eat between spaghetti , hamburger or pizza");
            String answer2= scan.next();
            while(!answer2.equals("pizza") && !answer2.equals("hamburger") && !answer2.equals("spaghetti")){
                System.out.println("Sorry we dont have it , what would you like between pizza, hamburger or spaghetti");
                answer2 =scan.next();
            }
            if(answer2.equals("pízza") || answer2.equals("hamburger") || answer2.equals("spaghetti") ){
                System.out.println("Do you want something to drink? : ");
                String answer3 = scan.next();
                while(!answer3.equals("yes") && !answer3.equals("no")){
                    System.out.println("Invalid answer , please enter 'Yes' or 'No' ");
                    answer3 = scan.next();

                }
                if(answer3.equals("yes")){
                    System.out.println("Do you want Coke or Juice: ");
                    String ans4 = scan.next();
                    while(!ans4.equals("coke")&& !ans4.equals("juice")){
                        System.out.println("Sorry we dont have it ,what would you like between Coke or Juice: ");
                        ans4= scan.next().toLowerCase();

                    }
                    if(ans4.equals("coke")|| ans4.equals("juice")){
                        System.out.println("Perfect , you have create a order of " + answer2 +" whit "+ ans4);

                    }
                    System.out.println("Please confirm you password: ");
                    confirmpass= scan.next();
                    while(!confirmpass.equals(password)) { // mientras sean distintas , le pido que ingrese la correcta y chequeo
                        System.out.println("The password is wrong, please enter the correct password: ");
                        confirmpass = scan.next();
                    }
                    System.out.println("Thank you , your order is on it´s way, have a nice day :)");

                }
                else {
                    System.out.println("Okay , with no drink.");
                    System.out.println("You have create a order of "+ answer2 );
                    System.out.println("Please confirm you password: ");
                   confirmpass= scan.next();
                    while(!confirmpass.equals(password)) { // mientras sean distintas , le pido que ingrese la correcta y chequeo
                        System.out.println("The password is wrong, please enter the correct password: ");
                        confirmpass = scan.next();
                    }
                    System.out.println("Thank you , your order is on it´s way, have a nice day :)");

                }

            }
        }
        else {
            System.out.println("Have a good day");
        }

    }

}

