
public class SettingsController { 
	
	private SettingsModel model;
	private SettingsView view; 
 
	 public SettingsController(SettingsModel m, SettingsView v) {
	  model = m;
	  view = v;
	  initView();
	 } 
	 
	 public void initView() {
	  view.getSettingOneTextfield().setText(Integer.toString(model.getConfig1()));
          view.getSettingAhadTextfield().setText(Integer.toString(model.getWieghtAhad()));
          view.getSettingDalalTextfield().setText(Integer.toString(model.getHeightDalal()));
          view.getSettingJawaherTextfield().setText(Integer.toString(model.getScoreJawaher()));
          view.getSettingShahedTextfield().setText(Integer.toString(model.getPriceShahed()));
	 } 
	 
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
          
          view.getSettingAhadSaveButton().addActionListener(e -> saveSettingAhad());
	  view.getSettingAhadPrintButton().addActionListener(e -> printToConsoleAhad());
          
          view.getSettingDalalSaveButton().addActionListener(e -> saveSettingDalal());
	  view.getSettingDalalPrintButton().addActionListener(e -> printToConsoleDalal());
          
          view.getSettingJawaherSaveButton().addActionListener(e -> saveSettingJawaher());
	  view.getSettingJawaherPrintButton().addActionListener(e -> printToConsoleJawaher());
          
          view.getSettingShahedSaveButton().addActionListener(e -> saveSettingShahed());
	  view.getSettingShahedPrintButton().addActionListener(e -> printToConsoleShahed());
	 } 
	 
	 private void saveSettingOne() {
	  model.setConfig1(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  } 
	 
	 private void printToConsole() {
	  System.out.println(model.getConfig1());
	 } 
         
          private void saveSettingAhad() {
	  model.setWieghtAhad(Integer.parseInt(view.getSettingAhadTextfield().getText()));
	  } 
	 
	 private void printToConsoleAhad() {
	  System.out.println(model.getWieghtAhad());
	 } 
         
         private void saveSettingDalal() {
	  model.setHeightDalal(Integer.parseInt(view.getSettingDalalTextfield().getText()));
	  } 
	 
	 private void printToConsoleDalal() {
	  System.out.println(model.getHeightDalal());
	 }
         
         private void saveSettingJawaher() {
	  model.setScoreJawaher(Integer.parseInt(view.getSettingJawaherTextfield().getText()));
	  } 
	 
	 private void printToConsoleJawaher() {
	  System.out.println(model.getScoreJawaher());
	 }
	 
         
         private void saveSettingShahed() {
	  model.setPriceShahed(Integer.parseInt(view.getSettingShahedTextfield().getText()));
	  } 
	 
	 private void printToConsoleShahed() {
	  System.out.println(model.getPriceShahed());
	 }
	
}