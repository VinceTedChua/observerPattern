

package observerPattern;

public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String newsAgency) {
        System.out.println(subscriberName + " received news:\n " + newsAgency);
    }
}

