package clase;

public class Autobuz {
    private String prodcator;

    public Autobuz(String prodcator) {
        this.prodcator = prodcator;
    }

    public void pleacaPeTraseu(int nrLinie){
        System.out.println("Autobuzul "+this.prodcator+" porneste pe traseul liniei "+nrLinie);
    }
}
