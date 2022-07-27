class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    public String toString(){
        return amount + " " + currency;
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return new Money(this.amount * multiplier, currency);
    }
}
