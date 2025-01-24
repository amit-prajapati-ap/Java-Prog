package Collection_Java;
class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot Add 8 & 9";
    }
    @Override
    public String getMessage() {
        return "Cannot Add 8 & 9";
    }
}
class CannotDivideByZero extends Exception {
    @Override
    public String toString() {
        return "Cannot Divide By 0";
    }
    @Override
    public String getMessage() {
        return "Cannot Divide By 0";
    }
}
class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Max Input Exception";
    }
    @Override
    public String getMessage() {
        return "Max Input Exception";
    }
}
class MultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input Cannot be Greater Then 1000";
    }
    @Override
    public String getMessage() {
        return "Input Cannot be Greater Then 1000";
    }
}
class NegetiveInputException extends Exception {
    @Override
    public String toString() {
        return "Input Cannot be Negative";
    }
    @Override
    public String getMessage() {
        return "Input Cannot be Negative";
    }
}
class CustomCalculator{
    double add(double a,double b) throws InvalidInputException , MaxInputException{
        if (a > 10000 || b > 10000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double sub(double a,double b) throws NegetiveInputException, MaxInputException {
        if(a < 0 || b < 0) {
            throw new NegetiveInputException();
        }
        if (a > 10000 || b > 10000) {
            throw new MaxInputException();
        }
        return a - b;
    }
    double multi(double a,double b) throws MultiplyInputException{
        if (a > 1000 || b > 1000) {
            throw new MultiplyInputException();
        }
        return a * b;
    }
    double div(double a,double b) throws CannotDivideByZero , MaxInputException{
        if (a > 10000 || b > 10000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZero();
        }
        return a / b;
    }
}
public class Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException , CannotDivideByZero, MaxInputException , MultiplyInputException , NegetiveInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
//        c.sub(-2,9);
//        c.div(8,12000);
//        c.multi(234,1200);
    }
}
