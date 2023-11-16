import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cajero {
    Map<Integer, Integer> BilletesDisponibles = new HashMap<>();

    public Cajero() {
        cargaDeBilletes();
    }

    public boolean entregarDinero(int cantidad) {
        for (int billete : BilletesDisponibles.keySet()) {
            int cantidadBilletes = BilletesDisponibles.get(billete);
            if (cantidad >= billete) {
                int cantidadNecesaria = cantidad / billete;
                if (cantidadNecesaria <= cantidadBilletes) {
                    return true;
                }
            }
        }
        return false;
    }
    private void MostrarBilletes() {
        BilletesDisponibles.put(100, 100);
        BilletesDisponibles.put(200, 100);
        BilletesDisponibles.put(500, 20);
        BilletesDisponibles.put(1000, 10);
    }
    public void cargaDeBilletes() {
        try {
            FileInputStream fileInputStream = new FileInputStream("billetes.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            BilletesDisponibles = (Map<Integer, Integer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            MostrarBilletes();
        }
    }

    public boolean actualizarBilletes(int cantidadRetiro) {
        List<Integer> denominaciones = new ArrayList<>(BilletesDisponibles.keySet());
        Collections.sort(denominaciones, Collections.reverseOrder());

        for (int billete : denominaciones) {
            int cantidadBilletes = BilletesDisponibles.get(billete);
            int cantidadNecesaria = cantidadRetiro / billete;
            int cantidadEntregada = Math.min(cantidadBilletes, cantidadNecesaria);
            cantidadRetiro -= cantidadEntregada * billete;
            BilletesDisponibles.put(billete, cantidadBilletes - cantidadEntregada);
        }
        guardarBilletes();
        return true;
    }

    public void guardarBilletes() {
        try {
            FileOutputStream fos = new FileOutputStream("billetes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(BilletesDisponibles);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}