package br.com.geekuniversity.section13;

public abstract class Training {
    public final void dailyWorkout() {
        physicalPreparation();
        trainingGame();
        tacticalTraining();
    }

    public abstract void physicalPreparation();
    public abstract void trainingGame();
    public final void tacticalTraining() {
        System.out.println("Tactical training ...");
    }
}
