package org.redhat.service;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * 
 * @author Romain Pelisse - <belaran@redhat.com>
 *
 */
public class WeldSeLogIssue {	

	public static void main(String[] args) {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "ERROR");
		
		WeldContainer weld = new Weld().initialize();
		MyBean myBean = weld.instance().select(MyBean.class).get();
		System.out.println(myBean.toString());
	}
}