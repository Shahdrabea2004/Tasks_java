public class Service_sum_Even_Number_Imp implements InnerService_Sum_Even_Number
{
    //OPP_3
    @Override
    public int sum_number(Sum_Even_Numbers sumNumbers) {

        if(sumNumbers.getNumber1()%2==0&&sumNumbers.getNumber2()%2==0&&sumNumbers.getNumber3()%2==0)
        {
            System.out.print("Sum of three Numbers : ");
            return sumNumbers.getNumber1()+sumNumbers.getNumber2()+sumNumbers.getNumber3();
        }
        System.out.print("Exsit odd Numbers in your Numbers.");
        return -1;
    }
    
}
