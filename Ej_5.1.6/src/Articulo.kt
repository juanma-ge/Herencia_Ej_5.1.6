open class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var totalArticulos = 0
        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    private val id: Int = generarId()

    open fun promocionNavidad(porcentajeRebaja: Double): Double{
        return precio - (precio * (porcentajeRebaja/100))
    }

    override fun toString(): String {
        return "${nombre} - ${precio}€ (ID: ${id})"
    }

}