#include<iostream>
#include<cstdlib>
#include<string.h>
#include<conio.h>
using namespace std;

string alfabeto = "abcdefghijklmnopqrstuvwxyz";

void encriptardoVigenere (){
	string texto, clave, encriptar;
	cout<<"\n\n\t INGRESE TEXTO(SIN ESPACIO): ";cin>>texto;
	cout<<"\n\n\t INGRESE CLAVE: ";cin>>clave;
	
	int tamtexto = texto.size(); 
	int tamclave = clave.size(); 
	int postexto , posclave;
	if ( tamtexto > tamclave){
		for ( int i = 0; i < texto.size(); i++){
			clave += clave [i];
			//cout<<" "<<clave [i];
		}
		for ( int i = 0; i < texto.size(); i++){
			postexto = alfabeto.find(texto[i]);
			posclave = alfabeto.find(clave[i]); 
			encriptar += alfabeto[(postexto + posclave)%26];
		}
	}else {
		for ( int i = 0; i < texto.size(); i++){
			postexto = alfabeto.find(texto[i]);
			posclave = alfabeto.find(clave[i]); 
			encriptar += alfabeto[(postexto + posclave)%26];
		}
	}
	// mostrar texto encriptado
	cout<<"\n\n\t TEXTO ENCRIPTADO:  ";
	for (int i = 0 ; i < texto.size() ; i++){
		cout<<encriptar[i];
	} 
}

void desencriptar(){
	string texto, clave, desencriptar;
	int resultado;
	
	cout<<"\n\n\t INGRESE TEXTO(SIN ESPACIO): ";cin>>texto;
	cout<<"\n\n\t INGRESE CLAVE: ";cin>>clave;
	
	int tamtexto = texto.size(); 
	int tamclave = clave.size(); 
	int postexto , posclave;
	
	if ( tamtexto > tamclave){
		for ( int i = 0; i < texto.size(); i++){
			clave += clave [i];
			//cout<<" "<<clave [i];
		}
		for ( int i = 0; i < texto.size(); i++){
			postexto = alfabeto.find(texto[i]);
			posclave = alfabeto.find(clave[i]); 
			resultado = postexto - posclave;
			if ( resultado < 0){
				resultado = 26 + resultado;
				desencriptar += alfabeto[resultado%26];
			}
			else{
				desencriptar += alfabeto[resultado%26];
			}         
		}
	}else {
		for ( int i = 0; i < texto.size(); i++){
			postexto = alfabeto.find(texto[i]);
			posclave = alfabeto.find(clave[i]); 
			resultado = postexto - posclave;
			if ( resultado < 0){
				resultado = 26 + resultado;
				desencriptar += alfabeto[resultado%26];
			}
			else{
				desencriptar += alfabeto[resultado%26];
			}
		}
	} 
	cout<<"\n\n\t TEXTO DESENCRIPTADO:  ";
	for (int i = 0 ; i < texto.size() ; i++){
		cout<<desencriptar[i];
	}
}
int main (void)
{
	
	string alfabeto = "abcdefghijklmnopqrstuvwxyz";
	int opcion;
	cout<<"\n\n\t\t CIFRADO DE VIGENERE";
	cout<<endl;
	cout<<endl;
	cout<<"1. ENCRIPTAR ";
	cout<<endl;
	cout<<"2. DESENCRIPTAR";
	cout<<endl;
	cout<<endl;
	cout<<"INGRESAR OPCION: ";
	cin>>opcion;
	
	switch(opcion)
	{
		
	case 1:
		{
			
			encriptardoVigenere ();
			getch(); 
			break;
		}
	case 2:
		{
			
			desencriptar();
			getch(); 
			break;
		}
		system("pause");
	}
}
	
