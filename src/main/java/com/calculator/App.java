package com.calculator;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.calculator.ui.MainPanel;
import com.calculator.ui.StatusBar;

public class App {

    public static final int HIGHT = 450;
    public static final int WIDTH = 400;
    
    public static final Color BACKGROUND_COLOR = new Color(222,102,76);
    public static final Color ALTERNATE_BACKGROUND = new Color(120,143,84);

    public App() {

    }

    public void initApp() {
        Display display = new Display();
        Shell shell = new Shell(display);
        GridLayout mainLayout = new GridLayout(1, false);
        shell.setLayout(mainLayout);
        shell.setText("SWTCalculator");
        
        shell.setBackground(BACKGROUND_COLOR);

        createMainContent(shell);
        createStatusBar(shell);

        shell.setSize(WIDTH, HIGHT);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }

    private void createMainContent(Shell shell) {
        MainPanel mainPanel = new MainPanel(shell, SWT.NONE);
        mainPanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true));
        mainPanel.createUI();
    }

    private void createStatusBar(Shell shell) {
        StatusBar statusBar = new StatusBar(shell, SWT.NONE);
        statusBar.setBackground(ALTERNATE_BACKGROUND);
        statusBar.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, true));
        statusBar.createUI();
    }

}
