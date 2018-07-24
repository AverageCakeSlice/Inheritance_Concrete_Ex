//PieceWorker -- Provides concrete implementation for workers paid by product produced, and extends abstract class Employee
//CSIS 312-B03

public class PieceWorker extends Employee {
    
    //Instance variables
    private double wage;
    private int pieces;
    
    //Default constructor
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces){
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Wage per piece must be >= 0.0");
        
        if (pieces < 0)//validate number of pieces
            throw new IllegalArgumentException(
            "Number of pieces must be >= 0");
        
        this.wage = wage;
        this.pieces = pieces;
    }//end of constructor
    
    //Setters
    public void setWage(double wage){
        if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Wage per piece must be >= 0.0");
        
        this.wage = wage;
    }
    
    public void setPieces(int pieces){
        if (pieces < 0)//validate number of pieces
          throw new IllegalArgumentException(
            "Number of pieces must be >= 0");
        
        this.pieces = pieces;
    }
    
    //Getters
    public double getWage(){
        return wage;
    }
    
    public int getPieces(){
        return pieces;
    }
    
    //calculate earnings, overrides earnings method in abstract class Employee
    @Override
    public double earnings(){
        return wage * (double)pieces;
    }
    
    //specific implementation of toString, overrides method in abstract class Employee
    @Override
    public String toString(){
        return String.format("Piece Worker employee: %s%n%s: $%.2f%n%s: %d",
                super.toString(),"Wage per piece", getWage(),"Pieces produced", getPieces());
    }
    
}//end of concrete subclass PieceWorker
