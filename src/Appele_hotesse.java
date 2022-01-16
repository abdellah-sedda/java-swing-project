import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appele_hotesse extends JFrame implements ActionListener {
    JButton rtrn;
    JPanel panel, NorthPan, centerPan;
    JButton premier_classe, economique, enfent;
    Appele_hotesse() {
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
        centerPan.setLayout(new GridLayout(3,0,20,20));

        premier_classe = new JButton("1ERE classe");
        premier_classe.addActionListener(this);
        economique = new JButton("Èconomique");
        economique.addActionListener(this);
        enfent = new JButton("Enfent");
        enfent.addActionListener(this);

        centerPan.add(premier_classe);
        centerPan.add(economique);
        centerPan.add(enfent);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == rtrn){
            new Client();
            dispose();
        } else if (actionEvent.getSource() == premier_classe) {
            new PreClasse();
            dispose();
        } else if (actionEvent.getSource() == economique) {
            new Economique();
            dispose();
        } else if (actionEvent.getSource() == enfent) {
            new Enfent();
            dispose();
        }
    }
}
