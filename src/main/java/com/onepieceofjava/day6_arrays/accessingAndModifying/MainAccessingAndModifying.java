package com.onepieceofjava.day6_arrays.accessingAndModifying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {

        String [] employeeNames = {"Shane","Nan","Nami","Robin"};
        double [] basesalary = { 50000,60000,70000,80000};
        int [] yearsOfService = { 5,7,3,10};
        boolean[] isLate = { true,false,false,true};


      for(String names : employeeNames){
          System.out.println(" Employee Names:"  + names);
      }


      for( int i = 0; i < yearsOfService.length;i++){
          if(yearsOfService[i] >= 5){
              double originalsalary = basesalary[i];
              basesalary[i] *= 1.10;
              System.out.printf("%s received a 10%% increase, Original Salary: Php %.2f, New Salary: %.2f %n",
                      employeeNames[i],                         originalsalary,             basesalary[i]);

          }
      }
        System.out.println();
        for( int i = 0; i < yearsOfService.length;i++){
            if(isLate[i] ){
                double originalsalary = basesalary[i];
                basesalary[i] -= 1.90;
                System.out.printf("%s was late , Original Salary: Php %.2f, New Salary: %.2f %n",
                        employeeNames[i],                         originalsalary,             basesalary[i]);

            }
        }


    }
}
