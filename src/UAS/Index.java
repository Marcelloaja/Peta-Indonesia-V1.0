package UAS;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/**
 *
 * @author ello
 */
public class Index extends javax.swing.JFrame {
    
    ImageIcon ii;
    public Index() {
        initComponents();
        // Display Maximum 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        btnMulai = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        bg1 = new javax.swing.JLabel();
        pendahuluan = new javax.swing.JPanel();
        btnKembali = new javax.swing.JButton();
        btnLanjut = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();
        peta = new javax.swing.JPanel();
        labelMaluku = new javax.swing.JLabel();
        labelSulawesi = new javax.swing.JLabel();
        labelKalimantan = new javax.swing.JLabel();
        labelJawa = new javax.swing.JLabel();
        labelSumatra = new javax.swing.JLabel();
        labelBali = new javax.swing.JLabel();
        labelPapua = new javax.swing.JLabel();
        pulau = new javax.swing.JLabel();
        labelKompas = new javax.swing.JLabel();
        btnKembaliPeta = new javax.swing.JButton();
        bg3 = new javax.swing.JLabel();
        sumatra = new javax.swing.JPanel();
        panelSumatra1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bgSumatra = new javax.swing.JLabel();
        panelSumatra2 = new javax.swing.JPanel();
        btnKembaliSumatra = new javax.swing.JButton();
        btnLanjutSumatra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelSumatra3 = new javax.swing.JPanel();
        btnKembaliSumatra2 = new javax.swing.JButton();
        btnLanjutSumatra2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelSumatra4 = new javax.swing.JPanel();
        btnLanjutSumatra3 = new javax.swing.JButton();
        btnKembaliSumatra3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelSumatra5 = new javax.swing.JPanel();
        btnKembaliSumatra4 = new javax.swing.JButton();
        btnLanjutSumatra4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelSumatra6 = new javax.swing.JPanel();
        btnKembaliSumatra5 = new javax.swing.JButton();
        btnLanjutSumatra5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelSumatra7 = new javax.swing.JPanel();
        quisSumatra = new javax.swing.JPanel();
        btnSumatraNanti = new javax.swing.JButton();
        btnSumatraAyo = new javax.swing.JButton();
        bgSumatra2 = new javax.swing.JLabel();
        quisSumatra1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnSumatraLompat1 = new javax.swing.JButton();
        jawabanQuisSumatra1 = new javax.swing.JLabel();
        bgSumatra8 = new javax.swing.JLabel();
        quisSumatra2 = new javax.swing.JPanel();
        btnSumatraBarat = new javax.swing.JButton();
        btnSumatraSelatan = new javax.swing.JButton();
        btnSumatraUtara = new javax.swing.JButton();
        btnAceh = new javax.swing.JButton();
        btnSumatraLompat2 = new javax.swing.JButton();
        jawabanQuisSumatra2 = new javax.swing.JLabel();
        bgSumatra9 = new javax.swing.JLabel();
        quisSumatra3 = new javax.swing.JPanel();
        btnCandiBentar1 = new javax.swing.JButton();
        btnCandiSingosari1 = new javax.swing.JButton();
        btnCandiBorobudur1 = new javax.swing.JButton();
        btnCandiSebentar1 = new javax.swing.JButton();
        btnSumatraLompat3 = new javax.swing.JButton();
        jawabanQuisSumatra3 = new javax.swing.JLabel();
        bgSumatra10 = new javax.swing.JLabel();
        quisSumatra4 = new javax.swing.JPanel();
        btnMieSedaap = new javax.swing.JButton();
        btnMieAceh = new javax.swing.JButton();
        btnMieIndomie = new javax.swing.JButton();
        btnMieGacoan = new javax.swing.JButton();
        btnSumatraLompat4 = new javax.swing.JButton();
        jawabanQuisSumatra4 = new javax.swing.JLabel();
        bgSumatra11 = new javax.swing.JLabel();
        quisSumatra5 = new javax.swing.JPanel();
        btnBali = new javax.swing.JButton();
        btnJakarta = new javax.swing.JButton();
        btnMalang = new javax.swing.JButton();
        btnSumatra = new javax.swing.JButton();
        btnSumatraLompat5 = new javax.swing.JButton();
        jawabanQuisSumatra5 = new javax.swing.JLabel();
        bgSumatra12 = new javax.swing.JLabel();
        lompatSumatra = new javax.swing.JPanel();
        btnTidakSumatra1 = new javax.swing.JButton();
        btnYaSumatra1 = new javax.swing.JButton();
        bgSumatra13 = new javax.swing.JLabel();
        selesaiSumatra = new javax.swing.JPanel();
        btnTidakSumatra2 = new javax.swing.JButton();
        btnYaSumatra2 = new javax.swing.JButton();
        bgSumatra14 = new javax.swing.JLabel();
        jawa = new javax.swing.JPanel();
        panelJawa1 = new javax.swing.JPanel();
        btnLanjutJawa1 = new javax.swing.JButton();
        btnKembaliJawa1 = new javax.swing.JButton();
        bgJawa = new javax.swing.JLabel();
        panelJawa2 = new javax.swing.JPanel();
        btnKembaliJawa2 = new javax.swing.JButton();
        btnLanjutJawa2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelJawa3 = new javax.swing.JPanel();
        btnKembaliJawa3 = new javax.swing.JButton();
        btnLanjutJawa3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panelJawa4 = new javax.swing.JPanel();
        btnKembaliJawa4 = new javax.swing.JButton();
        btnLanjutJawa4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelJawa5 = new javax.swing.JPanel();
        btnKembaliJawa = new javax.swing.JButton();
        btnLanjutJawa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        quisJawa = new javax.swing.JPanel();
        btnJawaNanti = new javax.swing.JButton();
        btnJawaAyo = new javax.swing.JButton();
        bgJawa2 = new javax.swing.JLabel();
        quisJawa1 = new javax.swing.JPanel();
        btnSipit = new javax.swing.JButton();
        btnMataLebar = new javax.swing.JButton();
        btnRambutMerah = new javax.swing.JButton();
        btnRambutKriting = new javax.swing.JButton();
        btnJawaLompat1 = new javax.swing.JButton();
        jawabanQuisJawa1 = new javax.swing.JLabel();
        bgJawa13 = new javax.swing.JLabel();
        quisJawa2 = new javax.swing.JPanel();
        btnPapua = new javax.swing.JButton();
        btnSumatra6 = new javax.swing.JButton();
        btnJawa = new javax.swing.JButton();
        btnKalimantan = new javax.swing.JButton();
        btnJawaLompat2 = new javax.swing.JButton();
        jawabanQuisJawa2 = new javax.swing.JLabel();
        bgJawa14 = new javax.swing.JLabel();
        quisJawa3 = new javax.swing.JPanel();
        btnEmpat = new javax.swing.JButton();
        btnTiga = new javax.swing.JButton();
        btnDua = new javax.swing.JButton();
        btnSatu = new javax.swing.JButton();
        btnJawaLompat3 = new javax.swing.JButton();
        jawabanQuisJawa3 = new javax.swing.JLabel();
        bgJawa19 = new javax.swing.JLabel();
        quisJawa4 = new javax.swing.JPanel();
        btnBakpao = new javax.swing.JButton();
        btnLontong = new javax.swing.JButton();
        btnSteak = new javax.swing.JButton();
        btnGudeg = new javax.swing.JButton();
        btnJawaLompat4 = new javax.swing.JButton();
        jawabanQuisJawa4 = new javax.swing.JLabel();
        bgJawa18 = new javax.swing.JLabel();
        quisJawa5 = new javax.swing.JPanel();
        btnSateKambing1 = new javax.swing.JButton();
        btnSateAyam1 = new javax.swing.JButton();
        btnSateLilit1 = new javax.swing.JButton();
        btnSateTaichan1 = new javax.swing.JButton();
        btnJawaLompat5 = new javax.swing.JButton();
        jawabanQuisJawa5 = new javax.swing.JLabel();
        bgJawai17 = new javax.swing.JLabel();
        lompatJawa = new javax.swing.JPanel();
        btnTidakJawa1 = new javax.swing.JButton();
        btnYaJawa1 = new javax.swing.JButton();
        bgJawa15 = new javax.swing.JLabel();
        selesaiJawa = new javax.swing.JPanel();
        btnTidakJawa2 = new javax.swing.JButton();
        btnYaJawa2 = new javax.swing.JButton();
        bgJawa16 = new javax.swing.JLabel();
        bali = new javax.swing.JPanel();
        panelBali1 = new javax.swing.JPanel();
        btnSwipeKiriBali = new javax.swing.JButton();
        btnSwipeKananBali = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        sideBali1 = new javax.swing.JLabel();
        sideBali2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelBali2 = new javax.swing.JPanel();
        btnKembaliBali1 = new javax.swing.JButton();
        btnLanjutBali1 = new javax.swing.JButton();
        bgBali2 = new javax.swing.JLabel();
        panelBali3 = new javax.swing.JPanel();
        btnKembaliBali2 = new javax.swing.JButton();
        btnLanjutBali2 = new javax.swing.JButton();
        bgBali3 = new javax.swing.JLabel();
        panelBali4 = new javax.swing.JPanel();
        bgBali4 = new javax.swing.JLabel();
        quisBali = new javax.swing.JPanel();
        btnBaliNanti = new javax.swing.JButton();
        btnBaliAyo = new javax.swing.JButton();
        bgBali5 = new javax.swing.JLabel();
        quisBali1 = new javax.swing.JPanel();
        btnHariLibur = new javax.swing.JButton();
        btnHariGuru = new javax.swing.JButton();
        btnHariNasional = new javax.swing.JButton();
        btnHariSuci = new javax.swing.JButton();
        btnBaliLompat1 = new javax.swing.JButton();
        jawabanQuisBali1 = new javax.swing.JLabel();
        bgBali6 = new javax.swing.JLabel();
        quisBali2 = new javax.swing.JPanel();
        btnUleeBalang = new javax.swing.JButton();
        btnAesanGede = new javax.swing.JButton();
        btnBajuManten = new javax.swing.JButton();
        btnPayasAgung = new javax.swing.JButton();
        btnBaliLompat2 = new javax.swing.JButton();
        jawabanQuisBali2 = new javax.swing.JLabel();
        bgBali7 = new javax.swing.JLabel();
        quisBali3 = new javax.swing.JPanel();
        btnCandiBentar = new javax.swing.JButton();
        btnCandiSingosari = new javax.swing.JButton();
        btnCandiBorobudur = new javax.swing.JButton();
        btnCandiSebentar = new javax.swing.JButton();
        btnBaliLompat3 = new javax.swing.JButton();
        jawabanQuisBali3 = new javax.swing.JLabel();
        bgBali8 = new javax.swing.JLabel();
        quisBali4 = new javax.swing.JPanel();
        btnPulauSeribuPura = new javax.swing.JButton();
        btnPulauDewanta = new javax.swing.JButton();
        btnPulauDewata = new javax.swing.JButton();
        btnPulauSeribu = new javax.swing.JButton();
        btnBaliLompat4 = new javax.swing.JButton();
        jawabanQuisBali4 = new javax.swing.JLabel();
        bgBali9 = new javax.swing.JLabel();
        quisBali5 = new javax.swing.JPanel();
        btnSateKambing = new javax.swing.JButton();
        btnSateAyam = new javax.swing.JButton();
        btnSateLilit = new javax.swing.JButton();
        btnSateTaichan = new javax.swing.JButton();
        btnBaliLompat5 = new javax.swing.JButton();
        jawabanQuisBali5 = new javax.swing.JLabel();
        bgBali10 = new javax.swing.JLabel();
        lompatBali = new javax.swing.JPanel();
        btnTidakBali1 = new javax.swing.JButton();
        btnYaBali1 = new javax.swing.JButton();
        bgBali11 = new javax.swing.JLabel();
        selesaiBali = new javax.swing.JPanel();
        btnTidakBali2 = new javax.swing.JButton();
        btnYaBali2 = new javax.swing.JButton();
        bgBali12 = new javax.swing.JLabel();
        kalimantan = new javax.swing.JPanel();
        panelKalimantan1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        bgKalimantan = new javax.swing.JLabel();
        panelKalimantan2 = new javax.swing.JPanel();
        btnKembaliKalimantan = new javax.swing.JButton();
        btnLanjutKalimantan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panelKalimantan3 = new javax.swing.JPanel();
        btnKembaliKalimantan2 = new javax.swing.JButton();
        btnLanjutKalimantan2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        panelKalimantan4 = new javax.swing.JPanel();
        quisKalimantan = new javax.swing.JPanel();
        btnKalimantanNanti = new javax.swing.JButton();
        btnKalimantanAyo = new javax.swing.JButton();
        bgKalimantan2 = new javax.swing.JLabel();
        quisKalimantan1 = new javax.swing.JPanel();
        btnBiruTua = new javax.swing.JButton();
        btnMerah = new javax.swing.JButton();
        btnBiru = new javax.swing.JButton();
        btnHijau = new javax.swing.JButton();
        btnKalimantanLompat1 = new javax.swing.JButton();
        jawabanQuisKalimantan1 = new javax.swing.JLabel();
        bgKalimantan21 = new javax.swing.JLabel();
        quisKalimantan2 = new javax.swing.JPanel();
        btnTujuh = new javax.swing.JButton();
        btnEmpat4 = new javax.swing.JButton();
        btnLima = new javax.swing.JButton();
        btnEnam = new javax.swing.JButton();
        btnKalimantanLompat2 = new javax.swing.JButton();
        jawabanQuisKalimantan2 = new javax.swing.JLabel();
        bgKalimantan22 = new javax.swing.JLabel();
        quisKalimantan3 = new javax.swing.JPanel();
        btnKebaya = new javax.swing.JButton();
        btnTaa = new javax.swing.JButton();
        btnHoodie = new javax.swing.JButton();
        btnKemben = new javax.swing.JButton();
        btnKalimantanLompat3 = new javax.swing.JButton();
        jawabanQuisKalimantan3 = new javax.swing.JLabel();
        bgKalimantan23 = new javax.swing.JLabel();
        quisKalimantan4 = new javax.swing.JPanel();
        btnBanjar = new javax.swing.JButton();
        btnOsing = new javax.swing.JButton();
        btnKutai = new javax.swing.JButton();
        btnDayak = new javax.swing.JButton();
        btnKalimantanLompat4 = new javax.swing.JButton();
        jawabanQuisKalimantan4 = new javax.swing.JLabel();
        bgKalimantan24 = new javax.swing.JLabel();
        quisKalimantan5 = new javax.swing.JPanel();
        btnHariLibur6 = new javax.swing.JButton();
        btnHariGuru6 = new javax.swing.JButton();
        btnHariNasional6 = new javax.swing.JButton();
        btnLamin = new javax.swing.JButton();
        btnKalimantanLompat5 = new javax.swing.JButton();
        jawabanQuisKalimantan5 = new javax.swing.JLabel();
        bgKalimantan25 = new javax.swing.JLabel();
        lompatKalimantan = new javax.swing.JPanel();
        btnTidakKalimantan1 = new javax.swing.JButton();
        btnYaKalimantan1 = new javax.swing.JButton();
        bgKalimantan17 = new javax.swing.JLabel();
        selesaiKalimantan = new javax.swing.JPanel();
        btnTidakKalimantan2 = new javax.swing.JButton();
        btnYaKalimantan2 = new javax.swing.JButton();
        bgKalimantan18 = new javax.swing.JLabel();
        sulawesi = new javax.swing.JPanel();
        panelSulawesi1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bgSulawesi = new javax.swing.JLabel();
        panelSulawesi2 = new javax.swing.JPanel();
        btnKembaliSulawesi1 = new javax.swing.JButton();
        btnLanjutSulawesi1 = new javax.swing.JButton();
        bgSulawesi1 = new javax.swing.JLabel();
        panelSulawesi3 = new javax.swing.JPanel();
        btnKembaliSulawesi2 = new javax.swing.JButton();
        btnLanjutSulawesi2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        panelSulawesi4 = new javax.swing.JPanel();
        quisSulawesi = new javax.swing.JPanel();
        btnSulawesiNanti = new javax.swing.JButton();
        btnSulawesiAyo = new javax.swing.JButton();
        bgSulawesi2 = new javax.swing.JLabel();
        quisSulawesi1 = new javax.swing.JPanel();
        btnRambut = new javax.swing.JButton();
        btnTelinga = new javax.swing.JButton();
        btnKulit = new javax.swing.JButton();
        btnBadan = new javax.swing.JButton();
        btnSulawesiLompat1 = new javax.swing.JButton();
        jawabanQuisSulawesi1 = new javax.swing.JLabel();
        bgSulawesi26 = new javax.swing.JLabel();
        quisSulawesi2 = new javax.swing.JPanel();
        btn4Empat = new javax.swing.JButton();
        btn2Dua = new javax.swing.JButton();
        btnSatu1 = new javax.swing.JButton();
        btnTiga3 = new javax.swing.JButton();
        btnSulawesiLompat2 = new javax.swing.JButton();
        jawabanQuisSulawesi2 = new javax.swing.JLabel();
        bgSulawesi27 = new javax.swing.JLabel();
        quisSulawesi3 = new javax.swing.JPanel();
        btnLamin2 = new javax.swing.JButton();
        btnJoglo = new javax.swing.JButton();
        btnTambi = new javax.swing.JButton();
        btnRumah = new javax.swing.JButton();
        btnSulawesiLompat3 = new javax.swing.JButton();
        jawabanQuisSulawesi3 = new javax.swing.JLabel();
        bgSulawesi28 = new javax.swing.JLabel();
        quisSulawesi4 = new javax.swing.JPanel();
        btn98 = new javax.swing.JButton();
        btn180 = new javax.swing.JButton();
        btn134 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btnSulawesiLompat4 = new javax.swing.JButton();
        jawabanQuisSulawesi4 = new javax.swing.JLabel();
        bgSulawesi29 = new javax.swing.JLabel();
        quisSulawesi5 = new javax.swing.JPanel();
        btnSulawesi2 = new javax.swing.JButton();
        btnPapua2 = new javax.swing.JButton();
        btnJawa2 = new javax.swing.JButton();
        btnBali2 = new javax.swing.JButton();
        btnSulawesiLompat5 = new javax.swing.JButton();
        jawabanQuisSulawesi5 = new javax.swing.JLabel();
        bgSulawesi30 = new javax.swing.JLabel();
        lompatSulawesi = new javax.swing.JPanel();
        btnTidakSulawesi1 = new javax.swing.JButton();
        btnYaSulawesi1 = new javax.swing.JButton();
        bgSulawesi13 = new javax.swing.JLabel();
        selesaiSulawesi = new javax.swing.JPanel();
        btnTidakSulawesi2 = new javax.swing.JButton();
        btnYaSulawesi2 = new javax.swing.JButton();
        bgSulawesi14 = new javax.swing.JLabel();
        maluku = new javax.swing.JPanel();
        panelMaluku1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        bgMaluku = new javax.swing.JLabel();
        panelMaluku2 = new javax.swing.JPanel();
        btnKembaliMaluku2 = new javax.swing.JButton();
        btnLanjutMaluku2 = new javax.swing.JButton();
        bgSulawesi3 = new javax.swing.JLabel();
        panelMaluku3 = new javax.swing.JPanel();
        btnKembaliMaluku3 = new javax.swing.JButton();
        btnLanjutMaluku3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        panelMaluku4 = new javax.swing.JPanel();
        quisMaluku = new javax.swing.JPanel();
        btnMalukuNanti = new javax.swing.JButton();
        btnMalukuAyo = new javax.swing.JButton();
        bgMaluku2 = new javax.swing.JLabel();
        quisMaluku1 = new javax.swing.JPanel();
        btn1satu1 = new javax.swing.JButton();
        btn2Dua2 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btnMalukuLompat = new javax.swing.JButton();
        jawabanQuisMaluku1 = new javax.swing.JLabel();
        bgMaluku31 = new javax.swing.JLabel();
        quisMaluku2 = new javax.swing.JPanel();
        btnAsmat = new javax.swing.JButton();
        btnSunda = new javax.swing.JButton();
        btnBanjar2 = new javax.swing.JButton();
        btnTernate = new javax.swing.JButton();
        btnMalukuLompat1 = new javax.swing.JButton();
        jawabanQuisMaluku2 = new javax.swing.JLabel();
        bgMaluku32 = new javax.swing.JLabel();
        quisMaluku3 = new javax.swing.JPanel();
        btnTunik = new javax.swing.JButton();
        btnKemben3 = new javax.swing.JButton();
        btnNona = new javax.swing.JButton();
        btnKebaya3 = new javax.swing.JButton();
        btnMalukuLompat2 = new javax.swing.JButton();
        jawabanQuisMaluku3 = new javax.swing.JLabel();
        bgMaluku33 = new javax.swing.JLabel();
        quisMaluku4 = new javax.swing.JPanel();
        btnRambut2 = new javax.swing.JButton();
        btnMancung = new javax.swing.JButton();
        btnPutih = new javax.swing.JButton();
        btnGelap = new javax.swing.JButton();
        btnMalukuLompat3 = new javax.swing.JButton();
        jawabanQuisMaluku4 = new javax.swing.JLabel();
        bgMaluku34 = new javax.swing.JLabel();
        quisMaluku5 = new javax.swing.JPanel();
        btnKalimantan2 = new javax.swing.JButton();
        btnMaluku2 = new javax.swing.JButton();
        btnSumatra2 = new javax.swing.JButton();
        btnJawa4 = new javax.swing.JButton();
        btnMalukuLompat4 = new javax.swing.JButton();
        jawabanQuisMaluku5 = new javax.swing.JLabel();
        bgMaluku35 = new javax.swing.JLabel();
        lompatMaluku = new javax.swing.JPanel();
        btnTidakMaluku1 = new javax.swing.JButton();
        btnYaMaluku1 = new javax.swing.JButton();
        bgMaluku15 = new javax.swing.JLabel();
        selesaiMaluku = new javax.swing.JPanel();
        btnTidakMaluku2 = new javax.swing.JButton();
        btnYaMaluku2 = new javax.swing.JButton();
        bgMaluku16 = new javax.swing.JLabel();
        papua = new javax.swing.JPanel();
        panelPapua1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        bgPapua = new javax.swing.JLabel();
        panelPapua2 = new javax.swing.JPanel();
        btnKembaliPapua1 = new javax.swing.JButton();
        btnLanjutpaua1 = new javax.swing.JButton();
        bgPapua24 = new javax.swing.JLabel();
        panelPapua3 = new javax.swing.JPanel();
        btnKembaliPapua2 = new javax.swing.JButton();
        btnLanjutPapua2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        panelPapua4 = new javax.swing.JPanel();
        quisPapua = new javax.swing.JPanel();
        btnPapuaNanti = new javax.swing.JButton();
        btnPapuaAyo = new javax.swing.JButton();
        bgPapua2 = new javax.swing.JLabel();
        quisPapua1 = new javax.swing.JPanel();
        btnPapua3 = new javax.swing.JButton();
        btnAceh3 = new javax.swing.JButton();
        btnJatim = new javax.swing.JButton();
        btnBali4 = new javax.swing.JButton();
        btnPapuaLompat = new javax.swing.JButton();
        jawabanQuisPapua1 = new javax.swing.JLabel();
        bgPapua36 = new javax.swing.JLabel();
        quisPapua2 = new javax.swing.JPanel();
        btnSumuri = new javax.swing.JButton();
        btnBiak = new javax.swing.JButton();
        btnAsmat4 = new javax.swing.JButton();
        btnSunda4 = new javax.swing.JButton();
        btnPapuaLompat1 = new javax.swing.JButton();
        jawabanQuisPapua2 = new javax.swing.JLabel();
        bgPapua37 = new javax.swing.JLabel();
        quisPapua3 = new javax.swing.JPanel();
        btnMLHP = new javax.swing.JButton();
        btnRLKH = new javax.swing.JButton();
        btnRKKH = new javax.swing.JButton();
        btnHMML = new javax.swing.JButton();
        btnPapuaLompat2 = new javax.swing.JButton();
        jawabanQuisPapua3 = new javax.swing.JLabel();
        bgPapua38 = new javax.swing.JLabel();
        quisPapua4 = new javax.swing.JPanel();
        btnPiring = new javax.swing.JButton();
        btnSajojo = new javax.swing.JButton();
        btnGandrung = new javax.swing.JButton();
        btnGambyong = new javax.swing.JButton();
        btnPapuaLompat3 = new javax.swing.JButton();
        jawabanQuisPapua4 = new javax.swing.JLabel();
        bgPapua39 = new javax.swing.JLabel();
        quisPapua5 = new javax.swing.JPanel();
        btnHariLibur21 = new javax.swing.JButton();
        btnHariGuru21 = new javax.swing.JButton();
        btnHariNasional21 = new javax.swing.JButton();
        btnHariSuci21 = new javax.swing.JButton();
        btnPapuaLompat4 = new javax.swing.JButton();
        jawabanQuisPapua5 = new javax.swing.JLabel();
        bgPapua40 = new javax.swing.JLabel();
        lompatPapua = new javax.swing.JPanel();
        btnTidakPapua1 = new javax.swing.JButton();
        btnYaPapua1 = new javax.swing.JButton();
        bgPapua17 = new javax.swing.JLabel();
        selesaiPapua = new javax.swing.JPanel();
        btnTidakPapua2 = new javax.swing.JButton();
        btnYaPapua2 = new javax.swing.JButton();
        bgPapua18 = new javax.swing.JLabel();
        copy9 = new javax.swing.JPanel();
        copy10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelUtama.setLayout(new java.awt.CardLayout());

        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMulai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Mulai.png"))); // NOI18N
        btnMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaiActionPerformed(evt);
            }
        });
        dashboard.add(btnMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 370, 60));

        btnKeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Keluar.png"))); // NOI18N
        btnKeluar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        dashboard.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 90, 30));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/petaIndonesia.png"))); // NOI18N
        dashboard.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1370, 770));

        panelUtama.add(dashboard, "dashboard");

        pendahuluan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali.png"))); // NOI18N
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        pendahuluan.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 90, 30));

        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut.png"))); // NOI18N
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });
        pendahuluan.add(btnLanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 100, 30));

        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/pendahuluan.png"))); // NOI18N
        pendahuluan.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        panelUtama.add(pendahuluan, "pendahuluan");

        peta.setLayout(null);

        labelMaluku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMaluku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMalukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMalukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMalukuMouseExited(evt);
            }
        });
        peta.add(labelMaluku);
        labelMaluku.setBounds(870, 520, 140, 40);

        labelSulawesi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSulawesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSulawesiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSulawesiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSulawesiMouseExited(evt);
            }
        });
        peta.add(labelSulawesi);
        labelSulawesi.setBounds(690, 370, 280, 240);

        labelKalimantan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelKalimantan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKalimantanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelKalimantanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelKalimantanMouseExited(evt);
            }
        });
        peta.add(labelKalimantan);
        labelKalimantan.setBounds(444, 220, 290, 350);

        labelJawa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelJawa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelJawaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelJawaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelJawaMouseExited(evt);
            }
        });
        peta.add(labelJawa);
        labelJawa.setBounds(350, 610, 240, 80);

        labelSumatra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSumatra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSumatraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSumatraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSumatraMouseExited(evt);
            }
        });
        peta.add(labelSumatra);
        labelSumatra.setBounds(70, 230, 330, 420);

        labelBali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBaliMouseExited(evt);
            }
        });
        peta.add(labelBali);
        labelBali.setBounds(590, 620, 40, 110);

        labelPapua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPapua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPapuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPapuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPapuaMouseExited(evt);
            }
        });
        peta.add(labelPapua);
        labelPapua.setBounds(990, 430, 290, 280);

        pulau.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        peta.add(pulau);
        pulau.setBounds(20, 724, 190, 30);

        labelKompas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKompas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/peta/kompas.png"))); // NOI18N
        peta.add(labelKompas);
        labelKompas.setBounds(1150, 40, 180, 170);

        btnKembaliPeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/peta/kembaliPeta.png"))); // NOI18N
        btnKembaliPeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPetaActionPerformed(evt);
            }
        });
        peta.add(btnKembaliPeta);
        btnKembaliPeta.setBounds(30, 30, 90, 30);

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/peta.jpg"))); // NOI18N
        peta.add(bg3);
        bg3.setBounds(0, 0, 1370, 770);

        panelUtama.add(peta, "peta");

        sumatra.setLayout(new java.awt.CardLayout());

        panelSumatra1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelSumatra1.add(jButton1);
        jButton1.setBounds(1280, 370, 50, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Merah Putih Dirgahayu Indonesia Banner (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelSumatra1.add(jButton2);
        jButton2.setBounds(30, 370, 50, 30);

        bgSumatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/POSTER SUMATRA.png"))); // NOI18N
        panelSumatra1.add(bgSumatra);
        bgSumatra.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra1, "panelSumatra1");

        panelSumatra2.setLayout(null);

        btnKembaliSumatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliSumatra.setMargin(new java.awt.Insets(2, 14, 6, 14));
        btnKembaliSumatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSumatraActionPerformed(evt);
            }
        });
        panelSumatra2.add(btnKembaliSumatra);
        btnKembaliSumatra.setBounds(720, 700, 120, 40);

        btnLanjutSumatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutSumatra.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btnLanjutSumatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSumatraActionPerformed(evt);
            }
        });
        panelSumatra2.add(btnLanjutSumatra);
        btnLanjutSumatra.setBounds(910, 700, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/1.png"))); // NOI18N
        panelSumatra2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra2, "panelSumatra2");

        panelSumatra3.setLayout(null);

        btnKembaliSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliSumatra2.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnKembaliSumatra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSumatra2ActionPerformed(evt);
            }
        });
        panelSumatra3.add(btnKembaliSumatra2);
        btnKembaliSumatra2.setBounds(710, 700, 140, 30);

        btnLanjutSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutSumatra2.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnLanjutSumatra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSumatra2ActionPerformed(evt);
            }
        });
        panelSumatra3.add(btnLanjutSumatra2);
        btnLanjutSumatra2.setBounds(910, 700, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/2.png"))); // NOI18N
        panelSumatra3.add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra3, "panelSumatra3");

        panelSumatra4.setLayout(null);

        btnLanjutSumatra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutSumatra3.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnLanjutSumatra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSumatra3ActionPerformed(evt);
            }
        });
        panelSumatra4.add(btnLanjutSumatra3);
        btnLanjutSumatra3.setBounds(910, 700, 130, 30);

        btnKembaliSumatra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliSumatra3.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnKembaliSumatra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSumatra3ActionPerformed(evt);
            }
        });
        panelSumatra4.add(btnKembaliSumatra3);
        btnKembaliSumatra3.setBounds(720, 700, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/3.png"))); // NOI18N
        panelSumatra4.add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra4, "panelSumatra4");

        panelSumatra5.setLayout(null);

        btnKembaliSumatra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliSumatra4.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnKembaliSumatra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSumatra4ActionPerformed(evt);
            }
        });
        panelSumatra5.add(btnKembaliSumatra4);
        btnKembaliSumatra4.setBounds(720, 700, 120, 30);

        btnLanjutSumatra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutSumatra4.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnLanjutSumatra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSumatra4ActionPerformed(evt);
            }
        });
        panelSumatra5.add(btnLanjutSumatra4);
        btnLanjutSumatra4.setBounds(910, 700, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/4.png"))); // NOI18N
        panelSumatra5.add(jLabel4);
        jLabel4.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra5, "panelSumatra5");

        panelSumatra6.setLayout(null);

        btnKembaliSumatra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliSumatra5.setMargin(new java.awt.Insets(2, 7, 5, 14));
        btnKembaliSumatra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSumatra5ActionPerformed(evt);
            }
        });
        panelSumatra6.add(btnKembaliSumatra5);
        btnKembaliSumatra5.setBounds(250, 710, 150, 20);

        btnLanjutSumatra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutSumatra5.setMargin(new java.awt.Insets(2, 14, 5, 10));
        btnLanjutSumatra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSumatra5ActionPerformed(evt);
            }
        });
        panelSumatra6.add(btnLanjutSumatra5);
        btnLanjutSumatra5.setBounds(440, 710, 150, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/5.png"))); // NOI18N
        panelSumatra6.add(jLabel5);
        jLabel5.setBounds(0, 0, 1370, 770);

        sumatra.add(panelSumatra6, "panelSumatra6");

        panelSumatra7.setLayout(null);
        sumatra.add(panelSumatra7, "panelSumatra7");

        quisSumatra.setLayout(null);

        btnSumatraNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnSumatraNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraNantiActionPerformed(evt);
            }
        });
        quisSumatra.add(btnSumatraNanti);
        btnSumatraNanti.setBounds(710, 490, 70, 30);

        btnSumatraAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnSumatraAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraAyoActionPerformed(evt);
            }
        });
        quisSumatra.add(btnSumatraAyo);
        btnSumatraAyo.setBounds(560, 490, 70, 30);

        bgSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisSumatra.add(bgSumatra2);
        bgSumatra2.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra, "quisSumatra");

        quisSumatra1.setBackground(new java.awt.Color(255, 255, 255));
        quisSumatra1.setLayout(null);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM1d.png"))); // NOI18N
        btn1.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        quisSumatra1.add(btn1);
        btn1.setBounds(710, 640, 590, 40);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM1b.png"))); // NOI18N
        btn9.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn9MousePressed(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        quisSumatra1.add(btn9);
        btn9.setBounds(50, 640, 590, 40);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM1a.png"))); // NOI18N
        btn4.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        quisSumatra1.add(btn4);
        btn4.setBounds(60, 560, 580, 50);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM1c.png"))); // NOI18N
        btn7.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn7MousePressed(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        quisSumatra1.add(btn7);
        btn7.setBounds(710, 570, 590, 40);

        btnSumatraLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSumatraLompat1.setMargin(new java.awt.Insets(4, 14, 5, 14));
        btnSumatraLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraLompat1ActionPerformed(evt);
            }
        });
        quisSumatra1.add(btnSumatraLompat1);
        btnSumatraLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisSumatra1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSumatra1.add(jawabanQuisSumatra1);
        jawabanQuisSumatra1.setBounds(130, 710, 310, 60);

        bgSumatra8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/SUMATRA SOAL 1.png"))); // NOI18N
        quisSumatra1.add(bgSumatra8);
        bgSumatra8.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra1, "quisSumatra1");

        quisSumatra2.setBackground(new java.awt.Color(255, 255, 255));
        quisSumatra2.setLayout(null);

        btnSumatraBarat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM2d.png"))); // NOI18N
        btnSumatraBarat.setMargin(new java.awt.Insets(11, 14, 2, 14));
        btnSumatraBarat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatraBaratMousePressed(evt);
            }
        });
        btnSumatraBarat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraBaratActionPerformed(evt);
            }
        });
        quisSumatra2.add(btnSumatraBarat);
        btnSumatraBarat.setBounds(710, 640, 570, 40);

        btnSumatraSelatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM2c.png"))); // NOI18N
        btnSumatraSelatan.setMargin(new java.awt.Insets(6, 14, 5, 14));
        btnSumatraSelatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatraSelatanMousePressed(evt);
            }
        });
        btnSumatraSelatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraSelatanActionPerformed(evt);
            }
        });
        quisSumatra2.add(btnSumatraSelatan);
        btnSumatraSelatan.setBounds(710, 570, 570, 40);

        btnSumatraUtara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM2b.png"))); // NOI18N
        btnSumatraUtara.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnSumatraUtara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatraUtaraMousePressed(evt);
            }
        });
        btnSumatraUtara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraUtaraActionPerformed(evt);
            }
        });
        quisSumatra2.add(btnSumatraUtara);
        btnSumatraUtara.setBounds(60, 640, 560, 40);

        btnAceh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM2a.png"))); // NOI18N
        btnAceh.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnAceh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcehMousePressed(evt);
            }
        });
        btnAceh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcehActionPerformed(evt);
            }
        });
        quisSumatra2.add(btnAceh);
        btnAceh.setBounds(60, 570, 560, 40);

        btnSumatraLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSumatraLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSumatraLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraLompat2ActionPerformed(evt);
            }
        });
        quisSumatra2.add(btnSumatraLompat2);
        btnSumatraLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisSumatra2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSumatra2.add(jawabanQuisSumatra2);
        jawabanQuisSumatra2.setBounds(130, 710, 310, 60);

        bgSumatra9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/SUMATRA SOAL 2.png"))); // NOI18N
        quisSumatra2.add(bgSumatra9);
        bgSumatra9.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra2, "quisSumatra2");

        quisSumatra3.setBackground(new java.awt.Color(255, 255, 255));
        quisSumatra3.setLayout(null);

        btnCandiBentar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM3d.png"))); // NOI18N
        btnCandiBentar1.setMargin(new java.awt.Insets(12, 14, 2, 14));
        btnCandiBentar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiBentar1MousePressed(evt);
            }
        });
        btnCandiBentar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiBentar1ActionPerformed(evt);
            }
        });
        quisSumatra3.add(btnCandiBentar1);
        btnCandiBentar1.setBounds(710, 640, 580, 40);

        btnCandiSingosari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM3c.png"))); // NOI18N
        btnCandiSingosari1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiSingosari1MousePressed(evt);
            }
        });
        btnCandiSingosari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiSingosari1ActionPerformed(evt);
            }
        });
        quisSumatra3.add(btnCandiSingosari1);
        btnCandiSingosari1.setBounds(710, 570, 580, 40);

        btnCandiBorobudur1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM3b.png"))); // NOI18N
        btnCandiBorobudur1.setMargin(new java.awt.Insets(9, 14, 2, 7));
        btnCandiBorobudur1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiBorobudur1MousePressed(evt);
            }
        });
        btnCandiBorobudur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiBorobudur1ActionPerformed(evt);
            }
        });
        quisSumatra3.add(btnCandiBorobudur1);
        btnCandiBorobudur1.setBounds(40, 640, 590, 40);

        btnCandiSebentar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM3a.png"))); // NOI18N
        btnCandiSebentar1.setMargin(new java.awt.Insets(2, 14, 6, 14));
        btnCandiSebentar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiSebentar1MousePressed(evt);
            }
        });
        btnCandiSebentar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiSebentar1ActionPerformed(evt);
            }
        });
        quisSumatra3.add(btnCandiSebentar1);
        btnCandiSebentar1.setBounds(43, 570, 590, 40);

        btnSumatraLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSumatraLompat3.setMargin(new java.awt.Insets(2, 14, 9, 14));
        btnSumatraLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraLompat3ActionPerformed(evt);
            }
        });
        quisSumatra3.add(btnSumatraLompat3);
        btnSumatraLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisSumatra3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSumatra3.add(jawabanQuisSumatra3);
        jawabanQuisSumatra3.setBounds(130, 710, 310, 60);

        bgSumatra10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/SUMATRA SOAL 3.png"))); // NOI18N
        quisSumatra3.add(bgSumatra10);
        bgSumatra10.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra3, "quisSumatra3");

        quisSumatra4.setBackground(new java.awt.Color(255, 255, 255));
        quisSumatra4.setLayout(null);

        btnMieSedaap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM4d.png"))); // NOI18N
        btnMieSedaap.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnMieSedaap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMieSedaapMousePressed(evt);
            }
        });
        btnMieSedaap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMieSedaapActionPerformed(evt);
            }
        });
        quisSumatra4.add(btnMieSedaap);
        btnMieSedaap.setBounds(700, 640, 590, 40);

        btnMieAceh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM4c.png"))); // NOI18N
        btnMieAceh.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMieAceh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMieAcehMousePressed(evt);
            }
        });
        btnMieAceh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMieAcehActionPerformed(evt);
            }
        });
        quisSumatra4.add(btnMieAceh);
        btnMieAceh.setBounds(700, 570, 590, 40);

        btnMieIndomie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM4b.png"))); // NOI18N
        btnMieIndomie.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMieIndomie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMieIndomieMousePressed(evt);
            }
        });
        btnMieIndomie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMieIndomieActionPerformed(evt);
            }
        });
        quisSumatra4.add(btnMieIndomie);
        btnMieIndomie.setBounds(40, 650, 590, 30);

        btnMieGacoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM4a.png"))); // NOI18N
        btnMieGacoan.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMieGacoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMieGacoanMousePressed(evt);
            }
        });
        btnMieGacoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMieGacoanActionPerformed(evt);
            }
        });
        quisSumatra4.add(btnMieGacoan);
        btnMieGacoan.setBounds(40, 570, 590, 40);

        btnSumatraLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSumatraLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSumatraLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraLompat4ActionPerformed(evt);
            }
        });
        quisSumatra4.add(btnSumatraLompat4);
        btnSumatraLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisSumatra4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSumatra4.add(jawabanQuisSumatra4);
        jawabanQuisSumatra4.setBounds(130, 710, 310, 60);

        bgSumatra11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/SUMATRA SOAL 4.png"))); // NOI18N
        quisSumatra4.add(bgSumatra11);
        bgSumatra11.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra4, "quisSumatra4");

        quisSumatra5.setBackground(new java.awt.Color(255, 255, 255));
        quisSumatra5.setLayout(null);

        btnBali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM5d.png"))); // NOI18N
        btnBali.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnBali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBaliMousePressed(evt);
            }
        });
        btnBali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliActionPerformed(evt);
            }
        });
        quisSumatra5.add(btnBali);
        btnBali.setBounds(710, 640, 580, 40);

        btnJakarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM5c.png"))); // NOI18N
        btnJakarta.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJakarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJakartaMousePressed(evt);
            }
        });
        btnJakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJakartaActionPerformed(evt);
            }
        });
        quisSumatra5.add(btnJakarta);
        btnJakarta.setBounds(710, 570, 580, 40);

        btnMalang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM5b.png"))); // NOI18N
        btnMalang.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMalangMousePressed(evt);
            }
        });
        btnMalang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalangActionPerformed(evt);
            }
        });
        quisSumatra5.add(btnMalang);
        btnMalang.setBounds(50, 650, 580, 30);

        btnSumatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/Answer/SUM5a.png"))); // NOI18N
        btnSumatra.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSumatra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatraMousePressed(evt);
            }
        });
        btnSumatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraActionPerformed(evt);
            }
        });
        quisSumatra5.add(btnSumatra);
        btnSumatra.setBounds(50, 570, 580, 40);

        btnSumatraLompat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSumatraLompat5.setMargin(new java.awt.Insets(2, 14, 3, 14));
        btnSumatraLompat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatraLompat5ActionPerformed(evt);
            }
        });
        quisSumatra5.add(btnSumatraLompat5);
        btnSumatraLompat5.setBounds(620, 17, 120, 20);

        jawabanQuisSumatra5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSumatra5.add(jawabanQuisSumatra5);
        jawabanQuisSumatra5.setBounds(130, 710, 310, 60);

        bgSumatra12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/sumatra/SUMATRA SOAL 5.png"))); // NOI18N
        quisSumatra5.add(bgSumatra12);
        bgSumatra12.setBounds(0, 0, 1370, 770);

        sumatra.add(quisSumatra5, "quisSumatra5");

        lompatSumatra.setBackground(new java.awt.Color(255, 255, 255));
        lompatSumatra.setLayout(null);

        btnTidakSumatra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakSumatra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakSumatra1ActionPerformed(evt);
            }
        });
        lompatSumatra.add(btnTidakSumatra1);
        btnTidakSumatra1.setBounds(700, 490, 90, 30);

        btnYaSumatra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaSumatra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaSumatra1ActionPerformed(evt);
            }
        });
        lompatSumatra.add(btnYaSumatra1);
        btnYaSumatra1.setBounds(550, 490, 90, 30);

        bgSumatra13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatSumatra.add(bgSumatra13);
        bgSumatra13.setBounds(0, 0, 1370, 770);

        sumatra.add(lompatSumatra, "lompatSumatra");

        selesaiSumatra.setBackground(new java.awt.Color(255, 255, 255));
        selesaiSumatra.setLayout(null);

        btnTidakSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakSumatra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakSumatra2ActionPerformed(evt);
            }
        });
        selesaiSumatra.add(btnTidakSumatra2);
        btnTidakSumatra2.setBounds(700, 480, 90, 20);

        btnYaSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaSumatra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaSumatra2ActionPerformed(evt);
            }
        });
        selesaiSumatra.add(btnYaSumatra2);
        btnYaSumatra2.setBounds(550, 480, 90, 20);

        bgSumatra14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiSumatra.add(bgSumatra14);
        bgSumatra14.setBounds(0, 0, 1370, 770);

        sumatra.add(selesaiSumatra, "selesaiSumatra");

        panelUtama.add(sumatra, "sumatra");

        jawa.setLayout(new java.awt.CardLayout());

        panelJawa1.setLayout(null);

        btnLanjutJawa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Merah Putih Dirgahayu Indonesia Banner (1).png"))); // NOI18N
        btnLanjutJawa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutJawa1ActionPerformed(evt);
            }
        });
        panelJawa1.add(btnLanjutJawa1);
        btnLanjutJawa1.setBounds(1280, 370, 50, 30);

        btnKembaliJawa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        btnKembaliJawa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliJawa1ActionPerformed(evt);
            }
        });
        panelJawa1.add(btnKembaliJawa1);
        btnKembaliJawa1.setBounds(40, 370, 50, 30);

        bgJawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/POSTER JAWA.png"))); // NOI18N
        panelJawa1.add(bgJawa);
        bgJawa.setBounds(0, 0, 1370, 770);

        jawa.add(panelJawa1, "panelJawa1");

        panelJawa2.setLayout(null);

        btnKembaliJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliJawa2.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliJawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliJawa2ActionPerformed(evt);
            }
        });
        panelJawa2.add(btnKembaliJawa2);
        btnKembaliJawa2.setBounds(710, 710, 140, 20);

        btnLanjutJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutJawa2.setMargin(new java.awt.Insets(12, 8, 7, 18));
        btnLanjutJawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutJawa2ActionPerformed(evt);
            }
        });
        panelJawa2.add(btnLanjutJawa2);
        btnLanjutJawa2.setBounds(920, 700, 120, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/1.png"))); // NOI18N
        panelJawa2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1370, 770);

        jawa.add(panelJawa2, "panelJawa2");

        panelJawa3.setLayout(null);

        btnKembaliJawa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliJawa3.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliJawa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliJawa3ActionPerformed(evt);
            }
        });
        panelJawa3.add(btnKembaliJawa3);
        btnKembaliJawa3.setBounds(710, 710, 140, 20);

        btnLanjutJawa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutJawa3.setMargin(new java.awt.Insets(12, 8, 7, 18));
        btnLanjutJawa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutJawa3ActionPerformed(evt);
            }
        });
        panelJawa3.add(btnLanjutJawa3);
        btnLanjutJawa3.setBounds(920, 700, 120, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/2.png"))); // NOI18N
        panelJawa3.add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 770);

        jawa.add(panelJawa3, "panelJawa3");

        panelJawa4.setLayout(null);

        btnKembaliJawa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliJawa4.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliJawa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliJawa4ActionPerformed(evt);
            }
        });
        panelJawa4.add(btnKembaliJawa4);
        btnKembaliJawa4.setBounds(710, 710, 140, 20);

        btnLanjutJawa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutJawa4.setMargin(new java.awt.Insets(12, 8, 7, 18));
        btnLanjutJawa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutJawa4ActionPerformed(evt);
            }
        });
        panelJawa4.add(btnLanjutJawa4);
        btnLanjutJawa4.setBounds(920, 700, 120, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/3.png"))); // NOI18N
        panelJawa4.add(jLabel8);
        jLabel8.setBounds(0, 0, 1370, 770);

        jawa.add(panelJawa4, "panelJawa4");

        panelJawa5.setLayout(null);

        btnKembaliJawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliJawa.setMargin(new java.awt.Insets(2, 16, 5, 14));
        btnKembaliJawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliJawaActionPerformed(evt);
            }
        });
        panelJawa5.add(btnKembaliJawa);
        btnKembaliJawa.setBounds(250, 700, 140, 40);

        btnLanjutJawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutJawa.setMargin(new java.awt.Insets(2, 14, 5, 9));
        btnLanjutJawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutJawaActionPerformed(evt);
            }
        });
        panelJawa5.add(btnLanjutJawa);
        btnLanjutJawa.setBounds(440, 710, 150, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/4.png"))); // NOI18N
        panelJawa5.add(jLabel9);
        jLabel9.setBounds(0, 0, 1370, 770);

        jawa.add(panelJawa5, "panelJawa5");

        quisJawa.setLayout(null);

        btnJawaNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnJawaNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaNantiActionPerformed(evt);
            }
        });
        quisJawa.add(btnJawaNanti);
        btnJawaNanti.setBounds(710, 490, 70, 30);

        btnJawaAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnJawaAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaAyoActionPerformed(evt);
            }
        });
        quisJawa.add(btnJawaAyo);
        btnJawaAyo.setBounds(560, 490, 70, 30);

        bgJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisJawa.add(bgJawa2);
        bgJawa2.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa, "quisJawa");

        quisJawa1.setBackground(new java.awt.Color(255, 255, 255));
        quisJawa1.setLayout(null);

        btnSipit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j1d.png"))); // NOI18N
        btnSipit.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnSipit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSipitMousePressed(evt);
            }
        });
        btnSipit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSipitActionPerformed(evt);
            }
        });
        quisJawa1.add(btnSipit);
        btnSipit.setBounds(710, 640, 590, 40);

        btnMataLebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j1b.png"))); // NOI18N
        btnMataLebar.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnMataLebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMataLebarMousePressed(evt);
            }
        });
        btnMataLebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMataLebarActionPerformed(evt);
            }
        });
        quisJawa1.add(btnMataLebar);
        btnMataLebar.setBounds(50, 640, 590, 40);

        btnRambutMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j1a.png"))); // NOI18N
        btnRambutMerah.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnRambutMerah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRambutMerahMousePressed(evt);
            }
        });
        btnRambutMerah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRambutMerahActionPerformed(evt);
            }
        });
        quisJawa1.add(btnRambutMerah);
        btnRambutMerah.setBounds(60, 560, 580, 50);

        btnRambutKriting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j1c.png"))); // NOI18N
        btnRambutKriting.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnRambutKriting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRambutKritingMousePressed(evt);
            }
        });
        btnRambutKriting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRambutKritingActionPerformed(evt);
            }
        });
        quisJawa1.add(btnRambutKriting);
        btnRambutKriting.setBounds(710, 570, 590, 40);

        btnJawaLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnJawaLompat1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJawaLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaLompat1ActionPerformed(evt);
            }
        });
        quisJawa1.add(btnJawaLompat1);
        btnJawaLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisJawa1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisJawa1.add(jawabanQuisJawa1);
        jawabanQuisJawa1.setBounds(130, 710, 310, 60);

        bgJawa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/JAWA SOAL 1.png"))); // NOI18N
        quisJawa1.add(bgJawa13);
        bgJawa13.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa1, "quisJawa1");

        quisJawa2.setBackground(new java.awt.Color(255, 255, 255));
        quisJawa2.setLayout(null);

        btnPapua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j2d.png"))); // NOI18N
        btnPapua.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnPapua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPapuaMousePressed(evt);
            }
        });
        btnPapua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaActionPerformed(evt);
            }
        });
        quisJawa2.add(btnPapua);
        btnPapua.setBounds(710, 640, 570, 40);

        btnSumatra6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j2c.png"))); // NOI18N
        btnSumatra6.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSumatra6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatra6MousePressed(evt);
            }
        });
        btnSumatra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatra6ActionPerformed(evt);
            }
        });
        quisJawa2.add(btnSumatra6);
        btnSumatra6.setBounds(710, 570, 570, 40);

        btnJawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j2b.png"))); // NOI18N
        btnJawa.setMargin(new java.awt.Insets(4, 14, 2, 14));
        btnJawa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJawaMousePressed(evt);
            }
        });
        btnJawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaActionPerformed(evt);
            }
        });
        quisJawa2.add(btnJawa);
        btnJawa.setBounds(60, 640, 560, 40);

        btnKalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j2a.png"))); // NOI18N
        btnKalimantan.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnKalimantan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKalimantanMousePressed(evt);
            }
        });
        btnKalimantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanActionPerformed(evt);
            }
        });
        quisJawa2.add(btnKalimantan);
        btnKalimantan.setBounds(60, 570, 560, 40);

        btnJawaLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnJawaLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJawaLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaLompat2ActionPerformed(evt);
            }
        });
        quisJawa2.add(btnJawaLompat2);
        btnJawaLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisJawa2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisJawa2.add(jawabanQuisJawa2);
        jawabanQuisJawa2.setBounds(130, 710, 310, 60);

        bgJawa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/JAWA SOAL 2.png"))); // NOI18N
        quisJawa2.add(bgJawa14);
        bgJawa14.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa2, "quisJawa2");

        quisJawa3.setBackground(new java.awt.Color(255, 255, 255));
        quisJawa3.setLayout(null);

        btnEmpat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j3d.png"))); // NOI18N
        btnEmpat.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btnEmpat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpatMousePressed(evt);
            }
        });
        btnEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatActionPerformed(evt);
            }
        });
        quisJawa3.add(btnEmpat);
        btnEmpat.setBounds(710, 640, 580, 40);

        btnTiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j3c.png"))); // NOI18N
        btnTiga.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnTiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTigaMousePressed(evt);
            }
        });
        btnTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigaActionPerformed(evt);
            }
        });
        quisJawa3.add(btnTiga);
        btnTiga.setBounds(710, 570, 580, 40);

        btnDua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j3b.png"))); // NOI18N
        btnDua.setMargin(new java.awt.Insets(8, 14, 2, 7));
        btnDua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDuaMousePressed(evt);
            }
        });
        btnDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuaActionPerformed(evt);
            }
        });
        quisJawa3.add(btnDua);
        btnDua.setBounds(40, 640, 590, 40);

        btnSatu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j3a.png"))); // NOI18N
        btnSatu.setMargin(new java.awt.Insets(2, 14, 6, 14));
        btnSatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSatuMousePressed(evt);
            }
        });
        btnSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuActionPerformed(evt);
            }
        });
        quisJawa3.add(btnSatu);
        btnSatu.setBounds(43, 570, 590, 40);

        btnJawaLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnJawaLompat3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJawaLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaLompat3ActionPerformed(evt);
            }
        });
        quisJawa3.add(btnJawaLompat3);
        btnJawaLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisJawa3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisJawa3.add(jawabanQuisJawa3);
        jawabanQuisJawa3.setBounds(130, 710, 310, 60);

        bgJawa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/JAWA SOAL 3.png"))); // NOI18N
        quisJawa3.add(bgJawa19);
        bgJawa19.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa3, "quisJawa3");

        quisJawa4.setBackground(new java.awt.Color(255, 255, 255));
        quisJawa4.setLayout(null);

        btnBakpao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j4d.png"))); // NOI18N
        btnBakpao.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnBakpao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBakpaoMousePressed(evt);
            }
        });
        btnBakpao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBakpaoActionPerformed(evt);
            }
        });
        quisJawa4.add(btnBakpao);
        btnBakpao.setBounds(700, 640, 590, 40);

        btnLontong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j4c.png"))); // NOI18N
        btnLontong.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnLontong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLontongMousePressed(evt);
            }
        });
        btnLontong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLontongActionPerformed(evt);
            }
        });
        quisJawa4.add(btnLontong);
        btnLontong.setBounds(700, 570, 590, 40);

        btnSteak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j4b.png"))); // NOI18N
        btnSteak.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSteak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSteakMousePressed(evt);
            }
        });
        btnSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSteakActionPerformed(evt);
            }
        });
        quisJawa4.add(btnSteak);
        btnSteak.setBounds(40, 650, 590, 30);

        btnGudeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j4a.png"))); // NOI18N
        btnGudeg.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnGudeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGudegMousePressed(evt);
            }
        });
        btnGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGudegActionPerformed(evt);
            }
        });
        quisJawa4.add(btnGudeg);
        btnGudeg.setBounds(40, 570, 590, 40);

        btnJawaLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnJawaLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJawaLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaLompat4ActionPerformed(evt);
            }
        });
        quisJawa4.add(btnJawaLompat4);
        btnJawaLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisJawa4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisJawa4.add(jawabanQuisJawa4);
        jawabanQuisJawa4.setBounds(130, 710, 310, 60);

        bgJawa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/JAWA SOAL 4.png"))); // NOI18N
        quisJawa4.add(bgJawa18);
        bgJawa18.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa4, "quisJawa4");

        quisJawa5.setBackground(new java.awt.Color(255, 255, 255));
        quisJawa5.setLayout(null);

        btnSateKambing1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j5d.png"))); // NOI18N
        btnSateKambing1.setMargin(new java.awt.Insets(15, 14, 8, 14));
        btnSateKambing1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateKambing1MousePressed(evt);
            }
        });
        btnSateKambing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateKambing1ActionPerformed(evt);
            }
        });
        quisJawa5.add(btnSateKambing1);
        btnSateKambing1.setBounds(700, 640, 590, 40);

        btnSateAyam1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j5c.png"))); // NOI18N
        btnSateAyam1.setMargin(new java.awt.Insets(5, 14, 8, 14));
        btnSateAyam1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateAyam1MousePressed(evt);
            }
        });
        btnSateAyam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateAyam1ActionPerformed(evt);
            }
        });
        quisJawa5.add(btnSateAyam1);
        btnSateAyam1.setBounds(700, 570, 590, 40);

        btnSateLilit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j5b.png"))); // NOI18N
        btnSateLilit1.setMargin(new java.awt.Insets(6, 14, 10, 14));
        btnSateLilit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateLilit1MousePressed(evt);
            }
        });
        btnSateLilit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateLilit1ActionPerformed(evt);
            }
        });
        quisJawa5.add(btnSateLilit1);
        btnSateLilit1.setBounds(40, 650, 590, 30);

        btnSateTaichan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/Answer/j5a.png"))); // NOI18N
        btnSateTaichan1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSateTaichan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateTaichan1MousePressed(evt);
            }
        });
        btnSateTaichan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateTaichan1ActionPerformed(evt);
            }
        });
        quisJawa5.add(btnSateTaichan1);
        btnSateTaichan1.setBounds(40, 570, 590, 40);

        btnJawaLompat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnJawaLompat5.setMargin(new java.awt.Insets(2, 14, 7, 8));
        btnJawaLompat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawaLompat5ActionPerformed(evt);
            }
        });
        quisJawa5.add(btnJawaLompat5);
        btnJawaLompat5.setBounds(620, 17, 120, 20);

        jawabanQuisJawa5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisJawa5.add(jawabanQuisJawa5);
        jawabanQuisJawa5.setBounds(130, 710, 310, 60);

        bgJawai17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/JAWA/JAWA SOAL 5.png"))); // NOI18N
        quisJawa5.add(bgJawai17);
        bgJawai17.setBounds(0, 0, 1370, 770);

        jawa.add(quisJawa5, "quisJawa5");

        lompatJawa.setBackground(new java.awt.Color(255, 255, 255));
        lompatJawa.setLayout(null);

        btnTidakJawa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakJawa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakJawa1ActionPerformed(evt);
            }
        });
        lompatJawa.add(btnTidakJawa1);
        btnTidakJawa1.setBounds(700, 490, 90, 30);

        btnYaJawa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaJawa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaJawa1ActionPerformed(evt);
            }
        });
        lompatJawa.add(btnYaJawa1);
        btnYaJawa1.setBounds(550, 490, 90, 30);

        bgJawa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatJawa.add(bgJawa15);
        bgJawa15.setBounds(0, 0, 1370, 770);

        jawa.add(lompatJawa, "lompatJawa");

        selesaiJawa.setBackground(new java.awt.Color(255, 255, 255));
        selesaiJawa.setLayout(null);

        btnTidakJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakJawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakJawa2ActionPerformed(evt);
            }
        });
        selesaiJawa.add(btnTidakJawa2);
        btnTidakJawa2.setBounds(700, 480, 90, 20);

        btnYaJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaJawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaJawa2ActionPerformed(evt);
            }
        });
        selesaiJawa.add(btnYaJawa2);
        btnYaJawa2.setBounds(550, 480, 90, 20);

        bgJawa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiJawa.add(bgJawa16);
        bgJawa16.setBounds(0, 0, 1370, 770);

        jawa.add(selesaiJawa, "selesaiJawa");

        panelUtama.add(jawa, "jawa");

        bali.setLayout(new java.awt.CardLayout());

        panelBali1.setBackground(new java.awt.Color(255, 255, 255));
        panelBali1.setLayout(null);

        btnSwipeKiriBali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/swipeKiri.png"))); // NOI18N
        btnSwipeKiriBali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwipeKiriBaliActionPerformed(evt);
            }
        });
        panelBali1.add(btnSwipeKiriBali);
        btnSwipeKiriBali.setBounds(30, 370, 50, 30);

        btnSwipeKananBali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/swipeKanan.png"))); // NOI18N
        btnSwipeKananBali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwipeKananBaliActionPerformed(evt);
            }
        });
        panelBali1.add(btnSwipeKananBali);
        btnSwipeKananBali.setBounds(1300, 370, 40, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/nyepi.png"))); // NOI18N
        panelBali1.add(jLabel13);
        jLabel13.setBounds(540, 410, 290, 360);

        sideBali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/nkdnvd.png"))); // NOI18N
        panelBali1.add(sideBali1);
        sideBali1.setBounds(0, 0, 540, 770);

        sideBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/ubud.png"))); // NOI18N
        panelBali1.add(sideBali2);
        sideBali2.setBounds(830, 0, 540, 770);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/barong.png"))); // NOI18N
        panelBali1.add(jLabel12);
        jLabel12.setBounds(540, 0, 290, 410);

        bali.add(panelBali1, "panelBali1");

        panelBali2.setBackground(new java.awt.Color(255, 255, 255));
        panelBali2.setLayout(null);

        btnKembaliBali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliBali1.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliBali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliBali1ActionPerformed(evt);
            }
        });
        panelBali2.add(btnKembaliBali1);
        btnKembaliBali1.setBounds(750, 720, 140, 30);

        btnLanjutBali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutBali1.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnLanjutBali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutBali1ActionPerformed(evt);
            }
        });
        panelBali2.add(btnLanjutBali1);
        btnLanjutBali1.setBounds(960, 720, 130, 30);

        bgBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/1.png"))); // NOI18N
        panelBali2.add(bgBali2);
        bgBali2.setBounds(0, 0, 1370, 770);

        bali.add(panelBali2, "panelBali2");

        panelBali3.setBackground(new java.awt.Color(255, 255, 255));
        panelBali3.setLayout(null);

        btnKembaliBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliBali2.setMargin(new java.awt.Insets(2, 16, 5, 14));
        btnKembaliBali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliBali2ActionPerformed(evt);
            }
        });
        panelBali3.add(btnKembaliBali2);
        btnKembaliBali2.setBounds(260, 720, 150, 30);

        btnLanjutBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutBali2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnLanjutBali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutBali2ActionPerformed(evt);
            }
        });
        panelBali3.add(btnLanjutBali2);
        btnLanjutBali2.setBounds(470, 720, 150, 30);

        bgBali3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/2.png"))); // NOI18N
        panelBali3.add(bgBali3);
        bgBali3.setBounds(0, 0, 1370, 770);

        bali.add(panelBali3, "panelBali3");

        panelBali4.setBackground(new java.awt.Color(255, 255, 255));
        panelBali4.setLayout(null);

        bgBali4.setText("bgBali4");
        panelBali4.add(bgBali4);
        bgBali4.setBounds(0, 0, 1370, 770);

        bali.add(panelBali4, "panelBali4");

        quisBali.setBackground(new java.awt.Color(255, 255, 255));
        quisBali.setLayout(null);

        btnBaliNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnBaliNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliNantiActionPerformed(evt);
            }
        });
        quisBali.add(btnBaliNanti);
        btnBaliNanti.setBounds(710, 490, 70, 30);

        btnBaliAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnBaliAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliAyoActionPerformed(evt);
            }
        });
        quisBali.add(btnBaliAyo);
        btnBaliAyo.setBounds(560, 490, 70, 30);

        bgBali5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisBali.add(bgBali5);
        bgBali5.setBounds(0, 0, 1370, 770);

        bali.add(quisBali, "quisBali");

        quisBali1.setBackground(new java.awt.Color(255, 255, 255));
        quisBali1.setLayout(null);

        btnHariLibur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali1d.png"))); // NOI18N
        btnHariLibur.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnHariLibur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariLiburMousePressed(evt);
            }
        });
        btnHariLibur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariLiburActionPerformed(evt);
            }
        });
        quisBali1.add(btnHariLibur);
        btnHariLibur.setBounds(710, 640, 590, 40);

        btnHariGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali1b.png"))); // NOI18N
        btnHariGuru.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnHariGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariGuruMousePressed(evt);
            }
        });
        btnHariGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariGuruActionPerformed(evt);
            }
        });
        quisBali1.add(btnHariGuru);
        btnHariGuru.setBounds(50, 640, 590, 40);

        btnHariNasional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali1a.png"))); // NOI18N
        btnHariNasional.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnHariNasional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariNasionalMousePressed(evt);
            }
        });
        btnHariNasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariNasionalActionPerformed(evt);
            }
        });
        quisBali1.add(btnHariNasional);
        btnHariNasional.setBounds(60, 560, 580, 50);

        btnHariSuci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali1c.png"))); // NOI18N
        btnHariSuci.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnHariSuci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariSuciMousePressed(evt);
            }
        });
        btnHariSuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariSuciActionPerformed(evt);
            }
        });
        quisBali1.add(btnHariSuci);
        btnHariSuci.setBounds(710, 570, 590, 40);

        btnBaliLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnBaliLompat1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBaliLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliLompat1ActionPerformed(evt);
            }
        });
        quisBali1.add(btnBaliLompat1);
        btnBaliLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisBali1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisBali1.add(jawabanQuisBali1);
        jawabanQuisBali1.setBounds(130, 710, 310, 60);

        bgBali6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Quis BALI 1.png"))); // NOI18N
        quisBali1.add(bgBali6);
        bgBali6.setBounds(0, 0, 1370, 770);

        bali.add(quisBali1, "quisBali1");

        quisBali2.setBackground(new java.awt.Color(255, 255, 255));
        quisBali2.setLayout(null);

        btnUleeBalang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali2d.png"))); // NOI18N
        btnUleeBalang.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnUleeBalang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUleeBalangMousePressed(evt);
            }
        });
        btnUleeBalang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUleeBalangActionPerformed(evt);
            }
        });
        quisBali2.add(btnUleeBalang);
        btnUleeBalang.setBounds(710, 640, 570, 40);

        btnAesanGede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali2c.png"))); // NOI18N
        btnAesanGede.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnAesanGede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAesanGedeMousePressed(evt);
            }
        });
        btnAesanGede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAesanGedeActionPerformed(evt);
            }
        });
        quisBali2.add(btnAesanGede);
        btnAesanGede.setBounds(710, 570, 570, 40);

        btnBajuManten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali2b.png"))); // NOI18N
        btnBajuManten.setMargin(new java.awt.Insets(4, 14, 2, 14));
        btnBajuManten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBajuMantenMousePressed(evt);
            }
        });
        btnBajuManten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajuMantenActionPerformed(evt);
            }
        });
        quisBali2.add(btnBajuManten);
        btnBajuManten.setBounds(60, 640, 560, 40);

        btnPayasAgung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali2a.png"))); // NOI18N
        btnPayasAgung.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPayasAgung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPayasAgungMousePressed(evt);
            }
        });
        btnPayasAgung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayasAgungActionPerformed(evt);
            }
        });
        quisBali2.add(btnPayasAgung);
        btnPayasAgung.setBounds(60, 570, 560, 40);

        btnBaliLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnBaliLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBaliLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliLompat2ActionPerformed(evt);
            }
        });
        quisBali2.add(btnBaliLompat2);
        btnBaliLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisBali2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisBali2.add(jawabanQuisBali2);
        jawabanQuisBali2.setBounds(130, 710, 310, 60);

        bgBali7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Quis BALI 2.png"))); // NOI18N
        quisBali2.add(bgBali7);
        bgBali7.setBounds(0, 0, 1370, 770);

        bali.add(quisBali2, "quisBali2");

        quisBali3.setBackground(new java.awt.Color(255, 255, 255));
        quisBali3.setLayout(null);

        btnCandiBentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali3d.png"))); // NOI18N
        btnCandiBentar.setMargin(new java.awt.Insets(8, 14, 2, 14));
        btnCandiBentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiBentarMousePressed(evt);
            }
        });
        btnCandiBentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiBentarActionPerformed(evt);
            }
        });
        quisBali3.add(btnCandiBentar);
        btnCandiBentar.setBounds(710, 640, 580, 40);

        btnCandiSingosari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali3c.png"))); // NOI18N
        btnCandiSingosari.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnCandiSingosari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiSingosariMousePressed(evt);
            }
        });
        btnCandiSingosari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiSingosariActionPerformed(evt);
            }
        });
        quisBali3.add(btnCandiSingosari);
        btnCandiSingosari.setBounds(710, 570, 580, 40);

        btnCandiBorobudur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali3b.png"))); // NOI18N
        btnCandiBorobudur.setMargin(new java.awt.Insets(8, 14, 2, 7));
        btnCandiBorobudur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiBorobudurMousePressed(evt);
            }
        });
        btnCandiBorobudur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiBorobudurActionPerformed(evt);
            }
        });
        quisBali3.add(btnCandiBorobudur);
        btnCandiBorobudur.setBounds(40, 640, 590, 40);

        btnCandiSebentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali3a.png"))); // NOI18N
        btnCandiSebentar.setMargin(new java.awt.Insets(2, 14, 6, 14));
        btnCandiSebentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCandiSebentarMousePressed(evt);
            }
        });
        btnCandiSebentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandiSebentarActionPerformed(evt);
            }
        });
        quisBali3.add(btnCandiSebentar);
        btnCandiSebentar.setBounds(43, 570, 590, 40);

        btnBaliLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnBaliLompat3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBaliLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliLompat3ActionPerformed(evt);
            }
        });
        quisBali3.add(btnBaliLompat3);
        btnBaliLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisBali3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisBali3.add(jawabanQuisBali3);
        jawabanQuisBali3.setBounds(130, 710, 310, 60);

        bgBali8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Quis BALI 3.png"))); // NOI18N
        quisBali3.add(bgBali8);
        bgBali8.setBounds(0, 0, 1370, 770);

        bali.add(quisBali3, "quisBali3");

        quisBali4.setBackground(new java.awt.Color(255, 255, 255));
        quisBali4.setLayout(null);

        btnPulauSeribuPura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali4d.png"))); // NOI18N
        btnPulauSeribuPura.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnPulauSeribuPura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPulauSeribuPuraMousePressed(evt);
            }
        });
        btnPulauSeribuPura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulauSeribuPuraActionPerformed(evt);
            }
        });
        quisBali4.add(btnPulauSeribuPura);
        btnPulauSeribuPura.setBounds(700, 640, 590, 40);

        btnPulauDewanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali4c.png"))); // NOI18N
        btnPulauDewanta.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPulauDewanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPulauDewantaMousePressed(evt);
            }
        });
        btnPulauDewanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulauDewantaActionPerformed(evt);
            }
        });
        quisBali4.add(btnPulauDewanta);
        btnPulauDewanta.setBounds(700, 570, 590, 40);

        btnPulauDewata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali4b.png"))); // NOI18N
        btnPulauDewata.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPulauDewata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPulauDewataMousePressed(evt);
            }
        });
        btnPulauDewata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulauDewataActionPerformed(evt);
            }
        });
        quisBali4.add(btnPulauDewata);
        btnPulauDewata.setBounds(40, 650, 590, 30);

        btnPulauSeribu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali4a.png"))); // NOI18N
        btnPulauSeribu.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPulauSeribu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPulauSeribuMousePressed(evt);
            }
        });
        btnPulauSeribu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulauSeribuActionPerformed(evt);
            }
        });
        quisBali4.add(btnPulauSeribu);
        btnPulauSeribu.setBounds(40, 570, 590, 40);

        btnBaliLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnBaliLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBaliLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliLompat4ActionPerformed(evt);
            }
        });
        quisBali4.add(btnBaliLompat4);
        btnBaliLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisBali4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisBali4.add(jawabanQuisBali4);
        jawabanQuisBali4.setBounds(130, 710, 310, 60);

        bgBali9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Quis BALI 4.png"))); // NOI18N
        quisBali4.add(bgBali9);
        bgBali9.setBounds(0, 0, 1370, 770);

        bali.add(quisBali4, "quisBali4");

        quisBali5.setBackground(new java.awt.Color(255, 255, 255));
        quisBali5.setLayout(null);

        btnSateKambing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali5d.png"))); // NOI18N
        btnSateKambing.setMargin(new java.awt.Insets(15, 14, 2, 14));
        btnSateKambing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateKambingMousePressed(evt);
            }
        });
        btnSateKambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateKambingActionPerformed(evt);
            }
        });
        quisBali5.add(btnSateKambing);
        btnSateKambing.setBounds(700, 640, 590, 40);

        btnSateAyam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali5c.png"))); // NOI18N
        btnSateAyam.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnSateAyam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateAyamMousePressed(evt);
            }
        });
        btnSateAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateAyamActionPerformed(evt);
            }
        });
        quisBali5.add(btnSateAyam);
        btnSateAyam.setBounds(700, 570, 590, 40);

        btnSateLilit.setBackground(new java.awt.Color(255, 102, 102));
        btnSateLilit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali5b.png"))); // NOI18N
        btnSateLilit.setMargin(new java.awt.Insets(6, 14, 5, 14));
        btnSateLilit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateLilitMousePressed(evt);
            }
        });
        btnSateLilit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateLilitActionPerformed(evt);
            }
        });
        quisBali5.add(btnSateLilit);
        btnSateLilit.setBounds(40, 640, 590, 50);

        btnSateTaichan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Answer/OpsiBali5a.png"))); // NOI18N
        btnSateTaichan.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSateTaichan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSateTaichanMousePressed(evt);
            }
        });
        btnSateTaichan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSateTaichanActionPerformed(evt);
            }
        });
        quisBali5.add(btnSateTaichan);
        btnSateTaichan.setBounds(40, 570, 590, 40);

        btnBaliLompat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnBaliLompat5.setMargin(new java.awt.Insets(2, 14, 7, 8));
        btnBaliLompat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaliLompat5ActionPerformed(evt);
            }
        });
        quisBali5.add(btnBaliLompat5);
        btnBaliLompat5.setBounds(620, 17, 120, 20);

        jawabanQuisBali5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisBali5.add(jawabanQuisBali5);
        jawabanQuisBali5.setBounds(130, 710, 310, 60);

        bgBali10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/bali/Quis BALI 5.png"))); // NOI18N
        quisBali5.add(bgBali10);
        bgBali10.setBounds(0, 0, 1370, 770);

        bali.add(quisBali5, "quisBali5");

        lompatBali.setBackground(new java.awt.Color(255, 255, 255));
        lompatBali.setLayout(null);

        btnTidakBali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakBali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakBali1ActionPerformed(evt);
            }
        });
        lompatBali.add(btnTidakBali1);
        btnTidakBali1.setBounds(700, 490, 90, 30);

        btnYaBali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaBali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaBali1ActionPerformed(evt);
            }
        });
        lompatBali.add(btnYaBali1);
        btnYaBali1.setBounds(550, 490, 90, 30);

        bgBali11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatBali.add(bgBali11);
        bgBali11.setBounds(0, 0, 1370, 770);

        bali.add(lompatBali, "lompatBali");

        selesaiBali.setBackground(new java.awt.Color(255, 255, 255));
        selesaiBali.setLayout(null);

        btnTidakBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakBali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakBali2ActionPerformed(evt);
            }
        });
        selesaiBali.add(btnTidakBali2);
        btnTidakBali2.setBounds(700, 480, 90, 20);

        btnYaBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaBali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaBali2ActionPerformed(evt);
            }
        });
        selesaiBali.add(btnYaBali2);
        btnYaBali2.setBounds(550, 480, 90, 20);

        bgBali12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiBali.add(bgBali12);
        bgBali12.setBounds(0, 0, 1370, 770);

        bali.add(selesaiBali, "selesaiBali");

        panelUtama.add(bali, "bali");

        kalimantan.setLayout(new java.awt.CardLayout());

        panelKalimantan1.setLayout(null);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton7.setMargin(new java.awt.Insets(7, 14, 2, 14));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelKalimantan1.add(jButton7);
        jButton7.setBounds(1270, 360, 60, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton8.setMargin(new java.awt.Insets(7, 14, 2, 14));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelKalimantan1.add(jButton8);
        jButton8.setBounds(40, 360, 50, 30);

        bgKalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/POSTER KALIMANTAN.png"))); // NOI18N
        panelKalimantan1.add(bgKalimantan);
        bgKalimantan.setBounds(0, 0, 1370, 770);

        kalimantan.add(panelKalimantan1, "panelKalimantan1");

        panelKalimantan2.setLayout(null);

        btnKembaliKalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliKalimantan.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliKalimantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliKalimantanActionPerformed(evt);
            }
        });
        panelKalimantan2.add(btnKembaliKalimantan);
        btnKembaliKalimantan.setBounds(710, 710, 140, 20);

        btnLanjutKalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutKalimantan.setMargin(new java.awt.Insets(12, 8, 7, 18));
        btnLanjutKalimantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutKalimantanActionPerformed(evt);
            }
        });
        panelKalimantan2.add(btnLanjutKalimantan);
        btnLanjutKalimantan.setBounds(920, 700, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/1.png"))); // NOI18N
        panelKalimantan2.add(jLabel10);
        jLabel10.setBounds(0, 0, 1370, 770);

        kalimantan.add(panelKalimantan2, "panelKalimantan2");

        panelKalimantan3.setLayout(null);

        btnKembaliKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliKalimantan2.setMargin(new java.awt.Insets(10, 16, 5, 14));
        btnKembaliKalimantan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliKalimantan2ActionPerformed(evt);
            }
        });
        panelKalimantan3.add(btnKembaliKalimantan2);
        btnKembaliKalimantan2.setBounds(250, 700, 140, 30);

        btnLanjutKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutKalimantan2.setMargin(new java.awt.Insets(10, 14, 5, 14));
        btnLanjutKalimantan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutKalimantan2ActionPerformed(evt);
            }
        });
        panelKalimantan3.add(btnLanjutKalimantan2);
        btnLanjutKalimantan2.setBounds(450, 700, 130, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/2.png"))); // NOI18N
        panelKalimantan3.add(jLabel11);
        jLabel11.setBounds(0, 0, 1370, 770);

        kalimantan.add(panelKalimantan3, "panelKalimantan3");

        panelKalimantan4.setLayout(null);
        kalimantan.add(panelKalimantan4, "panelKalimantan4");

        quisKalimantan.setLayout(null);

        btnKalimantanNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnKalimantanNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanNantiActionPerformed(evt);
            }
        });
        quisKalimantan.add(btnKalimantanNanti);
        btnKalimantanNanti.setBounds(710, 490, 70, 30);

        btnKalimantanAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnKalimantanAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanAyoActionPerformed(evt);
            }
        });
        quisKalimantan.add(btnKalimantanAyo);
        btnKalimantanAyo.setBounds(560, 490, 70, 30);

        bgKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisKalimantan.add(bgKalimantan2);
        bgKalimantan2.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan, "quisKalimantan");

        quisKalimantan1.setBackground(new java.awt.Color(255, 255, 255));
        quisKalimantan1.setLayout(null);

        btnBiruTua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K1d.png"))); // NOI18N
        btnBiruTua.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnBiruTua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBiruTuaMousePressed(evt);
            }
        });
        btnBiruTua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiruTuaActionPerformed(evt);
            }
        });
        quisKalimantan1.add(btnBiruTua);
        btnBiruTua.setBounds(710, 640, 590, 40);

        btnMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K1b.png"))); // NOI18N
        btnMerah.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnMerah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMerahMousePressed(evt);
            }
        });
        btnMerah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMerahActionPerformed(evt);
            }
        });
        quisKalimantan1.add(btnMerah);
        btnMerah.setBounds(50, 640, 590, 40);

        btnBiru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K1a.png"))); // NOI18N
        btnBiru.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnBiru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBiruMousePressed(evt);
            }
        });
        btnBiru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiruActionPerformed(evt);
            }
        });
        quisKalimantan1.add(btnBiru);
        btnBiru.setBounds(60, 560, 580, 50);

        btnHijau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K1c.png"))); // NOI18N
        btnHijau.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnHijau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHijauMousePressed(evt);
            }
        });
        btnHijau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHijauActionPerformed(evt);
            }
        });
        quisKalimantan1.add(btnHijau);
        btnHijau.setBounds(710, 570, 590, 40);

        btnKalimantanLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnKalimantanLompat1.setMargin(new java.awt.Insets(2, 14, 5, 10));
        btnKalimantanLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanLompat1ActionPerformed(evt);
            }
        });
        quisKalimantan1.add(btnKalimantanLompat1);
        btnKalimantanLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisKalimantan1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisKalimantan1.add(jawabanQuisKalimantan1);
        jawabanQuisKalimantan1.setBounds(130, 710, 310, 60);

        bgKalimantan21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/KALIMANTAN SOAL 1.png"))); // NOI18N
        quisKalimantan1.add(bgKalimantan21);
        bgKalimantan21.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan1, "quisKalimantan1");

        quisKalimantan2.setBackground(new java.awt.Color(255, 255, 255));
        quisKalimantan2.setLayout(null);

        btnTujuh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K2d.png"))); // NOI18N
        btnTujuh.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnTujuh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTujuhMousePressed(evt);
            }
        });
        btnTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTujuhActionPerformed(evt);
            }
        });
        quisKalimantan2.add(btnTujuh);
        btnTujuh.setBounds(710, 640, 590, 40);

        btnEmpat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K2b.png"))); // NOI18N
        btnEmpat4.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnEmpat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpat4MousePressed(evt);
            }
        });
        btnEmpat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpat4ActionPerformed(evt);
            }
        });
        quisKalimantan2.add(btnEmpat4);
        btnEmpat4.setBounds(50, 640, 590, 40);

        btnLima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K2a.png"))); // NOI18N
        btnLima.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnLima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimaMousePressed(evt);
            }
        });
        btnLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimaActionPerformed(evt);
            }
        });
        quisKalimantan2.add(btnLima);
        btnLima.setBounds(60, 560, 580, 50);

        btnEnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K2c.png"))); // NOI18N
        btnEnam.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnEnam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEnamMousePressed(evt);
            }
        });
        btnEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnamActionPerformed(evt);
            }
        });
        quisKalimantan2.add(btnEnam);
        btnEnam.setBounds(710, 570, 590, 40);

        btnKalimantanLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnKalimantanLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnKalimantanLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanLompat2ActionPerformed(evt);
            }
        });
        quisKalimantan2.add(btnKalimantanLompat2);
        btnKalimantanLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisKalimantan2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisKalimantan2.add(jawabanQuisKalimantan2);
        jawabanQuisKalimantan2.setBounds(130, 710, 310, 60);

        bgKalimantan22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/KALIMANTAN SOAL 2.png"))); // NOI18N
        quisKalimantan2.add(bgKalimantan22);
        bgKalimantan22.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan2, "quisKalimantan2");

        quisKalimantan3.setBackground(new java.awt.Color(255, 255, 255));
        quisKalimantan3.setLayout(null);

        btnKebaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K3d.png"))); // NOI18N
        btnKebaya.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnKebaya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKebayaMousePressed(evt);
            }
        });
        btnKebaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKebayaActionPerformed(evt);
            }
        });
        quisKalimantan3.add(btnKebaya);
        btnKebaya.setBounds(710, 640, 590, 40);

        btnTaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K3b.png"))); // NOI18N
        btnTaa.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnTaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTaaMousePressed(evt);
            }
        });
        btnTaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaaActionPerformed(evt);
            }
        });
        quisKalimantan3.add(btnTaa);
        btnTaa.setBounds(50, 640, 590, 40);

        btnHoodie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K3a.png"))); // NOI18N
        btnHoodie.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnHoodie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHoodieMousePressed(evt);
            }
        });
        btnHoodie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoodieActionPerformed(evt);
            }
        });
        quisKalimantan3.add(btnHoodie);
        btnHoodie.setBounds(60, 560, 580, 50);

        btnKemben.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K3c.png"))); // NOI18N
        btnKemben.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnKemben.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKembenMousePressed(evt);
            }
        });
        btnKemben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembenActionPerformed(evt);
            }
        });
        quisKalimantan3.add(btnKemben);
        btnKemben.setBounds(710, 570, 590, 40);

        btnKalimantanLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnKalimantanLompat3.setMargin(new java.awt.Insets(2, 14, 5, 10));
        btnKalimantanLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanLompat3ActionPerformed(evt);
            }
        });
        quisKalimantan3.add(btnKalimantanLompat3);
        btnKalimantanLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisKalimantan3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisKalimantan3.add(jawabanQuisKalimantan3);
        jawabanQuisKalimantan3.setBounds(130, 710, 310, 60);

        bgKalimantan23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/KALIMANTAN SOAL 3.png"))); // NOI18N
        quisKalimantan3.add(bgKalimantan23);
        bgKalimantan23.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan3, "quisKalimantan3");

        quisKalimantan4.setBackground(new java.awt.Color(255, 255, 255));
        quisKalimantan4.setLayout(null);

        btnBanjar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K4d.png"))); // NOI18N
        btnBanjar.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnBanjar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBanjarMousePressed(evt);
            }
        });
        btnBanjar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanjarActionPerformed(evt);
            }
        });
        quisKalimantan4.add(btnBanjar);
        btnBanjar.setBounds(710, 640, 590, 40);

        btnOsing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K4b.png"))); // NOI18N
        btnOsing.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnOsing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOsingMousePressed(evt);
            }
        });
        btnOsing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsingActionPerformed(evt);
            }
        });
        quisKalimantan4.add(btnOsing);
        btnOsing.setBounds(50, 640, 590, 40);

        btnKutai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K4a.png"))); // NOI18N
        btnKutai.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnKutai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKutaiMousePressed(evt);
            }
        });
        btnKutai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKutaiActionPerformed(evt);
            }
        });
        quisKalimantan4.add(btnKutai);
        btnKutai.setBounds(60, 560, 580, 50);

        btnDayak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K4c.png"))); // NOI18N
        btnDayak.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnDayak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDayakMousePressed(evt);
            }
        });
        btnDayak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDayakActionPerformed(evt);
            }
        });
        quisKalimantan4.add(btnDayak);
        btnDayak.setBounds(710, 570, 590, 40);

        btnKalimantanLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnKalimantanLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnKalimantanLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanLompat4ActionPerformed(evt);
            }
        });
        quisKalimantan4.add(btnKalimantanLompat4);
        btnKalimantanLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisKalimantan4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisKalimantan4.add(jawabanQuisKalimantan4);
        jawabanQuisKalimantan4.setBounds(130, 710, 310, 60);

        bgKalimantan24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/KALIMANTAN SOAL 4.png"))); // NOI18N
        quisKalimantan4.add(bgKalimantan24);
        bgKalimantan24.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan4, "quisKalimantan4");

        quisKalimantan5.setBackground(new java.awt.Color(255, 255, 255));
        quisKalimantan5.setLayout(null);

        btnHariLibur6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K5d.png"))); // NOI18N
        btnHariLibur6.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnHariLibur6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariLibur6MousePressed(evt);
            }
        });
        btnHariLibur6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariLibur6ActionPerformed(evt);
            }
        });
        quisKalimantan5.add(btnHariLibur6);
        btnHariLibur6.setBounds(710, 640, 590, 40);

        btnHariGuru6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K5b.png"))); // NOI18N
        btnHariGuru6.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnHariGuru6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariGuru6MousePressed(evt);
            }
        });
        btnHariGuru6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariGuru6ActionPerformed(evt);
            }
        });
        quisKalimantan5.add(btnHariGuru6);
        btnHariGuru6.setBounds(50, 640, 590, 40);

        btnHariNasional6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K5a.png"))); // NOI18N
        btnHariNasional6.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnHariNasional6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariNasional6MousePressed(evt);
            }
        });
        btnHariNasional6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariNasional6ActionPerformed(evt);
            }
        });
        quisKalimantan5.add(btnHariNasional6);
        btnHariNasional6.setBounds(60, 560, 580, 50);

        btnLamin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/Answer/K5c.png"))); // NOI18N
        btnLamin.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnLamin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLaminMousePressed(evt);
            }
        });
        btnLamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaminActionPerformed(evt);
            }
        });
        quisKalimantan5.add(btnLamin);
        btnLamin.setBounds(710, 570, 590, 40);

        btnKalimantanLompat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnKalimantanLompat5.setMargin(new java.awt.Insets(2, 14, 5, 10));
        btnKalimantanLompat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantanLompat5ActionPerformed(evt);
            }
        });
        quisKalimantan5.add(btnKalimantanLompat5);
        btnKalimantanLompat5.setBounds(620, 17, 120, 20);

        jawabanQuisKalimantan5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisKalimantan5.add(jawabanQuisKalimantan5);
        jawabanQuisKalimantan5.setBounds(130, 710, 310, 60);

        bgKalimantan25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KALIMANTAN/KALIMANTAN SOAL 5.png"))); // NOI18N
        quisKalimantan5.add(bgKalimantan25);
        bgKalimantan25.setBounds(0, 0, 1370, 770);

        kalimantan.add(quisKalimantan5, "quisKalimantan5");

        lompatKalimantan.setBackground(new java.awt.Color(255, 255, 255));
        lompatKalimantan.setLayout(null);

        btnTidakKalimantan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakKalimantan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakKalimantan1ActionPerformed(evt);
            }
        });
        lompatKalimantan.add(btnTidakKalimantan1);
        btnTidakKalimantan1.setBounds(700, 490, 90, 30);

        btnYaKalimantan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaKalimantan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaKalimantan1ActionPerformed(evt);
            }
        });
        lompatKalimantan.add(btnYaKalimantan1);
        btnYaKalimantan1.setBounds(550, 490, 90, 30);

        bgKalimantan17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatKalimantan.add(bgKalimantan17);
        bgKalimantan17.setBounds(0, 0, 1370, 770);

        kalimantan.add(lompatKalimantan, "lompatKalimantan");

        selesaiKalimantan.setBackground(new java.awt.Color(255, 255, 255));
        selesaiKalimantan.setLayout(null);

        btnTidakKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakKalimantan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakKalimantan2ActionPerformed(evt);
            }
        });
        selesaiKalimantan.add(btnTidakKalimantan2);
        btnTidakKalimantan2.setBounds(700, 480, 90, 20);

        btnYaKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaKalimantan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaKalimantan2ActionPerformed(evt);
            }
        });
        selesaiKalimantan.add(btnYaKalimantan2);
        btnYaKalimantan2.setBounds(550, 480, 90, 20);

        bgKalimantan18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiKalimantan.add(bgKalimantan18);
        bgKalimantan18.setBounds(0, 0, 1370, 770);

        kalimantan.add(selesaiKalimantan, "selesaiKalimantan");

        panelUtama.add(kalimantan, "kalimantan");

        sulawesi.setLayout(new java.awt.CardLayout());

        panelSulawesi1.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton3.setMargin(new java.awt.Insets(5, 14, 2, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelSulawesi1.add(jButton3);
        jButton3.setBounds(1280, 360, 60, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Merah Putih Dirgahayu Indonesia Banner (1).png"))); // NOI18N
        jButton4.setMargin(new java.awt.Insets(5, 14, 2, 14));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelSulawesi1.add(jButton4);
        jButton4.setBounds(40, 360, 50, 30);

        bgSulawesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/POSTER SULAWESI.png"))); // NOI18N
        panelSulawesi1.add(bgSulawesi);
        bgSulawesi.setBounds(0, 0, 1370, 770);

        sulawesi.add(panelSulawesi1, "panelSulawesi1");

        panelSulawesi2.setLayout(null);

        btnKembaliSulawesi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliSulawesi1.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliSulawesi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSulawesi1ActionPerformed(evt);
            }
        });
        panelSulawesi2.add(btnKembaliSulawesi1);
        btnKembaliSulawesi1.setBounds(720, 710, 120, 20);

        btnLanjutSulawesi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutSulawesi1.setMargin(new java.awt.Insets(12, 14, 5, 5));
        btnLanjutSulawesi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSulawesi1ActionPerformed(evt);
            }
        });
        panelSulawesi2.add(btnLanjutSulawesi1);
        btnLanjutSulawesi1.setBounds(920, 700, 100, 30);

        bgSulawesi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/1.png"))); // NOI18N
        panelSulawesi2.add(bgSulawesi1);
        bgSulawesi1.setBounds(0, 0, 1370, 770);

        sulawesi.add(panelSulawesi2, "panelSulawesi2");

        panelSulawesi3.setLayout(null);

        btnKembaliSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliSulawesi2.setMargin(new java.awt.Insets(10, 16, 5, 14));
        btnKembaliSulawesi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliSulawesi2ActionPerformed(evt);
            }
        });
        panelSulawesi3.add(btnKembaliSulawesi2);
        btnKembaliSulawesi2.setBounds(750, 700, 140, 30);

        btnLanjutSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutSulawesi2.setMargin(new java.awt.Insets(10, 14, 5, 14));
        btnLanjutSulawesi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutSulawesi2ActionPerformed(evt);
            }
        });
        panelSulawesi3.add(btnLanjutSulawesi2);
        btnLanjutSulawesi2.setBounds(950, 700, 130, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/2.png"))); // NOI18N
        panelSulawesi3.add(jLabel14);
        jLabel14.setBounds(0, 0, 1370, 770);

        sulawesi.add(panelSulawesi3, "panelSulawesi3");

        panelSulawesi4.setLayout(null);
        sulawesi.add(panelSulawesi4, "panelSulawesi4");

        quisSulawesi.setLayout(null);

        btnSulawesiNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnSulawesiNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiNantiActionPerformed(evt);
            }
        });
        quisSulawesi.add(btnSulawesiNanti);
        btnSulawesiNanti.setBounds(710, 490, 70, 30);

        btnSulawesiAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnSulawesiAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiAyoActionPerformed(evt);
            }
        });
        quisSulawesi.add(btnSulawesiAyo);
        btnSulawesiAyo.setBounds(560, 490, 70, 30);

        bgSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisSulawesi.add(bgSulawesi2);
        bgSulawesi2.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi, "quisSulawesi");

        quisSulawesi1.setBackground(new java.awt.Color(255, 255, 255));
        quisSulawesi1.setLayout(null);

        btnRambut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL1d.png"))); // NOI18N
        btnRambut.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnRambut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRambutMousePressed(evt);
            }
        });
        btnRambut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRambutActionPerformed(evt);
            }
        });
        quisSulawesi1.add(btnRambut);
        btnRambut.setBounds(710, 640, 590, 40);

        btnTelinga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL1b.png"))); // NOI18N
        btnTelinga.setMargin(new java.awt.Insets(7, 14, 2, 8));
        btnTelinga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTelingaMousePressed(evt);
            }
        });
        btnTelinga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelingaActionPerformed(evt);
            }
        });
        quisSulawesi1.add(btnTelinga);
        btnTelinga.setBounds(50, 640, 590, 40);

        btnKulit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL1a.png"))); // NOI18N
        btnKulit.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnKulit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKulitMousePressed(evt);
            }
        });
        btnKulit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKulitActionPerformed(evt);
            }
        });
        quisSulawesi1.add(btnKulit);
        btnKulit.setBounds(60, 560, 580, 50);

        btnBadan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL1c.png"))); // NOI18N
        btnBadan.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBadan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBadanMousePressed(evt);
            }
        });
        btnBadan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadanActionPerformed(evt);
            }
        });
        quisSulawesi1.add(btnBadan);
        btnBadan.setBounds(710, 570, 590, 40);

        btnSulawesiLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSulawesiLompat1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSulawesiLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiLompat1ActionPerformed(evt);
            }
        });
        quisSulawesi1.add(btnSulawesiLompat1);
        btnSulawesiLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisSulawesi1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSulawesi1.add(jawabanQuisSulawesi1);
        jawabanQuisSulawesi1.setBounds(130, 710, 310, 60);

        bgSulawesi26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/SULAWESI SOAL 1.png"))); // NOI18N
        quisSulawesi1.add(bgSulawesi26);
        bgSulawesi26.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi1, "quisSulawesi1");

        quisSulawesi2.setBackground(new java.awt.Color(255, 255, 255));
        quisSulawesi2.setLayout(null);

        btn4Empat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL2d.png"))); // NOI18N
        btn4Empat.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btn4Empat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4EmpatMousePressed(evt);
            }
        });
        btn4Empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4EmpatActionPerformed(evt);
            }
        });
        quisSulawesi2.add(btn4Empat);
        btn4Empat.setBounds(710, 640, 590, 40);

        btn2Dua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL2b.png"))); // NOI18N
        btn2Dua.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btn2Dua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2DuaMousePressed(evt);
            }
        });
        btn2Dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2DuaActionPerformed(evt);
            }
        });
        quisSulawesi2.add(btn2Dua);
        btn2Dua.setBounds(50, 640, 590, 40);

        btnSatu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL2a.png"))); // NOI18N
        btnSatu1.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnSatu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSatu1MousePressed(evt);
            }
        });
        btnSatu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatu1ActionPerformed(evt);
            }
        });
        quisSulawesi2.add(btnSatu1);
        btnSatu1.setBounds(60, 560, 580, 50);

        btnTiga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL2c.png"))); // NOI18N
        btnTiga3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnTiga3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiga3MousePressed(evt);
            }
        });
        btnTiga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiga3ActionPerformed(evt);
            }
        });
        quisSulawesi2.add(btnTiga3);
        btnTiga3.setBounds(710, 570, 590, 40);

        btnSulawesiLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSulawesiLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSulawesiLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiLompat2ActionPerformed(evt);
            }
        });
        quisSulawesi2.add(btnSulawesiLompat2);
        btnSulawesiLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisSulawesi2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSulawesi2.add(jawabanQuisSulawesi2);
        jawabanQuisSulawesi2.setBounds(130, 710, 310, 60);

        bgSulawesi27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/SULAWESI SOAL 2.png"))); // NOI18N
        quisSulawesi2.add(bgSulawesi27);
        bgSulawesi27.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi2, "quisSulawesi2");

        quisSulawesi3.setBackground(new java.awt.Color(255, 255, 255));
        quisSulawesi3.setLayout(null);

        btnLamin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL3d.png"))); // NOI18N
        btnLamin2.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnLamin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLamin2MousePressed(evt);
            }
        });
        btnLamin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamin2ActionPerformed(evt);
            }
        });
        quisSulawesi3.add(btnLamin2);
        btnLamin2.setBounds(710, 640, 590, 40);

        btnJoglo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL3b.png"))); // NOI18N
        btnJoglo.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnJoglo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJogloMousePressed(evt);
            }
        });
        btnJoglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogloActionPerformed(evt);
            }
        });
        quisSulawesi3.add(btnJoglo);
        btnJoglo.setBounds(50, 640, 590, 40);

        btnTambi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL3a.png"))); // NOI18N
        btnTambi.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnTambi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTambiMousePressed(evt);
            }
        });
        btnTambi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambiActionPerformed(evt);
            }
        });
        quisSulawesi3.add(btnTambi);
        btnTambi.setBounds(60, 560, 580, 50);

        btnRumah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL3c.png"))); // NOI18N
        btnRumah.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnRumah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRumahMousePressed(evt);
            }
        });
        btnRumah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRumahActionPerformed(evt);
            }
        });
        quisSulawesi3.add(btnRumah);
        btnRumah.setBounds(710, 570, 590, 40);

        btnSulawesiLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSulawesiLompat3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSulawesiLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiLompat3ActionPerformed(evt);
            }
        });
        quisSulawesi3.add(btnSulawesiLompat3);
        btnSulawesiLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisSulawesi3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSulawesi3.add(jawabanQuisSulawesi3);
        jawabanQuisSulawesi3.setBounds(130, 710, 310, 60);

        bgSulawesi28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/SULAWESI SOAL 3.png"))); // NOI18N
        quisSulawesi3.add(bgSulawesi28);
        bgSulawesi28.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi3, "quisSulawesi3");

        quisSulawesi4.setBackground(new java.awt.Color(255, 255, 255));
        quisSulawesi4.setLayout(null);

        btn98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL4d.png"))); // NOI18N
        btn98.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btn98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn98MousePressed(evt);
            }
        });
        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn98ActionPerformed(evt);
            }
        });
        quisSulawesi4.add(btn98);
        btn98.setBounds(710, 640, 590, 40);

        btn180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL4b.png"))); // NOI18N
        btn180.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btn180.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn180MousePressed(evt);
            }
        });
        btn180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn180ActionPerformed(evt);
            }
        });
        quisSulawesi4.add(btn180);
        btn180.setBounds(50, 640, 590, 40);

        btn134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL4a.png"))); // NOI18N
        btn134.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btn134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn134MousePressed(evt);
            }
        });
        btn134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn134ActionPerformed(evt);
            }
        });
        quisSulawesi4.add(btn134);
        btn134.setBounds(60, 560, 580, 50);

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL4c.png"))); // NOI18N
        btn12.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn12MousePressed(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        quisSulawesi4.add(btn12);
        btn12.setBounds(710, 570, 590, 40);

        btnSulawesiLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSulawesiLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSulawesiLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiLompat4ActionPerformed(evt);
            }
        });
        quisSulawesi4.add(btnSulawesiLompat4);
        btnSulawesiLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisSulawesi4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSulawesi4.add(jawabanQuisSulawesi4);
        jawabanQuisSulawesi4.setBounds(130, 710, 310, 60);

        bgSulawesi29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/SULAWESI SOAL 4.png"))); // NOI18N
        quisSulawesi4.add(bgSulawesi29);
        bgSulawesi29.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi4, "quisSulawesi4");

        quisSulawesi5.setBackground(new java.awt.Color(255, 255, 255));
        quisSulawesi5.setLayout(null);

        btnSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL5d.png"))); // NOI18N
        btnSulawesi2.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnSulawesi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSulawesi2MousePressed(evt);
            }
        });
        btnSulawesi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesi2ActionPerformed(evt);
            }
        });
        quisSulawesi5.add(btnSulawesi2);
        btnSulawesi2.setBounds(710, 640, 590, 40);

        btnPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL5b.png"))); // NOI18N
        btnPapua2.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnPapua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPapua2MousePressed(evt);
            }
        });
        btnPapua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapua2ActionPerformed(evt);
            }
        });
        quisSulawesi5.add(btnPapua2);
        btnPapua2.setBounds(50, 640, 590, 40);

        btnJawa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL5a.png"))); // NOI18N
        btnJawa2.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnJawa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJawa2MousePressed(evt);
            }
        });
        btnJawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawa2ActionPerformed(evt);
            }
        });
        quisSulawesi5.add(btnJawa2);
        btnJawa2.setBounds(60, 560, 580, 50);

        btnBali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/Answer/SUL5c.png"))); // NOI18N
        btnBali2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBali2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBali2MousePressed(evt);
            }
        });
        btnBali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBali2ActionPerformed(evt);
            }
        });
        quisSulawesi5.add(btnBali2);
        btnBali2.setBounds(710, 570, 590, 40);

        btnSulawesiLompat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnSulawesiLompat5.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSulawesiLompat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulawesiLompat5ActionPerformed(evt);
            }
        });
        quisSulawesi5.add(btnSulawesiLompat5);
        btnSulawesiLompat5.setBounds(620, 17, 120, 20);

        jawabanQuisSulawesi5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisSulawesi5.add(jawabanQuisSulawesi5);
        jawabanQuisSulawesi5.setBounds(130, 710, 310, 60);

        bgSulawesi30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/SULAWESI/SULAWESI SOAL 5.png"))); // NOI18N
        quisSulawesi5.add(bgSulawesi30);
        bgSulawesi30.setBounds(0, 0, 1370, 770);

        sulawesi.add(quisSulawesi5, "quisSulawesi5");

        lompatSulawesi.setBackground(new java.awt.Color(255, 255, 255));
        lompatSulawesi.setLayout(null);

        btnTidakSulawesi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakSulawesi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakSulawesi1ActionPerformed(evt);
            }
        });
        lompatSulawesi.add(btnTidakSulawesi1);
        btnTidakSulawesi1.setBounds(700, 490, 90, 30);

        btnYaSulawesi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaSulawesi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaSulawesi1ActionPerformed(evt);
            }
        });
        lompatSulawesi.add(btnYaSulawesi1);
        btnYaSulawesi1.setBounds(550, 490, 90, 30);

        bgSulawesi13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatSulawesi.add(bgSulawesi13);
        bgSulawesi13.setBounds(0, 0, 1370, 770);

        sulawesi.add(lompatSulawesi, "lompatSulawesi");

        selesaiSulawesi.setBackground(new java.awt.Color(255, 255, 255));
        selesaiSulawesi.setLayout(null);

        btnTidakSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakSulawesi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakSulawesi2ActionPerformed(evt);
            }
        });
        selesaiSulawesi.add(btnTidakSulawesi2);
        btnTidakSulawesi2.setBounds(700, 480, 90, 20);

        btnYaSulawesi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaSulawesi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaSulawesi2ActionPerformed(evt);
            }
        });
        selesaiSulawesi.add(btnYaSulawesi2);
        btnYaSulawesi2.setBounds(550, 480, 90, 20);

        bgSulawesi14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiSulawesi.add(bgSulawesi14);
        bgSulawesi14.setBounds(0, 0, 1370, 770);

        sulawesi.add(selesaiSulawesi, "selesaiSulawesi");

        panelUtama.add(sulawesi, "sulawesi");

        maluku.setLayout(new java.awt.CardLayout());

        panelMaluku1.setLayout(null);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Merah Putih Dirgahayu Indonesia Banner (1).png"))); // NOI18N
        jButton9.setMargin(new java.awt.Insets(6, 14, 2, 14));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelMaluku1.add(jButton9);
        jButton9.setBounds(1280, 360, 50, 30);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton10.setMargin(new java.awt.Insets(6, 14, 2, 14));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panelMaluku1.add(jButton10);
        jButton10.setBounds(40, 360, 50, 30);

        bgMaluku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/POSTER MALUKU.png"))); // NOI18N
        panelMaluku1.add(bgMaluku);
        bgMaluku.setBounds(0, 0, 1370, 770);

        maluku.add(panelMaluku1, "panelMaluku1");

        panelMaluku2.setLayout(null);

        btnKembaliMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliMaluku2.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliMaluku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliMaluku2ActionPerformed(evt);
            }
        });
        panelMaluku2.add(btnKembaliMaluku2);
        btnKembaliMaluku2.setBounds(720, 710, 120, 20);

        btnLanjutMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutMaluku2.setMargin(new java.awt.Insets(12, 14, 5, 5));
        btnLanjutMaluku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutMaluku2ActionPerformed(evt);
            }
        });
        panelMaluku2.add(btnLanjutMaluku2);
        btnLanjutMaluku2.setBounds(920, 700, 100, 30);

        bgSulawesi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/1.png"))); // NOI18N
        panelMaluku2.add(bgSulawesi3);
        bgSulawesi3.setBounds(0, 0, 1370, 770);

        maluku.add(panelMaluku2, "panelMaluku2");

        panelMaluku3.setLayout(null);

        btnKembaliMaluku3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliMaluku3.setMargin(new java.awt.Insets(10, 16, 5, 14));
        btnKembaliMaluku3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliMaluku3ActionPerformed(evt);
            }
        });
        panelMaluku3.add(btnKembaliMaluku3);
        btnKembaliMaluku3.setBounds(250, 700, 140, 30);

        btnLanjutMaluku3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutMaluku3.setMargin(new java.awt.Insets(10, 14, 5, 14));
        btnLanjutMaluku3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutMaluku3ActionPerformed(evt);
            }
        });
        panelMaluku3.add(btnLanjutMaluku3);
        btnLanjutMaluku3.setBounds(450, 700, 130, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/2.png"))); // NOI18N
        panelMaluku3.add(jLabel15);
        jLabel15.setBounds(0, 0, 1370, 770);

        maluku.add(panelMaluku3, "panelMaluku3");

        panelMaluku4.setLayout(null);
        maluku.add(panelMaluku4, "panelMaluku4");

        quisMaluku.setLayout(null);

        btnMalukuNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnMalukuNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuNantiActionPerformed(evt);
            }
        });
        quisMaluku.add(btnMalukuNanti);
        btnMalukuNanti.setBounds(710, 490, 70, 30);

        btnMalukuAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnMalukuAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuAyoActionPerformed(evt);
            }
        });
        quisMaluku.add(btnMalukuAyo);
        btnMalukuAyo.setBounds(560, 490, 70, 30);

        bgMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisMaluku.add(bgMaluku2);
        bgMaluku2.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku, "quisMaluku");

        quisMaluku1.setBackground(new java.awt.Color(255, 255, 255));
        quisMaluku1.setLayout(null);

        btn1satu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m1d.png"))); // NOI18N
        btn1satu1.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btn1satu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1satu1MousePressed(evt);
            }
        });
        btn1satu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1satu1ActionPerformed(evt);
            }
        });
        quisMaluku1.add(btn1satu1);
        btn1satu1.setBounds(710, 640, 590, 40);

        btn2Dua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m1b.png"))); // NOI18N
        btn2Dua2.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btn2Dua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2Dua2MousePressed(evt);
            }
        });
        btn2Dua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2Dua2ActionPerformed(evt);
            }
        });
        quisMaluku1.add(btn2Dua2);
        btn2Dua2.setBounds(50, 640, 590, 40);

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m1a.png"))); // NOI18N
        btn11.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn11MousePressed(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        quisMaluku1.add(btn11);
        btn11.setBounds(60, 560, 580, 50);

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m1c.png"))); // NOI18N
        btn13.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn13MousePressed(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        quisMaluku1.add(btn13);
        btn13.setBounds(710, 570, 590, 40);

        btnMalukuLompat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnMalukuLompat.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalukuLompat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuLompatActionPerformed(evt);
            }
        });
        quisMaluku1.add(btnMalukuLompat);
        btnMalukuLompat.setBounds(620, 17, 120, 20);

        jawabanQuisMaluku1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisMaluku1.add(jawabanQuisMaluku1);
        jawabanQuisMaluku1.setBounds(130, 710, 310, 60);

        bgMaluku31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/MALUKU SOAL 1.png"))); // NOI18N
        quisMaluku1.add(bgMaluku31);
        bgMaluku31.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku1, "quisMaluku1");

        quisMaluku2.setBackground(new java.awt.Color(255, 255, 255));
        quisMaluku2.setLayout(null);

        btnAsmat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m2d.png"))); // NOI18N
        btnAsmat.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnAsmat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsmatMousePressed(evt);
            }
        });
        btnAsmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsmatActionPerformed(evt);
            }
        });
        quisMaluku2.add(btnAsmat);
        btnAsmat.setBounds(710, 640, 590, 40);

        btnSunda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m2b.png"))); // NOI18N
        btnSunda.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnSunda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSundaMousePressed(evt);
            }
        });
        btnSunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSundaActionPerformed(evt);
            }
        });
        quisMaluku2.add(btnSunda);
        btnSunda.setBounds(50, 640, 590, 40);

        btnBanjar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m2a.png"))); // NOI18N
        btnBanjar2.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnBanjar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBanjar2MousePressed(evt);
            }
        });
        btnBanjar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanjar2ActionPerformed(evt);
            }
        });
        quisMaluku2.add(btnBanjar2);
        btnBanjar2.setBounds(60, 560, 580, 50);

        btnTernate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m2c.png"))); // NOI18N
        btnTernate.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnTernate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTernateMousePressed(evt);
            }
        });
        btnTernate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTernateActionPerformed(evt);
            }
        });
        quisMaluku2.add(btnTernate);
        btnTernate.setBounds(710, 570, 590, 40);

        btnMalukuLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnMalukuLompat1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalukuLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuLompat1ActionPerformed(evt);
            }
        });
        quisMaluku2.add(btnMalukuLompat1);
        btnMalukuLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisMaluku2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisMaluku2.add(jawabanQuisMaluku2);
        jawabanQuisMaluku2.setBounds(130, 710, 310, 60);

        bgMaluku32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/MALUKU SOAL 2.png"))); // NOI18N
        quisMaluku2.add(bgMaluku32);
        bgMaluku32.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku2, "quisMaluku2");

        quisMaluku3.setBackground(new java.awt.Color(255, 255, 255));
        quisMaluku3.setLayout(null);

        btnTunik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m3d.png"))); // NOI18N
        btnTunik.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnTunik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTunikMousePressed(evt);
            }
        });
        btnTunik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunikActionPerformed(evt);
            }
        });
        quisMaluku3.add(btnTunik);
        btnTunik.setBounds(710, 640, 590, 40);

        btnKemben3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m3b.png"))); // NOI18N
        btnKemben3.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnKemben3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKemben3MousePressed(evt);
            }
        });
        btnKemben3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKemben3ActionPerformed(evt);
            }
        });
        quisMaluku3.add(btnKemben3);
        btnKemben3.setBounds(50, 640, 590, 40);

        btnNona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m3a.png"))); // NOI18N
        btnNona.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnNona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNonaMousePressed(evt);
            }
        });
        btnNona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonaActionPerformed(evt);
            }
        });
        quisMaluku3.add(btnNona);
        btnNona.setBounds(60, 560, 580, 50);

        btnKebaya3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m3c.png"))); // NOI18N
        btnKebaya3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnKebaya3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKebaya3MousePressed(evt);
            }
        });
        btnKebaya3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKebaya3ActionPerformed(evt);
            }
        });
        quisMaluku3.add(btnKebaya3);
        btnKebaya3.setBounds(710, 570, 590, 40);

        btnMalukuLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnMalukuLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalukuLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuLompat2ActionPerformed(evt);
            }
        });
        quisMaluku3.add(btnMalukuLompat2);
        btnMalukuLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisMaluku3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisMaluku3.add(jawabanQuisMaluku3);
        jawabanQuisMaluku3.setBounds(130, 710, 310, 60);

        bgMaluku33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/MALUKU SOAL 3.png"))); // NOI18N
        quisMaluku3.add(bgMaluku33);
        bgMaluku33.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku3, "quisMaluku3");

        quisMaluku4.setBackground(new java.awt.Color(255, 255, 255));
        quisMaluku4.setLayout(null);

        btnRambut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m4d.png"))); // NOI18N
        btnRambut2.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnRambut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRambut2MousePressed(evt);
            }
        });
        btnRambut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRambut2ActionPerformed(evt);
            }
        });
        quisMaluku4.add(btnRambut2);
        btnRambut2.setBounds(710, 640, 590, 40);

        btnMancung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m4b.png"))); // NOI18N
        btnMancung.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnMancung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMancungMousePressed(evt);
            }
        });
        btnMancung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMancungActionPerformed(evt);
            }
        });
        quisMaluku4.add(btnMancung);
        btnMancung.setBounds(50, 640, 590, 40);

        btnPutih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m4a.png"))); // NOI18N
        btnPutih.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnPutih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPutihMousePressed(evt);
            }
        });
        btnPutih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutihActionPerformed(evt);
            }
        });
        quisMaluku4.add(btnPutih);
        btnPutih.setBounds(60, 560, 580, 50);

        btnGelap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m4c.png"))); // NOI18N
        btnGelap.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnGelap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGelapMousePressed(evt);
            }
        });
        btnGelap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGelapActionPerformed(evt);
            }
        });
        quisMaluku4.add(btnGelap);
        btnGelap.setBounds(710, 570, 590, 40);

        btnMalukuLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnMalukuLompat3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalukuLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuLompat3ActionPerformed(evt);
            }
        });
        quisMaluku4.add(btnMalukuLompat3);
        btnMalukuLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisMaluku4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisMaluku4.add(jawabanQuisMaluku4);
        jawabanQuisMaluku4.setBounds(130, 710, 310, 60);

        bgMaluku34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/MALUKU SOAL 4.png"))); // NOI18N
        quisMaluku4.add(bgMaluku34);
        bgMaluku34.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku4, "quisMaluku4");

        quisMaluku5.setBackground(new java.awt.Color(255, 255, 255));
        quisMaluku5.setLayout(null);

        btnKalimantan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m5d.png"))); // NOI18N
        btnKalimantan2.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnKalimantan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKalimantan2MousePressed(evt);
            }
        });
        btnKalimantan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKalimantan2ActionPerformed(evt);
            }
        });
        quisMaluku5.add(btnKalimantan2);
        btnKalimantan2.setBounds(710, 640, 590, 40);

        btnMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m5b.png"))); // NOI18N
        btnMaluku2.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnMaluku2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaluku2MousePressed(evt);
            }
        });
        btnMaluku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaluku2ActionPerformed(evt);
            }
        });
        quisMaluku5.add(btnMaluku2);
        btnMaluku2.setBounds(50, 640, 590, 40);

        btnSumatra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m5a.png"))); // NOI18N
        btnSumatra2.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnSumatra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumatra2MousePressed(evt);
            }
        });
        btnSumatra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatra2ActionPerformed(evt);
            }
        });
        quisMaluku5.add(btnSumatra2);
        btnSumatra2.setBounds(60, 560, 580, 50);

        btnJawa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/Answer/m5c.png"))); // NOI18N
        btnJawa4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnJawa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJawa4MousePressed(evt);
            }
        });
        btnJawa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawa4ActionPerformed(evt);
            }
        });
        quisMaluku5.add(btnJawa4);
        btnJawa4.setBounds(710, 570, 590, 40);

        btnMalukuLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnMalukuLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnMalukuLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalukuLompat4ActionPerformed(evt);
            }
        });
        quisMaluku5.add(btnMalukuLompat4);
        btnMalukuLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisMaluku5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisMaluku5.add(jawabanQuisMaluku5);
        jawabanQuisMaluku5.setBounds(130, 710, 310, 60);

        bgMaluku35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Maluku/MALUKU SOAL 5.png"))); // NOI18N
        quisMaluku5.add(bgMaluku35);
        bgMaluku35.setBounds(0, 0, 1370, 770);

        maluku.add(quisMaluku5, "quisMaluku5");

        lompatMaluku.setBackground(new java.awt.Color(255, 255, 255));
        lompatMaluku.setLayout(null);

        btnTidakMaluku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakMaluku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakMaluku1ActionPerformed(evt);
            }
        });
        lompatMaluku.add(btnTidakMaluku1);
        btnTidakMaluku1.setBounds(700, 490, 90, 30);

        btnYaMaluku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaMaluku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaMaluku1ActionPerformed(evt);
            }
        });
        lompatMaluku.add(btnYaMaluku1);
        btnYaMaluku1.setBounds(550, 490, 90, 30);

        bgMaluku15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatMaluku.add(bgMaluku15);
        bgMaluku15.setBounds(0, 0, 1370, 770);

        maluku.add(lompatMaluku, "lompatMaluku");

        selesaiMaluku.setBackground(new java.awt.Color(255, 255, 255));
        selesaiMaluku.setLayout(null);

        btnTidakMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakMaluku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakMaluku2ActionPerformed(evt);
            }
        });
        selesaiMaluku.add(btnTidakMaluku2);
        btnTidakMaluku2.setBounds(700, 480, 90, 20);

        btnYaMaluku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaMaluku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaMaluku2ActionPerformed(evt);
            }
        });
        selesaiMaluku.add(btnYaMaluku2);
        btnYaMaluku2.setBounds(550, 480, 90, 20);

        bgMaluku16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiMaluku.add(bgMaluku16);
        bgMaluku16.setBounds(0, 0, 1370, 770);

        maluku.add(selesaiMaluku, "selesaiMaluku");

        panelUtama.add(maluku, "maluku");

        papua.setLayout(new java.awt.CardLayout());

        panelPapua1.setLayout(null);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Merah Putih Dirgahayu Indonesia Banner.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panelPapua1.add(jButton11);
        jButton11.setBounds(1280, 363, 50, 30);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Merah Putih Dirgahayu Indonesia Banner (1).png"))); // NOI18N
        jButton12.setMargin(new java.awt.Insets(5, 14, 2, 14));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panelPapua1.add(jButton12);
        jButton12.setBounds(40, 360, 50, 30);

        bgPapua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/POSTER PAPUA.png"))); // NOI18N
        panelPapua1.add(bgPapua);
        bgPapua.setBounds(0, 0, 1370, 770);

        papua.add(panelPapua1, "panelPapua1");

        panelPapua2.setLayout(null);

        btnKembaliPapua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembali-kuning.png"))); // NOI18N
        btnKembaliPapua1.setMargin(new java.awt.Insets(2, 14, 7, 14));
        btnKembaliPapua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPapua1ActionPerformed(evt);
            }
        });
        panelPapua2.add(btnKembaliPapua1);
        btnKembaliPapua1.setBounds(720, 710, 120, 20);

        btnLanjutpaua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-kuning.png"))); // NOI18N
        btnLanjutpaua1.setMargin(new java.awt.Insets(12, 14, 5, 5));
        btnLanjutpaua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutpaua1ActionPerformed(evt);
            }
        });
        panelPapua2.add(btnLanjutpaua1);
        btnLanjutpaua1.setBounds(920, 700, 100, 30);

        bgPapua24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/1.png"))); // NOI18N
        panelPapua2.add(bgPapua24);
        bgPapua24.setBounds(0, 0, 1370, 770);

        papua.add(panelPapua2, "panelPapua2");

        panelPapua3.setLayout(null);

        btnKembaliPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kembal-iIjo.png"))); // NOI18N
        btnKembaliPapua2.setMargin(new java.awt.Insets(10, 16, 5, 14));
        btnKembaliPapua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPapua2ActionPerformed(evt);
            }
        });
        panelPapua3.add(btnKembaliPapua2);
        btnKembaliPapua2.setBounds(750, 700, 140, 30);

        btnLanjutPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lanjut-ijo.png"))); // NOI18N
        btnLanjutPapua2.setMargin(new java.awt.Insets(10, 14, 5, 14));
        btnLanjutPapua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutPapua2ActionPerformed(evt);
            }
        });
        panelPapua3.add(btnLanjutPapua2);
        btnLanjutPapua2.setBounds(950, 700, 130, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/2.png"))); // NOI18N
        panelPapua3.add(jLabel16);
        jLabel16.setBounds(0, 0, 1370, 770);

        papua.add(panelPapua3, "panelPapua3");

        panelPapua4.setLayout(null);
        papua.add(panelPapua4, "panelPapua4");

        quisPapua.setLayout(null);

        btnPapuaNanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Nanti.png"))); // NOI18N
        btnPapuaNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaNantiActionPerformed(evt);
            }
        });
        quisPapua.add(btnPapuaNanti);
        btnPapuaNanti.setBounds(710, 490, 70, 30);

        btnPapuaAyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Ayo.png"))); // NOI18N
        btnPapuaAyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaAyoActionPerformed(evt);
            }
        });
        quisPapua.add(btnPapuaAyo);
        btnPapuaAyo.setBounds(560, 490, 70, 30);

        bgPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/kuis.png"))); // NOI18N
        quisPapua.add(bgPapua2);
        bgPapua2.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua, "quisPapua");

        quisPapua1.setBackground(new java.awt.Color(255, 255, 255));
        quisPapua1.setLayout(null);

        btnPapua3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p1d.png"))); // NOI18N
        btnPapua3.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnPapua3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPapua3MousePressed(evt);
            }
        });
        btnPapua3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapua3ActionPerformed(evt);
            }
        });
        quisPapua1.add(btnPapua3);
        btnPapua3.setBounds(710, 640, 590, 40);

        btnAceh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p1b.png"))); // NOI18N
        btnAceh3.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnAceh3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceh3MousePressed(evt);
            }
        });
        btnAceh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceh3ActionPerformed(evt);
            }
        });
        quisPapua1.add(btnAceh3);
        btnAceh3.setBounds(50, 640, 590, 40);

        btnJatim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p1a.png"))); // NOI18N
        btnJatim.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnJatim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJatimMousePressed(evt);
            }
        });
        btnJatim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJatimActionPerformed(evt);
            }
        });
        quisPapua1.add(btnJatim);
        btnJatim.setBounds(60, 560, 580, 50);

        btnBali4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p1c.png"))); // NOI18N
        btnBali4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnBali4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBali4MousePressed(evt);
            }
        });
        btnBali4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBali4ActionPerformed(evt);
            }
        });
        quisPapua1.add(btnBali4);
        btnBali4.setBounds(710, 570, 590, 40);

        btnPapuaLompat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnPapuaLompat.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPapuaLompat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaLompatActionPerformed(evt);
            }
        });
        quisPapua1.add(btnPapuaLompat);
        btnPapuaLompat.setBounds(620, 17, 120, 20);

        jawabanQuisPapua1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisPapua1.add(jawabanQuisPapua1);
        jawabanQuisPapua1.setBounds(130, 710, 310, 60);

        bgPapua36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/PAPUA SOAL 1.png"))); // NOI18N
        quisPapua1.add(bgPapua36);
        bgPapua36.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua1, "quisPapua1");

        quisPapua2.setBackground(new java.awt.Color(255, 255, 255));
        quisPapua2.setLayout(null);

        btnSumuri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p2d.png"))); // NOI18N
        btnSumuri.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnSumuri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSumuriMousePressed(evt);
            }
        });
        btnSumuri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumuriActionPerformed(evt);
            }
        });
        quisPapua2.add(btnSumuri);
        btnSumuri.setBounds(710, 640, 590, 40);

        btnBiak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p2b.png"))); // NOI18N
        btnBiak.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnBiak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBiakMousePressed(evt);
            }
        });
        btnBiak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiakActionPerformed(evt);
            }
        });
        quisPapua2.add(btnBiak);
        btnBiak.setBounds(50, 640, 590, 40);

        btnAsmat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p2a.png"))); // NOI18N
        btnAsmat4.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnAsmat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsmat4MousePressed(evt);
            }
        });
        btnAsmat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsmat4ActionPerformed(evt);
            }
        });
        quisPapua2.add(btnAsmat4);
        btnAsmat4.setBounds(60, 560, 580, 50);

        btnSunda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p2c.png"))); // NOI18N
        btnSunda4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnSunda4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSunda4MousePressed(evt);
            }
        });
        btnSunda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSunda4ActionPerformed(evt);
            }
        });
        quisPapua2.add(btnSunda4);
        btnSunda4.setBounds(710, 570, 590, 40);

        btnPapuaLompat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnPapuaLompat1.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPapuaLompat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaLompat1ActionPerformed(evt);
            }
        });
        quisPapua2.add(btnPapuaLompat1);
        btnPapuaLompat1.setBounds(620, 17, 120, 20);

        jawabanQuisPapua2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisPapua2.add(jawabanQuisPapua2);
        jawabanQuisPapua2.setBounds(130, 710, 310, 60);

        bgPapua37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/PAPUA SOAL 2.png"))); // NOI18N
        quisPapua2.add(bgPapua37);
        bgPapua37.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua2, "quisPapua2");

        quisPapua3.setBackground(new java.awt.Color(255, 255, 255));
        quisPapua3.setLayout(null);

        btnMLHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p3d.png"))); // NOI18N
        btnMLHP.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnMLHP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMLHPMousePressed(evt);
            }
        });
        btnMLHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMLHPActionPerformed(evt);
            }
        });
        quisPapua3.add(btnMLHP);
        btnMLHP.setBounds(710, 640, 590, 40);

        btnRLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p3b.png"))); // NOI18N
        btnRLKH.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnRLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRLKHMousePressed(evt);
            }
        });
        btnRLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRLKHActionPerformed(evt);
            }
        });
        quisPapua3.add(btnRLKH);
        btnRLKH.setBounds(50, 640, 590, 40);

        btnRKKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p3a.png"))); // NOI18N
        btnRKKH.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnRKKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRKKHMousePressed(evt);
            }
        });
        btnRKKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRKKHActionPerformed(evt);
            }
        });
        quisPapua3.add(btnRKKH);
        btnRKKH.setBounds(60, 560, 580, 50);

        btnHMML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p3c.png"))); // NOI18N
        btnHMML.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnHMML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHMMLMousePressed(evt);
            }
        });
        btnHMML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHMMLActionPerformed(evt);
            }
        });
        quisPapua3.add(btnHMML);
        btnHMML.setBounds(710, 570, 590, 40);

        btnPapuaLompat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnPapuaLompat2.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPapuaLompat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaLompat2ActionPerformed(evt);
            }
        });
        quisPapua3.add(btnPapuaLompat2);
        btnPapuaLompat2.setBounds(620, 17, 120, 20);

        jawabanQuisPapua3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisPapua3.add(jawabanQuisPapua3);
        jawabanQuisPapua3.setBounds(130, 710, 310, 60);

        bgPapua38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/PAPUA SOAL 3.png"))); // NOI18N
        quisPapua3.add(bgPapua38);
        bgPapua38.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua3, "quisPapua3");

        quisPapua4.setBackground(new java.awt.Color(255, 255, 255));
        quisPapua4.setLayout(null);

        btnPiring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p4d.png"))); // NOI18N
        btnPiring.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnPiring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPiringMousePressed(evt);
            }
        });
        btnPiring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiringActionPerformed(evt);
            }
        });
        quisPapua4.add(btnPiring);
        btnPiring.setBounds(710, 640, 590, 40);

        btnSajojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p4b.png"))); // NOI18N
        btnSajojo.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnSajojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSajojoMousePressed(evt);
            }
        });
        btnSajojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSajojoActionPerformed(evt);
            }
        });
        quisPapua4.add(btnSajojo);
        btnSajojo.setBounds(50, 640, 590, 40);

        btnGandrung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p4a.png"))); // NOI18N
        btnGandrung.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnGandrung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGandrungMousePressed(evt);
            }
        });
        btnGandrung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGandrungActionPerformed(evt);
            }
        });
        quisPapua4.add(btnGandrung);
        btnGandrung.setBounds(60, 560, 580, 50);

        btnGambyong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p4c.png"))); // NOI18N
        btnGambyong.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnGambyong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGambyongMousePressed(evt);
            }
        });
        btnGambyong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambyongActionPerformed(evt);
            }
        });
        quisPapua4.add(btnGambyong);
        btnGambyong.setBounds(710, 570, 590, 40);

        btnPapuaLompat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnPapuaLompat3.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPapuaLompat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaLompat3ActionPerformed(evt);
            }
        });
        quisPapua4.add(btnPapuaLompat3);
        btnPapuaLompat3.setBounds(620, 17, 120, 20);

        jawabanQuisPapua4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisPapua4.add(jawabanQuisPapua4);
        jawabanQuisPapua4.setBounds(130, 710, 310, 60);

        bgPapua39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/PAPUA SOAL 4.png"))); // NOI18N
        quisPapua4.add(bgPapua39);
        bgPapua39.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua4, "quisPapua4");

        quisPapua5.setBackground(new java.awt.Color(255, 255, 255));
        quisPapua5.setLayout(null);

        btnHariLibur21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p5d.png"))); // NOI18N
        btnHariLibur21.setMargin(new java.awt.Insets(6, 14, 2, 14));
        btnHariLibur21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariLibur21MousePressed(evt);
            }
        });
        btnHariLibur21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariLibur21ActionPerformed(evt);
            }
        });
        quisPapua5.add(btnHariLibur21);
        btnHariLibur21.setBounds(710, 640, 590, 40);

        btnHariGuru21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p5b.png"))); // NOI18N
        btnHariGuru21.setMargin(new java.awt.Insets(7, 14, 2, 14));
        btnHariGuru21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariGuru21MousePressed(evt);
            }
        });
        btnHariGuru21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariGuru21ActionPerformed(evt);
            }
        });
        quisPapua5.add(btnHariGuru21);
        btnHariGuru21.setBounds(50, 640, 590, 40);

        btnHariNasional21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p5a.png"))); // NOI18N
        btnHariNasional21.setMargin(new java.awt.Insets(7, 8, 2, 14));
        btnHariNasional21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariNasional21MousePressed(evt);
            }
        });
        btnHariNasional21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariNasional21ActionPerformed(evt);
            }
        });
        quisPapua5.add(btnHariNasional21);
        btnHariNasional21.setBounds(60, 560, 580, 50);

        btnHariSuci21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/Answer/p5c.png"))); // NOI18N
        btnHariSuci21.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnHariSuci21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHariSuci21MousePressed(evt);
            }
        });
        btnHariSuci21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHariSuci21ActionPerformed(evt);
            }
        });
        quisPapua5.add(btnHariSuci21);
        btnHariSuci21.setBounds(710, 570, 590, 40);

        btnPapuaLompat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatQuis.png"))); // NOI18N
        btnPapuaLompat4.setMargin(new java.awt.Insets(2, 14, 5, 14));
        btnPapuaLompat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapuaLompat4ActionPerformed(evt);
            }
        });
        quisPapua5.add(btnPapuaLompat4);
        btnPapuaLompat4.setBounds(620, 17, 120, 20);

        jawabanQuisPapua5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        quisPapua5.add(jawabanQuisPapua5);
        jawabanQuisPapua5.setBounds(130, 710, 310, 60);

        bgPapua40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/Papua/PAPUA SOAL 5.png"))); // NOI18N
        quisPapua5.add(bgPapua40);
        bgPapua40.setBounds(0, 0, 1370, 770);

        papua.add(quisPapua5, "quisPapua5");

        lompatPapua.setBackground(new java.awt.Color(255, 255, 255));
        lompatPapua.setLayout(null);

        btnTidakPapua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakPapua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakPapua1ActionPerformed(evt);
            }
        });
        lompatPapua.add(btnTidakPapua1);
        btnTidakPapua1.setBounds(700, 490, 90, 30);

        btnYaPapua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaPapua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaPapua1ActionPerformed(evt);
            }
        });
        lompatPapua.add(btnYaPapua1);
        btnYaPapua1.setBounds(550, 490, 90, 30);

        bgPapua17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/lompatResult.png"))); // NOI18N
        lompatPapua.add(bgPapua17);
        bgPapua17.setBounds(0, 0, 1370, 770);

        papua.add(lompatPapua, "lompatPapua");

        selesaiPapua.setBackground(new java.awt.Color(255, 255, 255));
        selesaiPapua.setLayout(null);

        btnTidakPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/TIDAK.png"))); // NOI18N
        btnTidakPapua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakPapua2ActionPerformed(evt);
            }
        });
        selesaiPapua.add(btnTidakPapua2);
        btnTidakPapua2.setBounds(700, 480, 90, 20);

        btnYaPapua2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/YA.png"))); // NOI18N
        btnYaPapua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaPapua2ActionPerformed(evt);
            }
        });
        selesaiPapua.add(btnYaPapua2);
        btnYaPapua2.setBounds(550, 480, 90, 20);

        bgPapua18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/img/KuisResult.png"))); // NOI18N
        selesaiPapua.add(bgPapua18);
        bgPapua18.setBounds(0, 0, 1370, 770);

        papua.add(selesaiPapua, "selesaiPapua");

        panelUtama.add(papua, "papua");

        javax.swing.GroupLayout copy9Layout = new javax.swing.GroupLayout(copy9);
        copy9.setLayout(copy9Layout);
        copy9Layout.setHorizontalGroup(
            copy9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        copy9Layout.setVerticalGroup(
            copy9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );

        panelUtama.add(copy9, "card2");

        javax.swing.GroupLayout copy10Layout = new javax.swing.GroupLayout(copy10);
        copy10.setLayout(copy10Layout);
        copy10Layout.setHorizontalGroup(
            copy10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        copy10Layout.setVerticalGroup(
            copy10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );

        panelUtama.add(copy10, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        try {
            Thread.sleep(500);
            Object[] options = {"Terimakasih!"};
            int n = JOptionPane.showOptionDialog(null,
            "1.Gilbert Jeremy Nathanael \n 2. Marcello Ilham \n 3. Yesinka Vlorena Mutiasari",
            "TIM KAMI",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            dispose();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }            
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaiActionPerformed
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\UAS\\audio\\click.wav"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        } 
              
        // Ganti Halaman
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "pendahuluan"); 
    }//GEN-LAST:event_btnMulaiActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "dashboard");
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnLanjutActionPerformed

    private void labelSumatraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSumatraMouseEntered
        pulau.setText("Ini Pulau Sumatra");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/sumatra2.png"));
        labelSumatra.setIcon(ii);
    }//GEN-LAST:event_labelSumatraMouseEntered

    private void labelSumatraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSumatraMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelSumatra.setIcon(ii);
    }//GEN-LAST:event_labelSumatraMouseExited

    private void labelKalimantanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKalimantanMouseEntered
        pulau.setText("Ini Pulau Kalimantan");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/kalimantan2.png"));
        labelKalimantan.setIcon(ii);
    }//GEN-LAST:event_labelKalimantanMouseEntered

    private void labelKalimantanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKalimantanMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelKalimantan.setIcon(ii);
    }//GEN-LAST:event_labelKalimantanMouseExited

    private void labelJawaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJawaMouseEntered
        pulau.setText("Ini Pulau Jawa");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/jawa.png"));
        labelJawa.setIcon(ii);
    }//GEN-LAST:event_labelJawaMouseEntered

    private void labelJawaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJawaMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelJawa.setIcon(ii);
    }//GEN-LAST:event_labelJawaMouseExited

    private void labelBaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBaliMouseEntered
        pulau.setText("Ini Pulau Bali");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/bali.png"));
        labelBali.setIcon(ii);
    }//GEN-LAST:event_labelBaliMouseEntered

    private void labelBaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBaliMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelBali.setIcon(ii);
    }//GEN-LAST:event_labelBaliMouseExited

    private void labelSulawesiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSulawesiMouseEntered
        pulau.setText("Ini Pulau Sulawesi");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/sulawesi.png"));
        labelSulawesi.setIcon(ii);
    }//GEN-LAST:event_labelSulawesiMouseEntered

    private void labelSulawesiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSulawesiMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelSulawesi.setIcon(ii);
    }//GEN-LAST:event_labelSulawesiMouseExited

    private void labelMalukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMalukuMouseEntered
        pulau.setText("Ini Pulau Maluku");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/maluku.png"));
        labelMaluku.setIcon(ii);
    }//GEN-LAST:event_labelMalukuMouseEntered

    private void labelMalukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMalukuMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelMaluku.setIcon(ii);
    }//GEN-LAST:event_labelMalukuMouseExited

    private void labelPapuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPapuaMouseEntered
        pulau.setText("Ini Pulau Papua");
        ii = new ImageIcon(getClass().getResource("/UAS/img/peta/papua2.png"));
        labelPapua.setIcon(ii);
    }//GEN-LAST:event_labelPapuaMouseEntered

    private void labelPapuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPapuaMouseExited
        pulau.setText("");
        ii = new ImageIcon(getClass().getResource(""));
        labelPapua.setIcon(ii);
    }//GEN-LAST:event_labelPapuaMouseExited

    private void labelSumatraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSumatraMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "sumatra");
    }//GEN-LAST:event_labelSumatraMouseClicked

    private void labelBaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBaliMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "bali");
    }//GEN-LAST:event_labelBaliMouseClicked

    private void btnKembaliBali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliBali2ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali2");
    }//GEN-LAST:event_btnKembaliBali2ActionPerformed

    private void btnKembaliBali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliBali1ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali1");
    }//GEN-LAST:event_btnKembaliBali1ActionPerformed

    private void btnLanjutBali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutBali1ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali3");
    }//GEN-LAST:event_btnLanjutBali1ActionPerformed

    private void btnLanjutBali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutBali2ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali");
    }//GEN-LAST:event_btnLanjutBali2ActionPerformed

    private void btnSwipeKiriBaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwipeKiriBaliActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnSwipeKiriBaliActionPerformed

    private void btnSwipeKananBaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwipeKananBaliActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali2");
    }//GEN-LAST:event_btnSwipeKananBaliActionPerformed

    private void btnBaliNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliNantiActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali1");
    }//GEN-LAST:event_btnBaliNantiActionPerformed

    private void btnSumatraNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraNantiActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra1");
    }//GEN-LAST:event_btnSumatraNantiActionPerformed

    private void btnJawaNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaNantiActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa1");
    }//GEN-LAST:event_btnJawaNantiActionPerformed

    private void btnKalimantanNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanNantiActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan1");
    }//GEN-LAST:event_btnKalimantanNantiActionPerformed

    private void btnSulawesiNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiNantiActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi1");
    }//GEN-LAST:event_btnSulawesiNantiActionPerformed

    private void btnMalukuNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuNantiActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku1");
    }//GEN-LAST:event_btnMalukuNantiActionPerformed

    private void btnPapuaNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaNantiActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua1");
    }//GEN-LAST:event_btnPapuaNantiActionPerformed

    private void btnKembaliPetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPetaActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "dashboard");
    }//GEN-LAST:event_btnKembaliPetaActionPerformed

    private void btnBaliAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliAyoActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali1");
    }//GEN-LAST:event_btnBaliAyoActionPerformed

    private void btnBaliLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali3");
    }//GEN-LAST:event_btnBaliLompat2ActionPerformed

    private void btnBaliLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali2");
    }//GEN-LAST:event_btnBaliLompat1ActionPerformed

    private void btnBaliLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali4");
    }//GEN-LAST:event_btnBaliLompat3ActionPerformed

    private void btnBaliLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali5");
    }//GEN-LAST:event_btnBaliLompat4ActionPerformed

    private void btnBaliLompat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliLompat5ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "lompatBali");
    }//GEN-LAST:event_btnBaliLompat5ActionPerformed

    private void btnHariNasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariNasionalActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariNasionalActionPerformed

    private void btnHariGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariGuruActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariGuruActionPerformed

    private void btnHariSuciMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariSuciMousePressed
        jawabanQuisBali1.setText("BENAR");
    }//GEN-LAST:event_btnHariSuciMousePressed

    private void btnHariNasionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariNasionalMousePressed
        jawabanQuisBali1.setText("SALAH");
    }//GEN-LAST:event_btnHariNasionalMousePressed

    private void btnHariGuruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariGuruMousePressed
        jawabanQuisBali1.setText("SALAH");
    }//GEN-LAST:event_btnHariGuruMousePressed

    private void btnHariLiburMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariLiburMousePressed
        jawabanQuisBali1.setText("SALAH");
    }//GEN-LAST:event_btnHariLiburMousePressed

    private void btnHariSuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariSuciActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "quisBali2");
            jawabanQuisBali1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariSuciActionPerformed

    private void btnHariLiburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariLiburActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariLiburActionPerformed

    private void btnPayasAgungMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayasAgungMousePressed
        jawabanQuisBali2.setText("BENAR");
    }//GEN-LAST:event_btnPayasAgungMousePressed

    private void btnPayasAgungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayasAgungActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "quisBali3");
            jawabanQuisBali2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPayasAgungActionPerformed

    private void btnBajuMantenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajuMantenActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBajuMantenActionPerformed

    private void btnAesanGedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAesanGedeActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAesanGedeActionPerformed

    private void btnUleeBalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUleeBalangActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUleeBalangActionPerformed

    private void btnBajuMantenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajuMantenMousePressed
        jawabanQuisBali2.setText("SALAH");
    }//GEN-LAST:event_btnBajuMantenMousePressed

    private void btnAesanGedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAesanGedeMousePressed
        jawabanQuisBali2.setText("SALAH");
    }//GEN-LAST:event_btnAesanGedeMousePressed

    private void btnUleeBalangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUleeBalangMousePressed
        jawabanQuisBali2.setText("SALAH");
    }//GEN-LAST:event_btnUleeBalangMousePressed

    private void btnCandiSebentarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiSebentarMousePressed
        jawabanQuisBali3.setText("SALAH");
    }//GEN-LAST:event_btnCandiSebentarMousePressed

    private void btnCandiBorobudurMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiBorobudurMousePressed
        jawabanQuisBali3.setText("SALAH");
    }//GEN-LAST:event_btnCandiBorobudurMousePressed

    private void btnCandiSingosariMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiSingosariMousePressed
        jawabanQuisBali3.setText("SALAH");
    }//GEN-LAST:event_btnCandiSingosariMousePressed

    private void btnCandiBentarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiBentarMousePressed
        jawabanQuisBali3.setText("BENAR");
    }//GEN-LAST:event_btnCandiBentarMousePressed

    private void btnCandiSebentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiSebentarActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiSebentarActionPerformed

    private void btnCandiSingosariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiSingosariActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiSingosariActionPerformed

    private void btnCandiBorobudurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiBorobudurActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiBorobudurActionPerformed

    private void btnCandiBentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiBentarActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "quisBali4");
            jawabanQuisBali3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiBentarActionPerformed

    private void btnPulauSeribuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPulauSeribuMousePressed
        jawabanQuisBali4.setText("SALAH");
    }//GEN-LAST:event_btnPulauSeribuMousePressed

    private void btnPulauDewataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPulauDewataMousePressed
        jawabanQuisBali4.setText("BENAR");
    }//GEN-LAST:event_btnPulauDewataMousePressed

    private void btnPulauSeribuPuraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPulauSeribuPuraMousePressed
        jawabanQuisBali4.setText("BENAR");
    }//GEN-LAST:event_btnPulauSeribuPuraMousePressed

    private void btnPulauDewantaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPulauDewantaMousePressed
        jawabanQuisBali4.setText("SALAH");
    }//GEN-LAST:event_btnPulauDewantaMousePressed

    private void btnPulauSeribuPuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulauSeribuPuraActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "quisBali5");
            jawabanQuisBali4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPulauSeribuPuraActionPerformed

    private void btnPulauDewataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulauDewataActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "quisBali5");
            jawabanQuisBali4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPulauDewataActionPerformed

    private void btnPulauSeribuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulauSeribuActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPulauSeribuActionPerformed

    private void btnPulauDewantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulauDewantaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPulauDewantaActionPerformed

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        jawabanQuisSumatra1.setText("SALAH");
    }//GEN-LAST:event_btn1MousePressed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MousePressed
        jawabanQuisSumatra1.setText("BENAR");
    }//GEN-LAST:event_btn9MousePressed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sumatra.getLayout();
            cLayout.show(sumatra, "quisSumatra2");
            jawabanQuisSumatra1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        jawabanQuisSumatra1.setText("SALAH");
    }//GEN-LAST:event_btn4MousePressed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MousePressed
        jawabanQuisSumatra1.setText("SALAH");
    }//GEN-LAST:event_btn7MousePressed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnSumatraLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra2");
    }//GEN-LAST:event_btnSumatraLompat1ActionPerformed

    private void btnSumatraBaratMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatraBaratMousePressed
        jawabanQuisSumatra2.setText("BENAR");
    }//GEN-LAST:event_btnSumatraBaratMousePressed

    private void btnSumatraBaratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraBaratActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sumatra.getLayout();
            cLayout.show(sumatra, "quisSumatra3");
            jawabanQuisSumatra2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatraBaratActionPerformed

    private void btnSumatraSelatanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatraSelatanMousePressed
        jawabanQuisSumatra2.setText("SALAH");
    }//GEN-LAST:event_btnSumatraSelatanMousePressed

    private void btnSumatraSelatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraSelatanActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatraSelatanActionPerformed

    private void btnSumatraUtaraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatraUtaraMousePressed
        jawabanQuisSumatra2.setText("SALAH");
    }//GEN-LAST:event_btnSumatraUtaraMousePressed

    private void btnSumatraUtaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraUtaraActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatraUtaraActionPerformed

    private void btnAcehMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcehMousePressed
        jawabanQuisSumatra2.setText("SALAH");
    }//GEN-LAST:event_btnAcehMousePressed

    private void btnAcehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcehActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAcehActionPerformed

    private void btnSumatraLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra3");
    }//GEN-LAST:event_btnSumatraLompat2ActionPerformed

    private void btnCandiBentar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiBentar1MousePressed
        jawabanQuisSumatra3.setText("SALAH");
    }//GEN-LAST:event_btnCandiBentar1MousePressed

    private void btnCandiBentar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiBentar1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiBentar1ActionPerformed

    private void btnCandiSingosari1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiSingosari1MousePressed
        jawabanQuisSumatra3.setText("SALAH");
    }//GEN-LAST:event_btnCandiSingosari1MousePressed

    private void btnCandiSingosari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiSingosari1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiSingosari1ActionPerformed

    private void btnCandiBorobudur1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiBorobudur1MousePressed
        jawabanQuisSumatra3.setText("SALAH");
    }//GEN-LAST:event_btnCandiBorobudur1MousePressed

    private void btnCandiBorobudur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiBorobudur1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiBorobudur1ActionPerformed

    private void btnCandiSebentar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandiSebentar1MousePressed
        jawabanQuisSumatra3.setText("BENAR");
    }//GEN-LAST:event_btnCandiSebentar1MousePressed

    private void btnCandiSebentar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandiSebentar1ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sumatra.getLayout();
            cLayout.show(sumatra, "quisSumatra4");
            jawabanQuisSumatra3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCandiSebentar1ActionPerformed

    private void btnSumatraLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra4");
    }//GEN-LAST:event_btnSumatraLompat3ActionPerformed

    private void btnMieSedaapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMieSedaapMousePressed
        jawabanQuisSumatra4.setText("SALAH");
    }//GEN-LAST:event_btnMieSedaapMousePressed

    private void btnMieSedaapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMieSedaapActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMieSedaapActionPerformed

    private void btnMieAcehMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMieAcehMousePressed
        jawabanQuisSumatra4.setText("BENAR");
    }//GEN-LAST:event_btnMieAcehMousePressed

    private void btnMieAcehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMieAcehActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sumatra.getLayout();
            cLayout.show(sumatra, "quisSumatra5");
            jawabanQuisSumatra4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMieAcehActionPerformed

    private void btnMieIndomieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMieIndomieMousePressed
        jawabanQuisSumatra4.setText("SALAH");
    }//GEN-LAST:event_btnMieIndomieMousePressed

    private void btnMieIndomieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMieIndomieActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMieIndomieActionPerformed

    private void btnMieGacoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMieGacoanMousePressed
        jawabanQuisSumatra4.setText("SALAH");
    }//GEN-LAST:event_btnMieGacoanMousePressed

    private void btnMieGacoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMieGacoanActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMieGacoanActionPerformed

    private void btnSumatraLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra5");
    }//GEN-LAST:event_btnSumatraLompat4ActionPerformed

    private void btnSumatraLompat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraLompat5ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "lompatSumatra");
    }//GEN-LAST:event_btnSumatraLompat5ActionPerformed

    private void btnBaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaliMousePressed
        jawabanQuisSumatra5.setText("SALAH");
    }//GEN-LAST:event_btnBaliMousePressed

    private void btnBaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaliActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBaliActionPerformed

    private void btnJakartaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJakartaMousePressed
        jawabanQuisSumatra5.setText("SALAH");
    }//GEN-LAST:event_btnJakartaMousePressed

    private void btnJakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJakartaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJakartaActionPerformed

    private void btnMalangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMalangMousePressed
        jawabanQuisSumatra5.setText("SALAH");
    }//GEN-LAST:event_btnMalangMousePressed

    private void btnMalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalangActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSumatra5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMalangActionPerformed

    private void btnSumatraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatraMousePressed
        jawabanQuisSumatra5.setText("BENAR");
    }//GEN-LAST:event_btnSumatraMousePressed

    private void btnSumatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sumatra.getLayout();
            cLayout.show(sumatra, "selesaiSumatra");
            jawabanQuisSumatra5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatraActionPerformed

    private void btnSateKambingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateKambingMousePressed
        jawabanQuisBali5.setText("SALAH");
    }//GEN-LAST:event_btnSateKambingMousePressed

    private void btnSateKambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateKambingActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateKambingActionPerformed

    private void btnSateAyamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateAyamMousePressed
        jawabanQuisBali5.setText("SALAH");
    }//GEN-LAST:event_btnSateAyamMousePressed

    private void btnSateAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateAyamActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateAyamActionPerformed

    private void btnSateLilitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateLilitMousePressed
        jawabanQuisBali5.setText("BENAR");
    }//GEN-LAST:event_btnSateLilitMousePressed

    private void btnSateLilitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateLilitActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) bali.getLayout();
            cLayout.show(bali, "selesaiBali");
            jawabanQuisBali5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateLilitActionPerformed

    private void btnSateTaichanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateTaichanMousePressed
        jawabanQuisBali5.setText("SALAH");
    }//GEN-LAST:event_btnSateTaichanMousePressed

    private void btnSateTaichanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateTaichanActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisBali5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateTaichanActionPerformed

    private void btnTidakBali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakBali1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakBali1ActionPerformed

    private void btnYaBali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaBali1ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "quisBali");
    }//GEN-LAST:event_btnYaBali1ActionPerformed

    private void btnTidakBali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakBali2ActionPerformed
        CardLayout cLayout = (CardLayout) bali.getLayout();
        cLayout.show(bali, "panelBali1");
    }//GEN-LAST:event_btnTidakBali2ActionPerformed

    private void btnYaBali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaBali2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaBali2ActionPerformed

    private void btnYaSumatra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaSumatra1ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra");
    }//GEN-LAST:event_btnYaSumatra1ActionPerformed

    private void btnTidakSumatra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakSumatra1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakSumatra1ActionPerformed

    private void btnTidakSumatra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakSumatra2ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra1");
    }//GEN-LAST:event_btnTidakSumatra2ActionPerformed

    private void btnYaSumatra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaSumatra2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaSumatra2ActionPerformed

    private void btnLanjutSumatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSumatraActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra3");
    }//GEN-LAST:event_btnLanjutSumatraActionPerformed

    private void btnLanjutSumatra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSumatra2ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra4");
    }//GEN-LAST:event_btnLanjutSumatra2ActionPerformed

    private void btnLanjutSumatra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSumatra3ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra5");
    }//GEN-LAST:event_btnLanjutSumatra3ActionPerformed

    private void btnLanjutSumatra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSumatra4ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra6");
    }//GEN-LAST:event_btnLanjutSumatra4ActionPerformed

    private void btnKembaliSumatra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSumatra4ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra4");
    }//GEN-LAST:event_btnKembaliSumatra4ActionPerformed

    private void btnKembaliSumatra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSumatra3ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra3");
    }//GEN-LAST:event_btnKembaliSumatra3ActionPerformed

    private void btnKembaliSumatra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSumatra2ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra2");
    }//GEN-LAST:event_btnKembaliSumatra2ActionPerformed

    private void btnKembaliSumatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSumatraActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra1");
    }//GEN-LAST:event_btnKembaliSumatraActionPerformed

    private void btnKembaliSumatra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSumatra5ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra5");
    }//GEN-LAST:event_btnKembaliSumatra5ActionPerformed

    private void btnLanjutSumatra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSumatra5ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra");
    }//GEN-LAST:event_btnLanjutSumatra5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "panelSumatra2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSumatraAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatraAyoActionPerformed
        CardLayout cLayout = (CardLayout) sumatra.getLayout();
        cLayout.show(sumatra, "quisSumatra1");
    }//GEN-LAST:event_btnSumatraAyoActionPerformed

    private void btnKembaliSulawesi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSulawesi1ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi1");
    }//GEN-LAST:event_btnKembaliSulawesi1ActionPerformed

    private void btnLanjutSulawesi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSulawesi1ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi3");
    }//GEN-LAST:event_btnLanjutSulawesi1ActionPerformed

    private void labelKalimantanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKalimantanMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "kalimantan");
    }//GEN-LAST:event_labelKalimantanMouseClicked

    private void labelJawaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelJawaMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "jawa");
    }//GEN-LAST:event_labelJawaMouseClicked

    private void labelSulawesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSulawesiMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "sulawesi");
    }//GEN-LAST:event_labelSulawesiMouseClicked

    private void labelMalukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMalukuMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "maluku");
    }//GEN-LAST:event_labelMalukuMouseClicked

    private void labelPapuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPapuaMouseClicked
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "papua");
    }//GEN-LAST:event_labelPapuaMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLanjutJawa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutJawa1ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa2");
    }//GEN-LAST:event_btnLanjutJawa1ActionPerformed

    private void btnKembaliJawa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliJawa1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnKembaliJawa1ActionPerformed

    private void btnTidakJawa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakJawa1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakJawa1ActionPerformed

    private void btnYaJawa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaJawa1ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa");
    }//GEN-LAST:event_btnYaJawa1ActionPerformed

    private void btnTidakJawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakJawa2ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa1");
    }//GEN-LAST:event_btnTidakJawa2ActionPerformed

    private void btnYaJawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaJawa2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaJawa2ActionPerformed

    private void btnTidakKalimantan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakKalimantan1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakKalimantan1ActionPerformed

    private void btnYaKalimantan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaKalimantan1ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan");
    }//GEN-LAST:event_btnYaKalimantan1ActionPerformed

    private void btnTidakKalimantan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakKalimantan2ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan1");
    }//GEN-LAST:event_btnTidakKalimantan2ActionPerformed

    private void btnYaKalimantan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaKalimantan2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaKalimantan2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan2");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnTidakSulawesi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakSulawesi1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakSulawesi1ActionPerformed

    private void btnYaSulawesi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaSulawesi1ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi");
    }//GEN-LAST:event_btnYaSulawesi1ActionPerformed

    private void btnTidakSulawesi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakSulawesi2ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi1");
    }//GEN-LAST:event_btnTidakSulawesi2ActionPerformed

    private void btnYaSulawesi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaSulawesi2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaSulawesi2ActionPerformed

    private void btnTidakMaluku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakMaluku1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakMaluku1ActionPerformed

    private void btnYaMaluku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaMaluku1ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku");
    }//GEN-LAST:event_btnYaMaluku1ActionPerformed

    private void btnTidakMaluku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakMaluku2ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku1");
    }//GEN-LAST:event_btnTidakMaluku2ActionPerformed

    private void btnYaMaluku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaMaluku2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaMaluku2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku2");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua2");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnTidakPapua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakPapua1ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnTidakPapua1ActionPerformed

    private void btnYaPapua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaPapua1ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua");
    }//GEN-LAST:event_btnYaPapua1ActionPerformed

    private void btnTidakPapua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakPapua2ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua1");
    }//GEN-LAST:event_btnTidakPapua2ActionPerformed

    private void btnYaPapua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaPapua2ActionPerformed
        CardLayout cLayout = (CardLayout) panelUtama.getLayout();
        cLayout.show(panelUtama, "peta");
    }//GEN-LAST:event_btnYaPapua2ActionPerformed

    private void btnKembaliJawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliJawa2ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa1");
    }//GEN-LAST:event_btnKembaliJawa2ActionPerformed

    private void btnLanjutJawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutJawa2ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa3");
    }//GEN-LAST:event_btnLanjutJawa2ActionPerformed

    private void btnKembaliJawa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliJawa3ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa2");
    }//GEN-LAST:event_btnKembaliJawa3ActionPerformed

    private void btnLanjutJawa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutJawa3ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa4");
    }//GEN-LAST:event_btnLanjutJawa3ActionPerformed

    private void btnKembaliJawa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliJawa4ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa3");
    }//GEN-LAST:event_btnKembaliJawa4ActionPerformed

    private void btnLanjutJawa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutJawa4ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa5");
    }//GEN-LAST:event_btnLanjutJawa4ActionPerformed

    private void btnKembaliJawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliJawaActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "panelJawa4");
    }//GEN-LAST:event_btnKembaliJawaActionPerformed

    private void btnLanjutJawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutJawaActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa");
    }//GEN-LAST:event_btnLanjutJawaActionPerformed

    private void btnSipitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSipitMousePressed
        jawabanQuisJawa1.setText("SALAH");
    }//GEN-LAST:event_btnSipitMousePressed

    private void btnSipitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSipitActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSipitActionPerformed

    private void btnMataLebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMataLebarMousePressed
        jawabanQuisJawa1.setText("BENAR");
    }//GEN-LAST:event_btnMataLebarMousePressed

    private void btnMataLebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMataLebarActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) jawa.getLayout();
            cLayout.show(jawa, "quisJawa2");
            jawabanQuisJawa1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMataLebarActionPerformed

    private void btnRambutMerahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRambutMerahMousePressed
        jawabanQuisJawa1.setText("SALAH");
    }//GEN-LAST:event_btnRambutMerahMousePressed

    private void btnRambutMerahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRambutMerahActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRambutMerahActionPerformed

    private void btnRambutKritingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRambutKritingMousePressed
        jawabanQuisJawa1.setText("SALAH");
    }//GEN-LAST:event_btnRambutKritingMousePressed

    private void btnRambutKritingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRambutKritingActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRambutKritingActionPerformed

    private void btnJawaLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa2");
    }//GEN-LAST:event_btnJawaLompat1ActionPerformed

    private void btnPapuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapuaMousePressed
        jawabanQuisJawa2.setText("SALAH");
    }//GEN-LAST:event_btnPapuaMousePressed

    private void btnPapuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPapuaActionPerformed

    private void btnSumatra6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatra6MousePressed
        jawabanQuisJawa2.setText("SALAH");
    }//GEN-LAST:event_btnSumatra6MousePressed

    private void btnSumatra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatra6ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatra6ActionPerformed

    private void btnJawaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJawaMousePressed
        jawabanQuisJawa2.setText("BENAR");
    }//GEN-LAST:event_btnJawaMousePressed

    private void btnJawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) jawa.getLayout();
            cLayout.show(jawa, "quisJawa3");
            jawabanQuisJawa2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJawaActionPerformed

    private void btnKalimantanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKalimantanMousePressed
        jawabanQuisJawa2.setText("SALAH");
    }//GEN-LAST:event_btnKalimantanMousePressed

    private void btnKalimantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKalimantanActionPerformed

    private void btnJawaLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa3");
    }//GEN-LAST:event_btnJawaLompat2ActionPerformed

    private void btnEmpatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpatMousePressed
        jawabanQuisJawa3.setText("BENAR");
    }//GEN-LAST:event_btnEmpatMousePressed

    private void btnEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpatActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) jawa.getLayout();
            cLayout.show(jawa, "quisJawa4");
            jawabanQuisJawa3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEmpatActionPerformed

    private void btnTigaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTigaMousePressed
        jawabanQuisJawa3.setText("SALAH");
    }//GEN-LAST:event_btnTigaMousePressed

    private void btnTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTigaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTigaActionPerformed

    private void btnDuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDuaMousePressed
        jawabanQuisJawa3.setText("SALAH");
    }//GEN-LAST:event_btnDuaMousePressed

    private void btnDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDuaActionPerformed

    private void btnSatuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatuMousePressed
        jawabanQuisJawa3.setText("SALAH");
    }//GEN-LAST:event_btnSatuMousePressed

    private void btnSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSatuActionPerformed

    private void btnJawaLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa4");
    }//GEN-LAST:event_btnJawaLompat3ActionPerformed

    private void btnBakpaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBakpaoMousePressed
        jawabanQuisJawa4.setText("SALAH");
    }//GEN-LAST:event_btnBakpaoMousePressed

    private void btnBakpaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBakpaoActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBakpaoActionPerformed

    private void btnLontongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLontongMousePressed
        jawabanQuisJawa4.setText("BENAR");
    }//GEN-LAST:event_btnLontongMousePressed

    private void btnLontongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLontongActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) jawa.getLayout();
            cLayout.show(jawa, "quisJawa5");
            jawabanQuisJawa4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLontongActionPerformed

    private void btnSteakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSteakMousePressed
        jawabanQuisJawa4.setText("SALAH");
    }//GEN-LAST:event_btnSteakMousePressed

    private void btnSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteakActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSteakActionPerformed

    private void btnGudegMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGudegMousePressed
        jawabanQuisJawa4.setText("SALAH");
    }//GEN-LAST:event_btnGudegMousePressed

    private void btnGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGudegActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGudegActionPerformed

    private void btnJawaLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa5");
    }//GEN-LAST:event_btnJawaLompat4ActionPerformed

    private void btnSateKambing1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateKambing1MousePressed
        jawabanQuisJawa5.setText("SALAH");
    }//GEN-LAST:event_btnSateKambing1MousePressed

    private void btnSateKambing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateKambing1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateKambing1ActionPerformed

    private void btnSateAyam1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateAyam1MousePressed
        jawabanQuisJawa5.setText("SALAH");
    }//GEN-LAST:event_btnSateAyam1MousePressed

    private void btnSateAyam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateAyam1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateAyam1ActionPerformed

    private void btnSateLilit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateLilit1MousePressed
        jawabanQuisJawa5.setText("BENAR");
    }//GEN-LAST:event_btnSateLilit1MousePressed

    private void btnSateLilit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateLilit1ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) jawa.getLayout();
            cLayout.show(jawa, "selesaiJawa");
            jawabanQuisJawa5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateLilit1ActionPerformed

    private void btnSateTaichan1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSateTaichan1MousePressed
        jawabanQuisJawa5.setText("SALAH");
    }//GEN-LAST:event_btnSateTaichan1MousePressed

    private void btnSateTaichan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSateTaichan1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisJawa5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSateTaichan1ActionPerformed

    private void btnJawaLompat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaLompat5ActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "lompatJawa");
    }//GEN-LAST:event_btnJawaLompat5ActionPerformed

    private void btnJawaAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawaAyoActionPerformed
        CardLayout cLayout = (CardLayout) jawa.getLayout();
        cLayout.show(jawa, "quisJawa1");
    }//GEN-LAST:event_btnJawaAyoActionPerformed

    private void btnBiruTuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiruTuaMousePressed
        jawabanQuisKalimantan1.setText("BENAR");
    }//GEN-LAST:event_btnBiruTuaMousePressed

    private void btnBiruTuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiruTuaActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) kalimantan.getLayout();
            cLayout.show(kalimantan, "quisKalimantan2");
            jawabanQuisKalimantan1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBiruTuaActionPerformed

    private void btnMerahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMerahMousePressed
        jawabanQuisKalimantan1.setText("SALAH");
    }//GEN-LAST:event_btnMerahMousePressed

    private void btnMerahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMerahActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMerahActionPerformed

    private void btnBiruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiruMousePressed
        jawabanQuisKalimantan1.setText("SALAH");
    }//GEN-LAST:event_btnBiruMousePressed

    private void btnBiruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiruActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBiruActionPerformed

    private void btnHijauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHijauMousePressed
        jawabanQuisKalimantan1.setText("SALAH");
    }//GEN-LAST:event_btnHijauMousePressed

    private void btnHijauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHijauActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHijauActionPerformed

    private void btnKalimantanLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan2");
    }//GEN-LAST:event_btnKalimantanLompat1ActionPerformed

    private void btnTujuhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTujuhMousePressed
        jawabanQuisKalimantan2.setText("BENAR");
    }//GEN-LAST:event_btnTujuhMousePressed

    private void btnTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTujuhActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) kalimantan.getLayout();
            cLayout.show(kalimantan, "quisKalimantan3");
            jawabanQuisKalimantan2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTujuhActionPerformed

    private void btnEmpat4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpat4MousePressed
        jawabanQuisKalimantan2.setText("SALAH");
    }//GEN-LAST:event_btnEmpat4MousePressed

    private void btnEmpat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpat4ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEmpat4ActionPerformed

    private void btnLimaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimaMousePressed
        jawabanQuisKalimantan2.setText("SALAH");
    }//GEN-LAST:event_btnLimaMousePressed

    private void btnLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLimaActionPerformed

    private void btnEnamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnamMousePressed
        jawabanQuisKalimantan2.setText("SALAH");
    }//GEN-LAST:event_btnEnamMousePressed

    private void btnEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnamActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEnamActionPerformed

    private void btnKalimantanLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan3");
    }//GEN-LAST:event_btnKalimantanLompat2ActionPerformed

    private void btnKebayaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKebayaMousePressed
        jawabanQuisKalimantan3.setText("SALAH");
    }//GEN-LAST:event_btnKebayaMousePressed

    private void btnKebayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKebayaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKebayaActionPerformed

    private void btnTaaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaaMousePressed
        jawabanQuisKalimantan3.setText("BENAR");
    }//GEN-LAST:event_btnTaaMousePressed

    private void btnTaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaaActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) kalimantan.getLayout();
            cLayout.show(kalimantan, "quisKalimantan4");
            jawabanQuisKalimantan3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTaaActionPerformed

    private void btnHoodieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoodieMousePressed
        jawabanQuisKalimantan3.setText("SALAH");
    }//GEN-LAST:event_btnHoodieMousePressed

    private void btnHoodieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoodieActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHoodieActionPerformed

    private void btnKembenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembenMousePressed
        jawabanQuisKalimantan3.setText("SALAH");
    }//GEN-LAST:event_btnKembenMousePressed

    private void btnKembenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembenActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKembenActionPerformed

    private void btnKalimantanLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan4");
    }//GEN-LAST:event_btnKalimantanLompat3ActionPerformed

    private void btnBanjarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanjarMousePressed
        jawabanQuisKalimantan4.setText("SALAH");
    }//GEN-LAST:event_btnBanjarMousePressed

    private void btnBanjarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanjarActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBanjarActionPerformed

    private void btnOsingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOsingMousePressed
        jawabanQuisKalimantan4.setText("BENAR");
    }//GEN-LAST:event_btnOsingMousePressed

    private void btnOsingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsingActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) kalimantan.getLayout();
            cLayout.show(kalimantan, "quisKalimantan5");
            jawabanQuisKalimantan4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOsingActionPerformed

    private void btnKutaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKutaiMousePressed
        jawabanQuisKalimantan4.setText("SALAH");
    }//GEN-LAST:event_btnKutaiMousePressed

    private void btnKutaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKutaiActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKutaiActionPerformed

    private void btnDayakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDayakMousePressed
        jawabanQuisKalimantan4.setText("SALAH");
    }//GEN-LAST:event_btnDayakMousePressed

    private void btnDayakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayakActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDayakActionPerformed

    private void btnKalimantanLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan5");
    }//GEN-LAST:event_btnKalimantanLompat4ActionPerformed

    private void btnHariLibur6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariLibur6MousePressed
        jawabanQuisKalimantan5.setText("SALAH");
    }//GEN-LAST:event_btnHariLibur6MousePressed

    private void btnHariLibur6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariLibur6ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariLibur6ActionPerformed

    private void btnHariGuru6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariGuru6MousePressed
        jawabanQuisKalimantan5.setText("SALAH");
    }//GEN-LAST:event_btnHariGuru6MousePressed

    private void btnHariGuru6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariGuru6ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariGuru6ActionPerformed

    private void btnHariNasional6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariNasional6MousePressed
        jawabanQuisKalimantan5.setText("SALAH");
    }//GEN-LAST:event_btnHariNasional6MousePressed

    private void btnHariNasional6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariNasional6ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisKalimantan5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariNasional6ActionPerformed

    private void btnLaminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaminMousePressed
        jawabanQuisKalimantan5.setText("BENAR");
    }//GEN-LAST:event_btnLaminMousePressed

    private void btnLaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaminActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) kalimantan.getLayout();
            cLayout.show(kalimantan, "selesaiKalimantan");
            jawabanQuisKalimantan5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLaminActionPerformed

    private void btnKalimantanLompat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanLompat5ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "lompatKalimantan");
    }//GEN-LAST:event_btnKalimantanLompat5ActionPerformed

    private void btnRambutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRambutMousePressed
        jawabanQuisSulawesi1.setText("BENAR");
    }//GEN-LAST:event_btnRambutMousePressed

    private void btnRambutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRambutActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sulawesi.getLayout();
            cLayout.show(sulawesi, "quisSulawesi2");
            jawabanQuisSulawesi1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRambutActionPerformed

    private void btnTelingaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTelingaMousePressed
        jawabanQuisSulawesi1.setText("SALAH");
    }//GEN-LAST:event_btnTelingaMousePressed

    private void btnTelingaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelingaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTelingaActionPerformed

    private void btnKulitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKulitMousePressed
        jawabanQuisSulawesi1.setText("SALAH");
    }//GEN-LAST:event_btnKulitMousePressed

    private void btnKulitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKulitActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKulitActionPerformed

    private void btnBadanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBadanMousePressed
        jawabanQuisSulawesi1.setText("SALAH");
    }//GEN-LAST:event_btnBadanMousePressed

    private void btnBadanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadanActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBadanActionPerformed

    private void btnSulawesiLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi2");
    }//GEN-LAST:event_btnSulawesiLompat1ActionPerformed

    private void btn4EmpatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4EmpatMousePressed
        jawabanQuisSulawesi2.setText("BENAR");
    }//GEN-LAST:event_btn4EmpatMousePressed

    private void btn4EmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4EmpatActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sulawesi.getLayout();
            cLayout.show(sulawesi, "quisSulawesi3");
            jawabanQuisSulawesi2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn4EmpatActionPerformed

    private void btn2DuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2DuaMousePressed
        jawabanQuisSulawesi2.setText("SALAH");
    }//GEN-LAST:event_btn2DuaMousePressed

    private void btn2DuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2DuaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn2DuaActionPerformed

    private void btnSatu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatu1MousePressed
        jawabanQuisSulawesi2.setText("SALAH");
    }//GEN-LAST:event_btnSatu1MousePressed

    private void btnSatu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatu1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSatu1ActionPerformed

    private void btnTiga3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiga3MousePressed
        jawabanQuisSulawesi2.setText("SALAH");
    }//GEN-LAST:event_btnTiga3MousePressed

    private void btnTiga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiga3ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTiga3ActionPerformed

    private void btnSulawesiLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi3");
    }//GEN-LAST:event_btnSulawesiLompat2ActionPerformed

    private void btnLamin2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamin2MousePressed
        jawabanQuisSulawesi3.setText("SALAH");
    }//GEN-LAST:event_btnLamin2MousePressed

    private void btnLamin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamin2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLamin2ActionPerformed

    private void btnJogloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogloMousePressed
        jawabanQuisSulawesi3.setText("SALAH");
    }//GEN-LAST:event_btnJogloMousePressed

    private void btnJogloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogloActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJogloActionPerformed

    private void btnTambiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambiMousePressed
        jawabanQuisSulawesi3.setText("BENAR");
    }//GEN-LAST:event_btnTambiMousePressed

    private void btnTambiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambiActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sulawesi.getLayout();
            cLayout.show(sulawesi, "quisSulawesi4");
            jawabanQuisSulawesi3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTambiActionPerformed

    private void btnRumahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRumahMousePressed
        jawabanQuisSulawesi3.setText("SALAH");
    }//GEN-LAST:event_btnRumahMousePressed

    private void btnRumahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRumahActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRumahActionPerformed

    private void btnSulawesiLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi4");
    }//GEN-LAST:event_btnSulawesiLompat3ActionPerformed

    private void btn98MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn98MousePressed
        jawabanQuisSulawesi4.setText("SALAH");
    }//GEN-LAST:event_btn98MousePressed

    private void btn98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn98ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn98ActionPerformed

    private void btn180MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn180MousePressed
        jawabanQuisSulawesi4.setText("BENAR");
    }//GEN-LAST:event_btn180MousePressed

    private void btn180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn180ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sulawesi.getLayout();
            cLayout.show(sulawesi, "quisSulawesi5");
            jawabanQuisSulawesi4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn180ActionPerformed

    private void btn134MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn134MousePressed
        jawabanQuisSulawesi4.setText("SALAH");
    }//GEN-LAST:event_btn134MousePressed

    private void btn134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn134ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn134ActionPerformed

    private void btn12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MousePressed
        jawabanQuisSulawesi4.setText("SALAH");
    }//GEN-LAST:event_btn12MousePressed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btnSulawesiLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi5");
    }//GEN-LAST:event_btnSulawesiLompat4ActionPerformed

    private void btnSulawesi2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSulawesi2MousePressed
        jawabanQuisSulawesi5.setText("BENAR");
    }//GEN-LAST:event_btnSulawesi2MousePressed

    private void btnSulawesi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesi2ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) sulawesi.getLayout();
            cLayout.show(sulawesi, "selesaiSulawesi");
            jawabanQuisSulawesi5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSulawesi2ActionPerformed

    private void btnPapua2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapua2MousePressed
        jawabanQuisSulawesi5.setText("SALAH");
    }//GEN-LAST:event_btnPapua2MousePressed

    private void btnPapua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapua2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPapua2ActionPerformed

    private void btnJawa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJawa2MousePressed
        jawabanQuisSulawesi5.setText("SALAH");
    }//GEN-LAST:event_btnJawa2MousePressed

    private void btnJawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawa2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJawa2ActionPerformed

    private void btnBali2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBali2MousePressed
        jawabanQuisSulawesi5.setText("SALAH");
    }//GEN-LAST:event_btnBali2MousePressed

    private void btnBali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBali2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisSulawesi5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBali2ActionPerformed

    private void btnSulawesiLompat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiLompat5ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "lompatSulawesi");
    }//GEN-LAST:event_btnSulawesiLompat5ActionPerformed

    private void btnKembaliKalimantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliKalimantanActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan1");
    }//GEN-LAST:event_btnKembaliKalimantanActionPerformed

    private void btnLanjutKalimantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutKalimantanActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan3");
    }//GEN-LAST:event_btnLanjutKalimantanActionPerformed

    private void btnKembaliKalimantan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliKalimantan2ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "panelKalimantan2");
    }//GEN-LAST:event_btnKembaliKalimantan2ActionPerformed

    private void btnLanjutKalimantan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutKalimantan2ActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan");
    }//GEN-LAST:event_btnLanjutKalimantan2ActionPerformed

    private void btnKalimantanAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantanAyoActionPerformed
        CardLayout cLayout = (CardLayout) kalimantan.getLayout();
        cLayout.show(kalimantan, "quisKalimantan1");
    }//GEN-LAST:event_btnKalimantanAyoActionPerformed

    private void btnKembaliSulawesi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliSulawesi2ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi2");
    }//GEN-LAST:event_btnKembaliSulawesi2ActionPerformed

    private void btnLanjutSulawesi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutSulawesi2ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi");
    }//GEN-LAST:event_btnLanjutSulawesi2ActionPerformed

    private void btn1satu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1satu1MousePressed
        jawabanQuisMaluku1.setText("SALAH");
    }//GEN-LAST:event_btn1satu1MousePressed

    private void btn1satu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1satu1ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn1satu1ActionPerformed

    private void btn2Dua2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2Dua2MousePressed
        jawabanQuisMaluku1.setText("BENAR");
    }//GEN-LAST:event_btn2Dua2MousePressed

    private void btn2Dua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2Dua2ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) maluku.getLayout();
            cLayout.show(maluku, "quisMaluku2");
            jawabanQuisMaluku1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn2Dua2ActionPerformed

    private void btn11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MousePressed
        jawabanQuisMaluku1.setText("SALAH");
    }//GEN-LAST:event_btn11MousePressed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MousePressed
        jawabanQuisMaluku1.setText("SALAH");
    }//GEN-LAST:event_btn13MousePressed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btnMalukuLompatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuLompatActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku2");
    }//GEN-LAST:event_btnMalukuLompatActionPerformed

    private void btnAsmatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsmatMousePressed
        jawabanQuisMaluku2.setText("SALAH");
    }//GEN-LAST:event_btnAsmatMousePressed

    private void btnAsmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsmatActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAsmatActionPerformed

    private void btnSundaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSundaMousePressed
        jawabanQuisMaluku2.setText("SALAH");
    }//GEN-LAST:event_btnSundaMousePressed

    private void btnSundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSundaActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSundaActionPerformed

    private void btnBanjar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanjar2MousePressed
        jawabanQuisMaluku2.setText("SALAH");
    }//GEN-LAST:event_btnBanjar2MousePressed

    private void btnBanjar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanjar2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBanjar2ActionPerformed

    private void btnTernateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTernateMousePressed
        jawabanQuisMaluku2.setText("BENAR");
    }//GEN-LAST:event_btnTernateMousePressed

    private void btnTernateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTernateActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) maluku.getLayout();
            cLayout.show(maluku, "quisMaluku3");
            jawabanQuisMaluku2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTernateActionPerformed

    private void btnMalukuLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku3");
    }//GEN-LAST:event_btnMalukuLompat1ActionPerformed

    private void btnTunikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunikMousePressed
        jawabanQuisMaluku3.setText("SALAH");
    }//GEN-LAST:event_btnTunikMousePressed

    private void btnTunikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunikActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTunikActionPerformed

    private void btnKemben3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKemben3MousePressed
        jawabanQuisMaluku3.setText("SALAH");
    }//GEN-LAST:event_btnKemben3MousePressed

    private void btnKemben3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKemben3ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKemben3ActionPerformed

    private void btnNonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNonaMousePressed
        jawabanQuisMaluku3.setText("BENAR");
    }//GEN-LAST:event_btnNonaMousePressed

    private void btnNonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonaActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) maluku.getLayout();
            cLayout.show(maluku, "quisMaluku4");
            jawabanQuisMaluku3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNonaActionPerformed

    private void btnKebaya3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKebaya3MousePressed
        jawabanQuisMaluku3.setText("SALAH");
    }//GEN-LAST:event_btnKebaya3MousePressed

    private void btnKebaya3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKebaya3ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKebaya3ActionPerformed

    private void btnMalukuLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku4");
    }//GEN-LAST:event_btnMalukuLompat2ActionPerformed

    private void btnRambut2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRambut2MousePressed
        jawabanQuisMaluku4.setText("SALAH");
    }//GEN-LAST:event_btnRambut2MousePressed

    private void btnRambut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRambut2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRambut2ActionPerformed

    private void btnMancungMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMancungMousePressed
        jawabanQuisMaluku4.setText("SALAH");
    }//GEN-LAST:event_btnMancungMousePressed

    private void btnMancungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMancungActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMancungActionPerformed

    private void btnPutihMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPutihMousePressed
        jawabanQuisMaluku4.setText("SALAH");
    }//GEN-LAST:event_btnPutihMousePressed

    private void btnPutihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPutihActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPutihActionPerformed

    private void btnGelapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGelapMousePressed
        jawabanQuisMaluku4.setText("BENAR");
    }//GEN-LAST:event_btnGelapMousePressed

    private void btnGelapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGelapActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) maluku.getLayout();
            cLayout.show(maluku, "quisMaluku5");
            jawabanQuisMaluku4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGelapActionPerformed

    private void btnMalukuLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku5");
    }//GEN-LAST:event_btnMalukuLompat3ActionPerformed

    private void btnKalimantan2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKalimantan2MousePressed
        jawabanQuisMaluku5.setText("SALAH");
    }//GEN-LAST:event_btnKalimantan2MousePressed

    private void btnKalimantan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKalimantan2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKalimantan2ActionPerformed

    private void btnMaluku2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaluku2MousePressed
        jawabanQuisMaluku5.setText("BENAR");
    }//GEN-LAST:event_btnMaluku2MousePressed

    private void btnMaluku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaluku2ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) maluku.getLayout();
            cLayout.show(maluku, "selesaiMaluku");
            jawabanQuisMaluku5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMaluku2ActionPerformed

    private void btnSumatra2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumatra2MousePressed
        jawabanQuisMaluku5.setText("SALAH");
    }//GEN-LAST:event_btnSumatra2MousePressed

    private void btnSumatra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatra2ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumatra2ActionPerformed

    private void btnJawa4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJawa4MousePressed
        jawabanQuisMaluku5.setText("SALAH");
    }//GEN-LAST:event_btnJawa4MousePressed

    private void btnJawa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawa4ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisMaluku5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJawa4ActionPerformed

    private void btnMalukuLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "lompatMaluku");
    }//GEN-LAST:event_btnMalukuLompat4ActionPerformed

    private void btnPapua3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapua3MousePressed
        jawabanQuisPapua1.setText("BENAR");
    }//GEN-LAST:event_btnPapua3MousePressed

    private void btnPapua3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapua3ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) papua.getLayout();
            cLayout.show(papua, "quisPapua2");
            jawabanQuisPapua1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPapua3ActionPerformed

    private void btnAceh3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceh3MousePressed
        jawabanQuisPapua1.setText("SALAH");
    }//GEN-LAST:event_btnAceh3MousePressed

    private void btnAceh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceh3ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAceh3ActionPerformed

    private void btnJatimMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJatimMousePressed
        jawabanQuisPapua1.setText("SALAH");
    }//GEN-LAST:event_btnJatimMousePressed

    private void btnJatimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJatimActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnJatimActionPerformed

    private void btnBali4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBali4MousePressed
        jawabanQuisPapua1.setText("SALAH");
    }//GEN-LAST:event_btnBali4MousePressed

    private void btnBali4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBali4ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua1.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBali4ActionPerformed

    private void btnPapuaLompatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaLompatActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua2");
    }//GEN-LAST:event_btnPapuaLompatActionPerformed

    private void btnSumuriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumuriMousePressed
        jawabanQuisPapua2.setText("SALAH");
    }//GEN-LAST:event_btnSumuriMousePressed

    private void btnSumuriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumuriActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSumuriActionPerformed

    private void btnBiakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiakMousePressed
        jawabanQuisPapua2.setText("SALAH");
    }//GEN-LAST:event_btnBiakMousePressed

    private void btnBiakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiakActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBiakActionPerformed

    private void btnAsmat4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsmat4MousePressed
        jawabanQuisPapua2.setText("SALAH");
    }//GEN-LAST:event_btnAsmat4MousePressed

    private void btnAsmat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsmat4ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAsmat4ActionPerformed

    private void btnSunda4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSunda4MousePressed
        jawabanQuisPapua2.setText("BENAR");
    }//GEN-LAST:event_btnSunda4MousePressed

    private void btnSunda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSunda4ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) papua.getLayout();
            cLayout.show(papua, "quisPapua3");
            jawabanQuisPapua2.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSunda4ActionPerformed

    private void btnPapuaLompat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaLompat1ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua3");
    }//GEN-LAST:event_btnPapuaLompat1ActionPerformed

    private void btnMLHPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMLHPMousePressed
        jawabanQuisPapua3.setText("SALAH");
    }//GEN-LAST:event_btnMLHPMousePressed

    private void btnMLHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMLHPActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMLHPActionPerformed

    private void btnRLKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRLKHMousePressed
        jawabanQuisPapua3.setText("SALAH");
    }//GEN-LAST:event_btnRLKHMousePressed

    private void btnRLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRLKHActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRLKHActionPerformed

    private void btnRKKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRKKHMousePressed
        jawabanQuisPapua3.setText("BENAR");
    }//GEN-LAST:event_btnRKKHMousePressed

    private void btnRKKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRKKHActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) papua.getLayout();
            cLayout.show(papua, "quisPapua4");
            jawabanQuisPapua3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRKKHActionPerformed

    private void btnHMMLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHMMLMousePressed
        jawabanQuisPapua3.setText("SALAH");
    }//GEN-LAST:event_btnHMMLMousePressed

    private void btnHMMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHMMLActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua3.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHMMLActionPerformed

    private void btnPapuaLompat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaLompat2ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua4");
    }//GEN-LAST:event_btnPapuaLompat2ActionPerformed

    private void btnPiringMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiringMousePressed
        jawabanQuisPapua4.setText("SALAH");
    }//GEN-LAST:event_btnPiringMousePressed

    private void btnPiringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiringActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPiringActionPerformed

    private void btnSajojoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSajojoMousePressed
        jawabanQuisPapua4.setText("BENAR");
    }//GEN-LAST:event_btnSajojoMousePressed

    private void btnSajojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSajojoActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) papua.getLayout();
            cLayout.show(papua, "quisPapua5");
            jawabanQuisPapua4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSajojoActionPerformed

    private void btnGandrungMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGandrungMousePressed
        jawabanQuisPapua4.setText("SALAH");
    }//GEN-LAST:event_btnGandrungMousePressed

    private void btnGandrungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGandrungActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGandrungActionPerformed

    private void btnGambyongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGambyongMousePressed
        jawabanQuisPapua4.setText("SALAH");
    }//GEN-LAST:event_btnGambyongMousePressed

    private void btnGambyongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambyongActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua4.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGambyongActionPerformed

    private void btnPapuaLompat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaLompat3ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua5");
    }//GEN-LAST:event_btnPapuaLompat3ActionPerformed

    private void btnHariLibur21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariLibur21MousePressed
        jawabanQuisPapua5.setText("SALAH");
    }//GEN-LAST:event_btnHariLibur21MousePressed

    private void btnHariLibur21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariLibur21ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariLibur21ActionPerformed

    private void btnHariGuru21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariGuru21MousePressed
        jawabanQuisPapua5.setText("SALAH");
    }//GEN-LAST:event_btnHariGuru21MousePressed

    private void btnHariGuru21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariGuru21ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariGuru21ActionPerformed

    private void btnHariNasional21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariNasional21MousePressed
        jawabanQuisPapua5.setText("BENAR");
    }//GEN-LAST:event_btnHariNasional21MousePressed

    private void btnHariNasional21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariNasional21ActionPerformed
        try {
            Thread.sleep(2000);
            CardLayout cLayout = (CardLayout) papua.getLayout();
            cLayout.show(papua, "selesaiPapua");
            jawabanQuisPapua5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariNasional21ActionPerformed

    private void btnHariSuci21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHariSuci21MousePressed
        jawabanQuisPapua5.setText("SALAH");
    }//GEN-LAST:event_btnHariSuci21MousePressed

    private void btnHariSuci21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHariSuci21ActionPerformed
        try {
            Thread.sleep(1000);
            jawabanQuisPapua5.setText("");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHariSuci21ActionPerformed

    private void btnPapuaLompat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaLompat4ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "lompatPapua");
    }//GEN-LAST:event_btnPapuaLompat4ActionPerformed

    private void btnSulawesiAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulawesiAyoActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "quisSulawesi1");
    }//GEN-LAST:event_btnSulawesiAyoActionPerformed

    private void btnKembaliMaluku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliMaluku2ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku1");
    }//GEN-LAST:event_btnKembaliMaluku2ActionPerformed

    private void btnLanjutMaluku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutMaluku2ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku3");
    }//GEN-LAST:event_btnLanjutMaluku2ActionPerformed

    private void btnKembaliMaluku3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliMaluku3ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "panelMaluku2");
    }//GEN-LAST:event_btnKembaliMaluku3ActionPerformed

    private void btnLanjutMaluku3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutMaluku3ActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku");
    }//GEN-LAST:event_btnLanjutMaluku3ActionPerformed

    private void btnMalukuAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalukuAyoActionPerformed
        CardLayout cLayout = (CardLayout) maluku.getLayout();
        cLayout.show(maluku, "quisMaluku1");
    }//GEN-LAST:event_btnMalukuAyoActionPerformed

    private void btnKembaliPapua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPapua1ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua1");
    }//GEN-LAST:event_btnKembaliPapua1ActionPerformed

    private void btnLanjutpaua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutpaua1ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua3");
    }//GEN-LAST:event_btnLanjutpaua1ActionPerformed

    private void btnKembaliPapua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPapua2ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "panelPapua2");
    }//GEN-LAST:event_btnKembaliPapua2ActionPerformed

    private void btnLanjutPapua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutPapua2ActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua");
    }//GEN-LAST:event_btnLanjutPapua2ActionPerformed

    private void btnPapuaAyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapuaAyoActionPerformed
        CardLayout cLayout = (CardLayout) papua.getLayout();
        cLayout.show(papua, "quisPapua1");
    }//GEN-LAST:event_btnPapuaAyoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cLayout = (CardLayout) sulawesi.getLayout();
        cLayout.show(sulawesi, "panelSulawesi2");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });  
    }        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bali;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg3;
    private javax.swing.JLabel bgBali10;
    private javax.swing.JLabel bgBali11;
    private javax.swing.JLabel bgBali12;
    private javax.swing.JLabel bgBali2;
    private javax.swing.JLabel bgBali3;
    private javax.swing.JLabel bgBali4;
    private javax.swing.JLabel bgBali5;
    private javax.swing.JLabel bgBali6;
    private javax.swing.JLabel bgBali7;
    private javax.swing.JLabel bgBali8;
    private javax.swing.JLabel bgBali9;
    private javax.swing.JLabel bgJawa;
    private javax.swing.JLabel bgJawa13;
    private javax.swing.JLabel bgJawa14;
    private javax.swing.JLabel bgJawa15;
    private javax.swing.JLabel bgJawa16;
    private javax.swing.JLabel bgJawa18;
    private javax.swing.JLabel bgJawa19;
    private javax.swing.JLabel bgJawa2;
    private javax.swing.JLabel bgJawai17;
    private javax.swing.JLabel bgKalimantan;
    private javax.swing.JLabel bgKalimantan17;
    private javax.swing.JLabel bgKalimantan18;
    private javax.swing.JLabel bgKalimantan2;
    private javax.swing.JLabel bgKalimantan21;
    private javax.swing.JLabel bgKalimantan22;
    private javax.swing.JLabel bgKalimantan23;
    private javax.swing.JLabel bgKalimantan24;
    private javax.swing.JLabel bgKalimantan25;
    private javax.swing.JLabel bgMaluku;
    private javax.swing.JLabel bgMaluku15;
    private javax.swing.JLabel bgMaluku16;
    private javax.swing.JLabel bgMaluku2;
    private javax.swing.JLabel bgMaluku31;
    private javax.swing.JLabel bgMaluku32;
    private javax.swing.JLabel bgMaluku33;
    private javax.swing.JLabel bgMaluku34;
    private javax.swing.JLabel bgMaluku35;
    private javax.swing.JLabel bgPapua;
    private javax.swing.JLabel bgPapua17;
    private javax.swing.JLabel bgPapua18;
    private javax.swing.JLabel bgPapua2;
    private javax.swing.JLabel bgPapua24;
    private javax.swing.JLabel bgPapua36;
    private javax.swing.JLabel bgPapua37;
    private javax.swing.JLabel bgPapua38;
    private javax.swing.JLabel bgPapua39;
    private javax.swing.JLabel bgPapua40;
    private javax.swing.JLabel bgSulawesi;
    private javax.swing.JLabel bgSulawesi1;
    private javax.swing.JLabel bgSulawesi13;
    private javax.swing.JLabel bgSulawesi14;
    private javax.swing.JLabel bgSulawesi2;
    private javax.swing.JLabel bgSulawesi26;
    private javax.swing.JLabel bgSulawesi27;
    private javax.swing.JLabel bgSulawesi28;
    private javax.swing.JLabel bgSulawesi29;
    private javax.swing.JLabel bgSulawesi3;
    private javax.swing.JLabel bgSulawesi30;
    private javax.swing.JLabel bgSumatra;
    private javax.swing.JLabel bgSumatra10;
    private javax.swing.JLabel bgSumatra11;
    private javax.swing.JLabel bgSumatra12;
    private javax.swing.JLabel bgSumatra13;
    private javax.swing.JLabel bgSumatra14;
    private javax.swing.JLabel bgSumatra2;
    private javax.swing.JLabel bgSumatra8;
    private javax.swing.JLabel bgSumatra9;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn134;
    private javax.swing.JButton btn180;
    private javax.swing.JButton btn1satu1;
    private javax.swing.JButton btn2Dua;
    private javax.swing.JButton btn2Dua2;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn4Empat;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btnAceh;
    private javax.swing.JButton btnAceh3;
    private javax.swing.JButton btnAesanGede;
    private javax.swing.JButton btnAsmat;
    private javax.swing.JButton btnAsmat4;
    private javax.swing.JButton btnBadan;
    private javax.swing.JButton btnBajuManten;
    private javax.swing.JButton btnBakpao;
    private javax.swing.JButton btnBali;
    private javax.swing.JButton btnBali2;
    private javax.swing.JButton btnBali4;
    private javax.swing.JButton btnBaliAyo;
    private javax.swing.JButton btnBaliLompat1;
    private javax.swing.JButton btnBaliLompat2;
    private javax.swing.JButton btnBaliLompat3;
    private javax.swing.JButton btnBaliLompat4;
    private javax.swing.JButton btnBaliLompat5;
    private javax.swing.JButton btnBaliNanti;
    private javax.swing.JButton btnBanjar;
    private javax.swing.JButton btnBanjar2;
    private javax.swing.JButton btnBiak;
    private javax.swing.JButton btnBiru;
    private javax.swing.JButton btnBiruTua;
    private javax.swing.JButton btnCandiBentar;
    private javax.swing.JButton btnCandiBentar1;
    private javax.swing.JButton btnCandiBorobudur;
    private javax.swing.JButton btnCandiBorobudur1;
    private javax.swing.JButton btnCandiSebentar;
    private javax.swing.JButton btnCandiSebentar1;
    private javax.swing.JButton btnCandiSingosari;
    private javax.swing.JButton btnCandiSingosari1;
    private javax.swing.JButton btnDayak;
    private javax.swing.JButton btnDua;
    private javax.swing.JButton btnEmpat;
    private javax.swing.JButton btnEmpat4;
    private javax.swing.JButton btnEnam;
    private javax.swing.JButton btnGambyong;
    private javax.swing.JButton btnGandrung;
    private javax.swing.JButton btnGelap;
    private javax.swing.JButton btnGudeg;
    private javax.swing.JButton btnHMML;
    private javax.swing.JButton btnHariGuru;
    private javax.swing.JButton btnHariGuru21;
    private javax.swing.JButton btnHariGuru6;
    private javax.swing.JButton btnHariLibur;
    private javax.swing.JButton btnHariLibur21;
    private javax.swing.JButton btnHariLibur6;
    private javax.swing.JButton btnHariNasional;
    private javax.swing.JButton btnHariNasional21;
    private javax.swing.JButton btnHariNasional6;
    private javax.swing.JButton btnHariSuci;
    private javax.swing.JButton btnHariSuci21;
    private javax.swing.JButton btnHijau;
    private javax.swing.JButton btnHoodie;
    private javax.swing.JButton btnJakarta;
    private javax.swing.JButton btnJatim;
    private javax.swing.JButton btnJawa;
    private javax.swing.JButton btnJawa2;
    private javax.swing.JButton btnJawa4;
    private javax.swing.JButton btnJawaAyo;
    private javax.swing.JButton btnJawaLompat1;
    private javax.swing.JButton btnJawaLompat2;
    private javax.swing.JButton btnJawaLompat3;
    private javax.swing.JButton btnJawaLompat4;
    private javax.swing.JButton btnJawaLompat5;
    private javax.swing.JButton btnJawaNanti;
    private javax.swing.JButton btnJoglo;
    private javax.swing.JButton btnKalimantan;
    private javax.swing.JButton btnKalimantan2;
    private javax.swing.JButton btnKalimantanAyo;
    private javax.swing.JButton btnKalimantanLompat1;
    private javax.swing.JButton btnKalimantanLompat2;
    private javax.swing.JButton btnKalimantanLompat3;
    private javax.swing.JButton btnKalimantanLompat4;
    private javax.swing.JButton btnKalimantanLompat5;
    private javax.swing.JButton btnKalimantanNanti;
    private javax.swing.JButton btnKebaya;
    private javax.swing.JButton btnKebaya3;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKembaliBali1;
    private javax.swing.JButton btnKembaliBali2;
    private javax.swing.JButton btnKembaliJawa;
    private javax.swing.JButton btnKembaliJawa1;
    private javax.swing.JButton btnKembaliJawa2;
    private javax.swing.JButton btnKembaliJawa3;
    private javax.swing.JButton btnKembaliJawa4;
    private javax.swing.JButton btnKembaliKalimantan;
    private javax.swing.JButton btnKembaliKalimantan2;
    private javax.swing.JButton btnKembaliMaluku2;
    private javax.swing.JButton btnKembaliMaluku3;
    private javax.swing.JButton btnKembaliPapua1;
    private javax.swing.JButton btnKembaliPapua2;
    private javax.swing.JButton btnKembaliPeta;
    private javax.swing.JButton btnKembaliSulawesi1;
    private javax.swing.JButton btnKembaliSulawesi2;
    private javax.swing.JButton btnKembaliSumatra;
    private javax.swing.JButton btnKembaliSumatra2;
    private javax.swing.JButton btnKembaliSumatra3;
    private javax.swing.JButton btnKembaliSumatra4;
    private javax.swing.JButton btnKembaliSumatra5;
    private javax.swing.JButton btnKemben;
    private javax.swing.JButton btnKemben3;
    private javax.swing.JButton btnKulit;
    private javax.swing.JButton btnKutai;
    private javax.swing.JButton btnLamin;
    private javax.swing.JButton btnLamin2;
    private javax.swing.JButton btnLanjut;
    private javax.swing.JButton btnLanjutBali1;
    private javax.swing.JButton btnLanjutBali2;
    private javax.swing.JButton btnLanjutJawa;
    private javax.swing.JButton btnLanjutJawa1;
    private javax.swing.JButton btnLanjutJawa2;
    private javax.swing.JButton btnLanjutJawa3;
    private javax.swing.JButton btnLanjutJawa4;
    private javax.swing.JButton btnLanjutKalimantan;
    private javax.swing.JButton btnLanjutKalimantan2;
    private javax.swing.JButton btnLanjutMaluku2;
    private javax.swing.JButton btnLanjutMaluku3;
    private javax.swing.JButton btnLanjutPapua2;
    private javax.swing.JButton btnLanjutSulawesi1;
    private javax.swing.JButton btnLanjutSulawesi2;
    private javax.swing.JButton btnLanjutSumatra;
    private javax.swing.JButton btnLanjutSumatra2;
    private javax.swing.JButton btnLanjutSumatra3;
    private javax.swing.JButton btnLanjutSumatra4;
    private javax.swing.JButton btnLanjutSumatra5;
    private javax.swing.JButton btnLanjutpaua1;
    private javax.swing.JButton btnLima;
    private javax.swing.JButton btnLontong;
    private javax.swing.JButton btnMLHP;
    private javax.swing.JButton btnMalang;
    private javax.swing.JButton btnMaluku2;
    private javax.swing.JButton btnMalukuAyo;
    private javax.swing.JButton btnMalukuLompat;
    private javax.swing.JButton btnMalukuLompat1;
    private javax.swing.JButton btnMalukuLompat2;
    private javax.swing.JButton btnMalukuLompat3;
    private javax.swing.JButton btnMalukuLompat4;
    private javax.swing.JButton btnMalukuNanti;
    private javax.swing.JButton btnMancung;
    private javax.swing.JButton btnMataLebar;
    private javax.swing.JButton btnMerah;
    private javax.swing.JButton btnMieAceh;
    private javax.swing.JButton btnMieGacoan;
    private javax.swing.JButton btnMieIndomie;
    private javax.swing.JButton btnMieSedaap;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnNona;
    private javax.swing.JButton btnOsing;
    private javax.swing.JButton btnPapua;
    private javax.swing.JButton btnPapua2;
    private javax.swing.JButton btnPapua3;
    private javax.swing.JButton btnPapuaAyo;
    private javax.swing.JButton btnPapuaLompat;
    private javax.swing.JButton btnPapuaLompat1;
    private javax.swing.JButton btnPapuaLompat2;
    private javax.swing.JButton btnPapuaLompat3;
    private javax.swing.JButton btnPapuaLompat4;
    private javax.swing.JButton btnPapuaNanti;
    private javax.swing.JButton btnPayasAgung;
    private javax.swing.JButton btnPiring;
    private javax.swing.JButton btnPulauDewanta;
    private javax.swing.JButton btnPulauDewata;
    private javax.swing.JButton btnPulauSeribu;
    private javax.swing.JButton btnPulauSeribuPura;
    private javax.swing.JButton btnPutih;
    private javax.swing.JButton btnRKKH;
    private javax.swing.JButton btnRLKH;
    private javax.swing.JButton btnRambut;
    private javax.swing.JButton btnRambut2;
    private javax.swing.JButton btnRambutKriting;
    private javax.swing.JButton btnRambutMerah;
    private javax.swing.JButton btnRumah;
    private javax.swing.JButton btnSajojo;
    private javax.swing.JButton btnSateAyam;
    private javax.swing.JButton btnSateAyam1;
    private javax.swing.JButton btnSateKambing;
    private javax.swing.JButton btnSateKambing1;
    private javax.swing.JButton btnSateLilit;
    private javax.swing.JButton btnSateLilit1;
    private javax.swing.JButton btnSateTaichan;
    private javax.swing.JButton btnSateTaichan1;
    private javax.swing.JButton btnSatu;
    private javax.swing.JButton btnSatu1;
    private javax.swing.JButton btnSipit;
    private javax.swing.JButton btnSteak;
    private javax.swing.JButton btnSulawesi2;
    private javax.swing.JButton btnSulawesiAyo;
    private javax.swing.JButton btnSulawesiLompat1;
    private javax.swing.JButton btnSulawesiLompat2;
    private javax.swing.JButton btnSulawesiLompat3;
    private javax.swing.JButton btnSulawesiLompat4;
    private javax.swing.JButton btnSulawesiLompat5;
    private javax.swing.JButton btnSulawesiNanti;
    private javax.swing.JButton btnSumatra;
    private javax.swing.JButton btnSumatra2;
    private javax.swing.JButton btnSumatra6;
    private javax.swing.JButton btnSumatraAyo;
    private javax.swing.JButton btnSumatraBarat;
    private javax.swing.JButton btnSumatraLompat1;
    private javax.swing.JButton btnSumatraLompat2;
    private javax.swing.JButton btnSumatraLompat3;
    private javax.swing.JButton btnSumatraLompat4;
    private javax.swing.JButton btnSumatraLompat5;
    private javax.swing.JButton btnSumatraNanti;
    private javax.swing.JButton btnSumatraSelatan;
    private javax.swing.JButton btnSumatraUtara;
    private javax.swing.JButton btnSumuri;
    private javax.swing.JButton btnSunda;
    private javax.swing.JButton btnSunda4;
    private javax.swing.JButton btnSwipeKananBali;
    private javax.swing.JButton btnSwipeKiriBali;
    private javax.swing.JButton btnTaa;
    private javax.swing.JButton btnTambi;
    private javax.swing.JButton btnTelinga;
    private javax.swing.JButton btnTernate;
    private javax.swing.JButton btnTidakBali1;
    private javax.swing.JButton btnTidakBali2;
    private javax.swing.JButton btnTidakJawa1;
    private javax.swing.JButton btnTidakJawa2;
    private javax.swing.JButton btnTidakKalimantan1;
    private javax.swing.JButton btnTidakKalimantan2;
    private javax.swing.JButton btnTidakMaluku1;
    private javax.swing.JButton btnTidakMaluku2;
    private javax.swing.JButton btnTidakPapua1;
    private javax.swing.JButton btnTidakPapua2;
    private javax.swing.JButton btnTidakSulawesi1;
    private javax.swing.JButton btnTidakSulawesi2;
    private javax.swing.JButton btnTidakSumatra1;
    private javax.swing.JButton btnTidakSumatra2;
    private javax.swing.JButton btnTiga;
    private javax.swing.JButton btnTiga3;
    private javax.swing.JButton btnTujuh;
    private javax.swing.JButton btnTunik;
    private javax.swing.JButton btnUleeBalang;
    private javax.swing.JButton btnYaBali1;
    private javax.swing.JButton btnYaBali2;
    private javax.swing.JButton btnYaJawa1;
    private javax.swing.JButton btnYaJawa2;
    private javax.swing.JButton btnYaKalimantan1;
    private javax.swing.JButton btnYaKalimantan2;
    private javax.swing.JButton btnYaMaluku1;
    private javax.swing.JButton btnYaMaluku2;
    private javax.swing.JButton btnYaPapua1;
    private javax.swing.JButton btnYaPapua2;
    private javax.swing.JButton btnYaSulawesi1;
    private javax.swing.JButton btnYaSulawesi2;
    private javax.swing.JButton btnYaSumatra1;
    private javax.swing.JButton btnYaSumatra2;
    private javax.swing.JPanel copy10;
    private javax.swing.JPanel copy9;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jawa;
    private javax.swing.JLabel jawabanQuisBali1;
    private javax.swing.JLabel jawabanQuisBali2;
    private javax.swing.JLabel jawabanQuisBali3;
    private javax.swing.JLabel jawabanQuisBali4;
    private javax.swing.JLabel jawabanQuisBali5;
    private javax.swing.JLabel jawabanQuisJawa1;
    private javax.swing.JLabel jawabanQuisJawa2;
    private javax.swing.JLabel jawabanQuisJawa3;
    private javax.swing.JLabel jawabanQuisJawa4;
    private javax.swing.JLabel jawabanQuisJawa5;
    private javax.swing.JLabel jawabanQuisKalimantan1;
    private javax.swing.JLabel jawabanQuisKalimantan2;
    private javax.swing.JLabel jawabanQuisKalimantan3;
    private javax.swing.JLabel jawabanQuisKalimantan4;
    private javax.swing.JLabel jawabanQuisKalimantan5;
    private javax.swing.JLabel jawabanQuisMaluku1;
    private javax.swing.JLabel jawabanQuisMaluku2;
    private javax.swing.JLabel jawabanQuisMaluku3;
    private javax.swing.JLabel jawabanQuisMaluku4;
    private javax.swing.JLabel jawabanQuisMaluku5;
    private javax.swing.JLabel jawabanQuisPapua1;
    private javax.swing.JLabel jawabanQuisPapua2;
    private javax.swing.JLabel jawabanQuisPapua3;
    private javax.swing.JLabel jawabanQuisPapua4;
    private javax.swing.JLabel jawabanQuisPapua5;
    private javax.swing.JLabel jawabanQuisSulawesi1;
    private javax.swing.JLabel jawabanQuisSulawesi2;
    private javax.swing.JLabel jawabanQuisSulawesi3;
    private javax.swing.JLabel jawabanQuisSulawesi4;
    private javax.swing.JLabel jawabanQuisSulawesi5;
    private javax.swing.JLabel jawabanQuisSumatra1;
    private javax.swing.JLabel jawabanQuisSumatra2;
    private javax.swing.JLabel jawabanQuisSumatra3;
    private javax.swing.JLabel jawabanQuisSumatra4;
    private javax.swing.JLabel jawabanQuisSumatra5;
    private javax.swing.JPanel kalimantan;
    private javax.swing.JLabel labelBali;
    private javax.swing.JLabel labelJawa;
    private javax.swing.JLabel labelKalimantan;
    private javax.swing.JLabel labelKompas;
    private javax.swing.JLabel labelMaluku;
    private javax.swing.JLabel labelPapua;
    private javax.swing.JLabel labelSulawesi;
    private javax.swing.JLabel labelSumatra;
    private javax.swing.JPanel lompatBali;
    private javax.swing.JPanel lompatJawa;
    private javax.swing.JPanel lompatKalimantan;
    private javax.swing.JPanel lompatMaluku;
    private javax.swing.JPanel lompatPapua;
    private javax.swing.JPanel lompatSulawesi;
    private javax.swing.JPanel lompatSumatra;
    private javax.swing.JPanel maluku;
    private javax.swing.JPanel panelBali1;
    private javax.swing.JPanel panelBali2;
    private javax.swing.JPanel panelBali3;
    private javax.swing.JPanel panelBali4;
    private javax.swing.JPanel panelJawa1;
    private javax.swing.JPanel panelJawa2;
    private javax.swing.JPanel panelJawa3;
    private javax.swing.JPanel panelJawa4;
    private javax.swing.JPanel panelJawa5;
    private javax.swing.JPanel panelKalimantan1;
    private javax.swing.JPanel panelKalimantan2;
    private javax.swing.JPanel panelKalimantan3;
    private javax.swing.JPanel panelKalimantan4;
    private javax.swing.JPanel panelMaluku1;
    private javax.swing.JPanel panelMaluku2;
    private javax.swing.JPanel panelMaluku3;
    private javax.swing.JPanel panelMaluku4;
    private javax.swing.JPanel panelPapua1;
    private javax.swing.JPanel panelPapua2;
    private javax.swing.JPanel panelPapua3;
    private javax.swing.JPanel panelPapua4;
    private javax.swing.JPanel panelSulawesi1;
    private javax.swing.JPanel panelSulawesi2;
    private javax.swing.JPanel panelSulawesi3;
    private javax.swing.JPanel panelSulawesi4;
    private javax.swing.JPanel panelSumatra1;
    private javax.swing.JPanel panelSumatra2;
    private javax.swing.JPanel panelSumatra3;
    private javax.swing.JPanel panelSumatra4;
    private javax.swing.JPanel panelSumatra5;
    private javax.swing.JPanel panelSumatra6;
    private javax.swing.JPanel panelSumatra7;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel papua;
    private javax.swing.JPanel pendahuluan;
    private javax.swing.JPanel peta;
    private javax.swing.JLabel pulau;
    private javax.swing.JPanel quisBali;
    private javax.swing.JPanel quisBali1;
    private javax.swing.JPanel quisBali2;
    private javax.swing.JPanel quisBali3;
    private javax.swing.JPanel quisBali4;
    private javax.swing.JPanel quisBali5;
    private javax.swing.JPanel quisJawa;
    private javax.swing.JPanel quisJawa1;
    private javax.swing.JPanel quisJawa2;
    private javax.swing.JPanel quisJawa3;
    private javax.swing.JPanel quisJawa4;
    private javax.swing.JPanel quisJawa5;
    private javax.swing.JPanel quisKalimantan;
    private javax.swing.JPanel quisKalimantan1;
    private javax.swing.JPanel quisKalimantan2;
    private javax.swing.JPanel quisKalimantan3;
    private javax.swing.JPanel quisKalimantan4;
    private javax.swing.JPanel quisKalimantan5;
    private javax.swing.JPanel quisMaluku;
    private javax.swing.JPanel quisMaluku1;
    private javax.swing.JPanel quisMaluku2;
    private javax.swing.JPanel quisMaluku3;
    private javax.swing.JPanel quisMaluku4;
    private javax.swing.JPanel quisMaluku5;
    private javax.swing.JPanel quisPapua;
    private javax.swing.JPanel quisPapua1;
    private javax.swing.JPanel quisPapua2;
    private javax.swing.JPanel quisPapua3;
    private javax.swing.JPanel quisPapua4;
    private javax.swing.JPanel quisPapua5;
    private javax.swing.JPanel quisSulawesi;
    private javax.swing.JPanel quisSulawesi1;
    private javax.swing.JPanel quisSulawesi2;
    private javax.swing.JPanel quisSulawesi3;
    private javax.swing.JPanel quisSulawesi4;
    private javax.swing.JPanel quisSulawesi5;
    private javax.swing.JPanel quisSumatra;
    private javax.swing.JPanel quisSumatra1;
    private javax.swing.JPanel quisSumatra2;
    private javax.swing.JPanel quisSumatra3;
    private javax.swing.JPanel quisSumatra4;
    private javax.swing.JPanel quisSumatra5;
    private javax.swing.JPanel selesaiBali;
    private javax.swing.JPanel selesaiJawa;
    private javax.swing.JPanel selesaiKalimantan;
    private javax.swing.JPanel selesaiMaluku;
    private javax.swing.JPanel selesaiPapua;
    private javax.swing.JPanel selesaiSulawesi;
    private javax.swing.JPanel selesaiSumatra;
    private javax.swing.JLabel sideBali1;
    private javax.swing.JLabel sideBali2;
    private javax.swing.JPanel sulawesi;
    private javax.swing.JPanel sumatra;
    // End of variables declaration//GEN-END:variables
}
