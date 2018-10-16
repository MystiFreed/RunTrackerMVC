// Mysti Freed, mrfreed@dmacc.edu
// Run class, used to capture date, time of day, length and the quality of a run.

package myBeans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="runs")
public class Run {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID; // identifier for the run - in mySQL this is ID (int)
	private String runDate; // entry of date in format mm/dd/yr - in mySQL this is rundate (varchar)
	private TimeOfDay timeOfDay; // entry of time of day: morning/afternoon/evening- in mySQL this is timeofday (varchar)
	private int runLength; // length of run in number of minutes- in mySQL this is runlength (int)
	private boolean goodRun; // boolean: yes (good run) or no (bad run)- in mySQL this is goodrun (char)

	/**
	 * This method provides the values allowed for the enum TimeOfDay
	 * @author Mysti's PC
	 *
	 */
	public enum TimeOfDay {
		MORNING,
		AFTERNOON,
		EVENING,
	}
	
	/**
	 * default constructor for the Run class
	 */
	public void Run() {
	}
	
	/**
	 * getter for runID
	 * @return int
	 */
	public int getID() {
		return ID;
	}

	/**
	 * setter for runID
	 * @param runID
	 */
	public void setRunID(int runID) {
		this.ID = runID;
	}

	/**
	 * getter for runDate
	 * @return Date
	 */
	public String getRunDate() {
		return runDate;
	}

	/**
	 * setter for runDate
	 * @param runDate
	 */
	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}

	/**
	 * getter for runLength
	 * @return int
	 */
	public int getRunLength() {
		return runLength;
	}

	/**
	 * getter for TimeOfDay
	 * @return timeOfDay
	 */
	public TimeOfDay getTimeOfDay() {
		return timeOfDay;
	}

	/**
	 * setter for TimeOfDay
	 * @param timeOfDay
	 */
	public void setTimeOfDay(TimeOfDay timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	/**
	 * setter for runLength
	 * @param runLength
	 */
	public void setRunLength(int runLength) {
		this.runLength = runLength;
	}

	/**
	 * getter for isGoodRun
	 * @return boolean
	 */
	public boolean isGoodRun() {
		return goodRun;
	}

	/**
	 * setter for isGoodRun
	 * @param goodRun
	 */
	public void setGoodRun(boolean goodRun) {
		this.goodRun = goodRun;
	}

	/**
	 * toString for the Run class
	 */
	@Override
	public String toString() {
		return "Run [runDate=" + runDate + ", timeOfDay=" + timeOfDay + ", runLength=" + runLength + ", goodRun="
				+ goodRun + "]";
	}
}
