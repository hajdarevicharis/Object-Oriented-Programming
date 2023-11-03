package Lab05.Classes;

public class CivilService implements NationalService {
    int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(this.daysLeft > 0) {
            this.daysLeft--;
        } else {
            System.out.println("cannot go under 0");
        }
    }
}
