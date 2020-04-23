package com.uca.capas.segundaTarea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlumnoController {
	
	@RequestMapping("/alumno")
	public @ResponseBody String datosAlumno() {
		
		String nombre = " Jorge ";
		String apellido = " Valencia";
		String carnet = " 00003417";
		String disciplina = " Ing. Informática";
		String anioCursado = "Cuarto año";
		
		return nombre + apellido + carnet + disciplina + anioCursado;
	}
}
