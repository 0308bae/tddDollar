abstract class Money {
    abstract Money times(int multiplier);

    protected int amount;
    protected String currency;

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }


    public String currency(){
        return currency;
    }
}
