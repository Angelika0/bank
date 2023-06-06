import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("MENU 1.KLIJENT 2.RACHUNEK KLIJENTA 3.ZAMKNIJ PROGRAM");
            int options = scan.nextInt();
            if (options == 1) {
                while (true) {
                    System.out.println("KLIJENT: 1-DODAJ 2-USUŃ 3-WYSZUKAJ 4-PRZEGLĄDAJ 5-WYJDZ");
                    int options2 = scan.nextInt();
                    if (options2 == 1) {

                        System.out.println("Podaj imie nowego klijenta:");
                        String name =scan.next();
                        System.out.println("Podaj nazwisko nowego klijenta:");
                        String surname = scan.next();
                        System.out.println("Podaj ID nowego klijenta:");
                        int Id = scan.nextInt();
                        Client client = new Client(name, surname, Id);
                        bank.add(client);



                    } else if (options2 == 2) {
                        System.out.println("podaj id klijenta którego chessz usunąc");
                        int cl = scan.nextInt();
                        bank.delate(cl);

                    } else if (options2 == 3) {
                        System.out.println("podaj ID sklijenta którego chesz wyszukać");
                        int id = scan.nextInt();
                        bank.finde(id);
                    } else if (options2 == 4) {
                        System.out.println(bank.toString());
                    } else if (options2 == 5) {
                        break;
                    } else {
                        System.out.println("niepoprwnie wybrana opcja");
                    }
                }
            } else if (options == 2) {
                while (true) {
                    System.out.println("RACHUNEK KLIJENTA: 1.DODAJ 2.USUŃ 3.WYSZUKAJ 4.PRZEGLADAJ 5.Wyjdz");
                    int options3 = scan.nextInt();
                    if (options3 == 1) {
                            System.out.println("DODAJ: 1.rachunek normalny, 2.rachunek oszcednosciowy");
                            int op = scan.nextInt();
                            if(op==1){
                                //dodawanie rachunku normalnego
                            }
                            else if(op==2){
                                //dodawanie rachunku oszcednosciowego 
                            }
                            else {
                                System.out.println("błędna opcja");
                            }
                    } else if (options3 == 2) {
                        //usuń rachunek dla klijenta

                    } else if (options3 == 3) {
                        //wyszukaj konkretny rachunek (poz nazwie ) konkretnego klijenta

                    } else if (options3 == 4) {
                        //przeglądaj wszystkie rachunki klijenta

                    } else if (options3 == 5) {
                        break;
                    } else {
                        System.out.println("niepoprawnie wybrana opcja");
                    }
                }
            } else if (options == 3) {
                break;
            } else {
                System.out.println("niepoprawnie wybrana opcja");
            }
        }
    }
}