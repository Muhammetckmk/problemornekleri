package alıştırma;

public class harfYazımı {
    public static void main(String[] args) {


        /*
         *****
         *
         *****
         *
         *****
         */
        // int satırSayısı=13;
        // for (int i = 1; i <satırSayısı+1 ; i++) {
        //     if (i==1 || i==satırSayısı || i==satırSayısı/2+1){
        //         for (int j = 1; j < satırSayısı; j++) {
        //             System.out.print("* ");
        //         }
        //         System.out.println();

        //     }else {
        //         System.out.println("* ");

        //     }
        // }


        /*

         *     *
         **   **
         * * * *
         *  *  *


         */

        int satırSayısı = 7;
        for (int i = 1; i < satırSayısı + 1; i++) {
            if (i == 1) {
                for (int j = 1; j < satırSayısı + 1; j++) {
                    if (j == 1 || j == satırSayısı) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.println();
            } else if (i == 2) {
                for (int j = 1; j < satırSayısı + 1; j++) {
                    if (j == 1 || j == 2 || j == satırSayısı - 1 || j == satırSayısı) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else if (i == 3) {
                for (int j = 1; j < satırSayısı + 1; j++) {
                    if (j == 1 || j == 3 || j == satırSayısı - 2 || j == satırSayısı) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else if (i == 4) {
                for (int j = 1; j < satırSayısı + 1; j++) {
                    if (j == 1 || j==satırSayısı/2+1|| j == satırSayısı) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }System.out.println();
            } else if (i == 5) {
                for (int j = 1; j < satırSayısı + 1; j++) {
                    if (j == 1 || j == satırSayısı) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }
        }
    }}
