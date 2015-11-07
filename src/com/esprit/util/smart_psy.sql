-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 07 Novembre 2015 à 21:53
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `smart_psy`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(10) NOT NULL AUTO_INCREMENT,
  `login_admin` varchar(20) NOT NULL,
  `pwd_admin` varchar(20) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id_admin`, `login_admin`, `pwd_admin`) VALUES
(1, 'root', 'root');

-- --------------------------------------------------------

--
-- Structure de la table `diagnostique`
--

CREATE TABLE IF NOT EXISTS `diagnostique` (
  `id_diag` int(11) NOT NULL AUTO_INCREMENT,
  `id_psy` int(11) NOT NULL,
  `id_patient` int(11) NOT NULL,
  `id_test` int(11) NOT NULL,
  `diag` text NOT NULL,
  PRIMARY KEY (`id_diag`),
  KEY `id_patient` (`id_patient`),
  KEY `id_psy` (`id_psy`),
  KEY `id_test` (`id_test`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `id_patient` int(5) NOT NULL AUTO_INCREMENT,
  `nom_patient` varchar(20) NOT NULL,
  `prenom_patient` varchar(20) NOT NULL,
  `cin_patient` int(8) NOT NULL,
  `age_patient` int(11) NOT NULL,
  `pwd_patient` varchar(30) NOT NULL,
  `tel_patient` int(11) NOT NULL,
  `email_patient` varchar(30) NOT NULL,
  PRIMARY KEY (`id_patient`),
  UNIQUE KEY `id_patient` (`id_patient`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`id_patient`, `nom_patient`, `prenom_patient`, `cin_patient`, `age_patient`, `pwd_patient`, `tel_patient`, `email_patient`) VALUES
(1, 'marwen', 'hamza', 9391891, 25, 'marwen', 0, ''),
(4, 'siwar', 'brjeb', 25245545, 23, 'siwar', 0, ''),
(5, 'mm', 'hh', 99, 25, 'marwen', 55, 'gg'),
(6, 'mmm', 'hhh', 99, 25, 'mmm', 555, 'ggg'),
(7, 'mmmm', 'hhhh', 0, 25, 'marwen', 5555, 'gggg'),
(8, 'mmrt', 'erz', 999999, 25, 'marwen', 55, 'ggrsthdfger');

-- --------------------------------------------------------

--
-- Structure de la table `psychologue`
--

CREATE TABLE IF NOT EXISTS `psychologue` (
  `id_psy` int(5) NOT NULL AUTO_INCREMENT,
  `prenom_psy` varchar(20) NOT NULL,
  `nom_psy` varchar(20) NOT NULL,
  `cin_psy` int(11) NOT NULL,
  `age_psy` int(11) NOT NULL,
  `pwd_psy` varchar(20) NOT NULL,
  `ville` varchar(20) NOT NULL,
  `tel_psy` int(11) NOT NULL,
  `email_psy` varchar(30) NOT NULL,
  `diplome` varchar(20) NOT NULL,
  PRIMARY KEY (`id_psy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `psychologue`
--

INSERT INTO `psychologue` (`id_psy`, `prenom_psy`, `nom_psy`, `cin_psy`, `age_psy`, `pwd_psy`, `ville`, `tel_psy`, `email_psy`, `diplome`) VALUES
(1, '', 'hamza', 0, 0, 'hamza', '0', 0, '', ''),
(2, '', 'berjab', 0, 0, 'berjab', '0', 0, '', ''),
(3, 'hamza', 'hamza', 99, 25, 'marwen', 'mahdia', 55, 'gg', 'sqgdx');

-- --------------------------------------------------------

--
-- Structure de la table `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `id_question` int(5) NOT NULL AUTO_INCREMENT,
  `id_test` int(11) NOT NULL,
  `id_psy` int(11) NOT NULL,
  `categorie` varchar(20) NOT NULL,
  `question` text NOT NULL,
  PRIMARY KEY (`id_question`),
  KEY `id_test` (`id_test`),
  KEY `id_psy` (`id_psy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Contenu de la table `question`
--

INSERT INTO `question` (`id_question`, `id_test`, `id_psy`, `categorie`, `question`) VALUES
(1, 1, 1, 'society', 'why'),
(2, 1, 1, 'kannibalisme', 'viande arabe ou allmend ');

-- --------------------------------------------------------

--
-- Structure de la table `resultat`
--

CREATE TABLE IF NOT EXISTS `resultat` (
  `id_resultat` int(5) NOT NULL AUTO_INCREMENT,
  `id_question` int(11) NOT NULL,
  `id_patient` int(11) NOT NULL,
  `id_test` int(11) NOT NULL,
  `result` text NOT NULL,
  PRIMARY KEY (`id_resultat`),
  KEY `id_question` (`id_question`),
  KEY `id_question_2` (`id_question`),
  KEY `id_patient` (`id_patient`),
  KEY `id_test` (`id_test`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `resultat`
--

INSERT INTO `resultat` (`id_resultat`, `id_question`, `id_patient`, `id_test`, `result`) VALUES
(1, 1, 1, 1, 'yes');

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

CREATE TABLE IF NOT EXISTS `test` (
  `id_test` int(5) NOT NULL AUTO_INCREMENT,
  `id_psy` int(11) NOT NULL,
  `nom_test` varchar(20) NOT NULL,
  PRIMARY KEY (`id_test`),
  KEY `id_psy` (`id_psy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `test`
--

INSERT INTO `test` (`id_test`, `id_psy`, `nom_test`) VALUES
(1, 1, 'tester'),
(2, 2, 'kaneki');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `diagnostique`
--
ALTER TABLE `diagnostique`
  ADD CONSTRAINT `diagnostique_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `diagnostique_ibfk_2` FOREIGN KEY (`id_psy`) REFERENCES `psychologue` (`id_psy`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `diagnostique_ibfk_3` FOREIGN KEY (`id_test`) REFERENCES `test` (`id_test`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `question_ibfk_1` FOREIGN KEY (`id_test`) REFERENCES `test` (`id_test`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `question_ibfk_2` FOREIGN KEY (`id_psy`) REFERENCES `psychologue` (`id_psy`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `resultat`
--
ALTER TABLE `resultat`
  ADD CONSTRAINT `resultat_ibfk_1` FOREIGN KEY (`id_question`) REFERENCES `question` (`id_question`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `resultat_ibfk_2` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `resultat_ibfk_3` FOREIGN KEY (`id_test`) REFERENCES `test` (`id_test`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `test_ibfk_1` FOREIGN KEY (`id_psy`) REFERENCES `psychologue` (`id_psy`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
