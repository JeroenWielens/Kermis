import java.util.Scanner;

public class Kermis {
    Scanner scanner = new Scanner(System.in);

    Attractie botsAuto = new BotsAuto(2.50);
    Attractie spin = new Spin(2.25);
    Attractie spiegelpaleis = new Spiegelpaleis(2.75);
    Attractie spookhuis = new Spookhuis(3.20);
    Attractie hawaii = new Hawaii(2.90);
    Attractie ladderklimmen = new Ladderklimmen(5.00);

    Attractie oliebollenkraam = new Oliebollenkraam(4.00);
    Attractie frietkraam = new Frietkraam(3.45);
    Attractie mueslikraam = new Mueslikraam(9.00);
    Attractie shoarmatent = new Shoarmatent(5.15);

    public void welkomOpDeKermis() {
        System.out.println("Welkom op kermis Jeroen! \nWelke attractie of eetkraam wil je bezoeken?\n");
        System.out.println("Kies [1] voor de Botsauto's");
        System.out.println("Kies [2] voor de Spin");
        System.out.println("Kies [3] voor het Spiegelpaleis");
        System.out.println("Kies [4] voor het Spookhuis");
        System.out.println("Kies [5] voor de Hawaii");
        System.out.println("Kies [6] voor het Ladderklimmen");
        System.out.println("\nKies [11] voor de Oliebollenkraam");
        System.out.println("Kies [22] voor de Frietkraam");
        System.out.println("Kies [33] voor de Mueslikraam");
        System.out.println("Kies [44] voor de Shoarmatent");
        System.out.println("Kies [stop] als je naar huis wilt gaan");
        System.out.println("\nKies [o] voor de totaalomzet van de attracties");
        System.out.println("Kies [k] voor de totale klantenteller van de attracties");
        kermisLoop();
    }
    public double geefOmzetAttracties(){
        double omzetAttracties = (spin.getOmzet() + spiegelpaleis.getOmzet() + spookhuis.getOmzet() + hawaii.getOmzet() + ladderklimmen.getOmzet());
        return omzetAttracties;
    }
    public double geefOmzetEetkramen() {
        double omzetEetkramen = (oliebollenkraam.getOmzet() + frietkraam.getOmzet() + mueslikraam.getOmzet() + shoarmatent.getOmzet());
        return omzetEetkramen;
    }
    public int geefBezoekersaantalAttracties() {
        int bezoekersAttracties = (botsAuto.bezoekersAantal + spin.bezoekersAantal + spiegelpaleis.bezoekersAantal + spookhuis.bezoekersAantal + hawaii.bezoekersAantal + ladderklimmen.bezoekersAantal);
        return bezoekersAttracties;
    }
    public int geefBezoekersaantallenEetkramen() {
        int bezoekersEetkramen = (oliebollenkraam.bezoekersAantal + frietkraam.bezoekersAantal + mueslikraam.bezoekersAantal + shoarmatent.bezoekersAantal);
        return bezoekersEetkramen;
    }
    public double geefTotaalOmzet() {
        double totaalOmzet = (geefOmzetAttracties() + geefOmzetEetkramen());
        return totaalOmzet;
    }
    public int geefTotaalKlantenteller() {
        int totaalKlantenteller = (geefBezoekersaantalAttracties() + geefBezoekersaantallenEetkramen());
        return totaalKlantenteller;
    }

