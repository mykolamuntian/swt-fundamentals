package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class HistoryPanel extends Composite {

    public HistoryPanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        FillLayout fillLayout = new FillLayout(SWT.VERTICAL);
        setLayout(fillLayout);

        Text resultList = new Text(this, SWT.MULTI | SWT.BORDER | SWT.WRAP);
        Button clear = new Button(this, SWT.PUSH);
        clear.setText("Clear");
        clear.setLayoutData(new GridData(SWT.END));

    }
}
