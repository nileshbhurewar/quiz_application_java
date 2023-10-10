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
-- Table structure for table `studentdetails`
--

CREATE TABLE `studentdetails` (
  `RollNo` int(11) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `middlename` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `mothername` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `ContactNo` varchar(100) NOT NULL,
  `EmailId` varchar(300) NOT NULL,
  `TenthPercentage` varchar(20) NOT NULL,
  `TenthPassoutYear` int(30) NOT NULL,
  `TwelvethPercentage` varchar(30) NOT NULL,
  `TwelvethPassoutYear` int(30) NOT NULL,
  `City` varchar(300) NOT NULL,
  `Marks` int(50) NOT NULL,
  `Username` varchar(200) NOT NULL,
  `Password` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdetails`
--

INSERT INTO `studentdetails` (`RollNo`, `firstname`, `middlename`, `lastname`, `mothername`, `Gender`, `ContactNo`, `EmailId`, `TenthPercentage`, `TenthPassoutYear`, `TwelvethPercentage`, `TwelvethPassoutYear`, `City`, `Marks`, `Username`, `Password`) VALUES
(1, 'Abhishek', 'Ambadas', 'Bedarkar', 'Seema', 'Male', '1234567891', 'abhishek12@gmail.com', '66%', 2017, '95%', 2019, 'Nanded', 0, 'Abhi@123', 'bca123'),
(2, 'Pritesh', 'Bayas', 'Singh', 'seeta', 'Male', '98765432', 'pritesh2022@gmail.com', '85%', 2017, '75%', 2019, 'Nanded', 0, 'pritesh#123', 'bca123'),
(3, 'Arjun', 'Balaji', 'Patil', 'swati', 'Male', '800728982', 'arjun200@gmail.com', '95%', 2017, '66%', 2019, 'Nanded', 0, 'arjunpatil', 'bca1234'),
(4, 'Shivam', 'Balaji', 'Suryawanshi', 'Anjali', 'Male', '987654321', 'shivam12@gmail.com', '77%', 2017, '65%', 2019, 'Nanded', 0, 'shivam12', 'bca#12345'),
(5, 'Shrinivas', 'Ambadas', 'Bedarkar', 'Anjali', 'Male', '987654321', 'shrinivas2022@gmail.com', '75%', 2016, '85%', 2019, 'Nanded', 0, 'shri123', 'shri0051'),
(6, 'Aditya', 'Balaji', 'Khandre', 'Parvati', 'Male', '2874473242', 'aditya2022@gmail.com', '75%', 2018, '80%', 2019, 'Nanded', 0, 'AdityaKhandre', 'aditya0102');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
