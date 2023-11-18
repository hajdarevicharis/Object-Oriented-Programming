package Lab06.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> peopleLoans = new HashMap<>();
    double value;
    public PromissoryNote() {};

    public void setLoan(String toWhom, double value) {
        peopleLoans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (peopleLoans.containsKey(whose)) {
            return peopleLoans.get(whose);
        }
        return 0;
    }


}
