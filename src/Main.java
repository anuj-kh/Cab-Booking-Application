
public class Main {

    public static void main(String[] args) {
        CustomerDatabase cdb=new CustomerDatabase();
        cdb.openConnection();
        DriverDatabase ddb=new DriverDatabase();
        ddb.openConnection();
        LoginForm F=new LoginForm(cdb,ddb);
        Delay D=new Delay();
        
        Thread T1=new Thread(new Runnable()
        {
            public void run()
            {
                D.delay();
            }
        });
        Thread T2=new Thread(new Runnable()
        {
            public void run()
            {
                F.setVisible(true);
            }            
        });
        
        T1.start();
        T2.start();
    }
}
