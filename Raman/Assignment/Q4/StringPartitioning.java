class StringPartitioning{
	
	static int[][] cuts;
	public static void main(String s[]){
		System.out.println("Enter String : ");
		String str = new java.util.Scanner(System.in).nextLine();
		int len = str.length();
		cuts = new int[len][len];
		for(int i = 0;i<len;i++)
			for(int j = 0;j<len;j++)
				cuts[i][j] = len-1;
		makePartition(str);
		System.out.println("Minimum number of cuts : "+cuts[0][len-1]);
	}
	
	public static int makePartition(String s){
		int minCuts = 0;
		int len = s.length();
		for(int i=1;i<=len;i++){
			for(int j=0;j<=len-i;j++){
				if(isPallindrom(s.substring(j,j+i)))
					cuts[j][j+i-1] = 0;
				else{
					for(int k = j;k<j+i-1;k++){
						cuts[j][j+i-1] = Math.min(1+cuts[j][k]+cuts[k+1][j+i-1],cuts[j][j+i-1]);
					}
				}
				
			}
		}
		return minCuts;
	}
	
	
	
	public static boolean isPallindrom(String s){
		
		return s.equals(new StringBuffer(s).reverse().toString());
	}
}
