/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

package booksys.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import booksys.application.domain.BookingSystem;
import booksys.application.domain.Check;

public class BookingSystemApp extends Frame {
	private StaffUI ui;

	public BookingSystemApp() {
		setTitle("Restaurant Booking System");   
		setResizable(true);
		setMenuBar(new MenuBar());

		Menu fileMenu = new Menu("File");
		getMenuBar().add(fileMenu);

		MenuItem quit = new MenuItem("Quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(quit);

//     파일저장기능
		MenuItem save = new MenuItem("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Toolkit toolkit = Toolkit.getDefaultToolkit();

					Dimension screenSize = toolkit.getScreenSize();

					Rectangle rectangle = new Rectangle(0, 0, screenSize.width, screenSize.height);

					Robot robot = new Robot();

					BufferedImage bi = robot.createScreenCapture(rectangle);

					ImageIO.write(bi, "jpg", new File("d:/screenshot.jpg"));

				} catch (IOException ioe) {

					ioe.printStackTrace();

				} catch (Exception s) {

					s.printStackTrace();

				}
			}
		});
		fileMenu.add(save);

		
		
		
		Menu dateMenu = new Menu("Date");
		getMenuBar().add(dateMenu);

		MenuItem display = new MenuItem("Display...");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.displayDate();
			}
		});
		dateMenu.add(display);
		
		Menu bookingMenu = new Menu("Booking");
		getMenuBar().add(bookingMenu);

		MenuItem newReservation = new MenuItem("New Reservation...");
		newReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.addReservation();
			}
		});
		bookingMenu.add(newReservation);

		MenuItem newWalkIn = new MenuItem("New Walk-in...");
		newWalkIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.addWalkIn();
			}
		});
		bookingMenu.add(newWalkIn);

		MenuItem cancel = new MenuItem("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.cancel();
			}
		});
		bookingMenu.add(cancel);

		MenuItem recordArrival = new MenuItem("Record Arrival");
		recordArrival.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.recordArrival();
			}
		});
		bookingMenu.add(recordArrival);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
//		�޸���
		Menu memo = new Menu("Memo");
		getMenuBar().add(memo);
		
		MenuItem memodisplay = new MenuItem("Memo");
		memodisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Note.main(null);
			}
		});
		memo.add(memodisplay);
		
	
		if(Check.check == true) {
			Menu team = new Menu("Team");
			getMenuBar().add(team);
			
			MenuItem teamdisplay = new MenuItem("List");
			teamdisplay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					TeamviewDialog.main(null);
				}
			});
			team.add(teamdisplay);
		}
		
		
		
		ui = new StaffUI(this);
	
		this.add(ui);
	
		this.pack();
		this.show();
	}

	public static void main(String args[]) {
//		new BookingSystemApp();
	}
}
