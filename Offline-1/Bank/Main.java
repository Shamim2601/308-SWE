package Bank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//this is the super class for all account type 
class account{
    public String Name;
    private double Balance;
    public int FirstDiposit;
    public String type;
    private double IntRate;
    private double LoanAmount;
    private int age;

    public account(String name, int firstDiposit){
        Name = name;
        Balance = firstDiposit;
    }
    public double getLoanAmount() {
        return LoanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.LoanAmount = loanAmount;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getIntRate(){
        return IntRate;
    }

    public void setIntrate(double intRate){
        IntRate = intRate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void diposit(int amount){
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("Diposited "+amount+". Current balance: "+getBalance());
        }else{
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }
    }

    public void withdraw(int amount){
        if(amount>0 && amount<=getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("withdrawn "+amount+". Current balance: "+getBalance());
        }else{
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }
    }

    public double query(){
        return getBalance();
    }
}

class SavingsAccount extends account{
    public SavingsAccount(String name, int firstDiposit){
        super(name, firstDiposit);
        type = "savings";
        System.out.println("Savings account for "+name+" created. Initial balance: "+firstDiposit);
    }

    public void withdraw(int amount){
        if(amount>0 && (getBalance()-amount)<1000){   /*minimum balance 1000*/ 
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }else if(amount<0){
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }else{
            setBalance(getBalance()-amount);
            System.out.println("withdrawn "+amount+". Current balance: "+getBalance());
        }
    }
}

class StudentAccount extends account{
    public StudentAccount(String name, int firstDiposit){
        super(name, firstDiposit);
        type = "student";
        System.out.println("Student account for "+name+" created. Initial balance: "+firstDiposit);
    }

    public void withdraw(int amount){
        if(amount>10000){   /*minimum balance 1000*/ 
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }else if(amount>0){
            if(amount<getBalance()){
                setBalance(getBalance()-amount);
                System.out.println("withdrawn "+amount+". Current balance: "+getBalance());    
            }else{
                System.out.println("Invalid transaction. Current Balance: "+getBalance());
            }
        }else{
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }
    }
}

class FdAccount extends account{
    public FdAccount(String name, int firstDiposit){
        super(name, firstDiposit);
        type = "fixeddiposit";
        System.out.println("Fixed diposit account for "+name+" created. Initial balance: "+firstDiposit);
    }

    public void diposit(int amount){
        if(amount<50000){ /* minimum diposit 50000*/
            System.out.println("Invalid transaction. Current Balance: "+getBalance());
        }else{
            setBalance(getBalance()+amount);
            System.out.println("Diposited "+amount+". Current balance: "+getBalance());
        }
    }

    public void withdraw(int amount){
        if(getAge()>=1){ /*maturity period of 1 year */
            if(amount>0 && amount<=getBalance()){
                setBalance(getBalance()-amount);
                System.out.println("withdrawn "+amount+". Current balance: "+getBalance());
            }else{
                System.out.println("Invalid transaction. Current Balance: "+getBalance());
            }
        }else{
            System.out.println("Yet to be mature.");
        }
    }
}

class LoanAccount extends account{
    public LoanAccount(String name, int initial){
        super(name, initial);
        type = "loan";
        setBalance(0);
        setLoanAmount(initial);
        System.out.println("Loan account for "+name+" created. Initial loan: "+initial);
    }

    public void diposit(int amount){
        setLoanAmount(getLoanAmount()-amount); /*diposit means repay loan*/
    }

    public void withdraw(){
        System.out.println("You are not allowed to withdraw.");
    }
}

class LoanRequest{
    public account loanAcc;
    public double amount;
    public LoanRequest(account loanAcc, double amount) {
        this.loanAcc = loanAcc;
        this.amount = amount;
    }   
}

class employee{
    public String Name;
    public String Type;
    public employee(String name) {
        Name = name;
    }
    
}

class ManagingDirector extends employee{
    public ManagingDirector(String name){
        super(name);
        Type = "ManagingDirector";
    }
}

class Officer extends employee{
    public Officer(String name){
        super(name);
        Type = "officer";
    }
}

class Cashier extends employee{
    public Cashier(String name){
        super(name);
        Type = "cashier";
    }
}

class bank{
    private double Fund;
    public int yearCount;
    public HashMap<String, account> accounts;  //hashtable on Name of all accounts
    public HashMap<String, employee> employees; //hashtable for all employees
    public ArrayList<LoanRequest> loanRequests; //Arraylist to handle loanrequests

