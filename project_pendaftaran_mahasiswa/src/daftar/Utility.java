package daftar;

public class Utility{
    public static final int inputInt(String angka) {
        int inputan = -1;
        try {
            inputan = Integer.parseInt(angka);
        } catch (Exception e) {
            if (!angka.equals("")) {
                System.out.println("Inputkan Angka Dengan Benar");
            }
        }
        return inputan;
    }
}