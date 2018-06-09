package dp.observer;

public class JBCSubscriber implements ICartoonSubscriber{

	@Override
	public void update(AbstractCartoonSubject abstractCartoonSubject) {
		System.out.println(getSubscriberName()+" 收到 "+abstractCartoonSubject.getUpdateInfo());
	}

	@Override
	public String getSubscriberName() {
		return "贾博成";
	}

}
