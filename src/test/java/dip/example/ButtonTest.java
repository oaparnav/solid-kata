package dip.example;

import org.junit.jupiter.api.Test;

public class ButtonTest {
	
	@Test
	public void shouldReturnStateOftheLamp() {
		Device device = new Lamp(); 
		Button button = new Button(device);
		button.toggle();
		button.toggle();
	}
	
}
