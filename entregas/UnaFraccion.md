# Una fracción

## Interfaz pública a implementar

|||
|-|-|
|public Fraccion(int numerador, int denominador) {}||
|public Fraccion(int numerador) {}||
|public Fraccion() {}||
|public Fraccion sumar(Fraccion fraccion) {}||
|public Fraccion sumar(int entero) {}||
|public Fraccion oponer() {}||
|public Fraccion restar(Fraccion fraccion) {}||
|public Fraccion restar(int entero) {}||
|public Fraccion multiplicar(Fraccion fraccion) {}||
|public Fraccion multiplicar(int entero) {}||
|public Fraccion invertir() {}||
|public Fraccion dividir(Fraccion fraccion) {}||
|public Fraccion dividir(int entero) {}||
|public Fraccion elevar(int exponente) {}||
|public int numerador() {}||
|public int denominador() {}||
|public boolean esMenor(Fraccion fraccion) {}||
|public boolean esMayor(Fraccion fraccion) {}||
|public boolean esIgual(Fraccion fraccion) {}||
|public double valueOf() {}||
|public int compareTo(Fraccion fraccion) {}||
|public String toString() {}||
|public Fraccion clone() {}||

## Tester

> [ClienteFraccion.java](ClienteFraccion.java)

### Salida esperada del tester:

```console
Constructor & .toString(): 2/3
Numerador:   [2]
Denominador: [3]
Sumar: 4/3
11/3
Oponer: -2/3
Restar: 0
-1/3
Multiplicar: 4/9
4/3
Invertir: 3/2
Dividir: 1
2/9
Elevar: 8/27
Es mayor: false
Es menor: false
Es igual: true
Es igual: 0
valueOf(): 0.6666666666666666
clone(): 2/3
```