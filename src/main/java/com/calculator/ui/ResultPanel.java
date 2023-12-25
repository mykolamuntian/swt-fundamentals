package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ResultPanel extends Composite {

    public ResultPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        setLayout(gridLayout);
        setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        Label resultLabel = new Label(this, SWT.NONE);
        resultLabel.setText("Result");
        GridData gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        resultLabel.setLayoutData(gridData);

        Text resultText = new Text(this, SWT.BORDER);
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalSpan = 2;
        resultText.setLayoutData(gridData);

    }
}
