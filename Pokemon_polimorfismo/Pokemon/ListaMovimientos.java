package pokemon;

import  java.util.ArrayList;

public class ListaMovimientos{
    private ArrayList<Movimiento>movimientos=new ArrayList<>();

    public ListaMovimientos(){
      //Movimientos de tipo siniestro
        movimientos.add(new Movimiento("Picotazo",35,Tipo.SINIESTRO,35, Clase.FISICO));
        movimientos.add(new Movimiento("Golpe bajo",70,Tipo.SINIESTRO,5, Clase.FISICO));
        movimientos.add(new Movimiento("Ataque Ala",60,Tipo.SINIESTRO,35, Clase.FISICO));
        movimientos.add(new Movimiento("Finta",60,Tipo.SINIESTRO,20, Clase.FISICO));
        //Movimientos de tipo DragonFantasma
        movimientos.add(new Movimiento("Maldición",40,Tipo.DRAGONFANTASMA,35, Clase.FISICO));
        movimientos.add(new Movimiento("Impresionar",60,Tipo.DRAGONFANTASMA,25, Clase.FISICO));
        movimientos.add(new Movimiento("Bola Sombra",60,Tipo.DRAGONFANTASMA,35, Clase.ESPECIAL));
        movimientos.add(new Movimiento("Ataque Ala",60,Tipo.DRAGONFANTASMA,35, Clase.FISICO));
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
