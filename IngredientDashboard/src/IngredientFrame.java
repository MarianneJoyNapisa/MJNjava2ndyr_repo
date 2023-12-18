import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class IngredientFrame {
    private JFrame frame;
    private JPanel navbar;
    private JLabel header;

    private JScrollPane contentBox;
    private JTextArea ingredientList;

    public IngredientFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);

        Color bgColor = new Color(255, 229, 216);
        frame.getContentPane().setBackground(bgColor);

        Navbar();
        Header();
        ContentSection();

        frame.add(navbar);
        frame.add(header);
        frame.add(contentBox);

        frame.setVisible(true);
    }

    public void Navbar(){
        navbar = new JPanel();

        navbar.setLayout(null);
        navbar.setBackground(Color.WHITE);
        //navbar.setPreferredSize(new Dimension(175,700));
        navbar.setBounds(26,28, 196,640);
        navbar.setVisible(true);
    }

    public void Header(){

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/header_bg.jpg");
        header = new JLabel(backgroundImage);

        header.setLayout(null);
        header.setBounds(253, 34, 1088, 163);

        JLabel titleheader = new JLabel("INGREDIENT LIST");

        Color titleColor = new Color(109, 104, 117);
        titleheader.setForeground(titleColor);

        titleheader.setFont(new Font("Arial", Font.BOLD, 48));
        titleheader.setBounds(40,52, 450, 58);

        header.add(titleheader);
        header.setVisible(true);
    }

    public void ContentSection() {
        ingredientList = new JTextArea();
        ingredientList.setEditable(false);
        ingredientList.setLineWrap(true);
        ingredientList.setWrapStyleWord(true);

        ingredientList.setForeground(Color.WHITE);
        ingredientList.setFont(new Font("Arial", Font.PLAIN, 16));

        int marginSize = 50;
        ingredientList.setMargin(new Insets(marginSize, marginSize, marginSize, marginSize));
        ingredientList.setAlignmentX(Component.LEFT_ALIGNMENT);

        Color ingrebgColor = new Color(108, 104, 116);
        ingredientList.setBackground(ingrebgColor);

        try {
            Scanner scanner = new Scanner(new File("C:/Users/Admin/OneDrive/Desktop/BeaTheory/sample.txt"));
            StringBuilder all = new StringBuilder();

            while (scanner.hasNextLine()) {
                all.append(scanner.nextLine()).append("\n");
            }
            ingredientList.setText(all.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        contentBox = new JScrollPane(ingredientList);
        contentBox.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        contentBox.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        contentBox.setBounds(253, 225, 1088, 445);

        frame.add(contentBox);
    }
        public static void main(String[] args){
            IngredientFrame mainframe = new IngredientFrame();
        }
}
