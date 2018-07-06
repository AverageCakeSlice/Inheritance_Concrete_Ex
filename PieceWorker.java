//PieceWorker class provides a concrete implementation of
//method earnings()  to calculate the worker's salary
//based on the number of pieces produced.
//Aaron Roach - CSIS_312-D01

public class PieceWorker extends Employee
{

    private double wage;
    private double pieces;

    public PieceWorker (String firstName, String lastName,
    String socialSecurityNumber, double wage, double pieces)
    {
        super(firstName, lastName, socialSecurityNumber);

        this.wage = wage;
        this.pieces = pieces;
    }
}