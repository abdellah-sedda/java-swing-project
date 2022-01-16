import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame implements ActionListener {
    JPanel panel, NorthPan, centerPan;
    JButton film, appele, audio, mode_vip, para_lang;

    Client() {
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
        JLabel nom = new JLabel("Nom:");
        JLabel prenom = new JLabel("Prénom:");
        JLabel siege = new JLabel( "Siège:");

        NorthPan.add(nom, BorderLayout.NORTH);
        NorthPan.add(prenom, BorderLayout.CENTER);
        NorthPan.add(siege, BorderLayout.SOUTH);

    }

    private void centerPanel() {
        centerPan = new JPanel();
        centerPan.setBackground(Color.WHITE);
        centerPan.setLayout(new GridLayout(3,2,20,20));

        film = new JButton("Films");
        film.addActionListener(this);
        appele = new JButton("Appele a l'hotesse");
        appele.addActionListener(this);
        audio = new JButton("Audio");
        audio.addActionListener(this);
        mode_vip = new JButton("Mode VIP");
        mode_vip.addActionListener(this);
        para_lang = new JButton("Paramétre de langue");
        para_lang.addActionListener(this);

        centerPan.add(film);
        centerPan.add(appele);
        centerPan.add(audio);
        centerPan.add(mode_vip);
        centerPan.add(para_lang);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == film) {
            new Films();
            dispose();
        } else if (actionEvent.getSource() == appele) {
            new Appele_hotesse();
            dispose();
        } else if (actionEvent.getSource() == audio) {
            new Audio();
            dispose();
        } else if (actionEvent.getSource() == mode_vip) {
            new Mode_VIP();
            dispose();
        } else if (actionEvent.getSource() == para_lang) {
            new Paramétre_langue();
            dispose();
        }
    }
}
