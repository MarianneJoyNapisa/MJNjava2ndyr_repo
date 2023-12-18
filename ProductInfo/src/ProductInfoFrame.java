import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductInfoFrame{
    private JFrame frame;
    private JPanel navbar;
    private JLabel header;
    private JScrollPane contentBox;

    public ProductInfoFrame() {
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
    public void Header() {
        ImageIcon backgroundImage = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/BeaTheory/productHeaderbg.png");
        header = new JLabel(backgroundImage);
        header.setLayout(null);
        header.setBounds(250, 30, 1091, 200);

        ImageIcon productImage = new ImageIcon("C:/Users/Admin/OneDrive/Desktop/COMBINATION SKIN PRODUCTS/FacialWash/Price(100-500)/EverBilenaSqualaneFacialCleanser1.png");
        JLabel productImageLabel = new JLabel(productImage);
        productImageLabel.setBounds(50,10, productImage.getIconWidth(), productImage.getIconHeight());
        header.add(productImageLabel);

        JLabel productCompanyName = new JLabel("The Ordinary");
        Color textColor = new Color(109, 104, 117);
        productCompanyName.setForeground(textColor);
        productCompanyName.setFont(new Font("Arial", Font.PLAIN, 20));
        productCompanyName.setBounds(250, 40, 200, 20);

        JLabel productName = new JLabel("Caffeine Solution 5% + EGCG");
        productName.setForeground(textColor);
        productName.setFont(new Font("Arial", Font.BOLD, 24));
        productName.setBounds(250,70, 800, 29);

        JLabel productType = new JLabel("Eye Serum");
        productType.setForeground(textColor);
        productType.setFont(new Font("Arial", Font.PLAIN, 20));
        productType.setBounds(250, 110, 200, 20);

        JLabel productPrice = new JLabel("$200.00");
        productPrice.setForeground(textColor);
        productPrice.setFont(new Font("Arial", Font.BOLD, 20));
        productPrice.setBounds(250, 145, 200, 20);

        JButton ingredientButton = new JButton("SHOW INGREDIENTS DETAILS");
        ingredientButton.setBackground(Color.WHITE);
        ingredientButton.setBorderPainted(false);
        ingredientButton.setForeground(new Color(229, 152, 155));
        ingredientButton.setBounds(850, 150, 210, 30);
        ingredientButton.setFocusPainted(false);

        ingredientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingredientButton.setBackground(new Color(229, 152, 155));
                ingredientButton.setForeground(Color.WHITE);
            }
        });
        ingredientButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ingredientButton.setBackground(new Color(229, 152, 155));
                ingredientButton.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ingredientButton.setBackground(Color.WHITE);
                ingredientButton.setForeground(new Color(229, 152, 155));
            }
        });

        header.add(ingredientButton);
        header.add(productPrice);
        header.add(productType);
        header.add(productName);
        header.add(productCompanyName);
        header.setVisible(true);
    }
    public void ContentSection(){

        JTextArea skincareRoutine = new JTextArea();
        skincareRoutine.setEditable(false);
        skincareRoutine.setLineWrap(true);
        skincareRoutine.setWrapStyleWord(true);
        skincareRoutine.setForeground(Color.WHITE);
        skincareRoutine.setFont(new Font("Arial", Font.PLAIN, 16));

        int marginSize = 50;
        skincareRoutine.setMargin(new Insets(marginSize, marginSize, marginSize, marginSize));
        skincareRoutine.setAlignmentX(Component.LEFT_ALIGNMENT);

        Color contentBoxColor = new Color(229, 152, 155);
        skincareRoutine.setBackground(contentBoxColor);

        contentBox = new JScrollPane(skincareRoutine);
        contentBox.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        contentBox.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        contentBox.setBounds(253, 268, 1088, 400);
        contentBox.setBorder(null);

        try {
            Scanner scanner = new Scanner(new File("C:/Users/Admin/OneDrive/Desktop/COMBINATION SKIN PRODUCTS/FacialWash/Price(100-500)/EverBilenaSqualaneFacialCleanser-info.txt"));
            StringBuilder all = new StringBuilder();

            while (scanner.hasNextLine()) {
                all.append(scanner.nextLine()).append("\n");
            }
            skincareRoutine.setText(all.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ProductInfoFrame mainframe = new ProductInfoFrame();
    }
}