package Decorator;

// Decorador para Descargas Offline
public class DescargasOffline extends PlanDecorator {

    public DescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 700;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "Descargas Offline + ";
    }
}