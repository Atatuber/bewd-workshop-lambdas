package nl.han.bewd.lambdas.reis;

@FunctionalInterface

public interface VervoerStrategy {
    int berekenReistijd(boolean isReisTijdensSpits) ;
}
