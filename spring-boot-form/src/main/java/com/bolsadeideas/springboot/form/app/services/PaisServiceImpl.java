package com.bolsadeideas.springboot.form.app.services;

import com.bolsadeideas.springboot.form.app.models.domain.Pais;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaisServiceImpl implements PaisService{

    private List<Pais> lista;
    public PaisServiceImpl() {
        this.lista = Arrays.asList(
                new Pais(1, "ES", "España"),
                new Pais(2, "MX", "México"),
                new Pais(3, "CL", "Chile"),
                new Pais(4, "AR", "Argentina"),
                new Pais(5, "PE", "Perú"),
                new Pais(6, "CO", "Colombia"));
    }

    @Override
    public List<Pais> listar() {
        return lista;
    }

    @Override
    public Pais obtenerPorId(Integer id) {
        Pais resultado = null;
        for(Pais pais: this.lista){
            if(id == pais.getId()){
                resultado = pais;
                break;
            }
        }
        return resultado;
    }
}
