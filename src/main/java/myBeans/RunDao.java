// Mysti Freed, mrfreed@dmacc.edu
// RunDao interface, specifying the methods that apply to Run.java

package myBeans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RunDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RunTrackerMVC");
	
	/**
	 * Add a new run to the database via the runEntryForm.jsp
	 * @param runToAdd
	 */
	public void addNew(Run runToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(runToAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Update a run...intended for the viewAllRuns.jsp along with the removeRun method, leaving it
	 * here for when I get much, much better at HTML
	 * @param run
	 */
	public void updateRun(Run run) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(run);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Remove a run...intended for the viewAllRuns.jsp along with the updateRun method, leaving it
	 * here for when I get much, much better at HTML
	 * @param id
	 */
	public void removeRun(int id) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * Generate the full list of runs in the database, used with the viewAllRuns.jsp
	 * @return List of all Runs
	 */
	public List<Run> generateList() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String r = "select r from Run r";
		TypedQuery<Run> typedQuery = em.createQuery(r, Run.class);
		List<Run> list = typedQuery.getResultList();
		em.close();
		return list;	
	}
	
	/**
	 * Generate a list of runs based on the quality of the run(boolean)...intended for the viewAllRuns.jsp, 
	 * leaving it here for when I get much, much better at HTML
	 * @param goodOrBad
	 * @return List of runs (either good/bad based on selection)
	 */
	public List<Run> qualifiedRuns(boolean goodOrBad) {
		return null;	
	}
}
