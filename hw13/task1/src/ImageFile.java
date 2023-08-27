import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Зображення
 */
class ImageFile implements DisplayObject {
    private BufferedImage image;
    private String path;

    public ImageFile(String path) {
        this.path = path;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image " + path + "...");
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image.");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }
}