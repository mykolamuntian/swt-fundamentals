package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.calculator.App;

public class CalcPanel extends Composite {

    private static final int TOP_INDENTATION = 380;

    public CalcPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        GridLayout gridLayout = new GridLayout(1, false);
        int space = (this.getShell().getSize().y - TOP_INDENTATION) / 3;
        gridLayout.verticalSpacing = space;
        setLayout(gridLayout);
        setBackground(App.BACKGROUND_COLOR);

        OperationPanel operationPanel = new OperationPanel(this, SWT.NONE);
        operationPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        operationPanel.createUI();

        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        CalcModePanel calcModePanel = new CalcModePanel(this, SWT.NONE);
        calcModePanel.setLayoutData(gridData);
        calcModePanel.createUI();

        ResultPanel resultPanel = new ResultPanel(this, SWT.NONE);
        resultPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        resultPanel.createUI();
    }

}
