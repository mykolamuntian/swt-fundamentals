package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

/**
* Example class for creating status bar in SWT
* Author: psupawa@gmail.com
* Date: 04-May-2009
*/
public class StatusBar {

  public static void main(String[] args) {
    new StatusBar();
  }
 
  private Display display = new Display();
  private Shell shell = new Shell(display);
  private Group statusBarGroup, bodyGroup;
  private Label dateLabel;
  private Label statusLabel;
  private SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
  private FormResizeListener listener;
 
  public StatusBar() {
    shell.setText("Status Bar");
    FormLayout layout = new FormLayout();
    shell.setLayout(layout);
    createBodyGroup();
    createStatusBarGroup();
    listener = new FormResizeListener(shell, bodyGroup, statusBarGroup, statusLabel);
    shell.addListener(SWT.Resize, listener);
    Runnable timer = new Runnable() {
      public void run() {
        dateLabel.setText(" "+sdf.format(new Date())+" ");
        display.timerExec(1000, this);
      }
    };
    display.timerExec(1000, timer);
   
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }
    display.dispose();
     
  }
 
  public void createBodyGroup() {
    bodyGroup = new Group(shell, SWT.NONE);
    bodyGroup.setText("Body");
  }
 
  public void createStatusBarGroup() {
    statusBarGroup = new Group(shell, SWT.NONE);
    statusBarGroup.setEnabled(false);
    dateLabel = new Label(statusBarGroup, SWT.BORDER);
    dateLabel.setText(" "+sdf.format(new Date())+" ");
    dateLabel.setBounds(2, 8, 120, 16);
    statusLabel = new Label(statusBarGroup, SWT.BORDER);
    statusLabel.setText(" Here is a status message ");
  }
 
  public class FormResizeListener implements Listener {
    private Shell shell;
    private Group bodyGroup;
    private Group statusGroup;
    private Label label;
    private FormData statusBarData;
    private FormData bodyData;
   
    public FormResizeListener(Shell shell, Group bodyGroup, Group statusGroup, Label label) {
      this.shell = shell;
      this.bodyGroup = bodyGroup;
      this.statusGroup = statusGroup;
      this.label = label;
    }
   
    public void handleEvent(Event event) {
      bodyData = new FormData();
      bodyData.left = new FormAttachment(0);
      bodyData.right = new FormAttachment(100);
      bodyData.height = shell.getBounds().height - 65;
      bodyGroup.setLayoutData(bodyData);
     
      statusBarData = new FormData();
      statusBarData.left = new FormAttachment(0);
      statusBarData.right = new FormAttachment(100);
      statusBarData.bottom = new FormAttachment(100);
      statusBarData.height = 10;
      statusGroup.setLayoutData(statusBarData);
     
      label.setBounds(122, 8, shell.getBounds().width - 132, 16);
    }
  }   
}
