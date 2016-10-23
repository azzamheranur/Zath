/* Greedy Algorithm in java */
import java.io.DataInputStream;

class algoritmaGreedy
{
 public int i,j,k;

 // konstruktor
 algoritmaGreedy(){
 }

 // method untuk proses algoritma greedy
 void Greedy(int koin[], int hasil[],int jum[], int uang, int i)
 {
  int s [] = new int[uang];
 
  while(jum[i] < uang)
  {
   k=(int)(Math.random()*koin.length);
   s[hasil[i]] = koin[k];
  
   if((jum[i] + s[hasil[i]]) <= uang)
    System.out.print(s[hasil[i]]+" ");
  
   jum[i]+=s[hasil[i]];
   hasil[i]+=1;
  }
  System.out.print(" ");
 
  if (jum[i] == uang)
   System.out.println(" = "+hasil[i]+" koin");
   else
    System.out.println(" = Tidak ada solusi");
 }

 // method sorting
 void sorting(int data[], int n)
 {
  for(i=0;i<n-1;i++){
      for(j=0; j<n-1;j++)
       if(data[j]<data[j+1])
       {
        k=data[j];
        data[j]=data[j+1];
        data[j+1]= k;
       }
     }
 }

 // method untuk mencari solusi max n min
 void solusiGlobal(int data[],int jum[], int uang)
    {
     int bin[] = new int[data.length];
     j=0;
     for (i=0;i<data.length;i++)
     {
      if(jum[i]==uang){
       bin[j]=data[i];
       j+=1;
      }
     }
    
     sorting(bin,bin.length);
    
     k=0;
     for(i=0;i<bin.length;i++)
      if(bin[i] != 0)
       k+=1;
      
     System.out.println("nSolusi Minimum : "+bin[k-1]);
     System.out.println("Solusi Maximum : "+bin[0]);
 }
}

class main
{
 public static void main (String[] args) throws Exception
 {
  DataInputStream entri = new DataInputStream(System.in);
  System.out.print("Masukan jumlah uang yg di tukar: ");
  int uang = Integer.parseInt(entri.readLine());
  System.out.print("Masukkan banyaknya koin: ");
  int n = Integer.parseInt(entri.readLine());
  int koin[] = new int[n];
 
  for(int i = 0;i<n;i++)
  {
   System.out.print("Koin ke-"+(i+1)+" : ");
   koin[i] = Integer.parseInt(entri.readLine());
  }
 
  System.out.print("Masukkan batas iterasi: ");
  int batas = Integer.parseInt(entri.readLine());
  int hasil[] = new int [batas];
  int jum[] = new int [batas];
 

  // instansiasi objek greedy
  algoritmaGreedy g = new algoritmaGreedy();
   
  for(int i =0;i<batas;i++)
  {
   System.out.print("nSolusi ke-"+(i+1)+" = (");
   g.Greedy(koin,hasil,jum,uang,i);
  }
  g.solusiGlobal(hasil,jum,uang);
 }
}
