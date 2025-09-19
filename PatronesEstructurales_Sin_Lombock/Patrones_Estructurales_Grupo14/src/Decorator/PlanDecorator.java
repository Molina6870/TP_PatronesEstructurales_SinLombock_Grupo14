package Decorator;

// Clase abstracta que envuelve cualquier plan y delega sus métodos
public abstract class PlanDecorator implements Plan {

    protected Plan plan;

    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String getDescripcion() {
        return plan.getDescripcion();
    }

    @Override
    public double calcularCosto() {
        return plan.calcularCosto();
    }
}

