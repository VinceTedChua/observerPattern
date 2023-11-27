package observerPattern;

public class NewsSubscriber {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        // John is also notified
        SubscriberObserver John = new Subscriber("John");
        newsAgency.subscribe(John);

        // Jane is initialized as the new subscriber
        SubscriberObserver Jane = new Subscriber("Jane");
        newsAgency.subscribe(Jane);

        // Juan is initialized as the new subscriber.....
        SubscriberObserver Juan = new Subscriber("Juan");
        newsAgency.subscribe(Juan);

        // The news will be published to John and Jane
        newsAgency.publish("Breaking News: Covid-19 Pandemic!");

        // Unsubscribe John
        newsAgency.unsubscribe(John);

        // Timothy is initialized as the new subscriber
        SubscriberObserver Timothy = new Subscriber("Timothy");
        newsAgency.subscribe(Timothy);

        // The news will be published to Jane, Juan, and Timothy (without John)
        newsAgency.publish("Coming up!: Vaccination Boosters-");
    }
}

