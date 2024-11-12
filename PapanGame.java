import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class PapanGame {
    int jumlahBaris;
    int jumlahKolom;
    int jumlahBom;
    int ukuranUbin;

    // MineTile[][] papan = new MineTile[jumlahBaris][jumlahKolom];
    ArrayList<MineTile> mineList;
    JPanel papanPanel;
    JLabel textLabel;

    public PapanGame(int jumlahBaris, int jumlahKolom, int jumlahBom, int ukuranUbin, JLabel textLabel) {
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahBom = jumlahBom;
        this.ukuranUbin = ukuranUbin;
        this.textLabel = textLabel;

        // Buat panel untuk papan
        papanPanel = new JPanel();
        papanPanel.setLayout(new GridLayout(jumlahBaris, jumlahKolom)); //8x8
        // papanPanel.setBackground(Color.green);
        papanPanel.setPreferredSize(new Dimension(jumlahKolom * ukuranUbin, jumlahBaris * ukuranUbin));
        // ubinPapanGame();

        ArrayList<MineTile> mineTiles = new ArrayList<MineTile>();
        for (int baris = 0; baris < jumlahBaris; baris++) {
            for (int kolom = 0; kolom < jumlahKolom; kolom++) {
                MineTile ubin = new MineTile(jumlahBaris, jumlahKolom);
                ubin.setPreferredSize(new Dimension(ukuranUbin, ukuranUbin));
                papanPanel.add(ubin); // Tambahkan tile ke papan
                mineTiles.add(ubin);
                ubin.setText("1");
            }
        }

        // private void ubinPapanGame() {
        //     for (int baris = 0; baris < jumlahBaris; baris++) {
        //         for (int kolom = 0; kolom < jumlahKolom; kolom++) {
        //             MineTile ubin = new MineTile(baris, kolom);
        //             papan[baris][kolom] = ubin;

        //             ubin.setFocusable(false);
        //             ubin.setMargin(new Insets(0, 0, 0, 0));
        //             ubin.setFont(new Font("Arial Unicode MS", Font.PLAIN, 45));
        //             ubin.setText("1");
        //             papanPanel.add(ubin);
        //         }
        //     }
        // }
    }
}