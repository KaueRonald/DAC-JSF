package com.jsf.atividade.conversores;

import com.jsf.atividade.models.Dependente;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("conversor")
public class DependenteConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        String uuid = String.valueOf(s);
        return uuid;
    }

    @Override
        public String getAsString(FacesContext ctx, UIComponent comp, Object obj) {
            Dependente dependente = (Dependente) obj;
            return dependente.getUuid();
        }
    }

