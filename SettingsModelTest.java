import static org.junit.Assert.*;

import org.junit.Test;

public class SettingsModelTest {

	@Test
	public void testGetWieghtAhad() {
		
    SettingsModel settingsModel = SettingsModel.getInstance();
    
    int value = 100;
    
	settingsModel.setWieghtAhad(value);;
	int actual = settingsModel.getWieghtAhad();
		 		 
    assertEquals(value, actual);
	}

	@Test
	public void testSetWieghtAhad() {
		
	    SettingsModel settingsModel = SettingsModel.getInstance();
	    
	    int value = 40;
	    
		settingsModel.setWieghtAhad(value);;
		int actual = settingsModel.getWieghtAhad();
			 		 
	    assertEquals(value, actual);
	}

	@Test
	public void testGetHeightDalal() {
		
	    SettingsModel settingsModel = SettingsModel.getInstance();
	    
	    int value = 180;
	    
		settingsModel.setHeightDalal(value);
		int actual = settingsModel.getHeightDalal();
			 		 
	    assertEquals(value, actual);
	}

	@Test
	public void testSetHeightDalal() {
		
	    SettingsModel settingsModel = SettingsModel.getInstance();
	    
	    int value = 100;
	    
		settingsModel.setHeightDalal(value);
		int actual = settingsModel.getHeightDalal();
			 		 
	    assertEquals(value, actual);
	}

	@Test
	public void testGetScoreJawaher() {
		
		 SettingsModel settingsModel = SettingsModel.getInstance();
		    
		    int value = 100;
		    
			settingsModel.setScoreJawaher(value);
			int actual = settingsModel.getScoreJawaher();
				 		 
		    assertEquals(value, actual);
	}

	@Test
	public void testSetScoreJawaher() {
		 SettingsModel settingsModel = SettingsModel.getInstance();
		    
		    int value = 40;
		    
			settingsModel.setScoreJawaher(value);
			int actual = settingsModel.getScoreJawaher();
				 		 
		    assertEquals(value, actual);
	}

	@Test
	public void testGetPriceShahed() {
		
		 SettingsModel settingsModel = SettingsModel.getInstance();
		    
		    int value = 200;
		    
			settingsModel.setPriceShahed(value);
			int actual = settingsModel.getPriceShahed();
				 		 
		    assertEquals(value, actual);
	}

	@Test
	public void testSetPriceShahed() {
		 SettingsModel settingsModel = SettingsModel.getInstance();
		    
		    int value = 40;
		    
			settingsModel.setPriceShahed(value);
			int actual = settingsModel.getPriceShahed();
				 		 
		    assertEquals(value, actual);
	}

}
