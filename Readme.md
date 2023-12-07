# Taller 4 POO:

Claro, aquí está la estructura de las clases con los métodos actualizados en el formato que solicitaste, sin incluir la funcionalidad de ventas de entradas:

**EventoMusical**:
- nombreEvento: String
- fecha: Date
- lugar: String
- artistas: List<Artista>
- EventoMusical(nombreEvento: String, fecha: Date, lugar: String, artistas: List<Artista>)
- agregarArtista(Artista): void
- eliminarArtista(Artista): void
- mostrarDetalles(): String
- crearEvento(): void

**Artista**:
- nombreArtistico: String
- generoMusical: String
- eventos: List<EventoMusical>
- Artista(nombreArtistico: String, generoMusical: String, eventos: List<EventoMusical>)
- agregarEvento(EventoMusical): void
- eliminarEvento(EventoMusical): void
- mostrarDetalles(): String
- registrarArtista(): void

**Asistente**:
- informacionContacto: String
- preferenciasMusicales: String
- entradas: List<Entrada>
- Asistente(informacionContacto: String, preferenciasMusicales: String, entradas: List<Entrada>)
- comprarEntrada(Entrada): void
- cancelarEntrada(Entrada): void
- mostrarDetalles(): String
- registrarAsistente(): void