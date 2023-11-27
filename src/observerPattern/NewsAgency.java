package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private List<SubscriberObserver> subscribers = new ArrayList<>();

    @Override
    public void subscribe(SubscriberObserver subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(SubscriberObserver subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(String news) {
        for (SubscriberObserver subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    @Override
    public void publish(String news) {
        notify(news);
    }
}

