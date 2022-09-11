public class Policy{
   private int policyNumber;
   private String providerName, holderFirstName, holderLastName;
   private int holderAge;
   private String holderSmokes;
   private double holderHeight, holderWeight;

   public Policy(){
      policyNumber = 0;
      providerName = "Provider Name";
      holderFirstName = "Holder First Name";
      holderLastName = "Holder Last Name";
      holderAge = 0;
      holderSmokes = "non-smoker";
      holderHeight = 0d;
      holderWeight = 0d;
   }

   public Policy(int pNumber, String pName, String hFirstName, String hLastName, int hAge, String hSmokes, double hHeight, double hWeight){
        policyNumber = pNumber;
        providerName = pName;
        holderFirstName = hFirstName;
        holderLastName = hLastName;
        holderAge = hAge;
        holderSmokes = hSmokes;
        holderHeight = hHeight;
        holderWeight = hWeight;
   }



   public double calculateHolderBMI()
   {
   return (holderWeight * 703) / (holderHeight * holderHeight);
   }

    public double calculatePolicyPrice(){
       double p = 600d;
      
       if(holderAge > 50) p += 75d;
      
       if(holderSmokes.equals("smoker")) p += 100d;
      
       if(calculateHolderBMI() > 35){
       p += (calculateHolderBMI() - 35) * 20d;
       }
      
       return p;
   }



   public void setPolicyNumber(int i){
   policyNumber = i;
   }

   public void setProviderName(String s){
   providerName = s;
   }

   public void setHolderFirstName(String s){
   holderFirstName = s;
   }

   public void setHolderLastName(String s){
   holderLastName = s;
   }

   public void setHolderAge(int i){
   holderAge = i;
   }

   public void setHolderSmokingStatus(String s){
   holderSmokes = s;
   }

   public void setHolderHeight(double d){
   holderHeight = d;
   }

   public void setHolderWeight(double d){
   holderWeight = d;
   }



   public int getPolicyNumber(){
   return policyNumber;
   }

   public String getProviderName(){
   return providerName;
   }

   public String getHolderFirstName(){
   return holderFirstName;
   }

   public String getHolderLastName(){
   return holderLastName;
   }

   public int getHolderAge(){
   return holderAge;
   }

   public String getHolderSmokingStatus(){
   return holderSmokes;
   }

   public double getHolderHeight(){
   return holderHeight;
   }

   public double getHolderWeight(){
   return holderWeight;
   }
}