class byredo {
    private String nama;
    private String jenis;
    private int harga;
    protected int stok;

    public byredo(String nama, String jenis, int harga, int stok) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    void tampil() {
        System.out.println("=================================");
        System.out.println("| PARFUME NAME : " + this.nama);
        System.out.println("| PARFUME TYPE : " + this.jenis);
        System.out.println("| PARFUME PRICE : " + this.harga);
        System.out.println("| PARFUME STOCK : " + this.stok);
    }

    @Override
    public String toString() {
        return "=================================" +
                "\n| PARFUME NAME : " + nama +
                "\n| PARFUME TYPE : " + jenis +
                "\n| PARFUME PRICE : " + harga +
                "\n| PARFUME STOCK : " + stok;
    }
}


class sabun {
    private String namasabun;
    private int hargasabun;

    public sabun(String nama, int harga) {
        this.namasabun = nama;
        this.hargasabun = harga;
    }

    // Getter methods
    public String getNama() {
        return namasabun;
    }

    public int getHarga() {
        return hargasabun;
    }

    // Setter methods
    public void setNama(String nama) {
        this.namasabun = nama;
    }

    public void setHarga(int harga) {
        this.hargasabun = harga;
    }

    void tampil() {
        System.out.println("=================================");
        System.out.println("| SOAP NAME : " + this.namasabun);
        System.out.println("| SOAP PRICE : " + this.hargasabun);
    }

    @Override
    public String toString() {
        return "=================================" +
                "\n| SOAP NAME : " + namasabun +
                "\n| SOAP PRICE : " + hargasabun;
    }
}



class lilin {
    private String namalilin;
    private int hargalilin;

    public lilin(String nama, int harga) {
        this.namalilin = nama;
        this.hargalilin = harga;
    }

    // Getter methods
    public String getNama() {
        return namalilin;
    }

    public int getHarga() {
        return hargalilin;
    }

    // Setter methods
    public void setNama(String nama) {
        this.namalilin = nama;
    }

    public void setHarga(int harga) {
        this.hargalilin = harga;
    }

    void tampil() {
        System.out.println("=================================");
        System.out.println("| CANDLE NAME : " + this.namalilin);
        System.out.println("| CANDLE PRICE : " + this.hargalilin);
    }

    @Override
    public String toString() {
        return "=================================" +
                "\n| CANDLE NAME : " + namalilin +
                "\n| CANDLE PRICE : " + hargalilin;
    }
}



