-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 12 Novembre 2015 à 23:30
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
-- Structure de la table `contact`
--

CREATE TABLE IF NOT EXISTS `contact` (
  `id_patient` int(11) NOT NULL,
  `id_psy` int(11) NOT NULL,
  `id_test` int(11) NOT NULL,
  `passer_test` int(1) NOT NULL,
  KEY `id_patient` (`id_patient`),
  KEY `id_psy` (`id_psy`),
  KEY `id_test` (`id_test`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `contact`
--

INSERT INTO `contact` (`id_patient`, `id_psy`, `id_test`, `passer_test`) VALUES
(1, 1, 1, 0);

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
  `etat_diag` int(1) NOT NULL,
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
  `login` varchar(20) NOT NULL,
  `cin_patient` int(8) NOT NULL,
  `age_patient` int(11) NOT NULL,
  `pwd_patient` varchar(30) NOT NULL,
  `tel_patient` int(11) NOT NULL,
  `email_patient` varchar(30) NOT NULL,
  PRIMARY KEY (`id_patient`),
  UNIQUE KEY `id_patient` (`id_patient`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`id_patient`, `nom_patient`, `prenom_patient`, `login`, `cin_patient`, `age_patient`, `pwd_patient`, `tel_patient`, `email_patient`) VALUES
(1, 'hamza', 'marwen', 'marwen', 9391891, 25, 'marwen', 5555, 'gggg'),
(10, 'hamza', 'marwen', 'hamza', 99, 25, 'marwen', 55, 'gg'),
(11, 'hamza', 'marwen', 'marwen', 999, 25, 'marwen', 55, 'ggg');

-- --------------------------------------------------------

--
-- Structure de la table `psychologue`
--

CREATE TABLE IF NOT EXISTS `psychologue` (
  `id_psy` int(5) NOT NULL AUTO_INCREMENT,
  `nom_psy` varchar(20) NOT NULL,
  `prenom_psy` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `cin_psy` int(11) NOT NULL,
  `age_psy` int(11) NOT NULL,
  `pwd_psy` varchar(20) NOT NULL,
  `ville` varchar(20) NOT NULL,
  `tel_psy` int(11) NOT NULL,
  `email_psy` varchar(30) NOT NULL,
  `diplome` varchar(20) NOT NULL,
  PRIMARY KEY (`id_psy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `psychologue`
--

INSERT INTO `psychologue` (`id_psy`, `nom_psy`, `prenom_psy`, `login`, `cin_psy`, `age_psy`, `pwd_psy`, `ville`, `tel_psy`, `email_psy`, `diplome`) VALUES
(1, 'hamza', 'marwen', 'hamza', 9391890, 25, 'marwen', 'mahdia', 555, 'gggg', 'fsxcvxvc');

-- --------------------------------------------------------

--
-- Structure de la table `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `id_question` int(5) NOT NULL AUTO_INCREMENT,
  `id_test` int(11) NOT NULL,
  `id_psy` int(11) NOT NULL,
  `question` text NOT NULL,
  PRIMARY KEY (`id_question`),
  KEY `id_test` (`id_test`),
  KEY `id_psy` (`id_psy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `question`
--

INSERT INTO `question` (`id_question`, `id_test`, `id_psy`, `question`) VALUES
(1, 1, 1, ' test?????? '),
(2, 1, 1, ' tester??? '),
(3, 2, 1, ' ecrir une question ');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;

--
-- Contenu de la table `resultat`
--

INSERT INTO `resultat` (`id_resultat`, `id_question`, `id_patient`, `id_test`, `result`) VALUES
(27, 1, 11, 1, 'siwar'),
(29, 2, 11, 1, 'brjab');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `test`
--

INSERT INTO `test` (`id_test`, `id_psy`, `nom_test`) VALUES
(1, 1, 'teste1'),
(2, 1, 'teste2');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `contact`
--
ALTER TABLE `contact`
  ADD CONSTRAINT `contact_ibfk_3` FOREIGN KEY (`id_test`) REFERENCES `test` (`id_test`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contact_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contact_ibfk_2` FOREIGN KEY (`id_psy`) REFERENCES `psychologue` (`id_psy`) ON DELETE CASCADE ON UPDATE CASCADE;

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
