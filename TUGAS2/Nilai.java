package PBO3.TUGAS2;

public class Nilai {
    public Nilai() {
        // Inisialisasi variabel
        this.nim = "";
        this.nama = "";
        this.nilaiAbsen = "";
        this.nilaiTugas = "";
        this.nilaiUTS = "";
        this.nilaiUAS = "";
        this.nilaiAkhir = "";
      }
    
      // Method CetakNilai()
      public void CetakNilai() {
        // Menampilkan nilai
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Nilai Absen[10%] : " + this.nilaiAbsen);
        System.out.println("Nilai Tugas[20%] : " + this.nilaiTugas);
        System.out.println("Nilai UTS[30%] : " + this.nilaiUTS);
        System.out.println("Nilai UAS[40%] : " + this.nilaiUAS);
        System.out.println("Nilai Akhir : " + (this.nilaiAkhir));
      }
    
      // Variabel
      String nim;
      String nama;
      String nilaiAbsen;
      String nilaiTugas;
      String nilaiUTS;
      String nilaiUAS;
      String nilaiAkhir;
}
