class Ordenador(nombre: String, precio: Double, val tipo: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {

    override fun promocionNavidad(porcentajeRebaja: Double): Double {
        if (precio > 500) {
            return precio - (precio * (porcentajeRebaja/100))
        }
        return precio
    }

}