public class utsNo2 {
    public class Main {
        public static void main(String[] args) {
            int[] angka = new int[] {2,3,5,6,11};
            for (int index = 0; index<angka.length;index++){
                UbahAngkaKeChar(angka[index]);
            }
        }

        public static void UbahAngkaKeChar(int PenampungANgka){
            System.out.println("Ubah ke string :" + PenampungANgka);
        }
    }

}
