package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class CalcPanel extends Composite {

    private static final int TOP_INDENTATION = 370;

    public CalcPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        GridLayout gridLayout = new GridLayout(1, false);
        int space = (this.getShell().getSize().y - TOP_INDENTATION) / 3;
        gridLayout.verticalSpacing = space;
        setLayout(gridLayout);

        OperationPanel operationPanel = new OperationPanel(this, SWT.NONE);
        operationPanel.createUI();
        operationPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        CalcModePanel calcModePanel = new CalcModePanel(this, SWT.NONE);
        calcModePanel.setLayoutData(gridData);
        calcModePanel.createUI();

        ResultPanel resultPanel = new ResultPanel(this, SWT.NONE);
        resultPanel.createUI();
        resultPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
    }

}
