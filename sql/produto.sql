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
-- Estrutura da tabela produto
--

CREATE TABLE IF NOT EXISTS produto (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  CodigoDeBarras int(11) NOT NULL,
  nome varchar(200) NOT NULL,
  valorDeCusto decimal(4,2) NOT NULL,
  valorDeVenda decimal(4,2) NOT NULL,
  estoque int(10) NOT NULL,
  estoqueminimo int(10) NOT NULL,
  PRIMARY KEY (codigo),
  UNIQUE KEY nome (nome)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='Tabela de produtos' AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela produto
--

INSERT INTO produto (codigo, CodigoDeBarras, nome, valorDeCusto, valorDeVenda, estoque, estoqueminimo) VALUES
(1, 789, 'texte de conexão DAO', 10.00, 15.00, 100, 30);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
