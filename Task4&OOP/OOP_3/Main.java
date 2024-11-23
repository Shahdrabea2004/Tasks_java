public class Main {
    public static void main(String[] args) {
        
        //OOP_3
        Sum_Even_Numbers sumNumber=new Sum_Even_Numbers();
        sumNumber.setNumber1(1);
        sumNumber.setNumber2(4);
        sumNumber.setNumber3(6);
        Service_sum_Even_Number_Imp ServiceImp=new Service_sum_Even_Number_Imp();
        System.out.println(ServiceImp.sum_number(sumNumber));
        
        
       

    }
    
}
