public class Primes {
    public static void main(String[] args) {
       int f = Integer.parseInt(args[0]);
       boolean[] prime= new boolean [f+1] ;
       for(int i=2;i<=f; i++ ){
        prime[i]=true;
       }
       int j=2;
       int i=j+1;
       while(j<=f){
        i= j+1;
        while (i<=f) {
          
           if(i%j==0){
            prime[i]=false;
           } 
           i++;

        }
    
        j++;
       }
       System.out.println("Prime numbers up to " + f+ ":");

       int t=0;
       int count=0;

       while(t<=f){
        if(prime[t]==true){
            System.out.println(t);
            count++;
        }
        t++;

       }
       
       System.out.println("there are "+ count + " primes between 2 and "+ f+ "("+(int)( (double)count/(double)f*100) +"% are primes)" );
    }


    }
