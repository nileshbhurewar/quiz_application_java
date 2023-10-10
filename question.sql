-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2022 at 07:19 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mocktest`
--

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `name` varchar(600) NOT NULL,
  `opt1` varchar(300) NOT NULL,
  `opt2` varchar(300) NOT NULL,
  `opt3` varchar(300) NOT NULL,
  `opt4` varchar(300) NOT NULL,
  `Answer` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`id`, `name`, `opt1`, `opt2`, `opt3`, `opt4`, `Answer`) VALUES
(1, 'What is JVM Full Form?', 'Java Virtual Machine ', 'Java Visual Machine', 'Java Video Machine', 'Java Virtual Motor', 'Java Virtual Machine '),
(2, 'What Is Full Form Of HTML ?', 'HyperText Makcup Language', 'HyperText Markup Language', 'HyperText Machine Language', 'HyperText Master Language', 'HyperText Markup Language'),
(3, 'How Many Types Of Conditional Statements?', '6', '5', '4', '2', '4'),
(4, 'Who Amongst The Following Had Called Rabindranath Tagore As The GREAT SENTINEL?', 'Abdul Kalam Azad', 'Mahatma Gandhi', 'Dr.Rajendra Prasad', 'Subhash Chandra Bose', 'Mahatma Gandhi'),
(5, 'The Average Of First 50 Natural Numbers Is.............?', '25,30', '25,5', '25,36', '15,35', '25,5'),
(6, '106*106-94*94=?', '2004', '1906', '1909', '2400', '2400'),
(7, 'Find The Value OF X; If X=(2*3)+11.', '55', '192', '17', '66', '17'),
(8, 'Select The Valid Statement To Declare & Initialize An Array.', 'int[]A={}', 'int[]A={1,2,3}', 'int[]A=(1,2,3)', 'int[][]A={1,2,3}', 'int[]A={1,2,3}'),
(9, 'What Is The Implicit return Type Of Constructor.?', 'No return type', 'void ', 'A Class Object in Which It is Defined', 'None Of These', 'A Class Object in Which It is Defined'),
(10, 'Which Of The Following Exception Is thrown When Divided By Zero Statement Is Executed?', 'NullPointerException', 'NumberFormatException', 'ArithmaticException', 'None Of These', 'ArithmaticException');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
