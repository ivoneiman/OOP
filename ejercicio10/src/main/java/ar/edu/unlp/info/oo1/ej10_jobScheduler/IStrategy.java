package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public interface IStrategy {

	public JobDescription getNextJob(List<JobDescription> jobs);
}
