package Dec05;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {
    private JTextField tfName;
    private JLabel lName;
    private JPanel pnlMain;
    private JButton btnOk;
    private JRadioButton rbFirst;
    private JRadioButton rbSecond;
    private JRadioButton rbThird;
    private JRadioButton rbFourth;
    private JTextArea taOutput;
    private JComboBox cbProgram;
    private JCheckBox cbSerato;
    private JCheckBox cbArellano;
    private JCheckBox cbAliac;
    private JCheckBox cbHerrera;
    List<JRadioButton> bgYearLevel;
    List<JCheckBox> bgTeachers;


    public App() {
        bgYearLevel = new ArrayList<>();
        bgYearLevel.add(rbFirst);
        bgYearLevel.add(rbSecond);
        bgYearLevel.add(rbThird);
        bgYearLevel.add(rbFourth);
        bgTeachers = new ArrayList<>();
        bgTeachers.add(cbAliac);
        bgTeachers.add(cbSerato);
        bgTeachers.add(cbHerrera);
        bgTeachers.add(cbArellano);


        taOutput.setFont(new Font(null, Font.BOLD, 28));

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name_entered();
            }
        });

        tfName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    name_entered();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        App app = new App();
        app.setContentPane(app.pnlMain);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void name_entered() {
        int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure about that?");
        if (result == JOptionPane.NO_OPTION || result == JOptionPane.CANCEL_OPTION) {
            System.out.println("You selected NO or CANCEL");
            return;
        }
        String name = tfName.getText();
        tfName.setEditable(false);
        boolean year_found = false;
        for (JRadioButton rb : bgYearLevel) {
            if (rb.isSelected()) {
                taOutput.setText(name + "\nA " + rb.getText() + "-year student\n" + cbProgram.getSelectedItem().toString());
                year_found = true;
                break;
            }
        }
        if (!year_found) {
            JOptionPane.showMessageDialog(pnlMain, "You have not selected a year level");
        }
        taOutput.setText(taOutput.getText() + "\nYour teachers:");
        for (JCheckBox cb : bgTeachers) {
            if (cb.isSelected()) {
                taOutput.setText(taOutput.getText() + "\n" + cb.getText());
            }
        }
    }
}
