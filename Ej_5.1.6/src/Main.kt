fun main() {
    val articulo1 = Articulo("Libro", 25.0)
    val articulo2 = Articulo("Cuaderno", 45.0)
    val ordenador1 = Ordenador("PC Gamer", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("PC Básico", 399.99)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    for (articulo in articulos) {
        articulo.promocionNavidad(20.0)
        println(articulo)
    }
}