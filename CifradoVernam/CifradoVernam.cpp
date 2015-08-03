#include<iostream>
#include<bitset>
#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
using namespace std;

void algorCifraVernam(char *cadena, char *clave){
	
	char textEn[100];
	
	int tamCad,tamCla,cad,clav;
	int output[100][100];
	
	tamCad=strlen(cadena);
	tamCla=strlen(clave);
	
	strcpy(textEn,cadena);
	
	if(tamCad==tamCla){
		
		for(int i=0;i<tamCad;i++){
			for(int j=0;j<7;j++){
				cad=(cadena[i]>>(6-j))&1;
				clav=(clave[i]>>(6-j))&1;
				output[i][j]=cad^clav;
			}
		}
		cout<<"TEXTO CIFRADO: ";
		for(int i=0;i<tamCad;i++){
			for(int j=0;j<7;j++)
				if(j==6)
				{cout<<output[i][j];}
		}
		cout<<"\n";
	}else
		cout<<"LA LONGUITUD DE LA CADENA Y LA CLAVE DEBE DE SER LA MISMA";
}


void descripVernam(char *cadena, char *clave){
	
	char textEn[100];
	
	int tamCad,tamCla;
	int output[100];
	
	tamCad=strlen(cadena);
	tamCla=strlen(clave);
	
	strcpy(textEn,cadena);
	
	if(tamCad==tamCla){
		
		for(int i=0;i<tamCad;i++){      
			output[i]=cadena[i]^clave[i];
		}
		cout<<"TEXTO DESCIFRADO: ";
		for(int i=0;i<tamCad;i++){   
			cout<<output[i];   
		}
		cout<<"\n";
	}else
		cout<<"LA LONGUITUD DE LA CADENA Y LA CLAVE DEBE DE SER LA MISMA";
	
}

int main()
{
	char cadena[100];
	char clave[100];
	int opcion;
	while(1)
	{
		system("cls");
		cout<<"\n\t\tALGORITMO DE VERNAM\n\n";
		cout<<"1. ENCRIPTAR\n";
		cout<<"2. DESENCRIPTAR\n";
		cout<<"INGRESE OPCION: ";
		cin>>opcion;
		switch(opcion)
		{
		case 1: 
			{
				system("cls");
				cout<<"\n\t\tALGORITMO DE VERNAM  -  CIFRADO \n\n";
				cout<<"INGRESE TEXTO: ";
				fflush(stdin);
				gets(cadena);
				
				cout<<"INGRESE CLAVE: ";
				fflush(stdin);
				gets(clave);
				algorCifraVernam(cadena,clave);
				getch(); 
				break;
			}
		case 2:
			{
				system("cls");
				cout<<"\n\t\tALGORITMO DE VERNAM  -  DESCIFRADO \n\n";
				cout<<"INGRESE TEXTO: ";
				fflush(stdin);
				gets(cadena);
				cout<<"INGRESE CLAVE: ";
				fflush(stdin);
				gets(clave);
				descripVernam(cadena,clave);
				getch(); 
				break;
			}
		}
	}
	system("pause");
}
