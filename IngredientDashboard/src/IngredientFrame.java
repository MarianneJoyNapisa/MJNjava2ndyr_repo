import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
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

    public void Navbar() {
        navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBackground(Color.WHITE);
        navbar.setBounds(26, 28, 196, 640);
        navbar.setVisible(true);

        ImageIcon logoIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/logoVertical1.png");
        JLabel logoIconLabel = new JLabel(logoIcon);
        logoIconLabel.setBounds(35, 20, 128, 145);
        navbar.add(logoIconLabel);

        Font navbarText = new Font("Arial", Font.BOLD, 16);

        ImageIcon homeIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/home_icon1.png");
        ImageIcon homeWhiteIcon = new ImageIcon(changeImageColor(homeIcon.getImage(), Color.WHITE));

        JButton home = new JButton("Home", homeIcon);
        home.setBackground(Color.WHITE);
        home.setFont(navbarText);
        home.setForeground(new Color(229, 152, 155));
        home.setBounds(0, 220, 196, 30);
        home.setBorderPainted(false);
        home.setFocusPainted(false);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.setBackground(new Color(229, 152, 155));
                home.setForeground(Color.WHITE);
            }
        });
        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                home.setIcon(homeWhiteIcon);
                home.setBackground(new Color(229, 152, 155));
                home.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                home.setIcon(homeIcon); // Change to the original icon
                home.setBackground(Color.WHITE);
                home.setForeground(new Color(229, 152, 155));
            }
        });

        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the icon to the white version when hovered
                home.setIcon(homeWhiteIcon);
                home.setBackground(new Color(229, 152, 155));
                home.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restore the original icon when not hovered
                home.setIcon(homeIcon);
                home.setBackground(Color.WHITE);
                home.setForeground(new Color(229, 152, 155));
            }
        });

        ImageIcon productIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/product_icon1.png");
        ImageIcon productWhiteIcon = new ImageIcon(changeImageColor(productIcon.getImage(), Color.WHITE));

        JButton product = new JButton("Product", productIcon);
        product.setBackground(Color.WHITE);
        product.setFont(navbarText);
        product.setForeground(new Color(229, 152, 155));
        product.setBounds(0, 250, 196, 30);
        product.setBorderPainted(false);
        product.setFocusPainted(false);

        product.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.setBackground(new Color(229, 152, 155));
                product.setForeground(Color.WHITE);
            }
        });
        product.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                product.setIcon(productWhiteIcon);
                product.setBackground(new Color(229, 152, 155));
                product.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                product.setIcon(productIcon);
                product.setBackground(Color.WHITE);
                product.setForeground(new Color(229, 152, 155));
            }
        });

        ImageIcon routineIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/routine_icon1.png");
        ImageIcon routineWhiteIcon = new ImageIcon(changeImageColor(routineIcon.getImage(), Color.WHITE));

        JButton routine = new JButton("Routine", routineIcon);
        routine.setBackground(Color.WHITE);
        routine.setFont(navbarText);
        routine.setForeground(new Color(229, 152, 155));
        routine.setBounds(0, 280, 196, 30);
        routine.setBorderPainted(false);
        routine.setFocusPainted(false);

        routine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                routine.setBackground(new Color(229, 152, 155));
                routine.setForeground(Color.WHITE);
            }
        });
        routine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                routine.setIcon(routineWhiteIcon);
                routine.setBackground(new Color(229, 152, 155));
                routine.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                routine.setIcon(routineIcon);
                routine.setBackground(Color.WHITE);
                routine.setForeground(new Color(229, 152, 155));
            }
        });

        ImageIcon journalIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/journal_icon1.png");
        ImageIcon journalWhiteIcon = new ImageIcon(changeImageColor(journalIcon.getImage(), Color.WHITE));

        JButton journal = new JButton("Journal", journalIcon);
        journal.setBackground(Color.WHITE);
        journal.setFont(navbarText);
        journal.setForeground(new Color(229, 152, 155));
        journal.setBounds(0, 310, 196, 30);
        journal.setBorderPainted(false);
        journal.setFocusPainted(false);

        journal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                journal.setBackground(new Color(229, 152, 155));
                journal.setForeground(Color.WHITE);
            }
        });
        journal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                journal.setIcon(journalWhiteIcon);
                journal.setBackground(new Color(229, 152, 155));
                journal.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                journal.setIcon(journalIcon);
                journal.setBackground(Color.WHITE);
                journal.setForeground(new Color(229, 152, 155));
            }
        });

        ImageIcon logOutIcon = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/logout_icon1.png");
        ImageIcon logOutWhiteIcon = new ImageIcon(changeImageColor(logOutIcon.getImage(), Color.WHITE));

        JButton logOut = new JButton("Log Out",logOutIcon);
        logOut.setBackground(Color.WHITE);
        logOut.setFont(navbarText);
        logOut.setForeground(new Color(229, 152, 155));
        logOut.setBounds(0, 540, 196, 30);
        logOut.setBorderPainted(false);
        logOut.setFocusPainted(false);

        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logOut.setBackground(new Color(229, 152, 155));
                logOut.setForeground(Color.WHITE);
            }
        });
        logOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logOut.setIcon(logOutWhiteIcon);
                logOut.setBackground(new Color(229, 152, 155));
                logOut.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logOut.setIcon(logOutIcon);
                logOut.setBackground(Color.WHITE);
                logOut.setForeground(new Color(229, 152, 155));
            }
        });

        navbar.add(logOut);
        navbar.add(journal);
        navbar.add(routine);
        navbar.add(product);
        navbar.add(home);
    }
    private Image changeImageColor(Image image, Color color) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bufferedImage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();

        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                if (bufferedImage.getRGB(i, j) != 0x00000000) {
                    bufferedImage.setRGB(i, j, color.getRGB());
                }
            }
        }

        return bufferedImage;
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
            Scanner scanner = new Scanner(new File("C:/Users/Admin/OneDrive/Desktop/COMBINATION SKIN PRODUCTS/FacialWash/Price(100-500)/EverBilenaSqualaneFacialCleanser-ingredients.txt"));
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
