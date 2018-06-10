package dp.observer;

public class WXKSubscriber implements ICartoonSubscriber{

	@Override
	public void update(AbstractCartoonSubject abstractCartoonSubject) {
		System.out.println(getSubscriberName()+" 收到 "+abstractCartoonSubject.getUpdateInfo());
	}

	@Override
	public String getSubscriberName() {
		return "武雪凯";
	}

}
