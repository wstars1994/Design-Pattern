package dp.observer;
/**
 * 观察者模式
 * 根据对象状态进行相应的处理
 *上午7:52:56
 */
public interface ICartoonSubscriber {

	public String getSubscriberName();
	public void update(AbstractCartoonSubject abstractCartoonSubject);
	
}
