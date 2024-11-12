import javax.swing.JButton;

public class MineTile extends JButton {
    int baris;
    int kolom;

    public MineTile(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
        setFocusable(false);
        setFont(new java.awt.Font("Arial Unicode MS", java.awt.Font.PLAIN, 20));
    }
}
