import java.util.Scanner;

public class Main {
    User user = new User();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.holidays();
    }
        void holidays() {
            System.out.println("Welcome to the holiday list in Latvia, in 2021!\n");
            System.out.println("Enter user name: ");
            user.userName = scanner.nextLine();
            System.out.println("Hello " + user.userName);
            String month = "";
            do{
                System.out.println("\nWhich month do you want to see: ");
                System.out.println("January\t\t\t" + "July\n" +
                        "February\t\t" + "August\n" +
                        "March\t\t\t" + "September\n" +
                        "April\t\t\t" + "October\n" +
                        "May\t\t\t\t" + "November\n" +
                        "June\t\t\t" + "December\n" +
                        "\t  Quit list");
                System.out.println("Your choice: ");
                month = scanner.nextLine();

                switch (month){
                    case "January":
                        System.out.println("1 January = New Year's Day");
                        break;
                    case "February":
                        System.out.println("14 February = Valentine's Day");
                        break;
                    case "March":
                        System.out.println("8 March = Woman's Day");
                        break;
                    case "April":
                        System.out.println("2 April = Good Friday\n" +
                                "4 April = Easter Sunday\n" +
                                "5 April = Easter Monday");
                        break;
                    case "May":
                        System.out.println("1 May = Labour Day\n" +
                                "4 May = Restoration of Independence Day\n" +
                                "9 May = Mother's Day\n" +
                                "May = Pentecost");
                        break;
                    case "June":
                        System.out.println("23 June = Midsummer's Eve\n" +
                                "24 June = Midsummer's Day");
                        break;
                    case "July":
                        System.out.println("No holidays celebrated!");
                        break;
                    case "August":
                        System.out.println("No holidays celebrated!");
                        break;
                    case "September":
                        System.out.println("No holidays celebrated!");
                        break;
                    case "October":
                        System.out.println("No holidays celebrated!");
                        break;
                    case "November":
                        System.out.println("18 November = Proclamation Day of the Republic of Latvia");
                        break;
                    case "December":
                        System.out.println("24 December = Christmas Eve\n" +
                                "25 December = Christmas Day\n" +
                                "26 December = Second Day of Christmas\n" +
                                "31 December New Year's Eve");
                        break;
                    case "Quit":
                        System.out.println("Exiting list!");
                        break;
                }
                System.out.println("\nPress Enter to continue");
                scanner.nextLine();

            }while (!month.equalsIgnoreCase("quit"));
            return;
        }
}
