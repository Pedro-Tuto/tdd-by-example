package guru.springframework;

public class Sum implements Expression{
    Money augmend;
    Money addnend;

    public Sum(Money augmend, Money addnend) {
        this.augmend = augmend;
        this.addnend = addnend;
    }

    public Money reduce(String to){
        int amount = augmend.amount + addnend.amount;
        return new Money(amount, to);
    }
}
