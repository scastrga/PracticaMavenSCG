package com.everis.com.everis.mvnSCG;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 * Hello world!
 *
 */
public class EverisApp {
	public static void main(String[] args) {

		// Creamos variables WRAPPER
		final String str1 = "STRING 1";
		final String str2 = "STRING 2";
		final Integer int1 = 100000;
		final Integer int2 = 99999;

		// comprobar si la variable es numerico
		if (NumberUtils.isCreatable(str2)) {
			System.out.println("Si es numerico");
		} else {
			System.out.println("No es numerico");
		}

		// comprobar si la variable es nula o vacia
		if (StringUtils.isBlank(str1)) {
			System.out.println("Es nula o vacia");
		} else {
			System.out.println("Cadena bien formada");
		}

		// Comprobar si los dos numeros son iguales o diferentes
		if (NumberUtils.compare(int1, int2) == 0) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		// Mostrar texto de un archivo PDF
		try {
			// Introducimos la ruta del fichero
			File archivoPdf = new File("C:/Dev/WorkspaceFormacionEveris/com.everis.mvnSCG/pdfbox/archivoPDF.pdf");
			// Cargamos el fichero
			PDDocument document = PDDocument.load(archivoPdf);
			// Creamos un par de objetos que nos serviran para sacar el texto del PDF
			PDFTextStripper pdfstripper = new PDFTextStripper();
			String ocr_text = pdfstripper.getText(document);
			// Imprimimos ya el texto
			System.out.println(ocr_text);
		} catch (Exception e) {

		}
	}
}
