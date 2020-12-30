package ui;

import data.Account;
import data.SeasonTicket;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class NewClient extends Account implements UserMode {

	private String name;
	private String surname;
	private SeasonTicket ticket;
	private Display display = new Display();
	private Shell shell = new Shell(this.display, SWT.MAX | SWT.TITLE | SWT.CLOSE | SWT.SHELL_TRIM);
	

	public NewClient() {
		
	shell.setBounds(500, 100, 400, 350);
	shell.open();		
	
	Label labelMain = new Label (shell, SWT.NONE);
	labelMain.setText("New Client");
	labelMain.setBounds(145, 75, 250, 20);
		
	Button buyTicket = new Button (shell, SWT.PUSH);
	buyTicket.setText("Buy season ticket");
	buyTicket.setBounds(125, 193, 150, 28);
	buyTicket.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent arg0) {
			buySeasonTicket();
		}
	});
	
	Button showProfile = new Button (shell, SWT.PUSH);
	showProfile.setText("Show profile");
	showProfile.setBounds(125, 193, 150, 28);
	showProfile.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent arg0) {
			showProfile();
		}
	});
	}

	public void setSeasonTicket(SeasonTicket ticket) {
		this.ticket = ticket;
	}

	public SeasonTicket getSeasonTicket() {
		return ticket;
	}

	public SeasonTicket buySeasonTicket() {
		return ticket;
	}

	public void showProfile() {
	}

	@Override
	public void createUI() {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchMode() {
		// TODO Auto-generated method stub

	}

}
