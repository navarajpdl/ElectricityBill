import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GenerateBill {

    public static void main(String args[]) throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("enter the name of plan which bill will be generated");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String planName = br.readLine();
        System.out.println("Enter the number of units for bill be calculated:"  );
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount for " + planName+ " of "  + units+ "  unit is: ");
        p.getRate();
        p.calculate(units);

}}
