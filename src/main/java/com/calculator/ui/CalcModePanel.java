package com.calculator.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.calculator.App;

public class CalcModePanel extends Composite {

    public CalcModePanel(Composite parent, int style) {
        super(parent, style);
    }

    public void createUI() {
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        setLayout(gridLayout);
        setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        setBackground(App.BACKGROUND_COLOR);

        Button onFlyModeCheck = new Button(this, SWT.CHECK);
        onFlyModeCheck.setText("On Fly Mode");
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        gridData.horizontalAlignment = SWT.BEGINNING;
        gridData.horizontalSpan = 2;
        onFlyModeCheck.setLayoutData(gridData);
        onFlyModeCheck.setBackground(App.BACKGROUND_COLOR);

        Button calcBtn = new Button(this, SWT.PUSH);
        calcBtn.setText("Calculate");
        gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        gridData.horizontalAlignment = SWT.END;
        calcBtn.setLayoutData(gridData);
        calcBtn.setBackground(App.ALTERNATE_BACKGROUND);
    }

}
