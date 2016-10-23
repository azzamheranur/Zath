#include<stdio.h>
#include<conio.h>
#define size 99

void sort(int[], int);

main(){
int x[size],i,uang,n,k,hasil[size];

	printf("\n Banyak Koin : ");
		scanf("%d",&n);
	printf("\n\n Masukkan Jenis Koin : \n");

	for (i=1; i<=n; i++){
		scanf("\n %d", &x[i]);
	}

	sort(x,n);
	
	printf("\n Koin yang tersedia : \n");
	
	for(i=1;i<=n;i++){
	printf("%d \n",x[i]);
	}
	
	printf("\n\n Masukkan nilai yang dipecah :");
	scanf("%d \n", &uang);
	for(i=1;i<=n;i++){
	hasil[i] = uang/x[i];
	uang = uang%x[i];
	k = uang%x[i];
	}
	
	for(i=1;i<=n;i++){
	printf("Keping %d",x[i]);
	printf("-an sebanyak : %d",hasil[i];
	printf("\n %d");
	} 
	
	printf("Sisanya adalah : %d",k);
	getch;
	return 0;
	}
	
void sort(int a[], int siz){
	int pass,hold,j;
	for (pass=1;pass<=siz-1;pass++){
	for (j=0lj<=siz-2;j++){
	if(a[j+1]<a[j+2]){
	hold = a[J+1];
	a[j+1] = a[j+2];
	a[j+2] = hold;
	}
	}
	}
	}
