package days14;

public interface ILotto {
	
//	public final static int LENGTH = 6;
	int LENGTH = 6;

	// 추상메소드
	public abstract void fillLotto(int [] lotto);
	void dispLotto(int [] lotto);
	void isDuplicateLotto(int [] lotto);
}
