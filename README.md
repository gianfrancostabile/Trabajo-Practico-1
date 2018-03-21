# Trabajo-Practico-1

**1) Cuantos consumidores son necesarios para llegar a 0 el stock?** (*)1 solo consumidor es necesario.*
**2) Bloques synchronized por que deben serlos?** (*)Para que el recurso compartido no se vuelva loco, esto ocurre cuando un Hilo ejecuta un método que cambia el valor del Recurso Compartido a la vez que lo cambia el otro Hilo.*
**3) Explicar el recurso compartido.** (*)El recurso compartido es aquel valor que tienen acceso los Hilos en ejecución, en este caso, el recurso compartido es la instancia del Objeto BeerHouse creada en el Main.*
**4) Explicar las 3 formas de instanciar un Thread.** (*)Solo hay 2 formas: Una es, en la clase, implementar la interfaz 'Runnable', cuando se hace la instancia de esta clase, en el main, hay que crear una nueva instancia pero de la clase Thread, y pasarle al constructor de la clase Thread la instancia de la clase que implementa 'Runnable'; La otra forma es, en la clase, extender de 'Thread' ya que la clase 'Thread' implementa la intefaz 'Runnable'.*
