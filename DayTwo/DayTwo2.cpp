#include <iostream>
#include <fstream>
// AX BY CZ RPS 123 036
// XP YE ZG
using namespace std;
int main()
{
    ifstream fich("Input.txt");
    string valor;
    int punt = 0;
    while (fich >> valor)
    {
        string valor1 = valor;
        fich >> valor;
        string valor2 = valor;
        if (valor1 == "A" && valor2 == "X")
        {
            punt = punt + 3;
        }
        if (valor1 == "A" && valor2 == "Y")
        {
            punt = punt + 4;
        }
        if (valor1 == "A" && valor2 == "Z")
        {
            punt = punt + 8;
        }
        if (valor1 == "B" && valor2 == "X")
        {
            punt = punt + 1;
        }
        if (valor1 == "B" && valor2 == "Y")
        {
            punt = punt + 5;
        }
        if (valor1 == "B" && valor2 == "Z")
        {
            punt = punt + 9;
        }
        if (valor1 == "C" && valor2 == "X")
        {
            punt = punt + 2;
        }
        if (valor1 == "C" && valor2 == "Y")
        {
            punt = punt + 6;
        }
        if (valor1 == "C" && valor2 == "Z")
        {
            punt = punt + 7;
        }
    }

    std::cout << punt << "*";
}