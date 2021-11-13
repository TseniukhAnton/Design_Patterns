package observer;

public class JobSearch {
    public static void main(String[] args) {
        RabotaUaJobsite jobsite = new RabotaUaJobsite();

        jobsite.addVacancy("First job");
        jobsite.addVacancy("Second job");

        Observer firstSubscriber = new Subscriber("Anton");
        Observer secondSubscriber = new Subscriber("Oleg");

        jobsite.addObserver(firstSubscriber);
        jobsite.addObserver(secondSubscriber);

        jobsite.addVacancy("Third job");

        jobsite.removeVacancy("First job");
    }
}
