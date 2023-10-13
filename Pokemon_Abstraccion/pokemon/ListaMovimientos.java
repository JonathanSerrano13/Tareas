package pokemon;

import  java.util.ArrayList;

public class ListaMovimientos{
    private ArrayList<Movimiento>movimientos]=new ArrayList<>();

    public ListaMovimientos(){
        //Movimientos de tipo electrico
        movimientos.add(new Movimiento("Impactrueno",40,Tipo.ELECTRICO,30))
        movimientos.add(new Movimiento("Bola voltio",60,Tipo.ELECTRICO,10))

        //Movimientos de tipo fantasma
        movimientos.add(new Movimiento("Puño sombra",60,Tipo.FANTASMA,20));
        movimientos.add(new Movimiento("Lengüetazo",30,Tipo.FANTASMA,30));

        //Movimiemtos de tipo acero
        movimientos.add(new Movimiento("Cola de hierro",100,Tipo.ACERO,75))
        movimientos.add(new Movimiento("Giro bola",100,Tipo.ACERO,5))

        //Movimientos de tipo normal
        movimientos.add(new Movimiento("Meteoros",60,Tipo.NORMAL,20))
    }

    //Metodo que devuelve el movimiento uscando el nombre
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento:movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
}