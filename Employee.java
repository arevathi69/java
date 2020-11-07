class Employee
    {
        public string name;
        public int salary;
        public int joiningDate;
        public string address;
public Employee()
        {

        }

        public Employee(string name, int salary, int joiningDate,string address)
        {
            this.name = name;
            this.salary = salary;
            this.joiningDate = joiningDate;
            this.address =  address;
        }

        public void GetEmployeeData()
        {
            {
                Console.WriteLine("Enter the name of employee: ");
                name = Convert.ToString(Console.ReadLine());
                Console.WriteLine("Enter the salary of employee: ");
                salary = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the date of joining of employee: ");
                joiningDate = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the address of employee;");
                address=Convert.ToString(Console.ReadLine());
            }
        }

        public void DisplayEmployee()
        {
            Console.WriteLine("The name of employee is: "+ name);
            Console.WriteLine("The salary of employee is: "+salary);
            Console.WriteLine("The date of joining of employee is: "+joiningDate);
            Console.WriteLine("The address of employee is:" + address);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employee[] e = new Employee[3];
            for(int i = 0; i < 3; i++)
            {
                 Console.WriteLine("$Enter the data of employee with id: {i} *****************************************");
                e[i] = new Employee();
                e[i].GetEmployeeData();
            }

            Console.WriteLine("***********The data of given employees is: ");

            for(int i = 0; i < 3; i++)
            {
                e[i].DisplayEmployee();
            }
        }
    }