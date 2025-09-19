package Decorator;

// Decorador para Ultra HD
public class UltraHD extends PlanDecorator {

    public UltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "Ultra HD + ";
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 1000;
    }
}

