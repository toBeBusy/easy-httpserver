package org.eh.core.util;

import org.eh.core.common.Constants;
import org.eh.core.common.ReturnType;
import org.junit.Test;

/**
 *
 * @author guojing
 * @date 2014-3-4
 */
public class PropertyUtilTest {

	@Test
	public void testResd() {
		PropertyUtil.analysisProperties(Constants.CLASS_PATH
				+ "web.properties");
	}

	@Test
	public void testReflect() {
		System.out.println(ReturnType.redirect.name());
	}
}
