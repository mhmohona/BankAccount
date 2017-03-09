public class BankAccount{
private String name, address, accountID;
private  double balance;
public void setName(String n){
name=n;
}
public String getName(){
return name;
}
public void setAccountID(String i){
accountID=i; 
}
public String getAccountID(){
return accountID;
}
public void setBalance(double c){
balance =c;
}
public double getBalance(){return balance;}
public void setAddress(String a){
address=a;
}
public String getAddress(){
return address;
}
public void addInterest() {
balance=balance+(balance*(7/100.0));

}
}