/**
 * 
 */

/**
 * @author ronal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraficLight b = new TraficLight ();
		System.out.println(b.isGreen());
		System.out.println(b.isRed());
		System.out.println(b.pass());
		System.out.println(b.stop());
		b.changeColor();
		System.out.println(b.isYellow());
		System.out.println(b.pass());
		b.changeColor();
		System.out.println(b.isGreen());
		System.out.println(b.isYellow());
		System.out.println(b.pass());
		b.changeColor();
		System.out.println(b.pass());
		}
	}


