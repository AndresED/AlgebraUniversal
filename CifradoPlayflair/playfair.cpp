#include<iostream> 
#include<string.h> 
#include<stdio.h> 
#include<stdlib.h> 
#include<conio.h> 
using namespace std;

bool comparar(char *clave,char a,int k){
	
	for(int i=0;i<k;i++){
		if(clave[i]==a)
			return false;
	}
	
	return true;
}

char *preMatriz(char *clave,char *letras,char *textCpy){
	
	int k=0,i=0; 
	bool band=true;  
	
	while(k<25){  
		
		if(clave[k]=='j')
			clave[k]='i'; 
		
		if(clave[k]!='\0' && band==true){ 
			if(clave[k]!=' ' && clave[k]> 96 && clave[k]<123){      
				if(comparar(clave,clave[k],k)){
					textCpy[i]=clave[k];
					i++;                          
				}  
			}
		}
		else{
			if(band==true)
				k=0;
			band=false;
			if(comparar(textCpy,letras[k],i)){
				textCpy[i]=letras[k];
				i++;                          
			}
		}     
		
		k++;
	}
	textCpy[25]='\0';
	//cout<<"i: "<<i;
	return textCpy;
}

char *agrupar(char *text,char *textAgru){
	
	int k=0,i=0;
	int cont=0;
	
	while(text[k]!='\0'){
		
		if(text[k]=='j')
			text[k]='i';
		
		if(text[k]!=' '){
			if(cont!=2){
				textAgru[i]=text[k];
				cont++;
				i++;
			}
			else{
				if(textAgru[i-2]==textAgru[i-1]){
					textAgru[i-1]='x';
					textAgru[i]=' ';
					textAgru[i+1]=text[k-1];
					k--;
					i+=2;
					cont=1;
				} 
				else{     
					textAgru[i]=' ';
					textAgru[i+1]=text[k];
					i+=2;
					cont=1;
				}
			}     
		} 
		k++; 
	}
	//cout<<"i: "<<i<<"\n";
	if(textAgru[i-2]==' '){ 
		textAgru[i]='x';
		textAgru[i+1]='\0';
	}
	else  
		textAgru[i]='\0';
	
	return textAgru;
}

void algoCifradoPlaySyFair(char *text,char *clave,char *letras){
	
	char textCpy[25];
	char textAgru[500]; 
	char matriz[5][5];
	int k=0,m=0,sum1,sum2;
	int f1,f2,c1,c2;
	bool band1=true,band2=true;
	
	strcpy(textCpy,preMatriz(clave,letras,textCpy));
	
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			matriz[i][j]=textCpy[k];
			k++;
		}
	}
	
	strcpy(textAgru,agrupar(text,textAgru));
	
	cout<<"\n"<<textAgru;
	
	while(textAgru[m]!='\0'){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(matriz[i][j]==textAgru[m] && band1==true){     
					f1=i;
					c1=j;
					band1=false;
				}           
				if(matriz[i][j]==textAgru[m+1] && band2==true){     
					f2=i;
					c2=j;
					band2=false;
				}
			}
		}
		
		if(f1==f2){
			sum1=c1+1;
			sum2=c2+1;
			if(sum1> 4)
				textAgru[m]=matriz[f1][0];
			else
				textAgru[m]=matriz[f1][c1+1];
			
			if(sum2> 4)
				textAgru[m+1]=matriz[f2][0];
			else  
				textAgru[m+1]=matriz[f2][c2+1];
		}
		else if(c1==c2){
			sum1=f1+1;
			sum2=f2+1;
			
			if(sum1> 4)
				textAgru[m]=matriz[0][c1];
			else
				textAgru[m]=matriz[f1+1][c1];
			
			if(sum2> 4)
				textAgru[m+1]=matriz[0][c2];   
			else   
				textAgru[m+1]=matriz[f2+1][c2];   
		}else{
			textAgru[m]=matriz[f1][c2];  
			textAgru[m+1]=matriz[f2][c1];
		}
		
		m=m+3;
		band1=true;
		band2=true;
	}
	
	cout<<"\n\n";
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++)
			cout<<matriz[i][j]<<" ";   
		cout<<endl;
	}
	
	cout<<"\n"<<textAgru;
	
}

