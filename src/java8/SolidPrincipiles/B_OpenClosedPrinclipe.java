package java8.SolidPrincipiles;

// open for extension and closed for modification

class Arraylist{
	public final static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void sortDesc(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

class testOld{
	public static void main(String[] args) {
		int arr[] = {4,1,6,2,3,5};
		Arraylist.sort(arr);
		//or
		//Arraylist.sortDesc(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

//=========================================== ^==OLD =======================

interface RohitComparator{
	int compare(int value1,int value2);
}

class Arraylist2{
	public static void sort(int a[], RohitComparator comparator) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(comparator.compare(a[i], a[j])>0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

class AscComparator implements RohitComparator{

	@Override
	public int compare(int value1, int value2) {
		return value1 - value2;
	}
}

class DescComparator implements RohitComparator{

	@Override
	public int compare(int value1, int value2) {
		return value2 - value1;
	}
}

// Object or entities should be open for extension but closed for modification
public class B_OpenClosedPrinclipe {
	public static void main(String[] args) {
		int arr[] = {4,1,6,2,3,5};
		//Arraylist2.sort(arr,new AscComparator());
		//or
		Arraylist2.sort(arr,new DescComparator());
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
