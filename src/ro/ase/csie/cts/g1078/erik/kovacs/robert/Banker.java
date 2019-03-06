package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import ro.ase.csie.cts.g1078.erik.kovacs.robert.enums.BankAccountType;

public class Banker {
    private static Banker self = null;
    private static int nextid = 0;

    private Banker(){
    }

    public static Banker getBanker(){
        return self == null ? new Banker() : self;
    }

    public BankAccount openAccount(BankAccountType bankAccountType){
        Banker.nextid++;
        String iban = Utility.getRandomString(Banker.nextid);
        return bankAccountType == BankAccountType.CurrentAccount ? new CurrentAccount(iban) : new SavingsAccount(iban);
    }
}
