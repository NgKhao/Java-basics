
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		try {
			return a / b;
		} catch (Exception e) {
			return 0;
		}
	}
	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		double key;
	    int i, j;
	    for( i = 1; i < n; i++)
	    {
	        key = arr[i];
	        // duyệt ngược các ptu trước arr[i]
	        j = i - 1;
	        while(j >= 0 && arr[j] > key)
	        {
	            arr[j + 1] = arr[j];
	            j--;
	        }
//	        duyệt ngược đến khi key lớn nhất thì gán nó cho vị trí đc chọn
	        arr[j + 1] = key;
	    }
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		double key;
	    int i, j;
	    for( i = 1; i < n; i++)
	    {
	        key = arr[i];
	        // duyệt ngược các ptu trước arr[i]
	        j = i - 1;
	        while(j >= 0 && arr[j] < key)
	        {
	            arr[j + 1] = arr[j];
	            j--;
	        }
//	        duyệt ngược đến khi key lớn nhất thì gán nó cho vị trí đc chọn
	        arr[j + 1] = key;
	    }
	}

}
