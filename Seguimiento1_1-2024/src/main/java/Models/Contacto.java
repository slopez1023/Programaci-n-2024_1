package Models;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Contacto implements Serializable {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono, LocalDateTime registerDate) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.registerDate = registerDate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public LocalDateTime getRegisterDate(LocalDateTime registerDate) {
        return registerDate;
    }
    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate  = registerDate;
    }
    private LocalDateTime registerDate;
}
