package dp.observer;

public class HuYaoXiaoHongNiangSubject extends AbstractCartoonSubject {

	@Override
	public String getUpdateInfo() {
		return "["+geCartoonName()+"]更新啦,点击链接观看.http://www.hyxhn.com";
	}

	@Override
	public String geCartoonName() {
		return "狐妖小红娘";
	}
}