    public bank(int initialFund){
        setFund(initialFund);
        yearCount = 0;
        accounts = new HashMap<>();
        employees = new HashMap<>();
        loanRequests = new ArrayList<>();
        ManagingDirector MD = new ManagingDirector("MD");
        employees.put("MD", MD);
        Officer O1 = new Officer("S1");
        employees.put("S1", O1);
        Officer O2 = new Officer("S2");
        employees.put("S2", O2);
        Cashier C1 = new Cashier("C1");
        employees.put("C1", C1);
        Cashier C2 = new Cashier("C2");
        employees.put("C2", C2);
        Cashier C3 = new Cashier("C3");
        employees.put("C3", C3);
        Cashier C4 = new Cashier("C4");
        employees.put("C4", C4);
        Cashier C5 = new Cashier("C5");
        employees.put("C5", C5);

        System.out.println("\nBank created. "+MD.Name+","+O1.Name+","+O2.Name+","+C1.Name+","+C2.Name+","+C3.Name+","+C4.Name+","+C5.Name+ " created.");
    }

    public double getFund() {
        return Fund;
    }

    public void setFund(double d) {
        this.Fund = d;
    }

}

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        bank b = new bank(1000000);
        account currenAccount= null; //account that is opened now for transactions
        employee currentEmployee = null; //employee that is active now
        String command;
        int savingsIntRate= 10, studentIntRate = 5, FdIntRate = 15;

