package Decorator;

// Decorador para HD
public class HD extends PlanDecorator {

    public HD(Plan plan) {
        super(plan);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 500;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "HD + ";
    }
}
