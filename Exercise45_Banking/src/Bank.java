import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName){
        for(Branch branch : this.branches){
            if(branch.getName() == branchName){
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if(this.findBranch(branchName) == null){
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        if(this.findBranch(branchName) != null){
            for(Customer customer : this.findBranch(branchName).getCustomers()){
                if(customer.getName() == customerName) return false;
            }
            this.findBranch(branchName).newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if(this.findBranch(branchName) != null){
            for(Customer customer : this.findBranch(branchName).getCustomers()){
                if(customer.getName() == customerName){
                    customer.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        if(this.findBranch(branchName) == null) return false;
        if(printTransactions){
            System.out.println("Customer details for branch " + branchName);
            for (Customer customer : this.findBranch(branchName).getCustomers()){
                System.out.println("Customer: " + customer.getName() + "[" +
                        (this.findBranch(branchName).getCustomers().indexOf(customer) + 1) + "]");
                System.out.println("Transactions");
                for(Double transaction : customer.getTransactions()){
                    System.out.println("[" + (customer.getTransactions().indexOf(transaction) + 1) +
                            "]" + "  Amount " + transaction);
                }
            }
        } else{
            System.out.println("Customer details for branch " + branchName);
            for (Customer customer : this.findBranch(branchName).getCustomers()){
                System.out.println("Customer: " + customer.getName() + "[" +
                        (this.findBranch(branchName).getCustomers().indexOf(customer) + 1) + "]");
            }
        }
        return true;
    }
}
