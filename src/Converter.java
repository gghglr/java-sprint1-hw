public class Converter {

    int convertToKm(int steps){
        int km = (int) (steps * 0.75 / 1000);
        return km;
    }
    int convertStepsToKilocalories(int steps){
        int kil = steps * 50 / 1000;
        return kil;
    }

}
