
import java.util.Random;

class Usuario {
    private String nombreUsuario;
    private int nip;
    private int saldo;

    public Usuario(String nombreUsuario, int nip) {
        this.nombreUsuario = nombreUsuario;
        this.nip = nip;
        this.saldo = new Random().nextInt(49000) + 1000;
    }

    public String getNombre() {
        return nombreUsuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean Acceso(String nombre, int nip) {
        return this.nombreUsuario.equalsIgnoreCase(nombre) && this.nip == nip;
    }

    public boolean retirarEfectivo(int monto) {
        if (monto < 100 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }


}