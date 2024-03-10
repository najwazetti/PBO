public class parfume {
    String nama, jenis;
    int harga, stok;

    public parfume(String nama, String jenis, int harga, int stok){
        this.nama = nama ;
        this.jenis = jenis ;
        this.harga = harga ;
        this.stok = stok ;
    }

    void tampil(){
        System.out.println("=================================");
        System.out.println("| NAMA PARFUME : " + this.nama);
        System.out.println("| JENIS PARUME : " + this.jenis);
        System.out.println("| HARGA PARFUME : " + this.harga);
        System.out.println("| STOK PARFUME : " + this.stok);
    }
}
