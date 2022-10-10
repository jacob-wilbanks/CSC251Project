import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_jacob_wilbanks
{
   public static void main(String[] args)
   {
      try{
         File file = new File("PolicyInformation.txt");

         Scanner inputFile = new Scanner(file);
         ArrayList<Policy> policies = new ArrayList<Policy>();

         while(inputFile.hasNext())
         { //open loop

            String fileInput = inputFile.nextLine();
            int policyNumber = Integer.parseInt(fileInput);

            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();

            fileInput = inputFile.nextLine();
            int age = Integer.parseInt(fileInput);

            String smoking = inputFile.nextLine();

            fileInput = inputFile.nextLine();
            double height = Double.parseDouble(fileInput);

            fileInput = inputFile.nextLine();
            double weight = Double.parseDouble(fileInput);

            if(inputFile.hasNext())
            {
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }

            /* Create Course objects using the Course class type - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            Policy p = new Policy(policyNumber, providerName, firstName ,lastName, age, smoking, height, weight); //Passing variables as arguments to the constructor

            /* Add Course objects to the ArrayList (Note: courses is the reference variable for the ArrayList and c is the
            reference variable for the Course objects)*/
            policies.add(p);

         } //close loop

         /*
         Scanner keyboard = new Scanner(System.in);

         Policy policy = new Policy();

         System.out.print("Please enter the Policy Number: ");
         policy.setHolderHeight(keyboard.nextInt());

         System.out.print("Please enter the Provider's Name: ");
         policy.setProviderName(keyboard.next());

         System.out.print("Please enter the Policyholder's First Name: ");
         policy.setHolderFirstName(keyboard.next());

         System.out.print("Please enter the Policyholder's Last Name: ");
         policy.setHolderLastName(keyboard.next());

         System.out.print("Please enter the Policyholder's Age: ");
         policy.setHolderAge(keyboard.nextInt());

         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         policy.setHolderSmokingStatus(keyboard.next());

         System.out.print("Please enter the Policyholder's Height (in inches): ");
         policy.setHolderHeight(keyboard.nextDouble());

         System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         policy.setHolderWeight(keyboard.nextDouble());
         */

         int smokerCount = 0;
         for(int i = 0; i < policies.size(); i++){
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getHolderLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getHolderSmokingStatus());
            if(policies.get(i).getHolderSmokingStatus().equals("smoker")) smokerCount++;
            System.out.println("Policyholder's Height: " + policies.get(i).getHolderHeight());
            System.out.println("Policyholder's Weight: " + policies.get(i).getHolderWeight());
            System.out.println("Policyholder's BMI: " + policies.get(i).calculateHolderBMI());
            System.out.printf("Policy Price: $%.2f \n", policies.get(i).calculatePolicyPrice());
            System.out.println("");
         }

         System.out.println("The number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerCount));
      }
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

   }
}