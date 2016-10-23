#include <stdio.h>
#include <conio.h>
#include <string.h>

int match(char[],char[]);

int main()
{
	char a[100], b[100];
	int posisi;
	
	printf("\n\t\tProgram untuk menentukan Substring dalam sebuah string\n");
	
	printf("\nMasukkan string: \n\t");
	gets(a);
	
	printf("\nMasukkan Substring :\n\t");
	gets(b);
	
	posisi=match(a,b);
	
	if(posisi!=-1){
		printf("\n\n\t\t\tSubstring ADA didalam string.\n\n");
	}
	else{
		printf("\n\n\t\t\tSubstring TIDAK ADA didalam string.\n\n");
	}
	getch();
	
	return 0;
}

int match(char text[],char pattern[]){
	int c,d,e,text_length,pattern_length,posisi=-1,x=0,y=0,z=0;
	
	text_length=strlen(text);
	pattern_length=strlen(pattern);
	
	if(pattern_length>text_length){
		return-1;
	}
	for(c=0;c<text_length-1;c++){
		posisi=e=c;
		
		for(d=0;d<pattern_length;d++){
			if(pattern[d]==text[e]){
				printf("\nDi %c Memenuhi",text[e]);
				e++;
				
				x=1;
				y=1;
				z++;
			}
			else{
				printf("\nDi %c Tidak memenuhi",text[e]);
				
				y=0;
				
				break;
			}
		}
		if(d==pattern_length){
			return posisi;
		}
	}
	if(x==00 && y==00){
		return -1;
	}
}
