
import java.util.Scanner;
public class mock_final
{
    public static void main(String[] args)
    {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of planet");
        String planet_name= sc.nextLine();
        double distance=0;
        int index=-1;
        for (int j=0; j<planets.length;j++)
        {
            if (planet_name.equalsIgnoreCase(planets[j]))
            {
                index=j;
                break;
            }
            if (index == -1) 
            {
             System.out.println("Invalid Input");
             return;
            }
         double closest_distance=99999999;
         int closest_index=0;
         for(int i = 0; i < planets.length; i++) 
         {
         if (i != index) 
         {
            distance = Math.sqrt(
            Math.pow(x_coordinates[i] - x_coordinates[index], 2) +
            Math.pow(y_coordinates[i] - y_coordinates[index], 2) +
            Math.pow(z_coordinates[i] - z_coordinates[index], 2));
         

         if (distance < closest_distance) 
         {
            closest_distance = distance;
            closest_index = i;
         }
        }
     }

        System.out.println("Closest planet: "+planets[closest_index]);
        System.out.println("Distance: "+closest_distance);
    }
}