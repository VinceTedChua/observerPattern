package observerPattern;


public interface NewsAgencySubject {

    //Within the Subsciber observer it calls the parameters of
    //both subscribers and observer to maintain track of who to send out news.
    public void subscribe(SubscriberObserver subscriber);
    public void unsubscribe(SubscriberObserver subscriber);
    public void notify(String news);
    public void publish (String news);
}
