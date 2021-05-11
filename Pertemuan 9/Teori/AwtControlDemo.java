import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo{
    private Frame mainFrame = new Frame("Java AWT Example");
    private Label headerLabel = new Label();
    private Label statusLabel = new Label();
    private Panel controlPanel = new Panel();
    
    public AwtControlDemo() {
        prepareGUI();
    }
    
    private void prepareGUI(){
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel.setAlignment(Label.CENTER);
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel.setLayout(new FlowLayout());
    
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo(){
        headerLabel.setText("Control in action : Button");
        
        Button okButton = new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }

    // class listener
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("OK")){
                statusLabel.setText("Ok Button Clicked.");
            }
            else if (command.equals("Submit")){
                statusLabel.setText("Submit Button Clicked.");
            }
            else {
                statusLabel.setText("Cancel Button Clicked.");
            }
        }
    }

    public static void main(String[]args){
        AwtControlDemo awtControlDemo = new AwtControlDemo();
        awtControlDemo.showEventDemo();
    }
}
