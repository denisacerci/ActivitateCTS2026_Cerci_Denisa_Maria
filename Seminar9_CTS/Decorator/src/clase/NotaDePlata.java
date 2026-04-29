package clase;

public class NotaDePlata implements NotaDePlataAbstracta{
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
    this.suma = suma;
    this.data = data;
}

@Override
    public void printeaza() {
        System.out.println("\nLa data de "+data+" a fost achitata suma de "+suma+" lei.");
    }}
