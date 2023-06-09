import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        
        Generatory generatory = new Generatory();

        while (true) {

            System.out.println("MENU 1.KLIJENT 2.RACHUNEK KLIJENTA 3.ZAMKNIJ PROGRAM");
            int options = scan.nextInt();
            if (options == 1) {
                while (true) {
                    System.out.println("KLIENT: 1-DODAJ 2-USUŃ 3-WYSZUKAJ 4-PRZEGLĄDAJ 5-WYJDZ");
                    int options2 = scan.nextInt();
                    if (options2 == 1) {

                        System.out.println("Podaj imie nowego klienta:");
                        String name =scan.next();
                        System.out.println("Podaj nazwisko nowego klienta:");
                        String surname = scan.next();
                        int id = generatory.generujId();
                        Client client = new Client(name,surname,id);
                        bank.addClinet(client);
                    

                    } else if (options2 == 2) {
                        System.out.println("podaj id klienta którego chessz usunąc");
                        int cl = scan.nextInt();
                        bank.delate(cl);

                    } else if (options2 == 3) {
                        System.out.println("podaj ID klienta którego chesz wyszukać");
                        int id = scan.nextInt();
                        bank.findeClient(id);
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
                    System.out.println("RACHUNEK KLIENTA: 1.DODAJ 2.USUŃ 3.WYSZUKAJ 4.PRZEGLADAJ 5.Wyjdz");
                    int options3 = scan.nextInt();
                    if (options3 == 1) {
                            System.out.println("DODAJ: 1.rachunek normalny, 2.rachunek oszcednosciowy");
                            int op = scan.nextInt();
                            if(op==1){
                                System.out.println("podaj id klienta któremu chcesz dodać rachunek");
                                int id = scan.nextInt();
                                for(Client client : bank.clients){
                                    if(client.getId() == id){
                                        System.out.println("podaj stan początkowy rachunku");
                                        double balance = scan.nextDouble();
                                        String nr = generatory.generujNumerKonta();
                                        client.addNormalAccaount(new NormalAccaount(balance,nr,client));
                                    }
                                }
                                                           
                                
                            }
                            else if(op==2){
                                //dodawanie rachunku oszcednosciowego 
                            }
                            else {
                                System.out.println("błędna opcja");
                            }
                    } else if (options3 == 2) {
                        //usuń rachunek dla klijenta
                        System.out.println("podaj id klienta któremu chcesz usunąć rachunek");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku który chcesz usunąć");
                                String nr = scan.next();
                                client.delateNormalAccaount(nr);
                            }
                        }


                    } else if (options3 == 3) {
                        //wyszukaj konkretny rachunek (poz nazwie ) konkretnego klijenta
                        System.out.println("podaj id klienta któremu chcesz wyszukać rachunek");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            
                            if(client.getId() == id){
                                System.out.println("jakiego typu rachunek chcesz wyszukać? 1.normalny 2.oszczędnościowy");
                                int op = scan.nextInt();
                                if(op==1){
                                    System.out.println("podaj numer rachunku który chcesz wyszukać");
                                    String nr = scan.next();
                                    System.out.println( client.findeNormalAccaount(nr));
                                    break;
                                }
                                else if(op==2){
                                    //wyszukaj rachunek oszczędnościowy
                                }
                                else {
                                    System.out.println("błędna opcja");
                                }
                              
                            }
                        }

                    } else if (options3 == 4) {
                        //przeglądaj wszystkie rachunki klijenta
                        System.out.println("podaj id klienta któremu chcesz przeglądać rachunki");
                        int id = scan.nextInt();

                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println(client.toString2());
                            }
                        }

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