package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;


public class TraductorJava 
{
   
public static void main(String[] args) {
        
        HashMap<Integer, String> numPalabrasEs = new HashMap<>();
        HashMap<Integer, String> numPalabrasIn = new HashMap<>();

        
numPalabrasEs.put(0, "cero"); numPalabrasEs.put(1, "uno");
numPalabrasEs.put(2, "dos"); numPalabrasEs.put(3, "tres");
numPalabrasEs.put(4, "cuatro"); numPalabrasEs.put(5, "cinco");
numPalabrasEs.put(6, "seis"); numPalabrasEs.put(7, "siete");
numPalabrasEs.put(8, "ocho"); numPalabrasEs.put(9, "nueve");
numPalabrasEs.put(10, "diez"); numPalabrasEs.put(11, "once");
numPalabrasEs.put(12, "doce"); numPalabrasEs.put(13, "trece");
numPalabrasEs.put(14, "catorce"); numPalabrasEs.put(15, "quince");
numPalabrasEs.put(16, "dieciséis"); numPalabrasEs.put(17, "diecisiete");
numPalabrasEs.put(18, "dieciocho"); numPalabrasEs.put(19, "diecinueve");
numPalabrasEs.put(20, "veinte"); numPalabrasEs.put(21, "veintiuno");
numPalabrasEs.put(22, "veintidós"); numPalabrasEs.put(23, "veintitrés");
numPalabrasEs.put(24, "veinticuatro"); numPalabrasEs.put(25, "veinticinco");
numPalabrasEs.put(26, "veintiséis"); numPalabrasEs.put(27, "veintisiete");
numPalabrasEs.put(28, "veintiocho"); numPalabrasEs.put(29, "veintinueve");
numPalabrasEs.put(30, "treinta"); numPalabrasEs.put(31, "treinta y uno");
numPalabrasEs.put(32, "treinta y dos"); numPalabrasEs.put(33, "treinta y tres");
numPalabrasEs.put(34, "treinta y cuatro"); numPalabrasEs.put(35, "treinta y cinco");
numPalabrasEs.put(36, "treinta y seis"); numPalabrasEs.put(37, "treinta y siete");
numPalabrasEs.put(38, "treinta y ocho"); numPalabrasEs.put(39, "treinta y nueve");
numPalabrasEs.put(40, "cuarenta"); numPalabrasEs.put(41, "cuarenta y uno");
numPalabrasEs.put(42, "cuarenta y dos"); numPalabrasEs.put(43, "cuarenta y tres");
numPalabrasEs.put(44, "cuarenta y cuatro"); numPalabrasEs.put(45, "cuarenta y cinco");
numPalabrasEs.put(46, "cuarenta y seis"); numPalabrasEs.put(47, "cuarenta y siete");
numPalabrasEs.put(48, "cuarenta y ocho"); numPalabrasEs.put(49, "cuarenta y nueve");
numPalabrasEs.put(50, "cincuenta"); numPalabrasEs.put(51, "cincuenta y uno");
numPalabrasEs.put(52, "cincuenta y dos"); numPalabrasEs.put(53, "cincuenta y tres");
numPalabrasEs.put(54, "cincuenta y cuatro"); numPalabrasEs.put(55, "cincuenta y cinco");
numPalabrasEs.put(56, "cincuenta y seis"); numPalabrasEs.put(57, "cincuenta y siete");
numPalabrasEs.put(58, "cincuenta y ocho"); numPalabrasEs.put(59, "cincuenta y nueve");
numPalabrasEs.put(60, "sesenta"); numPalabrasEs.put(61, "sesenta y uno");
numPalabrasEs.put(62, "sesenta y dos"); numPalabrasEs.put(63, "sesenta y tres");
numPalabrasEs.put(64, "sesenta y cuatro"); numPalabrasEs.put(65, "sesenta y cinco");
numPalabrasEs.put(66, "sesenta y seis"); numPalabrasEs.put(67, "sesenta y siete");
numPalabrasEs.put(68, "sesenta y ocho"); numPalabrasEs.put(69, "sesenta y nueve");
numPalabrasEs.put(70, "setenta"); numPalabrasEs.put(71, "setenta y uno");
numPalabrasEs.put(72, "setenta y dos"); numPalabrasEs.put(73, "setenta y tres");
numPalabrasEs.put(74, "setenta y cuatro"); numPalabrasEs.put(75, "setenta y cinco");
numPalabrasEs.put(76, "setenta y seis"); numPalabrasEs.put(77, "setenta y siete");
numPalabrasEs.put(78, "setenta y ocho"); numPalabrasEs.put(79, "setenta y nueve");
numPalabrasEs.put(80, "ochenta"); numPalabrasEs.put(81, "ochenta y uno");
numPalabrasEs.put(82, "ochenta y dos"); numPalabrasEs.put(83, "ochenta y tres");
numPalabrasEs.put(84, "ochenta y cuatro"); numPalabrasEs.put(85, "ochenta y cinco");
numPalabrasEs.put(86, "ochenta y seis"); numPalabrasEs.put(87, "ochenta y siete");
numPalabrasEs.put(88, "ochenta y ocho"); numPalabrasEs.put(89, "ochenta y nueve");
numPalabrasEs.put(90, "noventa"); numPalabrasEs.put(91, "noventa y uno");
numPalabrasEs.put(92, "noventa y dos"); numPalabrasEs.put(93, "noventa y tres");
numPalabrasEs.put(94, "noventa y cuatro"); numPalabrasEs.put(95, "noventa y cinco");
numPalabrasEs.put(96, "noventa y seis"); numPalabrasEs.put(97, "noventa y siete");
numPalabrasEs.put(98, "noventa y ocho"); numPalabrasEs.put(99, "noventa y nueve");
numPalabrasEs.put(100, "cien");



       

numPalabrasIn.put(0, "zero"); numPalabrasIn.put(1, "one");
numPalabrasIn.put(2, "two"); numPalabrasIn.put(3, "three");
numPalabrasIn.put(4, "four"); numPalabrasIn.put(5, "five");
numPalabrasIn.put(6, "six"); numPalabrasIn.put(7, "seven");
numPalabrasIn.put(8, "eight"); numPalabrasIn.put(9, "nine");
numPalabrasIn.put(10, "ten"); numPalabrasIn.put(11, "eleven");
numPalabrasIn.put(12, "twelve"); numPalabrasIn.put(13, "thirteen");
numPalabrasIn.put(14, "fourteen"); numPalabrasIn.put(15, "fifteen");
numPalabrasIn.put(16, "sixteen"); numPalabrasIn.put(17, "seventeen");
numPalabrasIn.put(18, "eighteen"); numPalabrasIn.put(19, "nineteen");
numPalabrasIn.put(20, "twenty"); numPalabrasIn.put(21, "twenty-one");
numPalabrasIn.put(22, "twenty-two"); numPalabrasIn.put(23, "twenty-three");
numPalabrasIn.put(24, "twenty-four"); numPalabrasIn.put(25, "twenty-five");
numPalabrasIn.put(26, "twenty-six"); numPalabrasIn.put(27, "twenty-seven");
numPalabrasIn.put(28, "twenty-eight"); numPalabrasIn.put(29, "twenty-nine");
numPalabrasIn.put(30, "thirty"); numPalabrasIn.put(31, "thirty-one");
numPalabrasIn.put(32, "thirty-two"); numPalabrasIn.put(33, "thirty-three");
numPalabrasIn.put(34, "thirty-four"); numPalabrasIn.put(35, "thirty-five");
numPalabrasIn.put(36, "thirty-six"); numPalabrasIn.put(37, "thirty-seven");
numPalabrasIn.put(38, "thirty-eight"); numPalabrasIn.put(39, "thirty-nine");
numPalabrasIn.put(40, "forty"); numPalabrasIn.put(41, "forty-one");
numPalabrasIn.put(42, "forty-two"); numPalabrasIn.put(43, "forty-three");
numPalabrasIn.put(44, "forty-four"); numPalabrasIn.put(45, "forty-five");
numPalabrasIn.put(46, "forty-six"); numPalabrasIn.put(47, "forty-seven");
numPalabrasIn.put(48, "forty-eight"); numPalabrasIn.put(49, "forty-nine");
numPalabrasIn.put(50, "fifty"); numPalabrasIn.put(51, "fifty-one");
numPalabrasIn.put(52, "fifty-two"); numPalabrasIn.put(53, "fifty-three");
numPalabrasIn.put(54, "fifty-four"); numPalabrasIn.put(55, "fifty-five");
numPalabrasIn.put(56, "fifty-six"); numPalabrasIn.put(57, "fifty-seven");
numPalabrasIn.put(58, "fifty-eight"); numPalabrasIn.put(59, "fifty-nine");
numPalabrasIn.put(60, "sixty"); numPalabrasIn.put(61, "sixty-one");
numPalabrasIn.put(62, "sixty-two"); numPalabrasIn.put(63, "sixty-three");
numPalabrasIn.put(64, "sixty-four"); numPalabrasIn.put(65, "sixty-five");
numPalabrasIn.put(66, "sixty-six"); numPalabrasIn.put(67, "sixty-seven");
numPalabrasIn.put(68, "sixty-eight"); numPalabrasIn.put(69, "sixty-nine");
numPalabrasIn.put(70, "seventy"); numPalabrasIn.put(71, "seventy-one");
numPalabrasIn.put(72, "seventy-two"); numPalabrasIn.put(73, "seventy-three");
numPalabrasIn.put(74, "seventy-four"); numPalabrasIn.put(75, "seventy-five");
numPalabrasIn.put(76, "seventy-six"); numPalabrasIn.put(77, "seventy-seven");
numPalabrasIn.put(78, "seventy-eight"); numPalabrasIn.put(79, "seventy-nine");
numPalabrasIn.put(80, "eighty"); numPalabrasIn.put(81, "eighty-one");
numPalabrasIn.put(82, "eighty-two"); numPalabrasIn.put(83, "eighty-three");
numPalabrasIn.put(84, "eighty-four"); numPalabrasIn.put(85, "eighty-five");
numPalabrasIn.put(86, "eighty-six"); numPalabrasIn.put(87, "eighty-seven");
numPalabrasIn.put(88, "eighty-eight"); numPalabrasIn.put(89, "eighty-nine");
numPalabrasIn.put(90, "ninety"); numPalabrasIn.put(91, "ninety-one");
numPalabrasIn.put(92, "ninety-two"); numPalabrasIn.put(93, "ninety-three");
numPalabrasIn.put(94, "ninety-four"); numPalabrasIn.put(95, "ninety-five");
numPalabrasIn.put(96, "ninety-six"); numPalabrasIn.put(97, "ninety-seven");
numPalabrasIn.put(98, "ninety-eight"); numPalabrasIn.put(99, "ninety-nine");
numPalabrasIn.put(100, "one hundred");

      

        Scanner sc = new Scanner(System.in);


        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

      
            int suma = numero1 + numero2;

            
            String numero1Es = numPalabrasEs.get(numero1);
            String numero2Es = numPalabrasEs.get(numero2);
            String sumaEs = numPalabrasEs.get(suma);

            String numero1In = numPalabrasIn.get(numero1);
            String numero2In = numPalabrasIn.get(numero2);
            String sumaIn = numPalabrasIn.get(suma);

          
            System.out.println("La suma de " + numero1Es + " mas " + numero2Es + " es " + sumaEs);
            System.out.println("The sum of " + numero1In + " plus " + numero2In + " is " + sumaIn);
        

        sc.close();
    }
    }
    

