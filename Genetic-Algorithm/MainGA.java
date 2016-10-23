/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azzam
 */
public class MainGA {
    public static void main(String[] args) {
		
		//Set a candidate solution
		FitnessCalc.setSolution("100101111000011110000010101110001111000000000101001110000001111");
		
		// Create an initial population
		Population myPop = new Population(50, true);
		
		//Evolve the population until reach an optimum solution
		int generationCount = 0;
		while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
			generationCount++;
			System.out.println("Generation: " + generationCount + " Fitness: " + myPop.getFittest().getFitness());
			myPop = Algorithm.evolvePopulation(myPop);
		}
		System.out.println("Solution found!");
		System.out.println("Generation: " + generationCount);
		System.out.println("Genes: ");
		System.out.println(myPop.getFittest());
	}
}
