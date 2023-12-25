package com.calculator.ui;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class StatusBar extends Composite{

    public StatusBar(Composite parent, int style) {
        super(parent, style);
    }
    
    public void createUI() {
        setLayout(new GridLayout());
        
        Label statusBar = new Label(this, SWT.NONE);
        GridData gridData = new GridData(SWT.END, SWT.BOTTOM, true, true);
        statusBar.setLayoutData(gridData);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        statusBar.setText(currentDate);
    }

}
