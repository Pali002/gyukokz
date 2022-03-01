import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        
        //kezdet
        String valasztott = "";

        do{
            System.out.println("-------------------");
            System.out.println();
            System.out.println("1) Program indítása");
            System.out.println();
            System.out.println("2) Névjegy");
            System.out.println();
            System.out.println("3) Kilépés");
    
            System.out.println();
            System.out.println("Valasztas:");
            valasztott = sc.nextLine();
            switch(valasztott){
                case "1":
                    System.out.println("Program...");
                    double szam = 0;

        do{
            System.out.print("Szam: ");
            szam = sc.nextDouble();
            if(szam != 0){
                double ngyok = Math.sqrt(szam);
                System.out.printf(
                "Negyzetgyok: %.2f\n",
                ngyok
                );
            }
        }while(szam != 0);
        System.out.println("Folytatáshoz enter");
        sc.nextLine();
        sc.nextLine();
                    break;
                case "2":
                    System.out.println("Névjegy...");
                    System.out.println("Zentai Pál");
                    System.out.println("2022-03-01");
                    System.out.println("Szoft-I-N");
                    System.out.println("Gyökszámító program");
                    System.out.println("Folytatáshoz enter");
                    sc.nextLine();
                    break;
                case "3":
                System.out.println("Kilépés...");
                break;
            };    
        }while(!valasztott.equals("3"));
        //vége

        sc.close();
    }
}
