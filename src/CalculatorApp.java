import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class CalculatorApp {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CalculatorApp window = new CalculatorApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(150, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		double answer = 0;
		
		Label line_3 = new Label(shell, SWT.NONE);
		line_3.setBounds(10, 10, 118, 15);
		
		Label line_2 = new Label(shell, SWT.NONE);
		line_2.setBounds(10, 31, 118, 15);
		
		Label line_1 = new Label(shell, SWT.NONE);
		line_1.setBounds(10, 52, 118, 15);
		
		Label line_0 = new Label(shell, SWT.NONE);
		line_0.setBounds(10, 73, 118, 15);
		
		Button decimal_sign = new Button(shell, SWT.NONE);
		decimal_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		decimal_sign.setText(".");
		decimal_sign.setBounds(72, 224, 25, 25);
		
		Button num_1 = new Button(shell, SWT.NONE);
		num_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_1.setText("1");
		num_1.setBounds(10, 193, 25, 25);
		
		Button num_2 = new Button(shell, SWT.NONE);
		num_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_2.setText("2");
		num_2.setBounds(41, 193, 25, 25);
		
		Button num_3 = new Button(shell, SWT.NONE);
		num_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_3.setText("3");
		num_3.setBounds(72, 193, 25, 25);
		
		Button num_4 = new Button(shell, SWT.NONE);
		num_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_4.setText("4");
		num_4.setBounds(10, 162, 25, 25);
		
		Button num_5 = new Button(shell, SWT.NONE);
		num_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_5.setText("5");
		num_5.setBounds(41, 162, 25, 25);
		
		Button num_6 = new Button(shell, SWT.NONE);
		num_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_6.setText("6");
		num_6.setBounds(72, 162, 25, 25);
		
		Button num_7 = new Button(shell, SWT.NONE);
		num_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_7.setBounds(10, 131, 25, 25);
		num_7.setText("7");
		
		Button num_8 = new Button(shell, SWT.NONE);
		num_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_8.setText("8");
		num_8.setBounds(41, 131, 25, 25);
		
		Button num_9 = new Button(shell, SWT.NONE);
		num_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_9.setText("9");
		num_9.setBounds(72, 131, 25, 25);
		
		Button num_0 = new Button(shell, SWT.NONE);
		num_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		num_0.setText("0");
		num_0.setBounds(10, 224, 56, 25);
		
		Button minus_sign = new Button(shell, SWT.NONE);
		minus_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		minus_sign.setText("-");
		minus_sign.setBounds(103, 101, 25, 25);
		
		Button plus_sign = new Button(shell, SWT.NONE);
		plus_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		plus_sign.setText("+");
		plus_sign.setBounds(103, 132, 25, 55);
		
		Button multiply_sign = new Button(shell, SWT.NONE);
		multiply_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		multiply_sign.setText("*");
		multiply_sign.setBounds(72, 101, 25, 25);
		
		Button division_sign = new Button(shell, SWT.NONE);
		division_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		division_sign.setText("/");
		division_sign.setBounds(41, 101, 25, 25);
		
		Button equal_sign = new Button(shell, SWT.NONE);
		equal_sign.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		equal_sign.setText("=");
		equal_sign.setBounds(103, 193, 25, 56);
		
		Button clear = new Button(shell, SWT.NONE);
		clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
			}
			
			
		});
		clear.setText("C");
		clear.setBounds(10, 101, 25, 25);
		

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public void update(String temp, Label line_0, Label line_1, Label line_2, Label line_3) {
		
		return;
	}
}
