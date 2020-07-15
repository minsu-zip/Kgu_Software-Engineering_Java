package booksys.presentation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import booksys.application.domain.Login;
import booksys.application.domain.Check;
public class LoginDialog extends JFrame implements ActionListener {
 
 public String id = "";
 public String password = "";
 
 
 
 
 
 private JTextField tf;
 private JPasswordField pf;
 private JButton login;
 private JButton user;
 JLabel loginText = new JLabel();
 private boolean isLogin = false;

 public LoginDialog() {
  JPanel idPanel = new JPanel();
  JPanel passPanel = new JPanel();
  tf = new JTextField(12);
  pf = new JPasswordField(10);
  loginText.setForeground(Color.RED);
  
  JLabel idLabel = new JLabel("ID : ");
  JLabel passLabel = new JLabel("PASSWORD : ");
  login = new JButton("LOGIN");
  login.addActionListener(this);
  
  idPanel.add(idLabel);
  idPanel.add(tf);

  passPanel.add(passLabel);
  passPanel.add(pf);

  //일반사용자
  user = new JButton("일반사용자");
  user.addActionListener(this);
  
  this.add(idPanel);
  this.add(passPanel);
  this.add(login);
  this.add(loginText);
  this.add(user);
  
  
  setLayout(new FlowLayout());

  setTitle("LOGIN");
  setSize(400, 200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  setVisible(true);
 }
 

 @Override
 public void actionPerformed(ActionEvent e) {
  // TODO Auto-generated method stub
  if (e.getSource() == login) {
	  
	 
	  Login c = new Login();
	  
	  boolean abc = c.Login(tf.getText(),pf.getText());
	  
	  if(abc == true) {
		  loginText.setText("로그인이 되었습니다.");
		  Check.check = true;
		  BookingSystemApp app = new BookingSystemApp();
		  dispose();
	  }
	  else {
		  loginText.setText("ID 또는 password가 틀립니다.");
	  }

  }
  
  if (e.getSource() == user ) {
	  
	  Check.check = false;
	  BookingSystemApp app2 = new BookingSystemApp();
	  dispose();
	  
  }
  
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 LoginDialog my = new LoginDialog();
 }
} 
