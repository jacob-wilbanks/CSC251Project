import java.util.Scanner;

public class Project_jacob_wilbanks
{
   public static void main(String[] args)
   {
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
      
      
      
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder's Age: " + policy.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getHolderSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHolderHeight());
      System.out.println("Policyholder's Weight: " + policy.getHolderWeight());
      System.out.println("Policyholder's BMI: " + policy.calculateHolderBMI());
      System.out.println("Policy Price: " + policy.calculatePolicyPrice());
   }
}