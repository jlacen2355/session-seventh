package day5.encapsulation;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
//        account1.name = "James";
        account1.setName("James");
//        account1.accountNumber = "5454w5erwefr";
        account1.setAccountNumber("5454w5erwefr");
//        account1.accountType = AccountType.STUDENT;
        account1.setAccountType(AccountType.STUDENT);
//        account1.accountBalance = 360000;
        account1.setAccountBalance(360000);
//        account1.socialSecurityNumber = "aslsldkfjal;";
        account1.setSocialSecurityNumber("aslsldkfjal;");


//        System.out.println(account1.getSocialSecurityNumber());
        Account account2 = new Account();
//        account2.name = "James";
        account2.setName("James");
//        account2.accountNumber = "asdfadfrwefr";
        account2.setAccountNumber("asdfadfrwefr");
//        account2.accountType = AccountType.STUDENT;
        account2.setAccountType(AccountType.STUDENT);
//        account2.accountBalance = 220000;
        account2.setAccountBalance(220000);
//        account2.socialSecurityNumber = "iyutyu";
        account2.setSocialSecurityNumber("iyutyu;");

        account1.transferBalance(account1, account2, 100);


    }
}
