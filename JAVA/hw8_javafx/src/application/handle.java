package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class handle {
	@FXML
	private TextField f; //textfieldÀÇ °ªÀ» °¡Á®¿À±â À§ÇØ ¼±¾ð
	@FXML
	private TextField c;
	@SuppressWarnings("exports")
	// Raise ¹öÆ° Å¬¸¯½Ã ½ÇÇà
	public void Raise1(ActionEvent event) throws Exception {
		//È­¾¾¿Âµµ
		float Fahrenheit = Float.valueOf(c.getText());
		//¼·¾¾¿Âµµ
		float Celsius = Float.valueOf(c.getText());
		
		//¼·¾¾ -> È­¾¾ °è»ê
		Fahrenheit = (++Fahrenheit * 9/5)+32;
		f.setText(String.valueOf(Fahrenheit));
		//¼·¾¾ °è»ê
		Celsius+=1;
		
		c.setText(String.valueOf(Celsius));
		
	}
	// Lower¹öÆ° Å¬¸¯½Ã ½ÇÇà
	public void Lower1(ActionEvent event) throws Exception {
		//È­¾¾¿Âµµ
		float Fahrenheit1 = Float.valueOf(c.getText());
		//¼·¾¾¿Âµµ
		float Celsius1 = Float.valueOf(c.getText());
		//¼·¾¾ -> È­¾¾ °è»ê
		Fahrenheit1 = (--Fahrenheit1 * 9/5)+32;
		f.setText(String.valueOf(Fahrenheit1));
		//¼·¾¾ °è»ê
		Celsius1-=1;
		c.setText(String.valueOf(Celsius1));

	}

}
