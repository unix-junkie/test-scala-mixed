/*-
 * $Id$
 */

/**
 * @author Andrew ``Bass'' Shcheglov &lt;mailto:andrewbass@gmail.com&gt;
 */
final class C2 {
	def language(): String = {
		"Scala calling " + new C1().language()
	}
}
