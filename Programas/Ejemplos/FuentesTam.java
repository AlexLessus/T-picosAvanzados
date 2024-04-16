import java.awt.*;

public class FuentesTam {
    public static void main(String[] args) {

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // fuentes
        // String f[] = ge.getAvailableFontFamilyNames();
        // Font ff[] = ge.getAllFonts();
        // for (int i = 0; i < f.length; i++) {
        // System.err.println(ff[i].getFamily());
        // }

        // Obtener el tamaño de la pantalla
        Rectangle tam = ge.getMaximumWindowBounds();
        System.err.println(tam.width + "," + tam.height);
        Dimension tam2 = Toolkit.getDefaultToolkit().getScreenSize();
        System.err.println(tam2.width + "," + tam2.height);
    }
}
