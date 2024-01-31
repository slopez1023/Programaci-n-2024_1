package Services;

import Dto.ContactoDto;

import java.util.List;

public interface ContactoService {

    List<ContactoDto> addContacto(ContactoDto contacto) throws Exception;

    List<ContactoDto> listContacto();

    boolean verifyContactoExists(String nombre);
}
