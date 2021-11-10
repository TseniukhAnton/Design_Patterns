package facade;

public class Workflow {
    Fisher fisher = new Fisher();
    Fishing fishing = new Fishing();
    FishCounter fishCounter = new FishCounter();

    public void solveProblem(){
        fishing.catchFish();
        fishCounter.startSeason();
        fisher.catchFishBeforeSeasonFinish(fishCounter);
    }
}
