import java.util.Scanner;
public class Tax {
    public static void main(String[]args){
        System.out.println("tax code tax amount");

        displayDetails();

    }

    public static void displayDetails()
    {
        int customernumber, salesamount, totalamountdue;
        String name;
        String taxcode;
        String NPF;
        float NRM;
        String BIZ;
        String PFN;
        String textcode;
        int counter = 1;
        do {

            while (counter < 1000)
                counter += 1;


          //  System.out.print("customer number:" + "");
            Scanner taxscan = new Scanner(System.in);
            customernumber = taxscan.nextInt();


            System.out.print("name:" + "");
            Scanner taxscan = new Scanner(System.in);
            name = taxscan.next();
            {
                System.out.print(" seles amount:");
                taxscan = new Scanner(System.in);
                salesamount = taxscan.nextInt();

                {

                    System.out.print("tax code:"+salesamount);
                    taxscan = new Scanner(System.in);
                    taxcode = taxscan.next();

                    {
                        if
                                (taxcode == NRM) {
                            System.out.print(NRM);
                             NRM= (float) ((6 / 100 * salesamount));
                        }


                    }
                    {
                        if
                                (taxcode == PFN) {
                            System.out.print(PFN);
                             PFN=(float)(0/100*salesamount);
                            {
                                if

                                (taxcode == BIZ)
                                 System.out.print(BIZ);
                               // BIZ=(float)(4.5/100*salesamount);

                        } else System.out.println("invalid  !");
                        switch (taxscan.next()) {
                        }
                    }
                    }

                }


        }