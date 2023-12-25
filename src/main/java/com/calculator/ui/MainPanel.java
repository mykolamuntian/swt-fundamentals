package com.calculator.ui;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MainPanel extends Composite {

	public MainPanel(Composite parent, int style) {
		super(parent, style);
	}

	public void createUI() {
		setLayout(new FillLayout());
		
		CTabFolder cTabFolder = new CTabFolder(this, SWT.NONE);
		cTabFolder.setSimple(true);
		
		CTabItem calcTabItem = new CTabItem(cTabFolder, SWT.NONE);
		calcTabItem.setText("Calculation");
		
		CalcPanel calcPanel = new CalcPanel(cTabFolder, SWT.NONE);
		calcPanel.createUI();
		calcTabItem.setControl(calcPanel);
		
		HistoryPanel historyPanel = new HistoryPanel(cTabFolder, SWT.BORDER);
		CTabItem historyTabItem = new CTabItem(cTabFolder, SWT.NONE);
		historyTabItem.setText("History");
		historyPanel.createUI();
		historyTabItem.setControl(historyPanel);
		
		Label statusBar = new Label(cTabFolder, SWT.BORDER);
		statusBar.setLayoutData(new GridData(SWT.BOTTOM, SWT.BOTTOM, true, false));
//		statusBar.setLayoutData(statusBar);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        statusBar.setText(currentDate);
	}

	
}
