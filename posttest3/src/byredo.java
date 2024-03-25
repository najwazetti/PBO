class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getNama() {
        return name;
    }

    public int getHarga() {
        return price;
    }

    // Setter methods
    public void setNama(String nama) {
        this.name = nama;
    }

    public void setHarga(int harga) {
        this.price = harga;
    }

    void tampil() {
        System.out.println("=================================");
        System.out.println("| PRODUCT NAME : " + this.name);
        System.out.println("| PRODUCT PRICE : " + this.price);
    }

    @Override
    public String toString() {
        return "=================================" +
                "\n| PRODUCT NAME : " + name +
                "\n| PRODUCT PRICE : " + price;
    }
}

class byredo extends Product {
    private String jenis;
    protected int stok;

    public byredo(String nama, String jenis, int harga, int stok) {
        super(nama, harga);
        this.jenis = jenis;
        this.stok = stok;
    }

    void tampil() {
        super.tampil();
        System.out.println("| PARFUME TYPE : " + this.jenis);
        System.out.println("| PARFUME STOCK : " + this.stok);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n| PARFUME TYPE : " + jenis +
                "\n| PARFUME STOCK : " + stok;
    }
}

class sabun extends Product {
    public sabun(String nama, int harga) {
        super(nama, harga);
    }

    void tampil() {
        super.tampil();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class lilin extends Product {
    public lilin(String nama, int harga) {
        super(nama, harga);
    }

    void tampil() {
        super.tampil();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
