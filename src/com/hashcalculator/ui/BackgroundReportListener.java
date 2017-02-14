/* 2013/6/19 */
package com.hashcalculator.ui;

import java.util.EventListener;

public interface BackgroundReportListener extends EventListener {
	void report(BackgroundReportEvent e);
}
