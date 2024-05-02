import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

interface Displayable {
    void displayInfo();
    void displayError(String errorMessage);
}

abstract class Product {
    protected String nama;
    protected int harga;
    protected String jenis;
    protected int stok;
    protected static int totalProducts = 0;

    public Product(String nama, int harga, String jenis, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
        this.stok = stok;
        totalProducts++;
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public final String getNama() {
        return nama;
    }

    public abstract String getJenis();

    public abstract void setJenis(String jenis);

    public abstract int getStok();

    public abstract void setStok(int stok);

    public final int getHarga() {
        return harga;
    }

    abstract void tampil();

    abstract void tampil(String additionalInfo);

    @Override
    public final String toString() {
        return "=================================" +
                "\n| PRODUCT NAME : " + nama +
                "\n| PRODUCT PRICE : " + harga +
                "\n| PRODUCT TYPE : " + jenis +
                "\n| PRODUCT STOCK : " + stok;
    }
}

class Byredo extends Product implements Displayable {

    public Byredo(String nama, String jenis, int harga, int stok) {
        super(nama, harga, jenis, stok);
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    void tampil() {
        displayInfo();
    }

    @Override
    void tampil(String additionalInfo) {
    }

    @Override
    public void displayInfo() {
        System.out.println("=================================");
        System.out.println("| PRODUCT NAME : " + nama);
        System.out.println("| PRODUCT PRICE : " + harga);
        System.out.println("| PRODUCT TYPE : " + jenis);
        System.out.println("| PRODUCT STOCK : " + stok);
    }

    @Override
    public void displayError(String errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }

    // Implementasi setter untuk nama dan harga
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

class Sabun extends Product implements Displayable {

    public Sabun(String nama, int harga, int stok) {
        super(nama, harga, "Soap", stok);
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public void setJenis(String jenis) {
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
    }

    @Override
    void tampil() {
        displayInfo();
    }

    @Override
    void tampil(String additionalInfo) {
    }

    @Override
    public void displayInfo() {
        System.out.println("=================================");
        System.out.println("| PRODUCT NAME : " + nama);
        System.out.println("| PRODUCT PRICE : " + harga);
        System.out.println("| PRODUCT TYPE : " + jenis);
        System.out.println("| PRODUCT STOCK : " + stok);
    }

    @Override
    public void displayError(String errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }
}

class Lilin extends Product implements Displayable {

    public Lilin(String nama, int harga, int stok) {
        super(nama, harga, "Candle", stok);
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public void setJenis(String jenis) {
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
    }

    @Override
    void tampil() {
        displayInfo();
    }

    @Override
    void tampil(String additionalInfo) {
    }

    @Override
    public void displayInfo() {
        System.out.println("=================================");
        System.out.println("| PRODUCT NAME : " + nama);
        System.out.println("| PRODUCT PRICE : " + harga);
        System.out.println("| PRODUCT TYPE : " + jenis);
        System.out.println("| PRODUCT STOCK : " + stok);
    }

    @Override
    public void displayError(String errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }
}

public class posttest6 {
    public static void main(String[] args) throws IOException {
        ArrayList<Byredo> dataParfumes = new ArrayList<>();
        ArrayList<Sabun> datasabun = new ArrayList<>();
        ArrayList<Lilin> datalilin = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {

            System.out.println("""
                    +++++++++++++++++++++++++++++
                    |     BYREDO COLLECTION     |
                    +++++++++++++++++++++++++++++
                    | 1. ADD DATA               |
                    | 2. VIEW DATA              |
                    | 3. UPDATE DATA            |
                    | 4. DELETE DATA            |
                    | 0. EXIT PROGRAM           |
                    +++++++++++++++++++++++++++++
                """);
            System.out.print("CHOOSE MENU : ");
            String menu = br.readLine();
            if (menu.equals("1")) {
                System.out.println("""
                        +++++++++++++++++++++++++++++
                        |      ADD DATA MENU        |
                        +++++++++++++++++++++++++++++
                        | 1. PARFUME                |
                        | 2. SOAP                   |
                        | 3. CANDLE                 |
                        +++++++++++++++++++++++++++++
                    """);
                System.out.print("CHOOSE DATA TYPE : ");
                String dataType = br.readLine();
                if (dataType.equals("1")) {
                    System.out.println("\n====================");
                    System.out.println("ADDING PARFUME DATA.");
                    System.out.println("====================");
                    System.out.print("| NAME OF PARFUME: ");
                    String nama = br.readLine();

                    System.out.print("| TYPES : ");
                    String jenis = br.readLine();

                    int harga = 0;
                    boolean validPrice = false;
                    while (!validPrice) {
                        try {
                            System.out.print("| Price : ");
                            harga = Integer.parseInt(br.readLine());
                            validPrice = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR PRICE !\n");
                        }
                    }

                    int stok = 0;
                    boolean validStock = false;
                    while (!validStock) {
                        try {
                            System.out.print("| Stocks : ");
                            stok = Integer.parseInt(br.readLine());
                            validStock = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR STOCK !\n");
                        }
                    }

                    System.out.println("\nDATA ADDED SUCCESSFULLY !\n");

                    Byredo newParfume = new Byredo(nama, jenis, harga, stok);
                    dataParfumes.add(newParfume);
                    
                } else if (dataType.equals("2")) {
                    System.out.println("\n=================");
                    System.out.println("ADDING SOAP DATA.");
                    System.out.println("=================");

                    System.out.print("| NAME OF SOAP: ");
                    var namasabun = br.readLine();

                    int hargasabun = 0;
                    boolean validPrice = false;
                    while (!validPrice) {
                        try {
                            System.out.print("| Price : ");
                            hargasabun = Integer.parseInt(br.readLine());
                            validPrice = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR PRICE !\n");
                        }
                    }

                    int stoksabun = 0;
                    boolean validStock = false;
                    while (!validStock) {
                        try {
                            System.out.print("| Stocks : ");
                            stoksabun = Integer.parseInt(br.readLine());
                            validStock = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR STOCK !\n");
                        }
                    }

                    System.out.println("\nDATA ADDED SUCCESSFULLY !\n");

                    Sabun newSoap = new Sabun(namasabun, hargasabun, stoksabun);
                    datasabun.add(newSoap);

                } else if (dataType.equals("3")) {
                    System.out.println("\n===================");
                    System.out.println("ADDING CANDLE DATA.");
                    System.out.println("===================");
                    System.out.print("| NAME OF CANDLE: ");
                    String namalilin = br.readLine();

                    int hargalilin = 0;
                    boolean validPrice = false;
                    while (!validPrice) {
                        try {
                            System.out.print("| Price : ");
                            hargalilin = Integer.parseInt(br.readLine());
                            validPrice = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR PRICE !\n");
                        }
                    }

                    int stoklilin = 0;
                    boolean validStock = false;
                    while (!validStock) {
                        try {
                            System.out.print("| Stocks : ");
                            stoklilin = Integer.parseInt(br.readLine());
                            validStock = true;
                        } catch (NumberFormatException e) {
                            System.out.println("\nERROR: INVALID INPUT FOR STOCK !\n");
                        }
                    }

                    System.out.println("\nDATA ADDED SUCCESSFULLY !\n");

                    Lilin newCandle = new Lilin(namalilin, hargalilin, stoklilin);
                    datalilin.add(newCandle);

                } else {
                    System.out.println("\nERROR INPUT !!\n");
                }

        } else if (menu.equals("2")) {
            System.out.println("""
                        +++++++++++++++++++++++++++++
                        |      VIEW DATA MENU       |
                        +++++++++++++++++++++++++++++
                        | 1. Parfume                |
                        | 2. Sabun                  |
                        | 3. Lilin                  |
                        +++++++++++++++++++++++++++++
                    """);
            System.out.print("CHOOSE DATA TYPE : \n");
            String dataType = br.readLine();
            if (dataType.equals("1")) {
                System.out.println("VIEWED PARFUME DATA.");
                System.out.println("====================");
                for (int i = 0; i < dataParfumes.size(); i++) {
                    System.out.println("| PARFUME NUMBER " + i);
                    System.out.println(dataParfumes.get(i)); // menggunakan toString()
                    System.out.println("=================================\n");
                }

            } else if (dataType.equals("2")) {
                System.out.println("VIEWED SOAP DATA.");
                System.out.println("====================");
                for (int i = 0; i < datasabun.size(); i++) {
                    System.out.println("| SOAP NUMBER " + i);
                    System.out.println(datasabun.get(i)); // menggunakan toString()
                    System.out.println("=================================\n");
                }

            } else if (dataType.equals("3")) {
                System.out.println("VIEWED CANDLE DATA.");
                System.out.println("====================");
                for (int i = 0; i < datalilin.size(); i++) {
                    System.out.println("| CANDLE NUMBER " + i);
                    System.out.println(datalilin.get(i)); // menggunakan toString()
                    System.out.println("=================================\n");
                }

            } else {
                System.out.println("\nERROR INPUT !!\n");
            }

        } else if (menu.equals("3")) {
            System.out.println("""
                        +++++++++++++++++++++++++++++
                        |    UPDATE DATA MENU       |
                        +++++++++++++++++++++++++++++
                        | 1. PARFUME                |
                        | 2. SOAP                   |
                        | 3. CANDLE                 |
                        +++++++++++++++++++++++++++++
                    """);
            System.out.print("CHOOSE DATA TYPE : \n");
            String dataType = br.readLine();
            if (dataType.equals("1")) {
                System.out.println("UPDATE PARFUME DATA.");
                System.out.println("====================");
                for (int i = 0; i < dataParfumes.size(); i++) {
                    System.out.println("| PARFUME NUMBER " + i);
                    System.out.println(dataParfumes.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO CHANGE? : \n");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= dataParfumes.size()) {
                    System.out.print("| NAME OF PARFUME : ");
                    dataParfumes.get(ubah).setNama(br.readLine());

                    System.out.print("| TYPES : ");
                    dataParfumes.get(ubah).setJenis(br.readLine());

                    System.out.print("| PRICE : ");
                    dataParfumes.get(ubah).setHarga(Integer.parseInt(br.readLine()));

                    System.out.print("| STOCKS : ");
                    dataParfumes.get(ubah).setStok(Integer.parseInt(br.readLine()));
                    System.out.println("=================================");
                    System.out.println("\nUPDATED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nERROR INPUT !!\n");
                }

            } else if (dataType.equals("2")) {
                System.out.println("UPDATE SOAP DATA.");
                System.out.println("=================");
                for (int i = 0; i < datasabun.size(); i++) {
                    System.out.println("| SOAP NUMBER " + i);
                    System.out.println(datasabun.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO CHANGE? : \n");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= datasabun.size()) {
                    System.out.print("| NAME OF SOAP : ");
                    datasabun.get(ubah).setNama(br.readLine());

                    System.out.print("| PRICE : ");
                    datasabun.get(ubah).setHarga(Integer.parseInt(br.readLine()));

                    System.out.print("| STOCK : ");
                    datasabun.get(ubah).setStok(Integer.parseInt(br.readLine()));

                    System.out.println("=================================");
                    System.out.println("\nUPDATED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nERROR INPUT !!\n");
                }

            } else if (dataType.equals("3")) {
                System.out.println("UPDATE CANDLE DATA.");
                System.out.println("===================");
                for (int i = 0; i < datalilin.size(); i++) {
                    System.out.println("| CANDLE NUMBER " + i);
                    System.out.println(datalilin.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO CHANGE? : \n");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= datalilin.size()) {
                    System.out.print("| NAME OF CANDLE : ");
                    datalilin.get(ubah).setNama(br.readLine());

                    System.out.print("| PRICE : ");
                    datalilin.get(ubah).setHarga(Integer.parseInt(br.readLine()));

                    System.out.print("| STOCK : ");
                    datalilin.get(ubah).setStok(Integer.parseInt(br.readLine()));

                    System.out.println("=================================");
                    System.out.println("\nUPDATED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nERROR INPUT !!\n");
                }
                
            } else {
                System.out.println("\nERROR INPUT !!\n");
            }

        } else if (menu.equals("4")) {
            System.out.println("""
                        +++++++++++++++++++++++++++++
                        |    DELETE DATA MENU       |
                        +++++++++++++++++++++++++++++
                        | 1. PARFUME                |
                        | 2. SOAP                   |
                        | 3. CANDLE                 |
                        +++++++++++++++++++++++++++++
                    """);
            System.out.print("CHOOSE DATA TYPE : \n");
            String dataType = br.readLine();
            if (dataType.equals("1")) {
                System.out.println("DELETE PARFUME DATA.");
                System.out.println("====================");
                for (int i = 0; i < dataParfumes.size(); i++) {
                    System.out.println("| PARFUME NUMBER " + i);
                    System.out.println(dataParfumes.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO DELETE? : ");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= dataParfumes.size()) {
                    dataParfumes.remove(hapus);
                    System.out.println("\nDELETED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nDATA NOT AVAILABLE !!\n");
                }

            } else if (dataType.equals("2")) {
                System.out.println("DELETE SOAP DATA.");
                System.out.println("=================");
                for (int i = 0; i < datasabun.size(); i++) {
                    System.out.println("| SOAP NUMBER " + i);
                    System.out.println(datasabun.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO DELETE? : ");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= datasabun.size()) {
                    datasabun.remove(hapus);
                    System.out.println("\nDELETED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nDATA NOT AVAILABLE !!\n");
                }

            } else if (dataType.equals("3")) {
                System.out.println("DELETE CANDLE DATA.");
                System.out.println("===================");
                for (int i = 0; i < datalilin.size(); i++) {
                    System.out.println("| CANDLE NUMBER " + i);
                    System.out.println(datalilin.get(i));
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO DELETE? : ");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= datalilin.size()) {
                    datalilin.remove(hapus);
                    System.out.println("\nDELETED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nDATA NOT AVAILABLE !!\n");
                }

            } else {
                System.out.println("\nERROR INPUT !!\n");
            }
        
        } else if (menu.equals("0")) {
            System.out.println("\nBYREDO COLLECTION\n");
            break;
        } else {
            System.out.println("\nERROR INPUT !!\n");
        }
    }
}
}
