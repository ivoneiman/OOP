package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class Fifo implements IStrategy{

	public JobDescription getNextJob(List<JobDescription> jobs) {
		return jobs.get(0);
	}

	
}
