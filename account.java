public class account{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount();
    acc1.setName("Mike");
  acc1.setAccountID("14201031");
  acc1.setAddress("Faridpur");
  acc1.setBalance(100);
    System.out.println(acc1.getName());
  System.out.println(acc1.getAccountID());
  System.out.println(acc1.getAddress());
  System.out.println(acc1.getBalance());
  acc1.addInterest();
System.out.println(acc1.getBalance());
  }
}