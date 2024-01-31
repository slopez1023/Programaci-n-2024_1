package Services.impl;

import Dto.ContactoDto;
import Mapper.ContactoMapper;
import Models.Contacto;
import Services.ContactoService;
import Utils.Constantes;

import java.io.File;
import java.util.List;

public class ContactoServiceImpl implements ContactoService {

    private List<Contacto> contactoList;
    public ContactoServiceImpl(){
        contactoList = FileUtils.getContacto(new File(Contacto.PATH_CONTACTO));
    }
    public List<ContactoDto> listContacto(){
        return contactoList.stream().map(ContactoMapper::mapFrom).toList();
    }
    public boolean verifyContactoExists(String nombre){
        return contactoList.stream()
                .anyMatch(e->e.getNombre().equalsIgnoreCase(nombre));
    }
    public List<ContactoDto> addContacto(ContactoDto contacto)throws Exception{
        if (!verifyContactoExists(contacto.nombre())){
            contactoList.add(ContactoMapper.mapFrom(contacto));
            FileUtils.saveContacto(new File(Constantes.PATH_CONTACTO), contactoList);
            return contactoList.stream().map(ContactoMapper::mapFrom).toList();
        }
        throw new Exception("Ese contacto ya existe en la agenda");
    }

}
