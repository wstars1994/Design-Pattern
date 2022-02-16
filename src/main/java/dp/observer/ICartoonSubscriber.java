package dp.observer;

public interface ICartoonSubscriber {

	public String getSubscriberName();
	public void update(AbstractCartoonSubject abstractCartoonSubject);
	
}
