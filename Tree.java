package staj;
import java.util.Scanner ;  
public class Tree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Level of tree: ") ; 
		int max_level = input.nextInt() ; 
		input.close();
		int num_star=1,star_index=0,j;
		int num_space = (2*max_level)-1 ;
		int mid_index = (num_space/2) ; 
		for (int i=0;i<max_level;i++){
			star_index = num_star/2;
			j=0;
			while (j<num_space){
				if (j==(mid_index-star_index)){
					for (int k=0;k<num_star;k++){
						System.out.print("*");
						j++ ; 
					}
				}else{
					System.out.print(" ");
					j++ ; 
				}
			}
			num_star+=2;
			System.out.println("");
		}
	}
}
