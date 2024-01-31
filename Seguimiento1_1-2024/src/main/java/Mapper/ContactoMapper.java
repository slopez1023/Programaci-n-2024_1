package Mapper;

import Dto.ContactoDto;
import Models.Contacto;

import java.time.LocalDateTime;

public class ContactoMapper {
    public static Contacto mapFrom(ContactoDto dto){
        return new Contacto(dto.nombre(), dto.telefono(), LocalDateTime.now());
    }
    public static ContactoDto mapFrom(Contacto model){
        return new ContactoDto(model.getNombre(), model.getTelefono());
    }
}
