import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SettingsView {

    private JFrame frame;

    //Setting One needed View elements
    private JLabel settingOneLabel;
    private JTextField settingOneTextfield;
    private JButton settingOneSaveButton;
    private JButton settingOnePrintButton;

    //Ahad Part
    private JLabel settingAhadLabel;
    private JTextField settingAhadTextfield;
    private JButton settingAhadSaveButton;
    private JButton settingAhadPrintButton;

    //Dalal Part
    private JLabel settingDalalLabel;
    private JTextField settingDalalTextfield;
    private JButton settingDalalSaveButton;
    private JButton settingDalalPrintButton;

    //Jawaher Part
    private JLabel settingJawaherLabel;
    private JTextField settingJawaherTextfield;
    private JButton settingJawaherSaveButton;
    private JButton settingJawaherPrintButton;

    //Shahed Part
    private JLabel settingShahedLabel;
    private JTextField settingShahedTextfield;
    private JButton settingShahedSaveButton;
    private JButton settingShahedPrintButton;

    public SettingsView() {

        frame = new JFrame("Settings");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 230);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Create UI elements
        settingOneLabel = new JLabel("Setting One:");
        settingOneTextfield = new JTextField();
        settingOneSaveButton = new JButton("Save setting one");
        settingOnePrintButton = new JButton("Print to Console!");

        settingAhadLabel = new JLabel("Setting Ahad:");
        settingAhadTextfield = new JTextField();
        settingAhadSaveButton = new JButton("Save setting Ahad");
        settingAhadPrintButton = new JButton("Print to Console!");

        settingDalalLabel = new JLabel("Setting Dalal:");
        settingDalalTextfield = new JTextField();
        settingDalalSaveButton = new JButton("Save setting Dalal");
        settingDalalPrintButton = new JButton("Print to Console!");

        settingJawaherLabel = new JLabel("Setting Jawaher:");
        settingJawaherTextfield = new JTextField();
        settingJawaherSaveButton = new JButton("Save setting Jawaher");
        settingJawaherPrintButton = new JButton("Print to Console!");

        settingShahedLabel = new JLabel("Setting Shahed:");
        settingShahedTextfield = new JTextField();
        settingShahedSaveButton = new JButton("Save setting Shahed");
        settingShahedPrintButton = new JButton("Print to Console!");

        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(settingOneLabel)
                        .addComponent(settingAhadLabel)
                        .addComponent(settingDalalLabel)
                        .addComponent(settingJawaherLabel)
                        .addComponent(settingShahedLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(settingOneTextfield)
                        .addComponent(settingAhadTextfield)
                        .addComponent(settingDalalTextfield)
                        .addComponent(settingJawaherTextfield)
                        .addComponent(settingShahedTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(settingOneSaveButton)
                        .addComponent(settingAhadSaveButton)
                        .addComponent(settingDalalSaveButton)
                        .addComponent(settingJawaherSaveButton)
                        .addComponent(settingShahedSaveButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(settingOnePrintButton)
                        .addComponent(settingAhadPrintButton)
                        .addComponent(settingDalalPrintButton)
                        .addComponent(settingJawaherPrintButton)
                        .addComponent(settingShahedPrintButton))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(settingOneLabel)
                        .addComponent(settingOneTextfield)
                        .addComponent(settingOneSaveButton)
                        .addComponent(settingOnePrintButton))
                //Ahad Part
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(settingAhadLabel)
                        .addComponent(settingAhadTextfield)
                        .addComponent(settingAhadSaveButton)
                        .addComponent(settingAhadPrintButton))
                //Dalal Part
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(settingDalalLabel)
                        .addComponent(settingDalalTextfield)
                        .addComponent(settingDalalSaveButton)
                        .addComponent(settingDalalPrintButton))
                //Jawaher Part
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(settingJawaherLabel)
                        .addComponent(settingJawaherTextfield)
                        .addComponent(settingJawaherSaveButton)
                        .addComponent(settingJawaherPrintButton))
                //Shahed Part
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(settingShahedLabel)
                        .addComponent(settingShahedTextfield)
                        .addComponent(settingShahedSaveButton)
                        .addComponent(settingShahedPrintButton))
        );

        frame.getContentPane().setLayout(layout);

    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getSettingOneLabel() {
        return settingOneLabel;
    }

    public void setSettingOneLabel(JLabel settingOneLabel) {
        this.settingOneLabel = settingOneLabel;
    }

    public JTextField getSettingOneTextfield() {
        return settingOneTextfield;
    }

    public void setSettingOneTextfield(JTextField settingOneTextfield) {
        this.settingOneTextfield = settingOneTextfield;
    }

    public JButton getSettingOneSaveButton() {
        return settingOneSaveButton;
    }

    public void setSettingOneSaveButton(JButton settingOneSaveButton) {
        this.settingOneSaveButton = settingOneSaveButton;
    }

    public JButton getSettingOnePrintButton() {
        return settingOnePrintButton;
    }

    public void setPrintButton(JButton print) {
        this.settingOnePrintButton = print;
    }

    public JLabel getSettingAhadLabel() {
        return settingAhadLabel;
    }

    public void setSettingAhadLabel(JLabel settingAhadLabel) {
        this.settingAhadLabel = settingAhadLabel;
    }

    public JTextField getSettingAhadTextfield() {
        return settingAhadTextfield;
    }

    public void setSettingAhadTextfield(JTextField settingAhadTextfield) {
        this.settingAhadTextfield = settingAhadTextfield;
    }

    public JButton getSettingAhadSaveButton() {
        return settingAhadSaveButton;
    }

    public void setSettingAhadSaveButton(JButton settingAhadSaveButton) {
        this.settingAhadSaveButton = settingAhadSaveButton;
    }

    public JButton getSettingAhadPrintButton() {
        return settingAhadPrintButton;
    }

    public void setSettingAhadPrintButton(JButton settingAhadPrintButton) {
        this.settingAhadPrintButton = settingAhadPrintButton;
    }

    public JLabel getSettingDalalLabel() {
        return settingDalalLabel;
    }

    public void setSettingDalalLabel(JLabel settingDalalLabel) {
        this.settingDalalLabel = settingDalalLabel;
    }

    public JTextField getSettingDalalTextfield() {
        return settingDalalTextfield;
    }

    public void setSettingDalalTextfield(JTextField settingDalalTextfield) {
        this.settingDalalTextfield = settingDalalTextfield;
    }

    public JButton getSettingDalalSaveButton() {
        return settingDalalSaveButton;
    }

    public void setSettingDalalSaveButton(JButton settingDalalSaveButton) {
        this.settingDalalSaveButton = settingDalalSaveButton;
    }

    public JButton getSettingDalalPrintButton() {
        return settingDalalPrintButton;
    }

    public void setSettingDalalPrintButton(JButton settingDalalPrintButton) {
        this.settingDalalPrintButton = settingDalalPrintButton;
    }

    public JLabel getSettingJawaherLabel() {
        return settingJawaherLabel;
    }

    public void setSettingJawaherLabel(JLabel settingJawaherLabel) {
        this.settingJawaherLabel = settingJawaherLabel;
    }

    public JTextField getSettingJawaherTextfield() {
        return settingJawaherTextfield;
    }

    public void setSettingJawaherTextfield(JTextField settingJawaherTextfield) {
        this.settingJawaherTextfield = settingJawaherTextfield;
    }

    public JButton getSettingJawaherSaveButton() {
        return settingJawaherSaveButton;
    }

    public void setSettingJawaherSaveButton(JButton settingJawaherSaveButton) {
        this.settingJawaherSaveButton = settingJawaherSaveButton;
    }

    public JButton getSettingJawaherPrintButton() {
        return settingJawaherPrintButton;
    }

    public void setSettingJawaherPrintButton(JButton settingJawaherPrintButton) {
        this.settingJawaherPrintButton = settingJawaherPrintButton;
    }

    public JLabel getSettingShahedLabel() {
        return settingShahedLabel;
    }

    public void setSettingShahedLabel(JLabel settingShahedLabel) {
        this.settingShahedLabel = settingShahedLabel;
    }

    public JTextField getSettingShahedTextfield() {
        return settingShahedTextfield;
    }

    public void setSettingShahedTextfield(JTextField settingShahedTextfield) {
        this.settingShahedTextfield = settingShahedTextfield;
    }

    public JButton getSettingShahedSaveButton() {
        return settingShahedSaveButton;
    }

    public void setSettingShahedSaveButton(JButton settingShahedSaveButton) {
        this.settingShahedSaveButton = settingShahedSaveButton;
    }

    public JButton getSettingShahedPrintButton() {
        return settingShahedPrintButton;
    }

    public void setSettingShahedPrintButton(JButton settingShahedPrintButton) {
        this.settingShahedPrintButton = settingShahedPrintButton;
    }

}
