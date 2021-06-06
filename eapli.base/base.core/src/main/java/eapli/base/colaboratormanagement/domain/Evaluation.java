package eapli.base.colaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;

public class Evaluation implements ValueObject, Comparable<Evaluation> {

    private static final long serialVersionUID = 1L;

    private double evaluation;

    public Evaluation(final double evaluation) {
        if (evaluation==0.0) {
            throw new IllegalArgumentException(
                    "Evaluation should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.evaluation = evaluation;
    }

    protected Evaluation() {
        // for ORM
    }

    public static Evaluation valueOf(final double evaluation) {
        return new Evaluation(evaluation);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Evaluation)) {
            return false;
        }

        final Evaluation that = (Evaluation) o;
        return (this.evaluation==that.evaluation);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.evaluation);
    }

    @Override
    public String toString() {
        return String.valueOf(this.evaluation);
    }

    @Override
    public int compareTo(final Evaluation oEvaluation) {
        return Double.compare(this.evaluation, oEvaluation.evaluation);
    }
}
