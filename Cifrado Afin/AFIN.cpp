#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
using namespace std;
int mcd(int a, int b)
{
	int aux;
	while(b)
	{
		aux = b;
		b = a % b;
		a = aux;
	}
	return a;
}

long* alg_euc_ext(int n1,int n2) // n1 es a y n2 es b
{   
	long array[3],x=0,y=0,x2 = 1,x1 = 0,y2 = 0,y1 = 1,q = 0, r = 0;
	if(n2==0)
	{
		array[0]=n1;
		array[1]=1; 
		array[2]=0;  
	}
	else
		{
			while(n2>0) 
			{
				q = (n1/n2); 
				r = n1 - q*n2; 
				x = x2-q*x1; 
				y = y2 - q*y1; 
				n1 = n2; 
				n2 = r; 
				x2 = x1; 
				x1 = x; 
				y2 = y1;             
				y1 = y; 
			}
			array[0] = n1;   // mcd (n1,n2)
			array[1] = x2;   // x
			array[2] = y2;   // y
		}
	return array;
}

long Inverso_Zn(int a,int n)
{
	long* ptr,array[3];
	ptr=alg_euc_ext(n,a);
	
	array[0]=*ptr;
	array[1]=*(ptr+1);
	array[2]=*(ptr+2);
	
	if(array[0]!=1)
		return -1;
	else
		{
			if(array[2]<0)
				array[2]+=n;
			return array[2];
		}  
}

int main(void)
{
	int opcion,n=26;
	int a,b,nume,ll,cc;
	int a1,b1,a11,lll,numero,ccc1;
	char alfabeto[27]={'a','b','c','d','e','f','g','h','i','j','k',
		'l','m','n','o','p','q','r','s','t','u','v',
		'w','x','y','z'};
	while(1)
	{
		system("cls");
		cout<<"\t\tCIFRADO DE AFIN";
		cout<<"\n\n\n1. Encriptar ";
		cout<<"\n2. Desencriptar ";
		cout<<"\n\nIngrese opcion: ";
		cin>>opcion;
		switch(opcion)
		{
		case 1:  
			{
				system("cls");
				char palabraa[30],criptoo[30];
				
				cout<<"\t\tENCRIPTACION CON EL CIFRADO DE AFIN";
				cout<<"\n\n\nIngrese a: ";
				cin>>a;
				cout<<"\nIngrese b: ";
				cin>>b;
				cout<<"\nIngrese palabra a encriptar(sin espacios): ";
				cin>>gets(palabraa);
				ll=strlen(palabraa);
				strlwr(palabraa);
				for(int i=0;i<ll;i++)
				{
					for(int j=0;j<26;j++)
					{   
						if(palabraa[i]==alfabeto[j])
						{
							
							nume=j;
							cc=(a*nume+b)%26;
							criptoo[i]=alfabeto[cc];  
						}
					}
				}
				cout<<"\nResultado :";
				for(int k=0;k<ll;k++)
				{
					cout<<criptoo[k];
				}
				getch();
				break;
			}
		case 2:
			{   
				system("cls");
				char palabraaa[30],criptooo[30];
				
				cout<<"\tDESENCRIPTACION CON EL CIFRADO DE AFIN";
				cout<<"\n\n\nIngrese a: ";
				cin>>a1;
				while(mcd(a1,26)!=1)
				{
					
					cout<<"\n\n\nTiene que cumplir que mcd(a,26)=1 ";
					cout<<"\n\n\nIngrese a: ";
					cin>>a1;
				}
				cout<<"\nIngrese b: ";
				cin>>b1;
				cout<<"\nIngrese palabra a desencriptar: ";
				cin>>gets(palabraaa);
				a11=Inverso_Zn(a1,n);
				lll=strlen(palabraaa);
				strlwr(palabraaa);
				for(int i=0;i<lll;i++)
				{   
					for(int j=0;j<26;j++)
					{
						if(palabraaa[i]==alfabeto[j])
						{
							
							numero=j;
							ccc1=(a11*(numero-b1))%26;
							if(ccc1<0)
								ccc1=ccc1+26;
							criptooo[i]=alfabeto[ccc1];  
						}
					}
				}
				cout<<"\nResultado :";
				for(int k=0;k<lll;k++)
				{
					cout<<criptooo[k];
				}
				getch();
				break;
			}
		case 3: 
			{
				break;
			default: cout<<"\nOpcion incorrecta";
			}
		}
	}
}
