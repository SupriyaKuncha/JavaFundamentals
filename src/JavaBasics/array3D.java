package JavaBasics;

public class array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr3d = {
	             {
	              {1,2,3,4},
                  {5,6,7,8},
                  {1,3,5,7} 			                  
	             } ,
	             {
	               {11,21,31,41},
	               {15,16,17,18},
	               {12,32,52,72}
	             }
	             
              };	
		for(int[][] row : arr3d) {
			for(int num[] : row ) {
				for(int coloum: num) {
					System.out.print(coloum + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
//for (int i=0; i<arr3d.length; i++) { // layers
//			
//			for(int j=0; j < arr3d[i].length ; j++) {
//				
//				for(int k=0; k <arr3d[i][j].length ; k++) {
//					
//					System.out.print(arr3d[i][j][k]+ " ");
//				}
//				System.out.println();
//				
//			}
//			System.out.println();
//			
//		}

	}

}
