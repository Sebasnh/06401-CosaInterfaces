/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.app;

import org.japo.java.entities.Cosa;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

        //Entidad 1
        
        Cosa ob1 = new Cosa();
        
        System.out.println("Cosa 1");
        ob1.mostrarInfo();
        System.out.println("Actualizando ...");
        ob1.setComestibleOK(true);
        ob1.mostrarInfo();

        System.out.printf("%n---%n%n");
        
        //Entidad 2
        Cosa ob2 = new Cosa();

        System.out.println("Cosa 2");
        ob2.mostrarInfo();
        System.out.println("Actualizando ...");
        ob2.setComestibleOK(false);
        ob2.mostrarInfo();

        System.out.printf("%n---%n%n");
        
        //Entidad 1 vd Entidad 2
        System.out.println(String.format("%s IGUALES",
                ob1.equals(ob2) ? "SI" : "NO"));

    }

}