        while(scanner.hasNextLine()){
            command = scanner.nextLine();
            String[] str = command.split("\\s");

            switch(str[0].toLowerCase()){
                case "create":
                    if(b.accounts.containsKey(str[1])){
                        System.out.println("Account with this name already exists");
                    }else{
                        if (str[2].equalsIgnoreCase("savings")){
                            SavingsAccount sa1 = new SavingsAccount(str[1], Integer.parseInt(str[3]));
                            sa1.setIntrate(savingsIntRate);
                            b.accounts.put(str[1],sa1);
                            b.setFund(b.getFund()+Integer.parseInt(str[3]));
                            currenAccount = sa1;
                        }else if (str[2].equalsIgnoreCase("student")){
                            StudentAccount sta1 = new StudentAccount(str[1], Integer.parseInt(str[3]));
                            sta1.setIntrate(studentIntRate);
                            b.accounts.put(str[1],sta1);
                            b.setFund(b.getFund()+Integer.parseInt(str[3]));
                            currenAccount = sta1;
                        }else if (str[2].equalsIgnoreCase("fixeddiposit")){
                            if(Integer.parseInt(str[3])>=100000){
                                FdAccount fda1 = new FdAccount(str[1], Integer.parseInt(str[3]));
                                fda1.setIntrate(FdIntRate);
                                b.accounts.put(str[1],fda1);
                                b.setFund(b.getFund()+Integer.parseInt(str[3]));
                                currenAccount = fda1;
                            }else{
                                System.out.println("Invalid initial diposit amount.");
                            }         
                        }else{
                            LoanAccount la1 = new LoanAccount(str[1], Integer.parseInt(str[3]));
                            b.accounts.put(str[1], la1);
                            b.setFund(b.getFund()-Integer.parseInt(str[3]));
                            currenAccount = la1;
                        }
                    }
                    break;

                case "deposit":
                    if(currenAccount!=null){
                        currenAccount.diposit(Integer.parseInt(str[1]));
                        b.setFund(b.getFund()+Integer.parseInt(str[1]));
                    }
                    break;

                case "withdraw":
                    if(currenAccount!=null){
                        currenAccount.withdraw(Integer.parseInt(str[1]));
                        b.setFund(b.getFund()-Integer.parseInt(str[1]));
                    }
                    break;

                case "close":
                    if(currenAccount!=null){
                        System.out.println("Transaction closed for "+currenAccount.Name);
                        currenAccount = null;
                    }else if(currentEmployee!=null){
                        System.out.println("Operations for "+currentEmployee.Name+" closed.");
                        currentEmployee = null;
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "query":
                    if(currenAccount!=null){
                        System.out.println("Current balance:"+currenAccount.getBalance()+"; Loan: "+currenAccount.getLoanAmount());
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "request":
                    if(currenAccount!=null){
                        if(currenAccount.type.equalsIgnoreCase("loan")){
                            LoanRequest lr = new LoanRequest(currenAccount, currenAccount.getLoanAmount()*5/100);
                            b.loanRequests.add(lr);
                            System.out.println("Loan request successful. Sent for approval.");
                        }else{
                            String tp = currenAccount.type;
                            int amount = Integer.parseInt(str[1]);
                            if(amount>0){
                                if((tp.equalsIgnoreCase("savings")&& amount<=10000)||((tp.equalsIgnoreCase("student"))&& amount<=1000)||((tp.equalsIgnoreCase("fixeddiposit"))&& amount<=100000)){
                                    LoanRequest lr = new LoanRequest(currenAccount, amount);
                                    b.loanRequests.add(lr);
                                    System.out.println("Loan request successful. Sent for approval.");
                                }else{
                                    System.out.println("Invalid request.");
                                }
                            }
                        }
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "open":
                    if(b.accounts.containsKey(str[1])){
                        currenAccount = b.accounts.get(str[1]);
                        System.out.println("Welcome back, "+str[1]+"!");
                    }else if(b.employees.containsKey(str[1])){
                        currentEmployee = b.employees.get(str[1]);
                        System.out.print(str[1]+" active. ");
                        if(b.loanRequests.size()!=0){
                            System.out.println("There are loan requests pending.");
                        }else{
                            System.out.println();
                        }
                    }else{
                        System.out.println("Wrong Command.");
                    }
                    break;

                case "approve":
                    if(currentEmployee!=null){
                        if(b.loanRequests.get(0)!=null){
                            b.loanRequests.get(0).loanAcc.setLoanAmount(b.loanRequests.get(0).loanAcc.getLoanAmount()+b.loanRequests.get(0).amount);
                            System.out.println("Loan for "+b.loanRequests.get(0).loanAcc.Name+" approved.");
                            b.setFund(b.getFund()-b.loanRequests.get(0).amount);
                            b.loanRequests.remove(0);
                        }else{
                            System.out.println("Wrong command.");
                        }
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "change":
                    if(currentEmployee!=null){
                        if(currentEmployee.Type.equalsIgnoreCase("managingdirector")){
                            if(str[1].equalsIgnoreCase("student")){
                                studentIntRate = Integer.parseInt(str[2]);
                                System.out.println("Student interest rate changed to "+studentIntRate);
                            }else if(str[1].equalsIgnoreCase("savings")){
                                savingsIntRate = Integer.parseInt(str[2]);
                                System.out.println("Savings interest rate changed to "+savingsIntRate);
                            }else{
                                FdIntRate = Integer.parseInt(str[2]);
                                System.out.println("FixedDiposit interest rate changed to "+FdIntRate);
                            }

                            for(account acc: b.accounts.values()){
                                if(acc.type.equalsIgnoreCase("student")){
                                    acc.setIntrate(studentIntRate);
                                }else if(acc.type.equalsIgnoreCase("savings")){
                                    acc.setIntrate(savingsIntRate);
                                }else{
                                    acc.setIntrate(FdIntRate);;
                                }
                            }
                        }else{
                            System.out.println("You don't have permission for this operation.");
                        }
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "lookup":
                    if(currentEmployee!=null){
                        if(b.accounts.containsKey(str[1])){
                            System.out.println(str[1]+"'s current balance: "+b.accounts.get(str[1]).getBalance());
                        }else{
                            System.out.println("Wrong command.");
                        }
                    }else{
                        System.out.println("Wrong command.");
                    }
                    break;

                case "see":
                    if(currentEmployee!=null){
                        if(currentEmployee.Type.equalsIgnoreCase("managingdirector")){
                            System.out.println("Current internal fund of the bank: "+b.getFund());
                        }else{
                            System.out.println("You don't have permission for this operation.");
                        }
                    }else{
                        System.out.println("Wrong command");
                    }
                    break;

                case "inc":
                    b.yearCount++;
                    for(account acc: b.accounts.values()){
                        acc.setBalance((acc.getBalance()*(1+(acc.getIntRate()/100)))-500-(acc.getLoanAmount()*10/100));
                        acc.setAge(acc.getAge()+1);
                    }
                    System.out.println("1 year passed.");
                    break;

                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Wrong command!");
            }
        }
    }     
}