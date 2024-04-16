# Caso Final Integrador 5

Link del repositorio: https://github.com/PaxuitoGIT/CasoFinalIntegrador5

Para iniciar el programa, basta con ejecutar App.java

## Explicación

### Análisis Genómico (Ejercicios 7 y 8):

Para el conteo de genes, he creado una función recursiva que tenga en cuenta la longitud de la cadena. Si la longitud es menor que 0, entonces la cadena está vacía, luego si la
longitud es mayor o igual que 3, buscará en la cadena la combinación "ATG" para contarlo.

Para saber todas las combinaciones genéticas posibles, basta con contar el número de caracteres que tenemos(A,T,G) que es 3 y elevarlo a n. Para que se muestren todas las 
combinaciones, he implementado un algoritmo recursivo que va mostrando todas las posibilidades con A, con T y con G.

### Herramientas de Análisis Numérico (Ejercicios 1, 2, 3, 4 y 5):

Para el sumatorio es llamar de forma recursiva la función y comprobar que si el numero introducido "n" no sea 0, que sume n + (n-1) y ese n del (n-1) pase a ser el nuevo n y 
así hasta que llegue a 0. Un ejemplo con el n = 3 es " 3+(3-1)+(2-1)+(1-1) = 6 " 

Para el listado es llamar de forma recursiva el inicio y sumarle 1 hasta que coincida con el fin de la lista. 

Para la potencia es llamar de forma recursiva la base por el exponente menos 1 hasta que el exponente sea 0. Es decir, si la base es 5 y el exponente 3, lo que hará es
5 * 5 * 5 * 1 = 125

Para el máximo es ir comparando recursivamente el primer elemento de la lista con el siguiente para saber quién es mayor que el otro y luego con el siguiente elemento hasta
acabar la lista.

### Gestión de Información Científica (Ejercicios 9, 10, 11 y 12):

Para la organización de documentos, necesita guardar el texto del archivo en una lista y luego usar un collections.sort para ordenar de forma alfabética.

Para la búsqueda lineal, es lo mismo, solo que al buscar una palabra en concreto, irá desde el primer elemento de la lista de uno en uno comparando hasta encontrarlo.
Esta búsqueda está bien si es una lista corta o que el elemento que queramos encontrar esté de los primeros porque si está de los últimos, esta búsqueda tiene que pasar por todos.

Para la búsqueda binaria, hace el mismo proceso, solo que parte la lista en 2 y compara si la palabra introducida es la misma que con la del medio de la lista y si no es, 
puede estar en la primera mitad o en la otra y hace lo mismo de partir en 2 hasta encontrarla. Un ejemplo es si yo tengo una lista ya ordenada alfabéticamente con ["agua", 
"aire", "fuego", "tierra", "viento"] y quiero buscar la palabra "aire", lo que va a hacer es comparar "fuego" con "aire". Como la lista está ordenada y la "a" va antes que la "f",
sabemos que está en la primera mitad y así hasta que coincidan.

Para la gestión de fechas, es introducir las fechas y ordenarlas de forma cronológica con el método del TreeSet<LocalDate>

### Optimización de Procesos (Ejercicio 13):

Por último, el quicksort lo que hace es ordenar llamando a un elemento el "pivote" y lo que hará es comparar todos los elementos con ese pivote. Si es menor que el pivote, pasarán
al lado izquierdo y si son mayor al derecho. Una vez comprobado, el pivote se seleccionará a otro elemento y lo mismo hasta que todos los elementos estén en su posición final.
Para que el pivote no sea tan aleatorio, he implementado que siempre sea el medio, es decir, la mediana.
