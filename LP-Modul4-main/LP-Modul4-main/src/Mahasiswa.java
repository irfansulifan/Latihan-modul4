import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, MKP;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        MKP = mat;
        nim = ni;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Anjas Septian P.","3G","Jaringan Komputer",2021503603));
        mhs.put("2", new Mahasiswa("Fajar Endri K.","4C","Basis Data",2021703803));
        mhs.put("3", new Mahasiswa("Akbar Reynaldo S.","4H","Sistem Operasi",2021103104));

        System.out.print("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.print("Data Mahasiswa : " + data.nama + ", kelas : " +
                    data.kelas + ", Mata Kuliah Praktikum : " + data.MKP + ", NIM : " + data.nim);
        }
    }
}