public class Policy{
   private double policyNumber;
   private String providerName, holderFirstName, holderLastName;
   private int holderAge;
   private bool holderSmokes;
   private double holderHeight, holderWeight;

   public Policy(){
      policyNumber = 0d;
      providerName = "Provider Name";
      holderFirstName = "Holder First Name";
      holderLastName = "Holder Last Name";
      holderAge = 0;
      holderSmokes = false;
      holderHeight = 0d;
      holderWeight = 0d;
   }

   public Policy(double pNumber, String pName, String hFirstName, String hLastName, int hAge, bool hSmokes, double hHeight, double hWeight){
        policyNumber = pNumber;
        providerName = pName;
        holderFirstName = hFirstName;
        holderLastName = hLastName;
        holderAge = hAge;
        holderSmokes = hSmokes;
        holderHeight = hHeight;
        holderWeight = hWeight;
   }



   public double calculateHolderBMI(){
   return (holderWeight * 703) / (holderHeight ^ 2)
   }

       public double calculatePolicyPrice(){
       double p = 600d;

       if(holderAge > 50) p += 75d;

       if(holderSmokes) p += 100d;

       if(calculateHolderBMI() > 35){
       p += (calculateHolderBMI() - 35) * 20d;
       }

       return p;

   }



   public void setPolicyNumber(double d){
   policyNumber = d;
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

   public void setHolderSmokingStatus(bool b){
   holderSmokes = b;
   }

   public void setHolderHeight(double d){
   holderHeight = d;
   }

   public void setHolderWeight(double d){
   holderWeight = d;
   }



   public double getHolderPolicyNumber(){
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

   public bool getHolderSmokingStatus(){
   return holderSmokes;
   }

   public double getHolderHeight(){
   return holderHeight;
   }

   public double getHolderWeight(){
   return holderWeight;
   }
}