import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui(){
        super("Weather App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,650);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        addGuiComponent();
    }
    private void addGuiComponent(){
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15,15,351,45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN,24));
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchTextField);
        add(searchButton);

    }
    private ImageIcon loadImage(String resourcePath){
       try{
           BufferedImage image = ImageIO.read(new File(resourcePath));
           return new ImageIcon(image);
       }
       catch(IOException e){
           e.printStackTrace();
       }
       System.out.println("Could not find resource");
       return null;
    }
}
