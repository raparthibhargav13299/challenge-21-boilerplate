
class challenge21
{
    public static void main(String[]args)
{
int[] arr=new int[]{44,88,22,77,99};
sort (arr);
}

   
public static void sort(int[] arr)
 {

    int temp;

    for (int i = 0; i < 5; i++) 
    {
        for(int j=i;j<5;j++) 
        {
            if(arr[i]>arr[j]) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int num: arr) 
    {
        System.out.println(num);
    }
    }
}

