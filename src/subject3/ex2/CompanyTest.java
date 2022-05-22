package subject3.ex2;

public class CompanyTest {

    public static void main(String[] args) {

        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();

//        Company company = new Company() 오류

        System.out.println( myCompany1 == myCompany2 );
    }
}