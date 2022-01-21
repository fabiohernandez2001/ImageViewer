package controler;

import Modelo.Image;
import Persistencia.FileImageLoader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Usuarios\\fabio\\Pictures\\Imagenes Prueba\\");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}
