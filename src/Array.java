public class Array
{
    public static void main(String[] args)
    {
        int[] arr={4,2,2,3,3,2,1,4};
        for(int i=0;i< arr.length;i++){
            int c=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println(arr[i]);
            }
        }
    }
}
