package cek;


import java.util.Scanner;

public class main extends functions_procedures {

    public static void PrintMenu() {
        System.out.println("");
        System.out.println("****************************************************************");
        System.out.println("                             MENU");
        System.out.println("****************************************************************");
        System.out.println("1. Sistem Persamaan Linier");
        System.out.println("2. Determinan");
        System.out.println("3. Matriks Balikan");
        System.out.println("4. Interpolasi Polinom");
        System.out.println("5. Regresi Linier Berganda");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void PrintSubmenuSPL() {
        System.out.println("");
        System.out.println("****************************************************************");
        System.out.println("                             METODE");
        System.out.println("****************************************************************");
        System.out.println("1. Metode Eliminasi Gauss");
        System.out.println("2. Metode Eliminasi Gauss-Jordan");
        System.out.println("3. Metode Matriks Balikan");
        System.out.println("4. Metode Cramer");
        System.out.print("Pilih metode: ");
    }

    public static void PrintSubmenuDeterminan() {
        System.out.println("");
        System.out.println("****************************************************************");
        System.out.println("                             METODE");
        System.out.println("****************************************************************");
        System.out.println("1. Reduksi Baris");
        System.out.println("2. Ekspansi Kofaktor");
        System.out.print("Pilih metode: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PrintMenu();
        int menu = scan.nextInt();
        while (menu != 6) {
            if (menu == 1) { //SPL
                PrintSubmenuSPL();
                int submenu = scan.nextInt();

                if (submenu == 1) { //GAUSS
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("           MENYELESAIKAN SPL DENGAN METODE GAUSS");
                    System.out.println("****************************************************************");
                    mainsplgauss();
                }
                else if (submenu == 2) { //GAUSS-JORDAN
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("          MENYELESAIKAN SPL DENGAN METODE GAUSS-JORDAN");
                    System.out.println("****************************************************************");
                    mainsplgaussjordan();
                }
                else if (submenu == 3) { //INVERS
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("            MENYELESAIKAN SPL DENGAN METODE INVERS");
                    System.out.println("****************************************************************");
                    mainsplinvers();
                }

                else if (submenu == 4) { //CRAMER
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("           MENYELESAIKAN SPL DENGAN KAIDAH CRAMER");
                    System.out.println("****************************************************************");
                    mainsplcramer();
                }
            }

            else if (menu == 2) { //DETERMINAN
                PrintSubmenuDeterminan();
                int submenu = scan.nextInt();
                if (submenu == 1) { //REDUKSI BARIS
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("           MENCARI DETERMINAN DENGAN REDUKSI BARIS");
                    System.out.println("****************************************************************");
                    maindetreduksi();
                }
                else if (submenu == 2) { //EKSPANSI KOFAKTOR
                    System.out.println("");
                    System.out.println("****************************************************************");
                    System.out.println("          MENCARI DETERMINAN DENGAN EKSPANSI KOFAKTOR");
                    System.out.println("****************************************************************");
                    maindetcofactor();
                }

            }

            else if (menu == 3) { //INVERS
                System.out.println("");
                System.out.println("****************************************************************");
                System.out.println("                 MENCARI INVERS SUATU MATRIKS");
                System.out.println("****************************************************************");
                maininverse();
            }

            else if (menu == 4) { //INTERPOLASI
                System.out.println("");
                System.out.println("****************************************************************");
                System.out.println("             MENYELESAIKAN PERSOALAN INTERPOLASI");
                System.out.println("****************************************************************");
                maininterpolasi();
            }

            else if (menu == 5) { //REGRESI
                System.out.println("");
                System.out.println("****************************************************************");
                System.out.println("            MENYELESAIKAN PERSOALAN REGRESI LINEAR");
                System.out.println("****************************************************************");
                mainregresi();
            }

            else if (menu == 6) {

            }
            PrintMenu();
            menu = scan.nextInt();
        }

        System.out.println("");
        System.out.println("****************************************************************");
        System.out.println("                       SELAMAT BELAJAR!");
        System.out.println("****************************************************************");
    }
}
