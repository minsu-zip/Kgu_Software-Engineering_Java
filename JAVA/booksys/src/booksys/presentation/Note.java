package booksys.presentation;

import java.awt.*;  
import javax.swing.*;  
import javax.swing.filechooser.*;  
import javax.swing.text.StyledEditorKit;  
import java.awt.event.*;  
import java.io.*;  
  
public class Note extends JFrame  
{  
 // ���� ����  
 JTextArea text;  
 Container pane;  
 JMenuBar nb = new JMenuBar();  
 JMenu file, help;  
 JMenuItem newI,openI,saveI,infoI,helpI;  
 JFileChooser open = new JFileChooser();//���� �� ���丮 ���� ������Ʈ ����  
   
   
 public Note()  
 {  
  super("MemoNote"); // �θ�Ŭ���� ������ ȣ��  
  pane=getContentPane(); //JFrame �������� ���� ������ ���� ����  
  pane.setLayout(new BorderLayout()); //JFrame ����  
  setJMenuBar(nb); // �޴��� ����  
   
  // �޴� �� �޴� ������ ����  
  file = new JMenu("파일(F)");  

    
  //Ű���� �����ȣ ����  
  file.setMnemonic('F');  

    
  //���� �޴� ���� ����  
  newI = new JMenuItem("새문서");  
  openI = new JMenuItem("열기");  
  saveI = new JMenuItem("저장");  

  
  // �޴� ����Ű�� ���� ����  
    newI.setAccelerator(KeyStroke.getKeyStroke('N',Event.CTRL_MASK));  // Ctrl + N  
    openI.setAccelerator(KeyStroke.getKeyStroke('O',Event.CTRL_MASK)); // Ctrl + O  
    saveI.setAccelerator(KeyStroke.getKeyStroke('S',Event.CTRL_MASK)); // Ctrl + S  
  
 
  // �޴��� ���� ����  
  file.add(newI);  
  file.add(openI);  
  file.add(saveI);  

 
    
  // �޴� �ϼ�  
  nb.add(file);   
   
  // �޴����� ������ Ŭ�������� �̺�Ʈ ó��  
  newI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    text.setText(""); // text������ ��� �����  
   }  
  });  
   
  // �޴����� ���� Ŭ�������� �̺�Ʈ ó��  
  openI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showOpenDialog(Note.this); //���Ͽ��� ���̾�α�â�� ����  
    if (re==JFileChooser.APPROVE_OPTION)     //���� ���� Ȯ��  
    {  
     String fN;  
     String dir;  
     String str;  
      
     File file_open = open.getSelectedFile(); // ������ ���ϸ��� �����´�  
     
     FileInputStream fis;   //���� �ý����� ���� �Է� ����Ʈ ��� ��Ʈ�� ����  
     ByteArrayOutputStream bo;  //������ ����Ʈ �迭�� ���������� ��� ��Ʈ�� ����  
      try  
      {  
       fis = new FileInputStream(file_open); // FileInputStream��ü�� ����  
       bo = new ByteArrayOutputStream();     // ByteArrayOutputStream��ü�� ����  
       int i = 0;  
       while ((i = fis.read()) != -1) // ������ ���������� �о�帲  
       {  
        bo.write(i);                  //len ����Ʈ�� ����Ʈ �迭 ��� Stream�� ����  
       }  
        text.setText(bo.toString()); // ȭ�鿡 �ѷ��ش�  
       fis.close();                 // FileInputStream�� �ݴ´�.                  
       bo.close();                  // ByteArrayOutputStreamm�� �ݴ´�.  
      }  
      catch(FileNotFoundException fe)  
      {}  
      catch(IOException ie)  
      {}  
    }  
   }  
  });  
   
  //�޴����� ���� Ŭ�������� �̺�Ʈ ó��  
  saveI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showSaveDialog(Note.this);  
    if (re==JFileChooser.APPROVE_OPTION) // �������� ���̾�α׸� ����  
    {  
     File file_open = open.getSelectedFile(); // ������ ���ϸ��� �����´�  
   
     try  
     {  
     PrintWriter pw   = new PrintWriter(new BufferedWriter(new FileWriter(file_open))); // PrintWriter��ü�� �����ؼ�  
     pw.write(text.getText()); // ȭ���� ������ ���Ͽ� ����  
     pw.close();  
     }  
       
     catch(FileNotFoundException ie2)  
        {}  
     catch(IOException ie)  
        {}  
    }  
   }  
  });  
   


  text = new JTextArea();  
  // ȭ�鿡 ������ text���� ���¿� ���� ���� ����  
  text.setCaretColor(Color.black);   
  text.setSelectedTextColor(Color.white);  
  text.setSelectionColor(Color.blue);  
  text.setBackground(Color.white);  
   
  pane.add(new JScrollPane(text));  
  
 }  
   
 public static void main(String[] args)  
 {  
  Note note = new Note(); // ��ü����  
  note.setSize(400,300); // ������ ����  
  note.setVisible(true); // ȭ�鿡 ���̰� ��  
 }  
}  