class Addition{
public static void main(String []args){
int[][] a={{1,1,1,}};
int[][] b={{1,1,1},{2,2,2}};
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