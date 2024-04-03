import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Inventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();
        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25); // Ubah "penghapus" menjadi "Penghapus"

        System.out.println("Inventori awal: " + inventori); // Perbaiki "printin" menjadi "println"

        inventori.put("Pensil", inventori.get("Pensil") + 20);
        inventori.remove("Penghapus");

        System.out.println("Inventori setelah update: " + inventori); // Perbaiki "printin" menjadi "println"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari: "); // Perbaiki "printin" menjadi "print"
        String barang = scanner.nextLine();
        cariBarang(inventori, barang);
    }

    public static void cariBarang(HashMap<String, Integer> inventori, String barang) { // Perbaiki "barans" menjadi "barang"
        if (inventori.containsKey(barang)) {
            System.out.println("Stok " + barang + " : " + inventori.get(barang) + " unit."); // Perbaiki kesalahan pada tanda kutip dan penulisan variabel
        } else {
            System.out.println("Barang " + barang + " tidak tersedia di inventori."); // Perbaiki kesalahan pada tanda kutip dan penulisan variabel
        }
    }
}