    private void kermisLoop() {
        boolean naarHuis = false;

        do {
            String welkeAttractie = scanner.next();
            switch (welkeAttractie) {
                case "1":
                    botsAuto.nieuweBezoeker();
                    botsAuto.attractieDraait();
                    System.out.println("De huidige klantenteller van de Botsauto's is: " + botsAuto.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Botsauto's is: €" + botsAuto.getOmzet());
                    break;
                case "2":
                    spin.nieuweBezoeker();
                    spin.attractieDraait();
                    System.out.println("De huidige klantenteller van de Spin is: " + spin.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Spin is: €" + spin.getOmzet());
                    break;
                case "3":
                    spiegelpaleis.nieuweBezoeker();
                    spiegelpaleis.attractieDraait();
                    System.out.println("De huidige klantenteller van het Spiegelpaleis is: " + spiegelpaleis.getBezoekersAantal());
                    System.out.println("De huidige omzet van het Spiegelpaleis is: €" + spiegelpaleis.getOmzet());
                    break;
                case "4":
                    spookhuis.nieuweBezoeker();
                    spookhuis.attractieDraait();
                    System.out.println("De huidige klantenteller van het Spookhuis is: " + spookhuis.getBezoekersAantal());
                    System.out.println("De huidige omzet van het Spookhuis is: €" + spookhuis.getOmzet());
                    break;
                case "5":
                    hawaii.nieuweBezoeker();
                    hawaii.attractieDraait();
                    System.out.println("De huidige klantenteller van de Hawaii is: " + hawaii.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Hawaii is: €" + hawaii.getOmzet());
                    break;
                case "6":
                    ladderklimmen.nieuweBezoeker();
                    ladderklimmen.attractieDraait();
                    System.out.println("De huidige klantenteller van het Ladderklimmen is: " + ladderklimmen.getBezoekersAantal());
                    System.out.println("De huidige omzet van het Ladderklimmen is: €" + ladderklimmen.getOmzet());
                    break;
                case "11":
                    oliebollenkraam.nieuweBezoeker();
                    oliebollenkraam.attractieDraait();
                    System.out.println("De huidige klantenteller van de Oliebollenkraam is: " + oliebollenkraam.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Oliebollenkraam is: €" + oliebollenkraam.getOmzet());
                    break;
                case "22":
                    frietkraam.nieuweBezoeker();
                    frietkraam.attractieDraait();
                    System.out.println("De huidige klantenteller van de Frietkraam is: " + frietkraam.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Frietkraam is: €" + frietkraam.getOmzet());
                    break;
                case "33":
                    mueslikraam.nieuweBezoeker();
                    mueslikraam.attractieDraait();
                    System.out.println("De huidige klantenteller van de Mueslikraam is: " + mueslikraam.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Mueslikraam is: €" + mueslikraam.getOmzet());
                    break;
                case "44":
                    shoarmatent.nieuweBezoeker();
                    shoarmatent.attractieDraait();
                    System.out.println("De huidige klantenteller van de shoarmatent is: " + shoarmatent.getBezoekersAantal());
                    System.out.println("De huidige omzet van de Shoarmatent is: €" + shoarmatent.getOmzet());
                    break;
                case "stop":
                    System.out.println("Bedankt voor je bezoek aan Kermis Jeroen!");
                    System.out.println("\nDe uiteindelijke attractieomzet = €" + geefOmzetAttracties());
                    System.out.println("De uiteindelijke attractie klantenteller = " + geefBezoekersaantalAttracties());
                    System.out.println("\nDe uiteindelijke omzet van de eetkramen = €" + geefOmzetEetkramen());
                    System.out.println("De uiteindelijke klantenteller van de eetkramen = " + geefBezoekersaantallenEetkramen());
                    System.out.println("\nDe totaalomzet van de dag is: €" + geefTotaalOmzet());
                    System.out.println("De totaalklantenteller van de dag is: " + geefTotaalKlantenteller());
                    naarHuis = true;
                    break;
                case "o" :
                    System.out.println("De totale omzet van de attracties tot nu toe is: €" + geefOmzetAttracties());
                    System.out.println("De totale omzet van de eetkramen tot nu toe is: €" + geefOmzetEetkramen());
                    break;
                case "k" :
                    System.out.println("De huidige klantenteller van de attracties staat op: " + geefBezoekersaantalAttracties());
                    System.out.println("De huidige klantenteller van de eetkramen staat op: " + geefBezoekersaantallenEetkramen());
                    break;
                default:
                    System.out.println("Je hebt geen geldig attractienummer ingevoerd");
                    break;
            }
        } while (!naarHuis);
    }
}
