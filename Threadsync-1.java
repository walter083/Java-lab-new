
public class Threadsync{
	public static void main(String[] args){
		newThread nt=new newThread();
		
		Threaded thread1=new Threaded(nt,"thread1");
		Threaded thread2=new Threaded(nt,"thread2");
		thread1.start(); 
		thread2.start();
		
		
	}
}

class newThread {

    String name;
	 void printer(String name,long id){
		try{
			for(int i=0;i<5;i++){
				System.out.println("current thread: "+name+" "+" "+ id);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception generated");
		}
	}

}

class Threaded extends Thread{
    newThread nw;
    String name;
    long  id;
   Threaded(newThread t,String s) 
   {nw=t;
    name=s;
   }
    public void run()
    {
        synchronized(nw){
        id=currentThread().getId();
        nw.printer(name,id);}
    }
    
}


