package com.demo.ijfinal.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener initialized ...");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listener destroyed ...");
	}

}
