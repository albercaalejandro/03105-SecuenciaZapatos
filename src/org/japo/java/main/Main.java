/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
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
package org.japo.java.main;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        final String VACA = "Vaca";
        final String OVEJA = "Oveja";
        final String BURRO = "Burro";
        final String GALLINA = "Gallina";
        final int C_VACA = 3;
        final int C_OVEJA = 14;
        final int C_BURRO = 2;
        final int C_GALLINA = 18;
        final int P_ANIMAL4 = 4;
        final int P_ANIMAL2 = 2;
        
        int pVaca = C_VACA*P_ANIMAL4;
        int pOveja = C_OVEJA*P_ANIMAL4;
        int  pBurro = C_BURRO*P_ANIMAL4;
        int pGallina = C_GALLINA *P_ANIMAL2;        
        int tPatas = pVaca+pOveja+pBurro+pGallina;
        int pares = tPatas/2;
        
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        System.out.println("Animal ........: "+VACA);
        System.out.println("Cantidad .......: "+C_VACA);
        System.out.println("Patas ..........: "+pVaca);
        System.out.println("---");
        System.out.println("Animal ........: "+OVEJA);
        System.out.println("Cantidad .......: "+C_OVEJA);
        System.out.println("Patas ..........: "+pOveja);
        System.out.println("---");
        System.out.println("Animal ........: "+BURRO);
        System.out.println("Cantidad .......: "+C_BURRO);
        System.out.println("Patas ..........: "+pBurro);
        System.out.println("---");
        System.out.println("Animal ........: "+GALLINA);
        System.out.println("Cantidad .......: "+C_GALLINA);
        System.out.println("Patas ..........: "+pGallina);
        System.out.println("---");
        System.out.println("Total de Patas .: "+tPatas);
        System.out.println("Total de Pares .: "+pares);
    }
}
