-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.27
-- Versão do PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: salao
--

-- --------------------------------------------------------

--
-- Estrutura da tabela profissional
--

CREATE TABLE IF NOT EXISTS profissional (
  codigo bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  nome varchar(200) NOT NULL,
  Telefone varchar(12) NOT NULL,
  endereco varchar(300) NOT NULL,
  email varchar(100) NOT NULL,
  CPF int(11) NOT NULL,
  PRIMARY KEY (codigo),
  UNIQUE KEY codigo (codigo)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='Tabela de cadastro de profissionais' AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela profissional
--

INSERT INTO profissional (codigo, nome, Telefone, endereco, email, CPF) VALUES
(1, 'Paulo Porto', '5191365924', 'Rua augusto porto alegre 259', 'pauloportoles@hotmail.com', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
