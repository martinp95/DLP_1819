#Diseño de lenguajes de programación
Creación de un compilador
#Ejemplo de sintaxis del compilador
/*
NOTA. Este ejemplo solo pretende mostrar la sintaxis del lenguaje mediante fragmentos de código inconexos. 
No está pensado para ser ejecutado ya que realiza ninguna tarea concreta.

Aclaraciones:
- La sintaxis tiene que ser obligatoriamente la que se muestra en este ejemplo
- Las declaraciones de funciones y variables globales pueden venir en cualquier orden.
- Si la función no tiene valor de retorno no se pone nada entre los paréntesis de los parámetros y las llaves de las sentencias
- Las funciones deben tener paréntesis aunque no tengan parámetros
- Una función podrá declarar variables locales solo al inicio de su cuerpo. Por tanto no podrá haber declaración de variables locales en cualquier lugar de la función ni dentro de bloques anidados (por ejemplo el creado por un while)
- No pueden aparecer expresiones como sentencias
- Las llaves son obligatorias en el if/while aunque solo haya una sentencia dentro. También son obligatorios los paréntesis alrededor de la condición
*/

//// ------------------------------
//// DEFINICIONES de datos y tipos

// Tipos simples ---------
var a:int;
var b:char;

// Arrays ---------
var c:[5] float;
var h:[3][2] float;  // Pueden ser más de 2 dimensiones

// Structs ------------- 
struct Direccion {
	portal:int;
	codigoPostal:int;
};

var d1:Direccion;
var d2:Direccion;

struct Persona {
	edad:int;
	direccion:Direccion;
};

// Combinación de Arrays y Structs -------------
var f:[6] Persona;

struct Empresa {
	cif:[9] char;
	empleados:[10] Persona;
};

var microsoft: Empresa;

//// ------------------------------
//// DEFINICIONES de funciones

dobleSuma(a:int, b:int): int {
	var local:int;

	local = (a + b) * 2;
	return local;// * 2;
}

escribeEdad(num:int) {
	printsp microsoft.empleados[num].edad;
}

var z:int;	// Se puede definir entre funciones

main() {
  var local: int;
  var pepe: Persona;
  var v:[10] int;

  pepe.edad = 20;
  read pepe.direccion.codigoPostal;

  local = 0;
  while (local < 10) {
    v[local] = dobleSuma(cast<int>(2.0 + h[0][3]), local);
    local = local + 1;
  }

  if (a >= 2 && local < 5) {
    escribeEdad(a + local); 
    return;
  } else {
    b = 'R';
  }

  if (z != 2) {
    escribeEdad(v[local]);
  }
}
