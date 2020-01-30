/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Cosa implements ICosa, Serializable {

    private static final long serialVersionUID = 1L;

    public static final boolean DEF_COMESTIBLE_OK = false;

    private boolean comestibleOK;

    public Cosa() {
        comestibleOK = DEF_COMESTIBLE_OK;
    }

    public Cosa(boolean comestibleOK) {
        this.comestibleOK = comestibleOK;
    }

    public boolean isComestibleOK() {
        return comestibleOK;
    }

    public void setComestibleOK(boolean comestibleOK) {
        this.comestibleOK = comestibleOK;
    }

    @Override
    public final boolean equals(Object o) {
        boolean testOK;
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Cosa)) {
            testOK = false;
        } else {
            testOK = comestibleOK == ((Cosa) o).isComestibleOK(); //Haces un casting del objeto 
            //referenciado a Cosa con unos parentesis dobles para que primero haga el casting.
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.comestibleOK ? 1 : 0);
        return hash;

        //Otra forma de hacerlo: con un ternario. Numero que identifica que comestibleOK es true, 
        //return comestibleOK ? 1 : 0;
    }

    @Override
    public String toString() {
        //Get name:Nombre de paquete + nombre de la clase
        //Get simple name: solo nombre de la clase
        return String.format("%s: %s comestible",
                getClass().getSimpleName(), comestibleOK ? "SI" : "NO");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

}
