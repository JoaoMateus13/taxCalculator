package entites;

public abstract class  person {
    private String name;
    private Double annualIncome;

    public person() {
    }

    public person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double calculator();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + ": " + calculator());

        return sb.toString();
    }
}
