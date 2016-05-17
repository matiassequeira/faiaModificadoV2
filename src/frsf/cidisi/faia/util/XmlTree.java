/*
 * Copyright 2007-2009 Georgina Stegmayer, Milagros Gutiérrez, Jorge Roa
 * y Milton Pividori.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package frsf.cidisi.faia.util;

import java.io.File;

import frsf.cidisi.faia.solver.search.NTree;

public class XmlTree {

    private static int fileIdx = 0;
    private static final String searchTreesDir = "searchTrees/";

    public static void printFile(NTree tree) {

        PrintOut print = null;

        try {
            // Si la carpeta que necesito no existe, la creo.
            File f = new File(searchTreesDir);
            if (!f.exists()) {
                f.mkdir();
            }
            print = new PrintOut(searchTreesDir + fileIdx + ".xml");
            fileIdx = fileIdx + 1;

            print.write(tree.toXml());

            print.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
