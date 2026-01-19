public record BankAccount(String accountNumber, double balance)
{
    public BankAccount(String accountNumber)
    {
        this(accountNumber, 0.0);
    }
    public BankAccount withInterest(double percentage)
    {
        double newBalance = balance + balance * (percentage / 100.0);
        return new BankAccount(accountNumber, newBalance);
    }
}