package dp.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractCartoonSubject {

	List<ICartoonSubscriber> subscribers = new ArrayList<>();
	
	public abstract String getUpdateInfo();
	public abstract String geCartoonName();
	
	public void addSubscriber(ICartoonSubscriber subscriber) {
		subscribers.add(subscriber);
		System.out.println("["+subscriber.getSubscriberName()+"] 订阅了 ["+geCartoonName()+"]");
	}
	public void removeSubscriber(ICartoonSubscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notifiy() {
		Iterator<ICartoonSubscriber> iterator = subscribers.iterator();
		while (iterator.hasNext()) {
			ICartoonSubscriber subscriber = (ICartoonSubscriber) iterator.next();
			subscriber.update(this);
		}
	}
}
