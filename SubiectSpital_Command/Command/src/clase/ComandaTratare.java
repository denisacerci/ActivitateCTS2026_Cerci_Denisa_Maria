package clase;

public class ComandaTratare extends Command{
    public ComandaTratare(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        super.getMedic().tratarePacient();
    }

    @Override
    public void undo() {
        super.getMedic().anuleazaTratarePacient();
    }

    @Override
    public void redo() {
        super.getMedic().refaceTratarePacient();
    }
}
