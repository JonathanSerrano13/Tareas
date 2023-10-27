package pokemon;

import  java.util.ArrayList;

public class ListaMovimientos{
    private ArrayList<Movimiento>movimientos=new ArrayList<>();

    public ListaMovimientos(){
        //Movimientos de tipo electrico
        movimientos.add(new Movimiento("Impactrueno",40,Tipo.ELECTRICO,30));
        movimientos.add(new Movimiento("Bola voltio",60,Tipo.ELECTRICO,10));
        movimientos.add(new Movimiento("Ataque rapido",40,Tipo.ELECTRICO,30));
        movimientos.add(new Movimiento("Chispa",65,Tipo.ELECTRICO,20));
        //Movimientos de tipo fantasma
        movimientos.add(new Movimiento("Puño sombra",60,Tipo.FANTASMA,20));
        movimientos.add(new Movimiento("Lengüetazo",30,Tipo.FANTASMA,30));
        movimientos.add(new Movimiento("Golpe bajo",70,Tipo.FANTASMA,5));
        movimientos.add(new Movimiento("Vendetta",50,Tipo.FANTASMA,35));
        //Movimientos de tipo siniestro
        movimientos.add(new Movimiento("Picotazo",35,Tipo.SINIESTRO,35));
        movimientos.add(new Movimiento("Ataque Ala",60,Tipo.SINIESTRO,35));
        //Movimientos de tipo agua
        movimientos.add(new Movimiento("Placaje",40,Tipo.AGUA,35));
        movimientos.add(new Movimiento("Mordisco",60,Tipo.AGUA,25));
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
