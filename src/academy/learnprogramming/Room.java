package academy.learnprogramming;

public class Room {
    private double dlugosc;
    private double szerokosc;
    private double wysokosc;

    public double getDlugosc() {
        return dlugosc;
    }
    public double getSzerokosc() {
        return szerokosc;
    }
    public double getWysokosc() {
        return wysokosc;
    }

    public Room(double dlugosc, double szerokosc, double wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double getPowierzchniaPodlogi(){
        return dlugosc*szerokosc;
    }
    public double getRoomVolume(){
        return dlugosc*szerokosc*wysokosc;
    }
    public double getPowierzchniaScian(){
        return wysokosc*(dlugosc + szerokosc)*2;
    }
    public double floorPaintingPrice(double price){
        return getPowierzchniaPodlogi()*price;

    }
    public double wallPaintingPrice(double price){
        return getPowierzchniaScian()*price;
    }
    public void show(){
        System.out.println(" dlugosc: "+dlugosc+"\n szerokosc: "+szerokosc+"\n wysokosc: "+wysokosc
            +"\n objetosc pokoju: "+String.format("%.2f", getRoomVolume())+" m2");
    }
}
