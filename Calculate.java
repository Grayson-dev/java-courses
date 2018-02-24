public class Calculate {
    public static void main(String[] args) {
        double result;
        boolean error = false;
        
        System.out.println("Calculate...");
        
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[2]);
        switch (args[1]) {
            case "+":
                result = a + b;
                break;
            
            case "-":
                result = a - b;
                break;
            
            case "*":
                result = a * b;
                break;
            
            case "/":
                result = a / b;
                break;
            
            case "^":
                result = Math.pow(a, b);
                break;
            
            default:
                result = 0.0;
                error = true;
        }
        
        if (error)
            System.out.println("Unknown operation");
        else
            System.out.println("Result: " + result);
    }
}
