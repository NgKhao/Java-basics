
public class SapXepChon implements SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
	    int min;
	    for(int i = 0; i < n - 1; i++)
	    {
	        min = i;
	        for(int j = i + 1; j < n; j++)
	        {
	            if(arr[j] < arr[min])
	                min = j;
	        }
	        
	        if(min != i)
	        {
	        	double tmp = arr[min];
	        	arr[min] = arr[i];
	        	arr[i] = tmp;
	        }
	    }
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
	    int min;
	    for(int i = 0; i < n - 1; i++)
	    {
	        min = i;
	        for(int j = i + 1; j < n; j++)
	        {
	            if(arr[j] > arr[min])
	                min = j;
	        }
	        
	        if(min != i)
	        {
	        	double tmp = arr[min];
	        	arr[min] = arr[i];
	        	arr[i] = tmp;
	        }
	    }
	}

}
