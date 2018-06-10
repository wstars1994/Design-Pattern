package dp.observer;

public class QuanZhiGaoShouSubject extends AbstractCartoonSubject {

	@Override
	public String getUpdateInfo() {
		return "["+geCartoonName()+"]更新啦,点击链接观看.http://www.qzgs.com";
	}

	@Override
	public String geCartoonName() {
		return "全职高手";
	}

}
