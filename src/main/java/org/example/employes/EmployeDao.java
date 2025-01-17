package org.example.employes;

import java.util.ArrayList;
import java.util.List;

public class EmployeDao {

   public static List<Employe> getEmployeDetails(){

       List<Employe> employes = new ArrayList<>();
       employes.add(new Employe(1,"varun","IT","A",67877));
       employes.add(new Employe(2,"Lenin","CSE","B",7877));
       employes.add(new Employe(3,"Manish","Mangement","A",877));
       employes.add(new Employe(4,"Veer","Lead","c",167877));
       employes.add(new Employe(5,"Saud","Product","D",567877));

       return employes;
   }

}
