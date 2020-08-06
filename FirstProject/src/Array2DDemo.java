public class Array2DDemo {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int arr2D[][] = { {12,23,34,45,45}, {45,34,1}, {45,3}, {-45,43}, {45,45} };
//		System.out.println(arr2D);
		
		int arr3D[][][] = { 
				{ {12,23,34,45,45}, {45,34,1}, {45,3}, {-45,43}, {45,45} },
				{ {12,23,34,45,45}, {45,34,1}, {45,3}, {-45,43}, {45,45} },
				{ {12,23,34,45,45}, {45,34,1}, {45,3}, {-45,43}, {45,45} },
				{ {12,23,34,45,45}, {45,34,1}, {45,3}, {-45,43}, {45,45} }
		};
				
//		System.out.print("{");
//		for(int arr1D[] : arr2D) {
//			System.out.print("  [");
//			for(int element : arr1D) {
//				System.out.print(element + ", ");
//			}
//			System.out.println("]");
//		}
//		System.out.println("}");
//		
//		System.out.print("{");
//		for(int i = 0; i < arr2D.length; i++) {
//			int arr1D[] = arr2D[i];
//			System.out.print("  [");
//			for(int j = 0; j < arr1D.length; j++) {
//				int element = arr1D[j];
//				System.out.print(element + ", ");
//			}
//			System.out.println("]");
//		}
//		System.out.println("}");
		
//		System.out.print("{");
//		for(int i = 0; i < arr2D.length; i++) {
//			System.out.print("  [");
//			for(int j = 0; j < arr2D[i].length; j++) {
//				System.out.print(arr2D[i][j] + ", ");
//			}
//			System.out.println("]");
//		}
//		System.out.println("}");
		
		System.out.println("{");
		for(int i = 0; i < arr3D.length; i++) {
			System.out.print("[");
			for(int j = 0; j < arr3D[i].length; j++) {
				System.out.print("  (");
				for(int k = 0; k < arr3D[i][j].length; k++) {
					System.out.print(arr3D[i][j][k] + ", ");
				}
				System.out.println(")");
			}
			System.out.println("]");
		}
		System.out.println("}");
		
		

	}

}
