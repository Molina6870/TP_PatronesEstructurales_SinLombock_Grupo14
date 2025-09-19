package Decorator;

public class PlanBasico implements Plan {

    @Override
    public String getDescripcion() {
        return "Plan Básico + ";
    }

    @Override
    public double calcularCosto() {
        return 1000;
    }
}

