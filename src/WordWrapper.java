public class WordWrapper {
    public static String wrap(String linea, int i) {
        linea = linea.replace("  ", " ").trim();
        if (linea.length() <= i) {
            return linea;
        }

        int espacio = linea.substring(0, i).lastIndexOf(' ');
        if(espacio != -1){
            return calcular(linea,espacio,i);
        }

        if (linea.charAt(i)   == ' '){
            return calcular(linea,i,i);
        }

        return linea.substring(0,i) + "\n" + wrap(linea.substring(i), i);
    }

    public static String calcular(String linea, int espacio, int i) {
        return linea.substring(0, espacio) + "\n" + wrap(linea.substring(espacio + 1), i);
    }

}














