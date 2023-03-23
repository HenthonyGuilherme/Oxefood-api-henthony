package br.com.ifpe.Oxefood.util.entity;

import br.com.ifpe.Oxefood.util.exception.PreenchimentoException;

public abstract class GenericController {
 
    protected void validarPreenchimentoChave(String chave) {

        if (chave == null || chave.equals("")) {
            throw new PreenchimentoException(PreenchimentoException.MSG_CHAVE_NAO_INFORMADA);
        }
    }
}

