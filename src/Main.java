import java.util.Random;
import java.util.Scanner;

public class Main {
    int jumlahLantai = 3;
    static int totalPenerimaSetiapLantai = 150;
    static int totalBeban = 800000;
    public static String[] lantai1 =  new String[450000];
    public static String[] lantai2 =  new String[200000];
    public static String[] lantai3 =  new String[150000];

    public static void PrintMasukLantai (){
        int totalBebanLantai1 = 0;
        int sisaKoutaLantai = 0;
        for (int index = 0; index<lantai1.length;index++){
            if (lantai1[index] != null){
                totalBebanLantai1++;
            }
        }
        int totalBebanLantai2 = 0;

        for (int index = 0; index<lantai1.length;index++){
            if (lantai2[index] != null){
                totalBebanLantai2++;
            }
        }
        int totalBebanLantai3 = 0;
        for (int index = 0; index<lantai1.length;index++){
            if (lantai2[index] != null){
                totalBebanLantai2++;
            }
        }
        sisaKoutaLantai = sisaKoutaLantai - totalBebanLantai1 - totalBebanLantai2 - totalBebanLantai3;
        System.out.println("Total Pasien Prrizzer : " + totalBebanLantai1 );
        System.out.println("Jumlah Seluruh Vaksin : " + totalPenerimaSetiapLantai + " Sisa Kouta :" + sisaKoutaLantai);
        System.out.println();

    }

public static void checkMobilMasuk(String[] myArray,int BebanMobil){
    int indexNow = 0;
    for (int index = 0; index<myArray.length; index++){
        if (myArray[index] != null){
            indexNow = index+1;
        }
    }
    if(indexNow < myArray.length){
        myArray[indexNow] = String.valueOf(BebanMobil);
    }
}

    public static void simpanPasien(int AngkaRandom, int BebanMobil){
        switch (AngkaRandom){
            case 1:
                checkMobilMasuk(lantai1,BebanMobil);
                System.out.println("Masuk Lantai 1");
                PrintMasukLantai();
                break;


        }
    }
    public static void inputMobil(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Masukan Plat Mobil:");
            String PlatMobil = scan.nextLine();
            System.out.print("Masukan beban Mobil");
            int BebanMobil = scan.nextInt();
            if (PlatMobil.isBlank()){
                System.out.println("Masukan Plat lebih dahulu");
                inputMobil();
            }else if (PlatMobil.isBlank()) {
                System.out.println("Masukan Plat lebih dahulu");
                inputMobil();
            } else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt()+1;
                simpanPasien(JenisRandom,BebanMobil);

            }

        }
    }
    public static void main(String[] args) {
inputMobil();
    }
}