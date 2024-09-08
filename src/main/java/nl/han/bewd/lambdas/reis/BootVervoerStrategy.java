package nl.han.bewd.lambdas.reis;

public class BootVervoerStrategy implements VervoerStrategy {

    public int berekenReistijd(boolean isReisTijdensSpits) {
        if(isReisTijdensSpits) {
            return 120;
        }
        else {
            return 60;
        }
    }
}