void descifradoPlaySyFair(char *text,char *clave,char *letras){
	
	char textCpy[25];
	char textAgru[500]; 
	char matriz[5][5];
	int k=0,m=0,sum1,sum2;
	int f1,f2,c1,c2;
	bool band1=true,band2=true;
	
	strcpy(textCpy,preMatriz(clave,letras,textCpy));
	
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			matriz[i][j]=textCpy[k];
			k++;
		}
	}
	
	strcpy(textAgru,agrupar(text,textAgru));
	
	cout<<"\n"<<textAgru;
	
	while(textAgru[m]!='\0'){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(matriz[i][j]==textAgru[m] && band1==true){     
					f1=i;
					c1=j;
					band1=false;
				}           
				if(matriz[i][j]==textAgru[m+1] && band2==true){     
					f2=i;
					c2=j;
					band2=false;
				}
			}
		}
		
		if(f1==f2){
			sum1=c1-1;
			sum2=c2-1;
			if(sum1<0)
				textAgru[m]=matriz[f1][4];
			else
				textAgru[m]=matriz[f1][c1-1];
			
			if(sum2<0)
				textAgru[m+1]=matriz[f2][4];
			else  
				textAgru[m+1]=matriz[f2][c2-1];
		}
		else if(c1==c2){
			sum1=f1-1;
			sum2=f2-1;
			
			if(sum1<0)
				textAgru[m]=matriz[4][c1];
			else
				textAgru[m]=matriz[f1-1][c1];
			
			if(sum2<0)
				textAgru[m+1]=matriz[4][c2];   
			else   
				textAgru[m+1]=matriz[f2-1][c2];   
		}else{
			textAgru[m]=matriz[f1][c2];  
			textAgru[m+1]=matriz[f2][c1];
		}
		
		m=m+3;
		band1=true;
		band2=true;
	}
	
	cout<<"\n\n";
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++)
			cout<<matriz[i][j]<<" ";   
		cout<<endl;
	}
	
	cout<<"\n"<<textAgru;
	
	
	
}

int main()
{ 
	char letras[25]={'a','b','c','d','e',
		'f','g','h','i','k',
		'l','m','n','o','p',
		'q','r','s','t','u',
		'v','w','x','y','z'}; 
	char text[500];
	char clave[250];
	int opcion;
	while(1)
	{
		system("cls");
		cout<<"\n\t\tALGORITMO PLAYFAIR\n\n";
		cout<<"1. ENCRIPTAR\n";
		cout<<"2. DESENCRIPTAR\n";
		cout<<"INGRESE OPCION: ";
		cin>> opcion;
		switch(opcion)
		{
		case 1: 
			{
				system("cls");
				cout<<"\t\tALGORITMO PLAYFAIR - CIFRAR\n";
				cout<<"INGRESAR TEXTO(SIN ESPACIOS): ";
				fflush(stdin);
				gets(text);
				
				cout<<"INGRESE CLAVE: ";
				fflush(stdin);
				gets(clave);
				algoCifradoPlaySyFair(text,clave,letras);
				getch(); 
				break;
			}
		case 2:
			{
				system("cls");
				cout<<"\t\tALGORITMO PLAYFAIR - DESCIFRAR\n";
				cout<<"INGRESAR TEXTO(SIN ESPACIOS): ";
				fflush(stdin);
				gets(text);
				
				cout<<"INGRESE CLAVE: ";
				fflush(stdin);
				gets(clave);
				descifradoPlaySyFair(text,clave,letras);
				getch(); 
				break;
			}
		}
	}
	system("pause");
	
}
