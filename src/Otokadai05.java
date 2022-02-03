import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author t.yoshizawa
 *
 */
public class Otokadai05  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		while(true) {
			oto1.lightGreen();
			oto2.lightOff();
			oto1.sleep();
			oto2.sleep();
			oto1.lightYellow();
			oto1.sleep();
			oto2.sleep();
			oto1.lightRed();
			oto1.sleep();
			oto2.sleep();
			oto1.lightOff();
			oto2.lightGreen();
			oto1.sleep();
			oto2.sleep();
			oto2.lightYellow();
			oto1.sleep();
			oto2.sleep();
			oto2.lightRed();
			oto1.sleep();
			oto2.sleep();
		}

	}

}
