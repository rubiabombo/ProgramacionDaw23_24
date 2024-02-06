package examen20230314.ej01;
import java.util.HashMap;
import java.util.Map;

class CajaSupermercado {
    private Map<String, Double> precios;
    private Map<String, Integer> carrito;

    public CajaSupermercado() {
        precios = new HashMap<>();
        carrito = new HashMap<>();
        // Agrega algunos productos con sus precios al mapa de precios
        precios.put("Manzanas", 1.0);
        precios.put("Pan", 0.5);
        precios.put("Leche", 1.2);
        precios.put("Chocolate", 2.5);
    }

    public void agregarProducto(String producto, int cantidad) {
        if (precios.containsKey(producto)) {
            carrito.put(producto, cantidad);
            System.out.println(cantidad + " " + producto + "(s) agregado(s) al carrito.");
        } else {
            System.out.println("El producto " + producto + " no está disponible.");
        }
    }

    public void eliminarProducto(String producto) {
        if (carrito.containsKey(producto)) {
            carrito.remove(producto);
            System.out.println("Producto " + producto + " eliminado del carrito.");
        } else {
            System.out.println("El producto " + producto + " no está en el carrito.");
        }
    }

    public void calcularTotal() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = precios.get(producto);
            total += cantidad * precioUnitario;
        }
        System.out.println("Total a pagar: " + total + " euros");
    }

    public void pagar(double cantidadAbonada) throws InsufficientFundsException {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = precios.get(producto);
            total += cantidad * precioUnitario;
        }

        if (cantidadAbonada < total) {
            throw new InsufficientFundsException("El dinero abonado no es suficiente. Faltan " + (total - cantidadAbonada) + " euros.");
        } else {
            System.out.println("Pago exitoso. Gracias por su compra.");
        }
    }
}