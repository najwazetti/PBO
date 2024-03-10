import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class posstest1 {
    public static void main(String[] args) throws IOException {
        ArrayList<parfume> dataParfumes = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {

            System.out.println("""
                        +++++++++++++++++++++++++++++
                        |BYREDO PARFUME  RECORD MENU|
                        +++++++++++++++++++++++++++++
                        | 1. ADD DATA PARFUME       |
                        | 2. VIEW DATA PARFUME      |
                        | 3. UPDATE DATA PARFUME    |
                        | 4. DELETE DATA PARFUME    |
                        | 0. EXIT PROGRAM           |
                        +++++++++++++++++++++++++++++
                    """);
            System.out.print("CHOOSE MENU : \n");
            String menu = br.readLine();
            System.out.println("=================================");
            if (menu.equals("1")) {
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
                        System.out.println("\nERROR: INVALID INPUT FOR PRICE !\n");
                    }
                }

                System.out.println("\nDATA ADDED SUCCESSFULLY !\n");

                parfume newParfume = new parfume(nama, jenis, harga, stok);
                dataParfumes.add(newParfume);

            } else if (menu.equals("2")) {
                for (int i = 0; i < dataParfumes.size(); i++) {
                    System.out.println("| PARFUME NUMBER " + i);
                    dataParfumes.get(i).tampil();
                    System.out.println("=================================\n");
                }
                
            } else if (menu.equals("3")) {
                for (int i = 0; i < dataParfumes.size(); i++) {
                    System.out.println("| PARFUME NUMBER " + i);
                    dataParfumes.get(i).tampil();
                    System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO CHANGE? : \n");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= dataParfumes.size()) {
                    System.out.print("| NAME OF PARFUME : ");
                    dataParfumes.get(ubah).nama = br.readLine();

                    System.out.print("| TYPES : ");
                    dataParfumes.get(ubah).jenis = br.readLine();

                    System.out.print("| PRICE : ");
                    dataParfumes.get(ubah).harga = Integer.parseInt(br.readLine());

                    System.out.print("| STOCKS : ");
                    dataParfumes.get(ubah).stok = Integer.parseInt(br.readLine());
                    System.out.println("=================================");
                    System.out.println("\nUPDATED SUCCESSFULLY !\n");
                } else {
                    System.out.println("\nERROR INPUT !!\n");
                }
            } else if (menu.equals("4")) {
                for (int i = 0 ; i < dataParfumes.size() ; i++){
                System.out.println("| PARFUME NUMBER " + i);
                dataParfumes.get(i).tampil();
                System.out.println("=================================");
                }
                System.out.print("WHAT DATA NUMBER DO YOU WANT TO DELETE? : ");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= dataParfumes.size()){
                dataParfumes.remove(hapus);
                System.out.println("\nDELETED SUCCESSFULLY !\n");
                } else {
                System.out.println("\nDATA NOT AVAILABLE !!\n");
                }

            } else if (menu.equals("0")) {
                System.out.println("\nBYREDO PARFUME\n");
                break;
            } else {
                System.out.println("\nERROR INPUT !!\n");
            }
        }
    }
}
