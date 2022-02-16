package dp.observer;

/**
 * Observer - 观察者模式
 * 当观察对象的状态发生变化时通知观察者
 * 
 * 本例场景说明 : 在动漫网站追番,当被我订阅的动漫更新时通知我
 *
 */
public class Test {

	public static void main(String[] args) {

		//观察者
		ICartoonSubscriber wxk = new WXKSubscriber();
		ICartoonSubscriber jbc = new JBCSubscriber();
		//观察对象
		AbstractCartoonSubject hyxhnSubject = new HuYaoXiaoHongNiangSubject();
		hyxhnSubject.addSubscriber(wxk);
		hyxhnSubject.addSubscriber(jbc);
		AbstractCartoonSubject qzgsSubject = new QuanZhiGaoShouSubject();
		qzgsSubject.addSubscriber(wxk);
		
		hyxhnSubject.notifiy();
		qzgsSubject.notifiy();
	}
	
}
