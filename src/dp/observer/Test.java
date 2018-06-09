package dp.observer;

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
