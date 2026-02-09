import java.util.Scanner;

class studentmark
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter mark of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        int maxTotal = n * 100;   
        double percentage = (double) total / maxTotal * 100;

        System.out.println("Total mark: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

