import junit.framework.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        HomeWork1 hw = new HomeWork1();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num: ");
        int someNum = Integer.parseInt(reader.readLine());
        int someNum1 = Integer.parseInt(reader.readLine());
        int someNum2 = Integer.parseInt(reader.readLine());
        double someDouble = Double.parseDouble(reader.readLine());
        double someDouble1 = Double.parseDouble(reader.readLine());
        double someDouble2 = Double.parseDouble(reader.readLine());
        double someDouble3 = Double.parseDouble(reader.readLine());


        int []a1 = {1,4,2,5,7,4,5,6,0,8};
        double []b = {2.3, 4.5, 2.1, 1.9};

        Assert.assertEquals(120, hw.factNum(5));
        Assert.assertNotNull("Good result: +",hw.getDistance(someDouble,someDouble1,someDouble2,someDouble3));
        Assert.assertNotNull("triangle exist? ",(hw.triangleExist(someNum,someNum1,someNum2)));
        hw.triZero(hw.factNum(someNum));
        Assert.assertNotNull(hw.inMtela(65,1.72));
        hw.triNumbersSame();
        hw.basseinLitrov(2,4,3);
        hw.dvoe4niki(a1);
        hw.currencyExchange(b, (hw.inMtela(65, 1.72)));
        hw.stroka(someNum);
        hw.summa(7,4,3);
        hw.triangleSquare(4,7,5);
        hw.summyFactNechChisel();
        hw.buy(2700);
    }
}
