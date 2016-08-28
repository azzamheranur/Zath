
import java.util.Scanner;

public class Konversi2 {
    public static void main(String[]args){
        String jawab;
        
        do{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Konversi");
        System.out.println("1. Desimal");
        System.out.println("2. Biner");
        System.out.println("3. HexaDesimal");
        System.out.println("4. Oktal");
        
        
        
        
            System.out.print("Masukkan pilihan anda: ");
            int pila = scan.nextInt();
            switch (pila) {
                case 1:
                    System.out.println("1. Desimal ke Biner");
                    System.out.println("2. Desimal ke HexaDesimal ");
                    System.out.println("3. Desimal ke oktal ");
                    System.out.print("Masukkan pilihan anda: ");
                    int pila1 = scan.nextInt();
                        switch (pila1){
                        /*  case 1:
                              Scanner sc = new Scanner(System.in);
                                destobin a = new destobin();
                                System.out.print("Masukkan bilangan desimal: ");
                                    int dtb = sc.nextInt();
        
                                System.out.print("Bilangan binernya adalah: ");
                                    a.DesimalKeBiner(dtb);
                                System.out.println(" ");
                                break;
                        
                            case 2:
                                Scanner sc1 = new Scanner(System.in);
                                destohex a1 = new destohex();
                                System.out.print("Masukkan bilangan desimal: ");
                                    int dth = sc1.nextInt();
        
                                System.out.print("Bilangan hexanya adalah: ");
                                    a1.DesimalKeHexa(dth);
                                System.out.println(" ");
                                break;
                                
                            case 3:
                                Scanner sc2 = new Scanner(System.in);
                                destook a2 = new destook();
                                System.out.print("Masukkan bilangan desimal: ");
                                    int dto = sc2.nextInt();
        
                                System.out.print("Bilangan oktalnya adalah: ");
                                    a2.DesimalKeOktal(dto);
                                System.out.println("");
                                break;
                            */
                            case 1:
                                int dtb;
                                Scanner sc = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Desimal: ");
                                    dtb = Integer.parseInt(sc.nextLine());
                                    String binary = Integer.toBinaryString(dtb);
                                System.out.println("Bilangan Binernya adalah: "+binary);
                                break;
                                
                            case 2:
                                int dth;
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Desimal: ");
                                    dth = Integer.parseInt(sc1.nextLine());
                                    String hexa = Integer.toHexString(dth);
                                System.out.println("Bilangan Hexadesimalnya adalah: "+hexa);
                                break;
                            case 3:
                                int dto;
                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Desimal: ");
                                    dto = Integer.parseInt(sc2.nextLine());
                                    String octal = Integer.toOctalString(dto);
                                System.out.println("BIlangan Octalnya adalah: "+octal);
                                break;
            }
                        break;
                case 2:
                    System.out.println("1. Biner ke Desimal");
                    System.out.println("2. Biner ke HexaDesimal ");
                    System.out.println("3. Biner ke oktal ");
                    System.out.print("Masukkan pilihan anda: ");
                    int pila2 = scan.nextInt();
                        switch (pila2){
                            case 1:
                                int btd;
                                Scanner sc3 = new Scanner(System.in);
                                System.out.print("Masukkan bilangan Biner: ");
                                   btd = Integer.parseInt(sc3.nextLine(),2);
                                String decimal = Integer.toString(btd);
                                System.out.println("Bilangan Desimalnya adalah: "+decimal);
                                break;        
                            case 2:
                                int bth;
                                Scanner sc4 = new Scanner(System.in);
                                System.out.print("Masukkan bilangan Biner: ");
                                   bth = Integer.parseInt(sc4.nextLine(), 2);
                                String hexa = Integer.toHexString(bth);
                                System.out.println("Bilangan Hexadesimalnya adalah: "+hexa);
                                break;
                            case 3:
                                int bto;
                                Scanner sc5 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Biner: ");
                                    bto = Integer.parseInt(sc5.nextLine(),2);
                                String octal = Integer.toOctalString(bto);
                                System.out.println("Bilangan Octalnya adalah: "+octal);
                                break;
                        }
                        break;
                case 3:
                    System.out.println("1. Hexadesimal ke Desimal");
                    System.out.println("2. Hexadesimal ke Biner ");
                    System.out.println("3. Hexadesimal ke oktal ");
                    System.out.print("Masukkan pilihan anda: ");
                    int pila3 = scan.nextInt();
                        switch(pila3){
                            case 1:
                                int htd;
                                Scanner sc6 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Hexadesimal: ");
                                    htd = Integer.parseInt(sc6.nextLine(), 16);
                                    String decimal = Integer.toString(htd);
                                System.out.println("Bilangan Desimalanya adalah: "+decimal);
                                break;
                            case 2:
                                int htb;
                                Scanner sc7 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Hexadesimal: ");
                                    htb = Integer.parseInt(sc7.nextLine(), 16);
                                String binary = Integer.toBinaryString(htb);
                                System.out.println("Bilangan Binernya adalah: "+binary);
                                break;
                            case 3:
                                int hto;
                                Scanner sc8 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Hexadesimal: ");
                                    hto = Integer.parseInt(sc8.nextLine(), 16);
                                    String octal = Integer.toOctalString(hto);
                                System.out.println("Bilangan Octalnya adalah: "+octal);
                                break;
                        }
                        break;
                case 4:
                    System.out.println("1. Octal ke Desimal");
                    System.out.println("2. Octal ke Biner ");
                    System.out.println("3. Octal ke Hexadesimal ");
                    System.out.print("Masukkan pilihan anda: ");
                    int pila4 = scan.nextInt();
                        switch(pila4){
                            case 1:
                                int otd;
                                Scanner sc9 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Octal: ");
                                    otd = Integer.parseInt(sc9.nextLine(), 8);
                                    String decimal = Integer.toString(otd);
                                System.out.println("Bilangan Desimalnya adalah: "+decimal);
                                break;
                            case 2:
                                int otb;
                                Scanner sc10 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Octal: ");
                                    otb = Integer.parseInt(sc10.nextLine(), 8);
                                    String binary = Integer.toBinaryString(otb);
                                System.out.println("Bilangan Binernya adalah: "+binary);
                                break;
                            case 3:
                                int oth;
                                Scanner sc11 = new Scanner(System.in);
                                System.out.println("Masukkan bilangan Octal: ");
                                    oth = Integer.parseInt(sc11.nextLine(), 8);
                                    String hexa = Integer.toHexString(oth);
                                System.out.println("Bilangan Desimalnya adalah: "+hexa);
                                break;
                        }
                break;
            }
            
        System.out.println("Apakah anda mau melanjutkan? Y/T ");
        jawab = scan.next();
        jawab = jawab.toUpperCase();
    } while (jawab.equals("Y"));
        System.out.println("Terimakasih telah menggunakan program kami :) ");
    System.exit(0);
}
}