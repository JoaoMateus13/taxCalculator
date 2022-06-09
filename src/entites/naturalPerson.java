package entites;

public class naturalPerson extends person{
    private Double healthSpending;

    public naturalPerson() {
    }

    public naturalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }


    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double calculator() {
        if (getAnnualIncome()<20000.0){
            if (getHealthSpending()>0.0){
                return (getAnnualIncome()*0.15)-(getHealthSpending()*0.50);
            }
            else return (getAnnualIncome()*0.15);
        }

        if (getAnnualIncome()>20000.0){
            if (getHealthSpending()>0.0){
                return (getAnnualIncome()*0.25)-(getHealthSpending()*0.50);
            }
            else return (getAnnualIncome()*0.25);
        }

        return 0;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
