/* 2013/6/19 */
package com.hashcalculator.ui;

import java.util.EventListener;

public interface BackgroundStartListener extends EventListener {
	void start(BackgroundStartEvent e) throws Throwable;
}
