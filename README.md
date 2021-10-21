# Rick and Morty Backend App

En este proyecto, se usa la API de la serie Rick y Morty para traer datos de los personajes y episodios.
La documentación de la API puede verse en
`https://rickandmortyapi.com/documentation`

# Funcionalidades

Las rutas usadas hasta el momento son :

- **"/"** Devuelve las rutas posibles de la api.
- **"/api/characters"** Devuelve la lista de personajes.
- **"/api/characters/:id"** Esto nos llevara al detalle de cada personaje.

#Pasos Iniciales
En primer lugar, es preciso crear un Bean en el script inicial de la aplicación(RickAndMortyApplication.java) para poder usar RestTemplate. 

RestTemplate es la herramienta que permite "fetchear" a las rutas de la API. 
```
    @Bean
    public RestTemplate getRestTemplate() {
	return new RestTemplate();
    }

```


# Home
En la carpeta models se creó una clase "Home", que posee tres strings, los cuales concuerdan con el resultado de la ruta inicial de la API.
Notar que el string episodes, al igual que su getter y setter están comentados. Esto es para demostrar que la clase no debe concordar estrictamente con todas las propiedades del resultado de la API. Simplemente se pueden poner las propiedades que se precisen. Es para eso que se dispone de la anotación "JsonIgnoreProperties".

En la carpeta controllers se ha creado una clase "Home Controller", cuyo único método, anotado como un GetMapping, se encarga de consumir la api en su ruta inicial, vincular el resultado a una instancia de la clase "Home", y devolver esa instancia.

# Characters

Para las rutas de personajes surge un problema.
La ruta de la API que devuelve la lista de personajes posee un objeto con dos propiedades anidadas: "info" y "results".

Se precisa el array "results", que posee la lista de personajes. 
Para eso es necesario crear dos clases. Una clase "Character" que contenga los datos de cada personaje que se necesiten, y una clase "CharacterResults" que conste de un array de instancias de la clase Character, y que se pueda vincular a la ruta de la API que nos devuelve la lista de personajes.

En la clase CharacterController tenemos dos métodos entonces. Un método "getAllCharacters", que devuelve una instancia de CharacterResults, un método "GetCharacterById", que toma el parámetro de la ruta "id", y devuelve el personaje que corresponda.


