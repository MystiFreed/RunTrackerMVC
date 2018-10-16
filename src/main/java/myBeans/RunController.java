// Mysti Freed, mrfreed@dmacc.edu
// RunController, specifying the paths for the RunTrackerMVC Webapp

package myBeans;

import java.util.List;

import javax.annotation.Resource;

import org.eclipse.persistence.sessions.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RunController {
	
	@Autowired RunDao dao;
	
	/**
	 * This method maps the runEntryForm components to the /form
	 * @return modelAndView of the runEntryForm
	 */
	@RequestMapping(value = "/form")
	public ModelAndView run() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("runEntryForm");
		modelAndView.addObject("run", new Run());
		return modelAndView;
	}
	
	/**
	 * This method maps the runResult components to the /result
	 * @return modelAndView of the runResult
	 */
	@RequestMapping(value = "/result")
	public ModelAndView captureRun(Run run){
		ModelAndView modelAndView = new ModelAndView();
		dao.addNew(run);
		modelAndView.setViewName("runResult");
		modelAndView.addObject("r", run);
		return modelAndView;
	}
	
	/**
	 * This method maps the viewAllRuns components to the /viewAll
	 * @return modelAndView of the viewAllRuns
	 */
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll( ){
		ModelAndView modelAndView = new ModelAndView();
		List<Run> allRuns = dao.generateList();
		modelAndView.setViewName("viewAllRuns");
		modelAndView.addObject("all", allRuns);
		return modelAndView;
	}
	
	/**
	 * This method maps the viewAllRuns components after a user removes a run from the database
	 * @return modelAndView of the viewAllRuns
	 */
	@RequestMapping(value = "/removeRun") 
	public ModelAndView removeRun(@PathVariable int id){
		ModelAndView modelAndView = new ModelAndView();
		dao.removeRun(id);
		modelAndView.setViewName("viewAllRuns");
		return modelAndView;
		}
	
	@Bean
	public RunDao dao() {
		RunDao bean = new RunDao();
		return bean;
	}
}
