public class Test
{
    public static void main(String[] args) {
        int[] A = {1, 2,0 ,4,5,2,8,6, 7, 4};

          for(int i=0;i<A.length-2;i++)
          {
              for(int j=i+1;j<A.length-1;j++)
              {
                    if(A[i]+A[j]==9)
                    {
                        System.out.println(i+1+"-"+(j+1));
                    }
              }
          }
    }
}
