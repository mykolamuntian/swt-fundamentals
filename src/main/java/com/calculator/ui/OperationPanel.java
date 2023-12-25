package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.calculator.App;

public class OperationPanel extends Composite {

    Text firsOperand;
    Combo sign;
    Text  secondOperand;

    public OperationPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        setLayout(gridLayout);
        setBackground(App.BACKGROUND_COLOR);

        firsOperand = new Text(this, SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        firsOperand.setLayoutData(gridData);

        sign = new Combo(this, SWT.BORDER);
        gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        sign.setLayoutData(gridData);

        secondOperand = new Text(this, SWT.BORDER);
        gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        secondOperand.setLayoutData(gridData);
    }

}
