import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JPA02Test {
	@Test
	void test() {
		JPA02 main = new JPA02();
		String tmp = main.test(3, 4, 5);
		assertEquals("ª½¨¤¤T¨¤§Î",tmp);
	}

}
