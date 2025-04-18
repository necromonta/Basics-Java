package tutorial;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


/**
  Feladatok: 
                 1. Mennyi pizza van osszesen
                 2. Specific pizza + hany db
                 3. Specific pizza es Specific ar folott adatai,
                 4. Specific pizza  gyors %,atlag money , atlag meret
                 5. Specific pizza pizzat kicserelni  Specific pizza-ra es az arabol levonni valamennyit
                 6. Console-ra kiirja a jelenlegi arraylistet
                 
         
 */
public class MyFrame extends JFrame implements ActionListener {

    ArrayList<Pizza> pizzak;
    JTextField field = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();
    JTextField field4 = new JTextField();
    JTextField field5 = new JTextField();
    JTextField field6 = new JTextField();
    JTextField field7 = new JTextField();
    JLabel result = new JLabel();
    JLabel result2 = new JLabel();
    DefaultListModel<String> model = new DefaultListModel<>();
    JList<String> jList = new JList(model);

    MyFrame(ArrayList<Pizza> pizzak) {
        objects();
        this.pizzak = pizzak;
        exercise1Window();
        exercise2Window();
        exercise3Window();
        exercise4Window();
        exercise5Window();
        this.repaint();

    }

    void objects() {
        //button
        JButton button = new JButton();
        button.setBounds(150, 600, 120, 60);
        button.setText("Eredmenyek");
        button.addActionListener(this);
        button.setFocusable(false);

        //frame
        this.setTitle("Grafikus Megoldasok");
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(button);
        

    }

    void exercise1Window() {
        JLabel numberOfPizzas = new JLabel();
        numberOfPizzas.setText("1.Pizzak szama:  " + pizzak.size()+"db");
        numberOfPizzas.setBounds(50, 50, 200, 50);
        this.add(numberOfPizzas);
    }

    void exercise2Window() {

        JLabel pizzaType = new JLabel();
        pizzaType.setText("2.Keresett pizza:");
        pizzaType.setBounds(50, 100, 200, 50);
        this.add(pizzaType);

        field.setText("Magyaros");
        field.setBounds(150, 100, 150, 50);
        this.add(field);

        result.setBounds(350, 100, 200, 50);
        this.add(result);
    }

    void exercise3Window() {
        JLabel pizzaType2 = new JLabel();
        pizzaType2.setText("3.Keresett pizza+ar:");
        pizzaType2.setBounds(50, 170, 200, 50);
        this.add(pizzaType2);

        field2.setText("Magyaros");
        field2.setBounds(200, 170, 100, 50);
        this.add(field2);

        field3.setText("3100");
        field3.setBounds(310, 170, 100, 50);
        this.add(field3);

        jList.setVisibleRowCount(1);
        jList.setSize(450, 200);

        JPanel panel = new JPanel();
        panel.setBounds(420, 170, 500, 200);

        JScrollPane scrollPane = new JScrollPane(jList);
        panel.add(scrollPane);
        this.add(panel);

    }

    void exercise4Window() {
        JLabel pizzaType3 = new JLabel();
        pizzaType3.setText("4.Keresett pizza:");
        pizzaType3.setBounds(50, 230, 200, 50);
        this.add(pizzaType3);

        field4.setText("Magyaros");
        field4.setBounds(150, 230, 100, 50);
        this.add(field4);

        result2.setBounds(260, 230, 700, 50);
        result2.setOpaque(true);
        this.add(result2);
    }
   
    void exercise5Window() {
        JLabel pizzaType4 = new JLabel();
        pizzaType4.setText("5.Keresett pizza: ");
        pizzaType4.setBounds(50, 280, 200, 50);
        this.add(pizzaType4);
        
         JLabel pizzaType5 = new JLabel();
        pizzaType5.setText("Uj nev: ");
        pizzaType5.setBounds(50, 330, 200, 50);
        this.add(pizzaType5);
        
        JLabel pizzaType6 = new JLabel();
        pizzaType6.setText("Uj ar: ");
        pizzaType6.setBounds(50, 380, 200, 50);
        this.add(pizzaType6);
        
        field5.setText("Magyaros");
        field5.setBounds(300, 280, 100, 50);
        this.add(field5);

        field6.setText("Magyartalan");
        field6.setBounds(300, 330, 100, 50);
        this.add(field6);
        
        field7.setText("2000");
        field7.setBounds(300, 380, 100, 50);
        this.add(field7);
    }
    
    //2.
    int findsNumberOfSpecificPizza() {

        int db = 0;
        for (Pizza temp : pizzak) {
            if (temp.nev.equals(field.getText())) {
                db++;
            }
        }
        return db;

    }

    //3
    void findsSpecificPizza() {
        for (int i = 0; i < pizzak.size(); i++) {
            if (pizzak.get(i).nev.equals(field2.getText()) && pizzak.get(i).koltseg > Integer.valueOf(field3.getText())) {
                model.addElement(pizzak.get(i) + "");
            }
        }
    }

    //4
    String calculatesStuff() {
        String line;
        int counter=0;
        int sum=0;
        int size=0;
        int numberOfFast=0;
        for (int i = 0; i < pizzak.size(); i++) {
            if (pizzak.get(i).nev.equals(field4.getText())) {
                counter++;
                sum+=pizzak.get(i).koltseg;
                size+=pizzak.get(i).meret;
                if (pizzak.get(i).gyors) {
                    numberOfFast++;
                }
            }
        }

        line="Avg gyors:"+((float)numberOfFast/(float)counter)*100+"% Avg ar:"+(float)sum/(float)counter+"Ft Avg meret:"+(float)size/(float)counter+"cm";
        return line;
    }
    
    //5
    void changesPizzas(){
        if (!field5.getText().equals("")&&!field6.getText().equals("")&&!field7.getText().equals("")) {
            for (int i = 0; i < pizzak.size(); i++) {
                if (pizzak.get(i).nev.equals(field5.getText())) {
                    pizzak.get(i).nev=field6.getText();
                    pizzak.get(i).koltseg=Integer.valueOf(field7.getText());
//                    try{
//                         pizzak.get(i).koltseg=Integer.valueOf(field7.getText());
//                    }
//                    catch(){
//                        
//                    }
                    
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //2
        result.setText(findsNumberOfSpecificPizza() + "db");
        //3
        model.clear();
        findsSpecificPizza();
        //4
        result2.setText(calculatesStuff());
        //5
        changesPizzas();
        //6
        for (int i = 0; i < pizzak.size(); i++) {
            System.out.println(pizzak.get(i));
        }
        System.out.println("-------------------------------");
    }
}
