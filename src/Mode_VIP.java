import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mode_VIP extends JFrame implements ActionListener {

    JButton rtrn;
    JPanel panel, NorthPan, centerPan;
    JButton btn1, btn2, btn3, btn4;

    Mode_VIP() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 900, 700);
        getContentPane().setBackground(Color.WHITE);

        ajoutPanelToFrame();

        setLayout(new GridBagLayout());
        setVisible(true);
    }


    private void ajoutPanelToFrame() {

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 600));
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.white);

        ajoutElementToPanel();

        add(panel);
    }

    private void ajoutElementToPanel() {

        northPanel();

        centerPanel();

        JButton button = new JButton("Log in");
        button.addActionListener(this);

        panel.add(NorthPan, BorderLayout.NORTH);
        panel.add(centerPan, BorderLayout.CENTER);

    }

    private void northPanel() {
        NorthPan = new JPanel();
        NorthPan.setLayout(new BorderLayout());
        NorthPan.setBackground(Color.white);
        rtrn = new JButton("return");
        rtrn.setBackground(Color.gray);
        rtrn.addActionListener(this);

        NorthPan.add(rtrn, BorderLayout.NORTH);

    }

    private void centerPanel() {
        centerPan = new JPanel();
        centerPan.setBackground(Color.WHITE);
        centerPan.setLayout(new GridLayout(4,0,20,20));

        btn1 = new JButton("Netflix");
        btn1.addActionListener(this);
        btn2 = new JButton("Boissons alcolique");
        btn2.addActionListener(this);
        btn3 = new JButton("Repas VIP");
        btn3.addActionListener(this);
        btn4 = new JButton("Spotify");
        btn4.addActionListener(this);

        centerPan.add(btn1);
        centerPan.add(btn2);
        centerPan.add(btn3);
        centerPan.add(btn4);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == rtrn){
            new Client();
            dispose();
        }
    }
}
