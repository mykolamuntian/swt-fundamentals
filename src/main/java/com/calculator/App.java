package com.calculator;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.calculator.ui.MainPanel;

/**
 * Hello world!
 *
 */
public class App 
{

	public static final int HIGHT = 450;
	public static final int WIDTH = 400;

	public App() {
		
	}
	
	public void initApp() {
		Display display = new Display ();
		Shell shell = new Shell(display);
		GridLayout mainLayout = new GridLayout(1, false);
        shell.setLayout(mainLayout);
		shell.setText("SWTCalculator");
		
		createMainContent(shell);
		createStatusBar(shell);
		
		shell.setSize(WIDTH, HIGHT);
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}
	
	private void createMainContent(Shell shell) {
		MainPanel mainPanel = new MainPanel(shell, SWT.NONE);
		mainPanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true));
		mainPanel.createUI();
	}
	
	private void createStatusBar(Shell shell) {
		Label statusBar = new Label(shell, SWT.BORDER);
		GridData gridData = new GridData(SWT.END, SWT.BOTTOM, true, true);
		statusBar.setLayoutData(gridData);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        statusBar.setText(currentDate);
	}
    
}
