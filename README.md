# Tarea S1.03 - Java Collections

**Objetivos**: 
Crear y modificar colecciones con ArrayList, HashSet, HashMap,ListIterator
Gestionar duplicados y comparar objetos
Practicar ordenación de objetos (Comparable, Comparator)
Practicar lectura y escritura de archivos
Implementar menús e interacción con el usuario/a

## 📌 Nivel 1

### Ejercicio 1 – Duplicados
Crea una clase llamada Monthcon un atributo name, que almacene el nombre del mes. Añade 11 objetos Montha un ArrayList, dejando fuera "Agosto". Inserta este mes en la posición correspondiente y comprueba que el orden de los meses es correcto.
Convierte después el ArrayListen uno HashSety verifica que no se permiten duplicados.
Por último, recorre la colección con un bucle fory con un Iterator.

### Ejercicio 2 – ListIterator
Crea y rellena una List<Integer>.
Crea una segunda lista e inserta los mismos elementos pero en orden inverso.
Use uno ListIterator para leer los elementos de la primera y añadirlos a la segunda.

### Ejercicio 3 – Capital Game
A partir del archivo  countries.txt (consulta el apartado de recursos), que contiene parejas de país y capital separadas por comas, el programa debe leer todos los datos y almacenarlos en un  HashMap<String, String>, donde la clave es el nombre del país y el valor, su capital.

Una vez cargados los datos, el programa pedirá el nombre del usuario y empezará el juego.

El funcionamiento consiste en realizar 10 preguntas, escogiendo aleatoriamente 10 países diferentes del HashMap. En cada ronda, se mostrará el nombre de un país y el usuario deberá introducir el nombre de su capital. Si la respuesta es correcta (teniendo en cuenta mayúsculas y minúsculas si fuera necesario), se sumará un punto a su puntuación. Al término de las 10 preguntas, se mostrará la puntuación total obtenida.

Al finalizar las 10 preguntas, el programa guardará el nombre del usuario y su puntuación en un archivo llamado classificacio.txt.


## 🛠️Tecnologías
- IntelliJ IDEA Java 25 
- Git & GitHub 