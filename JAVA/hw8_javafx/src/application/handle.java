package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class handle {
	@FXML
	private TextField f; //textfield�� ���� �������� ���� ����
	@FXML
	private TextField c;
	@SuppressWarnings("exports")
	// Raise ��ư Ŭ���� ����
	public void Raise1(ActionEvent event) throws Exception {
		//ȭ���µ�
		float Fahrenheit = Float.valueOf(c.getText());
		//�����µ�
		float Celsius = Float.valueOf(c.getText());
		
		//���� -> ȭ�� ���
		Fahrenheit = (++Fahrenheit * 9/5)+32;
		f.setText(String.valueOf(Fahrenheit));
		//���� ���
		Celsius+=1;
		
		c.setText(String.valueOf(Celsius));
		
	}
	// Lower��ư Ŭ���� ����
	public void Lower1(ActionEvent event) throws Exception {
		//ȭ���µ�
		float Fahrenheit1 = Float.valueOf(c.getText());
		//�����µ�
		float Celsius1 = Float.valueOf(c.getText());
		//���� -> ȭ�� ���
		Fahrenheit1 = (--Fahrenheit1 * 9/5)+32;
		f.setText(String.valueOf(Fahrenheit1));
		//���� ���
		Celsius1-=1;
		c.setText(String.valueOf(Celsius1));

	}

}
