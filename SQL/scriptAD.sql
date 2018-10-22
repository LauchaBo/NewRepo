CREATE TABLE Usuarios (
    idUsuario int IDENTITY (1,1) NOT NULL,
    apodo VARCHAR(30) NOT NULL,
    mail VARCHAR (30) NOT NULL,
    password VARCHAR(20) NOT NULL,
    partidasJugadas int NOT NULL,
    partidasGanadas int NOT NULL,
    online BIT NOT NULL,
    puntos INT NOT NULL,
    promedio FLOAT NOT NULL,
    CONSTRAINT PK_Usuarios PRIMARY KEY (idUsuario)
);
CREATE TABLE Juegos (
    idJuego int IDENTITY(1,1) NOT NULL,
    fecha DATE NOT NULL,
    categoriaParejaA varchar (15) NOT NULL,
    categoriaParejaB varchar (15) NOT NULL,
    idParejaA int NOT NULL,
    idParejaB int NOT NULL,
    idPartidaActiva int NOT NULL
    CONSTRAINT PK_Juegos PRIMARY KEY (idJuego)
);

CREATE TABLE Parejas (
    idPareja int IDENTITY (1,1) NOT NULL,
    idJuego int NOT NULL, 
    idUsuario1 int NOT NULL,
    idUsuario2 int NOT NULL,
    CONSTRAINT PK_Parejas PRIMARY KEY (idPareja)
);

CREATE TABLE Jugadores (
    idUsuario int NOT NULL,
    idJuego int NOT NULL,
    puntosJuego int NOT NULL,
    CONSTRAINT PK_Jugadores PRIMARY KEY (idUsuario,idJuego)
);

CREATE TABLE Partidas (
    idPartida int IDENTITY (1,1) NOT NULL,
    idJuego int NOT NULL, 
    puntosTotalA int NOT NULL,
    puntosTotalB int NOT NULL,
    idMazo int NOT NULL,
    ganador int,
    idManoActiva int NOT NULL,
    CONSTRAINT PK_Partidas PRIMARY KEY (idPartida)
)

CREATE TABLE Manos (
    idMano int IDENTITY(1,1) NOT NULL,
    idJuego int NOT NULL,
    idPartida int NOT NULL,
    envidoMax int, 
    puntosA int NOT NULL,
    puntosB int NOT NULL, 
    idJugadorMano int NOT NULL,
    bazasGanadasA int NOT NULL,
    bazasGanadasB int NOT NULL,
    CONSTRAINT PK_Manos PRIMARY KEY (idMano)
);

CREATE TABLE Jugadas (
    idJugada int IDENTITY(1,1) NOT NULL,
    idJuego int NOT NULL,
    idPartida int NOT NULL,
    idMano int NOT NULL, 
    idUsuario int NOT NULL,
    nroCarta int NOT NULL,
    palo varchar(10) NOT NULL,
    CONSTRAINT PK_Jugadas PRIMARY KEY (idJugada)
);

CREATE TABLE Bazas(
    idBaza int IDENTITY(1,1) NOT NULL,
    idJuego int NOT NULL, 
    idPartida int NOT NULL,
    nroBaza int NOT NULL,
    turno int NOT NULL /*REVISAR*/ 
    CONSTRAINT PK_Bazas PRIMARY KEY (idBaza)
);
CREATE TABLE CartasEnMano (
    idJuego int NOT NULL, 
    idPartida int NOT NULL,
    idUsuario int NOT NUll, 
    idMano int NOT NULL, 
    idCarta int NOT NULL,
    CONSTRAINT PK_CartasEnMano PRIMARY KEY (idJuego,idPartida,idUsuario,idMano,idCarta)
);

CREATE TABLE Mazos (
    idMazo int IDENTITY(1,1) NOT NULL,
    idCarta int NOT NULL,
    CONSTRAINT PK_Mazos PRIMARY KEY (idMazo,idCarta)
);

CREATE TABLE Cartas(
    idCarta int IDENTITY(1,1) NOT NULL,
    numero int NOT NULL,
    palo varchar(10) NOT NULL,
    ranking int NOT NULL,
    CONSTRAINT PK_Cartas PRIMARY KEY (idCarta)
);

ALTER TABLE CartasEnMano 
    ADD FOREIGN KEY (idPartida) REFERENCES Partidas(idPartida),
        FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuarios),
        FOREIGN KEY (idJuego) REFERENCES Juegos(idJuego),
        FOREIGN KEY (idMano) REFERENCES Manos(idMano),
        FOREIGN KEY (idCarta) REFERENCES Cartas(idCarta);

ALTER TABLE Mazos
    ADD FOREIGN KEY (idCarta) REFERENCES Cartas(idCarta);

ALTER TABLE Bazas
    ADD FOREIGN KEY (idJuego) REFERENCES Juegos(idJuegos),
        FOREIGN KEY (idPartida) REFERENCES Partidas(idPartidas);

ALTER TABLE Jugadas
    ADD FOREIGN KEY (idJuego) REFERENCES Juegos (idJuego),
        FOREIGN KEY (idPartida) REFERENCES Partidas(idPartida),
        FOREIGN KEY (idMano) REFERENCES Manos (idManos),
        FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario);

ALTER TABLE Manos 
    ADD FOREIGN KEY (idJuego) REFERENCES Juegos (idJuego),
        FOREIGN KEY (idPartida) REFERENCES Partidas (idPartida),
        FOREIGN KEY (idJugadorMano) REFERENCES Jugadores (idJugadorMano);

ALTER TABLE Partidas 
    ADD FOREIGN KEY (idJuego) REFERENCES Juegos (idJuego),
        FOREIGN KEY (idMazo) REFERENCES Mazos(idMazo), 
        FOREIGN KEY (idManoActiva) REFERENCES Manos (idMano);

ALTER TABLE Jugadores 
    ADD FOREIGN KEY (idUsuario) REFERENCES Usuarios (idUsuario),
        FOREIGN KEY (idJuego) REFERENCES Juegos (idJuego);

ALTER TABLE Parejas 
    ADD FOREIGN KEY (idUsuario1) REFERENCES Usuarios (idUsuario),
        FOREIGN KEY (idUsuario2) REFERENCES Usuarios (idUsuario);

ALTER TABLE Juegos 
    ADD FOREIGN KEY (idParejaA) REFERENCES Parejas (idPareja);

CREATE TABLE PoolLibreIndividuales (
    idUsuario int NOT NULL,
    CONSTRAINT PK_PoolLibreIndividuales PRIMARY KEY (idUsuario)
);
ALTER TABLE PoolLibreIndividuales 
    ADD FOREIGN KEY (idUsuario) REFERENCES Usuarios (idUsuario);

CREATE TABLE PoolLibreParejas (
    idUsuario int NOT NULL,
    CONSTRAINT PK_idUsuario PRIMARY KEY (idUsuario)
);
ALTER TABLE PoolLibreParejas
    ADD FOREIGN KEY (idUsuario) REFERENCES Usuarios (idUsuario);

CREATE TABLE PoolParejasLibreParejas (
    idPareja int NOT NULL,
    CONSTRAINT PK_PoolParejasLibreParejas PRIMARY KEY (idPareja)
);
ALTER TABLE PoolParejasLibreParejas
    ADD FOREIGN KEY (idUsuario) REFERENCES Usuarios (idUsuario);





