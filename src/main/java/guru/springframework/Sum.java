package guru.springframework;

public class Sum implements Expression{
    Expression augmend;
    Expression addnend;

    public Sum(Expression augmend, Expression addnend) {
        this.augmend = augmend;
        this.addnend = addnend;
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = augmend.reduce(bank, to).amount + addnend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
