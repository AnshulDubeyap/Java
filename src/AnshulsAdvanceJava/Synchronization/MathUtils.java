package AnshulsAdvanceJava.Synchronization;

 public class MathUtils {
	 // getMultiples method is being accessed by multiple threads(Thread1 and Thread2)
	 // right now they can access this method at the unorder sequence
	 // to avoid this, we need to make this method synchronized (by using synchronized keyword)

	 synchronized void getMultiples(int num){
		for(int i = 1; i <= 10; i++){
			System.out.println(num * i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
