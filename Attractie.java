public abstract class Attractie implements IAttractie{
    public Double ticketPrijs;
    public Integer bezoekersAantal;

    public Integer getBezoekersAantal() {
        return bezoekersAantal;
    }

    public void attractieDraait(){}
}
