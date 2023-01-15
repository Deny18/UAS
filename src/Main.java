import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Frame frame = new Frame();

            Pesanan pesanan = new Pesanan();

            int i = 0;
            int harga_total = 0;
            boolean lanjut = true;
            boolean ulang = false;
            
            JOptionPane.showMessageDialog(frame, "Selamat datang di INDOMERID");
            
            do{
                String nama_pesan = "";
		HargaProduk harga_produk = new HargaProduk();
                
                do{
                    ulang = false;
                    String jawab_pesan = JOptionPane.showInputDialog(frame, "Anda ingin pesan apa? (gunakan angka untuk memilih)\n1. Silverquen: Rp. 23,000,-\n2. Chitatos: Rp. 12,000,-\n3. Aqua: Rp. 5,000,-\n4. Frutea: Rp. 5,000,-\n5. Lays: Rp. 10,000,-\n");
                    int no_pesan = Integer.parseInt(jawab_pesan);
                    
                    switch (no_pesan) {
			case 1:
                            nama_pesan = "Silverquen";
                            harga_produk.tambahHarga(23_000);
                            break;
			case 2:
                            nama_pesan = "Chitatos";
                            harga_produk.tambahHarga(12_000);
                            break;
			case 3:
                            nama_pesan = "Aqua";
                            harga_produk.tambahHarga(5_000);
                            break;
			case 4:
                            nama_pesan = "Frutea";
                            harga_produk.tambahHarga(5_000);
                            break;
                        case 5:
                            nama_pesan = "Lays";
                            harga_produk.tambahHarga(10_000);
                            break;
                        default:
                            JOptionPane.showMessageDialog(frame, "Anda harus memilih nomor menu");
                            ulang = true;
                            break;
                    }
                }while(ulang);
                int confirm = JOptionPane.showConfirmDialog(frame, "Apakah anda ingin memesan " + nama_pesan + "?");
		switch (confirm) {
                    case 0:
			pesanan.tambah(nama_pesan);
			harga_total += harga_produk.harga;
			JOptionPane.showMessageDialog(frame, pesanan.array()[i] + " telah ditambahkan ke Pesanan anda\nDengan harga " + harga_produk.harga);
			i++;
			break;
                    case 1:
                    case 2:
			JOptionPane.showMessageDialog(frame, "Pesanan dibatalkan");
			break;
		}

		confirm = JOptionPane.showConfirmDialog(frame, "Apakah anda ingin memesan lagi?");
                if (confirm != 0) {
                    lanjut = false;
		}
            }while (lanjut);
            String semua_pesanan = "";
            for (int j = 0; j < pesanan.array().length; j++) {
		semua_pesanan += (j+1) + ". " + pesanan.array()[j] + "\n";
            }

            JOptionPane.showMessageDialog(frame, "Total Pesanan:\n" + semua_pesanan + "\n Total harga: Rp. " + harga_total);


            frame.dispose();
    }
}
