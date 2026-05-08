package clase;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OperatorDeTriaj {
    private Queue<Command> comenzi;
    private Stack<Command> istoricUndo;
    private Stack<Command> istoricRedo;

    public OperatorDeTriaj() {
        this.comenzi = new LinkedList<>();
        this.istoricUndo = new Stack<>();
        this.istoricRedo = new Stack<>();
    }

    public void trimiteComanda(){
        if(!this.comenzi.isEmpty()){
            Command comanda=this.comenzi.poll();
            comanda.executa();
            istoricUndo.push(comanda);
            this.istoricRedo.clear();
        }
        else{
            System.out.println("Nu exista comenzi.");
        }
    }

    public void adaugaComanda(Command comanda){
        this.comenzi.add(comanda);
    }

    public void anuleazaComanda(){
        if(!this.istoricUndo.isEmpty()){
            Command comanda=this.istoricUndo.pop();
            comanda.executa();
            this.istoricRedo.push(comanda);
        }
        else{
            System.out.println("Comenzile nu au fost anulate.");
        }
    }

    public void refacereComanda(){
        if(!this.istoricRedo.isEmpty()){
            Command comanda=this.istoricRedo.pop();
            comanda.executa();
            this.istoricUndo.push(comanda);
        }
        else{
            System.out.println("Comenzile nu au fost refacute.");
        }
    }
}
