public int fibo(int n, int v1 = 0, int v2 = 1){
	if (n == 0) return v2;
	else return fibo(n-1, v2, v1+v2);
}