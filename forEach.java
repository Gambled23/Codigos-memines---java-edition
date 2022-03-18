public class forEach {
    public static void main(String[] args) {
        String[] nombres = { "Pablo", "Cesar", "Ricardo", "Victor", "Massimo", "Alan", "Christian", "Elias",
                "Pablo malo" };
        for (int i = 0; i < nombres.length; i++) // El metodo length devuelve la longitud del arreglo
        {
        }
        /*
        El for each no necesita que le digas cuantas veces debe repetirlo, primero
        pones el tipo de dato, luego un nombre para la variable, dos puntos y el
        nombre del arreglo que quieras usar, y se hara en bucle hasta recorrer todo
        el arreglo
        */
        for (String i : nombres) {
            System.out.println(i); //Aqui el i es lo mismo que si pusieras nombres[i]
        }
    }
}
