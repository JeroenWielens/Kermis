public class Oliebollenkraam extends Attractie {

    public Oliebollenkraam(Double ticketPrijs) {
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
        System.out.println("Smakelijk met je lekkere Oliebol!");
    }
}

