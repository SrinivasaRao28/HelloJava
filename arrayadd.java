class Addition{
public static void main(String []args){
int[][] a={{5,5,5,},{6,6,6},{4,5,6}};
int[][] b={{8,8,8},{2,2,2},{3,4,5}};
int[][] c=new int[3][3];

for(int i=0;i<a.length;i++){
	
	
for(int j=0;j<b[0].length;j++){
	c[i][j]=0;
	for(int k=0;k<3;k++){
		
	
c[i][j] +=a[i][k]*b[k][j];

	}

System.out.print(c[i][j]+"  ");
}
System.out.println();
}
}
}