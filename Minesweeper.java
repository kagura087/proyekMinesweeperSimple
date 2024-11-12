import javax.swing.*;
import java.awt.*;

public class Minesweeper {
    int ukuranUbin = 70;
    int jumlahBaris = 8;
    int jumlahKolom = jumlahBaris; //Buat 8x8
    int lebarPapan = jumlahKolom * ukuranUbin; //70x8 = 560pixel
    int tinggiPapan = jumlahBaris * ukuranUbin;

    JFrame frame = new JFrame("Minesweeper"); //buat bingkai
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel papanPanel = new JPanel();
    
    int jumlahBom = 10;
    PapanGame papanGame;

    Minesweeper() {
        frame.setSize(lebarPapan, tinggiPapan); //mengatur ukuran dan tinggi papan
        frame.setLocationRelativeTo(null); //buat bingkai dibuka ada ditengah layar
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25)); //membuat font jadi arial bold size 25
        textLabel.setHorizontalAlignment(JLabel.CENTER); //atur text ke tengah
        textLabel.setText("Minesweeper");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH); //menampilkan teks mineswpeer ke window dan membuat menempel diatas layout

        papanGame = new PapanGame(jumlahBaris, jumlahKolom, 10, ukuranUbin, textLabel);
        frame.add(papanGame.papanPanel, BorderLayout.CENTER);

        frame.setVisible(true); //buat bingkai bisa dilihat di window
    }
    
    public static void main(String[] args) {
        new Minesweeper();
    }
}