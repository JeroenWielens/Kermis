public class Mueslikraam extends Attractie {

    public Mueslikraam(Double ticketPrijs) {
        this.ticketPrijs = ticketPrijs;
        this.bezoekersAantal = 0;
    }

    @Override
    public Double getOmzet() {
        return this.bezoekersAantal * this.ticketPrijs;
    }

    @Override
    public void nieuweBezoeker() {
        this.bezoekersAantal += 1;
    }

    public void attractieDraait() {
        System.out.println("Smakelijk met je Muesli!");
    }
}


