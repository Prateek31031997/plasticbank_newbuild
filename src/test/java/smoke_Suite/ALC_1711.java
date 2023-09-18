package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.Data;

public class ALC_1711 {
	
	@Test
		public void run1711() throws IOException {
			Data p= new Data();
			p.runNewman1711();
		}

}
