public class Main {
    //public : Access Modifier
    //static : Access Specifier - Loads into stack memory which can be accessed by multiple object - single copy
    //void : return type
    //main : Starting point of execution
    //String args : A string of arguments taken in by main method
    public static void main(String[] args) {
        double salaryPerHour = 100;
        double workHour;
        double dailyWage;
        int isPresent = 1;
        int attendance = (int)(Math.random()*10);
        if(attendance%2 == isPresent){
            workHour = 8;
            System.out.println("Employee is present");
        }else{
            workHour = 0;
            System.out.println("Employee is absent");
        }
        dailyWage = workHour*salaryPerHour;
        System.out.println("Daily wage of employee is : "+dailyWage);
    }
}


//git init : used to initialize local repo : done once
//git add : used to stage all the file to save int in the current version : used multiple
//git commit -m : used to commit or save the build in the local machine
//git branch -M main : to rename master to main : done once
//git remote add origin url : it store the url link in the keyword origin : used once
//git push -u origin main : push the code to remote repository
//git checkout : command to change branch, -b is used to create a branch,