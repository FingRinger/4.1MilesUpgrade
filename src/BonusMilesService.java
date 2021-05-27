public class BonusMilesService {
    public int calculate(int cost){
        int amountOfRublesForOneMile = 20;
        int miles = cost / amountOfRublesForOneMile;

        return miles;
    }
}
