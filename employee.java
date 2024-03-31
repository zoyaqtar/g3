import java.util.Scanner;
public class employee extends devops_eng {
    int id;
    String name;
    int salary;
    void read(){
        System.out.println("Enter id name and salary of employee");
        Scanner s=new Scanner(System.in);
        id=s.nextInt();
        name=s.next();
        salary=s.nextInt();
    }
    void display(){
        System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
    public static void main(String[] args) {
        employee e1=new employee();
        devops_eng d1=new devops_eng();        
        e1.read();       
        e1.display();
        d1.readbonus();
        System.out.println("Total salary is: "+d1.calculate());
    }
    
}
