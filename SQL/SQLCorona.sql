CREATE DATABASE  IF NOT EXISTS DbCorona;



USE DbCorona;



CREATE TABLE TbPaciente (

  ID_Paciente int(11) NOT NULL AUTO_INCREMENT,

  Usuario varchar(100) NOT NULL,

  Senha varchar(14) NOT NULL,

  DescSintomas varchar(100) NOT NULL,

  PRIMARY KEY (ID_Paciente)

);

CREATE TABLE TbTesteCovid (

	TesteID int(11) not null auto_increment,
    ID_Paciente int(11) not null,
    resultado bool not null,
    IntegranteEquipeID int(11) not null,
    CONSTRAINT FK_ID_Paciente FOREIGN KEY (ID_Paciente) REFERENCES TbPaciente (ID_Paciente),
    CONSTRAINT FK_IntegranteEquipeID FOREIGN KEY (IntegranteEquipeID) REFERENCES TbEquipe (IntegranteEquipeID),
	primary key(TesteID)
);
CREATE TABLE TbEquipe (

  IntegranteEquipeID int(11) NOT NULL AUTO_INCREMENT,

  Senha varchar(50) NOT NULL,

  Usuario varchar(20) NOT NULL,

  CodEspecial varchar(50) NOT NULL,

  TesteID int(11) NOT NULL,

  PRIMARY KEY (IntegranteEquipeID),

  CONSTRAINT FK_TesteID FOREIGN KEY (TesteID) REFERENCES TbTesteCovid (TesteID)

);

CREATE TABLE TbForum (

  ID_Paciente int(11) NOT NULL ,

  Mensagem varchar(18) NOT NULL,
  
  IntegranteEquipeID int(11) NOT NULL auto_increment,
  
  Data date not null,
  
  datetime datetime not null,
  
  CONSTRAINT FK_ID_Paciente FOREIGN KEY (ID_Paciente) REFERENCES TbPaciente (ID_Paciente),
  CONSTRAINT FK_IntegranteEquipeID FOREIGN KEY (IntegranteEquipeID) REFERENCES TbEquipe (IntegranteEquipeID),
  PRIMARY KEY (IntegranteEquipeId)

);



CREATE TABLE TbPessoa (

  Nome varchar(50) NOT NULL ,
  
  telefone varchar(11) NOT NULL,

  CPF varchar(14) NOT NULL,

  UF varchar(2) NOT NULL,

  Email varchar(50) NOT NULL,
  
  RG varchar(10) NOT NULL,
  Rua varchar(50) NOT NULL,
  Complemento varchar(50) NOT NULL,
  Bairro varchar(50) NOT NULL,
  Sexo varchar(50) NOT NULL,
  Cep varchar(9) NOT NULL,
  NumCasa varchar(7) NOT NULL,
  Idade int(3) NOT NULL,
  PRIMARY KEY (Codigo),

  KEY FK_CodigoCliente_idx (ID_Pessoa)



);







CREATE TABLE TbAgendamento (
 Date date not null,
 datetime datetime not null,
 Status_Agendamento varchar(50)
);




