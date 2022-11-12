package br.com.geekuniversity.section13;

public class TrainingEndSeason extends Training{
    @Override
    public void physicalPreparation() {
        System.out.println("End of season fitness.");
    }

    @Override
    public void trainingGame() {
        System.out.println("End of season training game.");
    }
}
