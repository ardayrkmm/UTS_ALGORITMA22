import java.util.Random;
import java.util.Scanner;

public class uts {

    int jumlahLantai = 3;
    static int TotalBobotTotalMax = 800;
    static int totalJumlahKendaraan = 450;
    public static String[] Lantai1 = new String[149];
    public static String[] Lantai2 = new  String[149];
    public static String[] Lantai3 = new String[149];


    public static int[] bobotMaxLantai1 = new int[]{450};
    public static int[] bobotMaxLantai2 = new int[]{250};
    public static int[] bobotMaxLantai3 = new int[]{150};

    public static void PrintInfokendaraan(){
        int totalLantai1 = 0;
        int totalSisaKuota =0;
        int totalSisaKoutaBobot = 0;
        int totalBebanLantai2 = 0;
        int totalBebanLantai1 = 0;
        int totalBebanLantai3 = 0;
        for (int index=0; index< Lantai1.length; index++){
            if (Lantai1[index] != null){
                totalLantai1++;
            }
        }
        for (int index=0; index< bobotMaxLantai1.length; index++){
            if (bobotMaxLantai1[index] != 0){
                totalBebanLantai1++;
            }
        }
        for (int index=0; index< bobotMaxLantai2.length; index++){
            if (bobotMaxLantai2[index] != 0){
                totalBebanLantai2++;
            }
        }
        for (int index=0; index< bobotMaxLantai3.length; index++){
            if (bobotMaxLantai3[index] != 0){
                totalBebanLantai3++;
            }
        }
        int totalLantai2=0;
        for (int index = 0; index< Lantai2.length;index++){
            if (Lantai2[index] != null){
                totalLantai2++;
            }
        }
        int totalLantai3 = 0;
        for (int index = 0;index< Lantai3.length;index++){
            if (Lantai3[index] != null) {
                totalLantai3++;
            }
        }

        totalSisaKuota = totalJumlahKendaraan - totalLantai1 - totalLantai2 - totalLantai3;
        totalSisaKoutaBobot = TotalBobotTotalMax - totalBebanLantai1 - totalBebanLantai2 - totalBebanLantai3;
        System.out.println("Total Kendaraan lantai 1 : " + totalLantai1 + " | total Kendaraan Lantai 2 : " + totalLantai2 + " | total Kendaraan Lantai 3 : "+ totalLantai3);
        System.out.println("jumlah Kapasitas beban : " + TotalBobotTotalMax  + " | total kouta beban : " + totalSisaKoutaBobot);
        System.out.println("jumlah kapasitas : " + totalJumlahKendaraan + " | total Kendaraan : " + totalSisaKuota);
        System.out.println("-----------------------------------------------------");

    }
    public static void ChekIndexArray(String[] myArray,String kendaraan){
        int indexNow = 0;
        for (int index =0 ; index< myArray.length;index++){
            if (myArray[index] != null){
                indexNow= index+1;
            }
        }
        if (indexNow< myArray.length){
            myArray[indexNow] = kendaraan;
        }

    }

    public static void ChekIndexArrayBobot(int[] myArray,int bobot){
        int indexNow = 0;
        for (int index =0 ; index< myArray.length;index++){
            if (myArray[index] != 0){
                indexNow= index+1;
            }
        }
        if (indexNow< myArray.length){
            myArray[indexNow] = bobot;
        }
    }

    public static void simpanKendaraan (int angakaRandom, String kendaraan){
        switch (angakaRandom){
            case 1:
                ChekIndexArray(Lantai1,kendaraan);
                System.out.println("anda parkir di lantai 1");
                PrintInfokendaraan();
                break;
            case 2:
                ChekIndexArray(Lantai2,kendaraan);
                System.out.println("anda parkir di lantai 2");
                PrintInfokendaraan();
                break;
            case 3:
                ChekIndexArray(Lantai3,kendaraan);
                System.out.println("anda parkir di lantai 3");
                PrintInfokendaraan();
                break;
        }
    }
    public static void SimpanBobot (int angakaRandom, int bobot){
        switch (angakaRandom){
            case 1:

                ChekIndexArrayBobot(bobotMaxLantai1,bobot);
                System.out.println("anda parkir di lantai 1");
                PrintInfokendaraan();
                break;
            case 2:
                ChekIndexArrayBobot(bobotMaxLantai2,bobot);
                System.out.println("anda parkir di lantai 2");
                PrintInfokendaraan();
                break;
            case 3:
                ChekIndexArrayBobot(bobotMaxLantai3,bobot);
                System.out.println("anda parkir di lantai 3");
                PrintInfokendaraan();
                break;
        }
    }
    public static void inputKendaraan(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.print("Masukan Plat Nomer = ");
            String platNomor = inputData.nextLine();
            System.out.print("Masukan Bobot Mobil = ");
            String bobotMobil = inputData.nextLine();
            if ((platNomor.isBlank() )|| (bobotMobil.isBlank()) ) {
                System.out.println("Plat nomor wajib diisi ");
                inputKendaraan();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanKendaraan(JenisRandom,platNomor);
                int JenisRandom2 = hasilRandom.nextInt(4)-1;
                SimpanBobot(JenisRandom2, Integer.parseInt(bobotMobil));
            }
        }
    }

    public static void main(String[] args) {
        inputKendaraan();
    }
}