/**
 * 
 */
package oracle.mcgillin;

import java.text.MessageFormat;

/**
 * @author bamcgill
 *
 */
public class Sample2 {
	
	public boolean helloworld(boolean flag) {
		if (flag) {
			System.out.println(MessageFormat.format("Hello, World{0}", "!"));
		} else {
			System.out.println(MessageFormat.format("Hello, World{0}", "...Again!!"));
		}
		flag=!flag;
		return flag;
	}

}
