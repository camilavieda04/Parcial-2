CREATE TABLE `AIRLINE` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `web_page` varchar(500) NOT NULL,
  `pais` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo`)
) ;

CREATE TABLE `FLIGTH` (
  `codigo` varchar(100) NOT NULL,
  `airline` int(11) NOT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `destino` varchar(100) DEFAULT NULL,
  `duracion` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FLIGTH_AIRLINE_FK` (`airline`),
  CONSTRAINT `FLIGTH_AIRLINE_FK` FOREIGN KEY (`airline`) REFERENCES `AIRLINE` (`Codigo`)
) ;

CREATE TABLE `PASSENGER` (
  `tipo_id` varchar(100) NOT NULL,
  `no_id` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `flight` varchar(100) NOT NULL,
  PRIMARY KEY (`tipo_id`,`no_id`),
  KEY `PASSENGER_FLIGTH_FK` (`flight`),
  CONSTRAINT `PASSENGER_FLIGTH_FK` FOREIGN KEY (`flight`) REFERENCES `FLIGTH` (`codigo`)
) ;