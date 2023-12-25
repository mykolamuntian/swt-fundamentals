package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.calculator.App;

public class MainPanel extends Composite {

    public MainPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        setLayout(new FillLayout());

        CTabFolder tabFolder = new CTabFolder(this, SWT.NONE);
        tabFolder.setBackground(App.BACKGROUND_COLOR);
        tabFolder.setSelectionBackground(App.ALTERNATE_BACKGROUND);

        CTabItem calcTabItem = new CTabItem(tabFolder, SWT.NONE);
        calcTabItem.setText("Calculation");

        CalcPanel calcPanel = new CalcPanel(tabFolder, SWT.NONE);
        calcPanel.createUI();
        calcTabItem.setControl(calcPanel);

        HistoryPanel historyPanel = new HistoryPanel(tabFolder, SWT.BORDER);
        CTabItem historyTabItem = new CTabItem(tabFolder, SWT.NONE);
        historyTabItem.setText("History");
        historyPanel.createUI();
        historyTabItem.setControl(historyPanel);
    }

}
