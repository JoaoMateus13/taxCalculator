package entites;

public class legalPerson extends person{

    private Integer numberEmployee;

    public legalPerson() {
    }

    public legalPerson(String name, Double annualIncome, Integer numberEmployee) {
        super(name, annualIncome);
        this.numberEmployee = numberEmployee;
    }

    public Integer getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Integer numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public double calculator() {
        if (getNumberEmployee()>10){
            return getAnnualIncome()*0.14;
        }else
            return getAnnualIncome()*0.16;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
