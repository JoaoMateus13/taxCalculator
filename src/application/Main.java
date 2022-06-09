package application;

import entites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<person> people = new ArrayList<>();

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Tax payer" + "#" + (i+1)  + "data:");
            System.out.print("Individual or company (i/c)");
            char op = sc.next().charAt(0);
            if (op == 'i'){
                System.out.print("name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();
                people.add(new naturalPerson(name, annualIncome, healthSpending));
            }else {
                System.out.print("name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployee = sc.nextInt();
                people.add(new legalPerson(name, annualIncome, numberEmployee));
            }
        }

        for (person People: people){
            System.out.println(People.toString());
        }
    }
}
