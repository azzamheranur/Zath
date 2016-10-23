/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azzam
 */
public class FitnessCalc {
    static byte[] solution = new byte[64];
	
	/* Public methods */
	// Set a candicate solution as a byte array
	public static void setSolution(byte[] newSolution) {
		solution = newSolution;
	}
	
	// Set candicate solution with string of 0s and 1s
	static void setSolution(String newSolution) {
		solution = new byte[newSolution.length()];
		// Loop through each char of our string and save it in byte array
		for (int i = 0; i < newSolution.length(); i++){
			String character = newSolution.substring(i, i + 1);
			if (character.contains("0") || character.contains("1")) {
				solution[i] = Byte.parseByte(character);
			} else {
				solution[i] = 0;
			}
                }
	}
	
	// Calculate individual fitness by comparing it to candidate solution
	static int getFitness(Individual individual) {
		int fitness = 0;
		// Loop through individual genes and compare them to candidates
		for (int i = 0; i < individual.size() && i < solution.length; i++) {
			if (individual.getGene(i) == solution[i]) {
				fitness++;
			}
		}
		return fitness;
	}
	
	// Get optimum fitness
	static int getMaxFitness() {
		int maxFitness = solution.length;
		return maxFitness;
	}
}
