package facade;

public class FishCounter {
    private boolean activeSeason;

    public boolean isActiveSeason(){
        return activeSeason;
    }

    public void startSeason(){
        System.out.println("Season is active.");
        activeSeason = true;
    }

    public void finishSeason(){
        System.out.println("Season is not active.");
        activeSeason = false;
    }
}
