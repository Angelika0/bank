import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();

        // NormalAccaount normalAccaount = new NormalAccaount(0, "123", new Client("Jan", "Kowalski", 1));
        // NormalAccaount normalAccaount2 = new NormalAccaount(0, "123", new Client("Jan", "Kowalski", 2));
        // normalAccaount.deposit(1000);
       
        // normalAccaount.withdraw(500);
        // normalAccaount.withdraw(200);
        // normalAccaount.deposit(100);
        // normalAccaount.withdraw(100);
        // normalAccaount.deposit(500);
        // // normalAccaount.transfer(250, normalAccaount2);

        // normalAccaount.printOperationsHistory(LocalDate.of(2023,1,1), LocalDate.of(2023,06,30));
        // normalAccaount2.printOperationHistorybyAmount(50, 500);
        
        Generatory generatory = new Generatory();

        while (true) {

            System.out.println("MENU 1.KLIENT 2.RACHUNEK KLIENTA 3.ZAMKNIJ PROGRAM");
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
                    System.out.println("RACHUNEK KLIENTA: 1.DODAJ 2.USUŃ 3.WYSZUKAJ 4.PRZEGLADAJ 5.ZROB PRZELEW 6.WYPŁATA 7.WPŁATA 8.HISTORIA OPERACJI 9.WYJDZ");
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
                                client.deleteNormalAccount(nr);
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
                        //przeglądaj wszystkie rachunki klienta
                        System.out.println("podaj id klienta któremu chcesz przeglądać rachunki");
                        int id = scan.nextInt();

                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println(client.toString2());
                            }
                        }

                    } else if (options3 == 5) {
                        // zrób przelew
                        System.out.println("na jaki rodzaj konta chcesz zrobic przelwe? 1.normalne 2.oszczędnościowe");
                        int op = scan.nextInt();
                        if(op==1){
                        System.out.println("podaj id klienta który chcesz zrobić przelew");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku z którego chcesz zrobić przelew");
                                String nr = scan.next();
                                System.out.println("podaj id klienta na którego chcesz zrobić przelew");
                                int id2 = scan.nextInt();
                                for(Client client2 : bank.clients){
                                    if(client2.getId() == id2){
                                        System.out.println("podaj numer rachunku na który chcesz zrobić przelew");
                                        String nr2 = scan.next();
                                        System.out.println("podaj kwote przelewu");
                                        double kwota = scan.nextDouble();
                                        client.findeNormalAccaount(nr).transfertoNormalAccaount(kwota,client2.findeNormalAccaount(nr2));
                                    }
                                }
                            
                            }
                        }
                    }
                    else if(op==2){
                        //przelew na rachunek oszczędnościowy
                        System.out.println("podaj id klienta który chcesz zrobić przelew");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku z którego chcesz zrobić przelew");
                                String nr = scan.next();
                                System.out.println("podaj numer rachunku na który chcesz zrobić przelew");
                                String nr2 = scan.next();
                                System.out.println("podaj kwote przelewu");
                                double kwota = scan.nextDouble();
                                // client.findeNormalAccaount(nr).transfertoSavingsAccaount(kwota,client.findeSavingsAccaount(nr2));
                            }
                        }
                    }
                    else {
                        System.out.println("błędna opcja");
                    }

                    } else if (options3 == 6) {
                        //wypłata
                        System.out.println("podaj id klienta któremu chcesz wypłacić pieniądze");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku z którego chcesz wypłacić pieniądze");
                                String nr = scan.next();
                                System.out.println("podaj kwote wypłaty");
                                double kwota = scan.nextDouble();
                                client.findeNormalAccaount(nr).withdraw(kwota);
                            }
                        }

                    } else if (options3 == 7) {
                        //wpłata
                        System.out.println("podaj id klienta któremu chcesz wpłacić pieniądze");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku na który chcesz wpłacić pieniądze");
                                String nr = scan.next();
                                System.out.println("podaj kwote wpłaty");
                                double kwota = scan.nextDouble();
                                client.findeNormalAccaount(nr).deposit(kwota);
                            }
                        }

                    } else if (options3 == 8) {
                        //historia operacji
                        System.out.println("Wyszukaj po: 1.Dacie 2.Kwocie)");
                        int op = scan.nextInt();
                        if(op==1){
                         System.out.println("podaj id klienta któremu chcesz sprawdzić historie operacji");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku którego historie operacji chcesz sprawdzić");
                                String nr = scan.next();
                                System.out.println("podaj zakres czasowy historii operacji");
                                System.out.println("podaj date początkową");
                                System.out.println("dzień:");
                                Integer dd = scan.nextInt();
                                System.out.println("miesiąc:");
                                Integer mm = scan.nextInt();
                                System.out.println("rok:");
                                Integer yy = scan.nextInt();
                                LocalDate date1 = LocalDate.of(yy, mm, dd);
                                System.out.println("podaj date końcową");
                                System.out.println("dzień:");
                                Integer dd2 = scan.nextInt();
                                System.out.println("miesiąc:");
                                Integer mm2 = scan.nextInt();
                                System.out.println("rok:");
                                Integer yy2 = scan.nextInt();
                                LocalDate date2 = LocalDate.of(yy2, mm2, dd2);
                                

                                client.findeNormalAccaount(nr).printOperationsHistory(date1, date2);
                                
                            }
                        }
                        }
                        else if(op==2){
                            System.out.println("podaj id klienta któremu chcesz sprawdzić historie operacji");
                        int id = scan.nextInt();
                        for(Client client : bank.clients){
                            if(client.getId() == id){
                                System.out.println("podaj numer rachunku którego historie operacji chcesz sprawdzić");
                                String nr = scan.next();
                                System.out.println("podaj zakres czasowy historii operacji");
                                System.out.println("podaj kwote początkową");
                                double kwota1 = scan.nextDouble();
                                System.out.println("podaj kwote końcową");
                                double kwota2 = scan.nextDouble();
                                client.findeNormalAccaount(nr).printOperationHistorybyAmount(kwota1, kwota2);
                                
                            }
                        }
                        }
                        else{
                            System.out.println("błędna opcja");
                        }

                    } else if (options3 == 9) {
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