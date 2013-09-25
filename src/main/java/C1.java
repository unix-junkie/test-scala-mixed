/*-
 * $Id$
 */

/**
 * @author Andrew ``Bass'' Shcheglov &lt;mailto:andrewbass@gmail.com&gt;
 */
public final class C1 {
	@SuppressWarnings("static-method")
	public String language() {
		return "Java";
	}

	public static void main(final String args[]) {
		System.out.println("Java calling " + new C2().language());
	}
}
