package facade;

public class Fisher {
    public void catchFishBeforeSeasonFinish(FishCounter fishCounter){
        if (fishCounter.isActiveSeason()){
            System.out.println("Fisher is fishing now...");
        }else {
            System.out.println("Fisher is at the fishing market...");
        }
    }
}
